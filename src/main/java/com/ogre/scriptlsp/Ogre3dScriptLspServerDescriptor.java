package com.ogre.scriptlsp;

import com.intellij.execution.ExecutionException;
import com.intellij.execution.configurations.GeneralCommandLine;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.platform.lsp.api.ProjectWideLspServerDescriptor;
import com.intellij.platform.lsp.api.customization.LspFormattingSupport;
import com.jediterm.terminal.TerminalDataStream.EOF;
import com.jgoodies.common.base.SystemUtils;
import com.ogre.scriptlsp.exceptions.CopyLspAppException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import java.util.Objects;
import org.apache.commons.io.FileUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Ogre3dScriptLspServerDescriptor extends ProjectWideLspServerDescriptor {

  public Ogre3dScriptLspServerDescriptor(@NotNull Project project) {
    super(project, "Ogre3dScriptLsp");
  }

  @Nullable
  @Override
  public LspFormattingSupport getLspFormattingSupport() {
    return new Ogre3dScriptLspFormattingSupport();
  }

  @NotNull
  @Override
  public GeneralCommandLine createCommandLine() throws ExecutionException {
    // copy lsp to tmp files before being executed
    String executablePath = copyLspToSystem();

    return new GeneralCommandLine(Arrays.asList(executablePath, "-l"));
  }

  private String copyLspToSystem() throws CopyLspAppException {
    // todo: used for testing, can be removed when stable version
//    return "ogre_scripts_LSP";
    String executablePath;
    String resourceBinary;
    if (SystemUtils.IS_OS_LINUX) {
      executablePath = System.getProperty("user.home") + "/.local/bin/ogre_scripts_LSP";
      resourceBinary = "ogre_scripts_LSP";
    } else if (SystemUtils.IS_OS_WINDOWS) {
      executablePath = System.getProperty("user.home") + "\\AppData\\Local\\Programs\\ogre_scripts_LSP.exe";
      resourceBinary = "ogre_scripts_LSP.exe";
    } else {
      throw new CopyLspAppException("plugin not supported in OS");
    }
    try {
      URL binarySrcUrl = getClass().getResource("/lsp/" + resourceBinary);
      // copy binary if not exist or if different checksum
      if (!new File(executablePath).exists() ||
          !Objects.equals(fileMd5checksum(new FileInputStream(executablePath)), fileMd5checksum(binarySrcUrl.openStream()))) {
        FileUtils.copyURLToFile(binarySrcUrl, new File(executablePath));
        if (!new File(executablePath).setExecutable(true)) {
          throw new CopyLspAppException("Couldn't make the LSP application executable");
        }
      }
    } catch (IOException | NullPointerException | NoSuchAlgorithmException e) {
      throw new CopyLspAppException("Couldn't copy the LSP (Language Server Protocol) application", e);
    }
    return executablePath;
  }

  public String fileMd5checksum(InputStream is) throws NoSuchAlgorithmException, IOException {
    MessageDigest md = MessageDigest.getInstance("MD5");
    DigestInputStream dis = new DigestInputStream(is, md);
    while (dis.read() != -1) {
    }
    return new String(md.digest());
  }

  @Override
  public boolean isSupportedFile(@NotNull VirtualFile virtualFile) {
    return "material".equals(virtualFile.getExtension());
  }
}
