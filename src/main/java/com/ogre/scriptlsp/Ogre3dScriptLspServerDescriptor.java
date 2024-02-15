package com.ogre.scriptlsp;

import com.intellij.execution.ExecutionException;
import com.intellij.execution.configurations.GeneralCommandLine;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.platform.lsp.api.ProjectWideLspServerDescriptor;
import com.intellij.platform.lsp.api.customization.LspFormattingSupport;
import com.jgoodies.common.base.SystemUtils;
import com.ogre.scriptlsp.exceptions.CopyLspAppException;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
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

    return new GeneralCommandLine(executablePath);
  }

  private String copyLspToSystem() throws CopyLspAppException {
    // todo: used for testing, can be removed when stable version
//    return "ogre_scripts_LSP";
    String executablePath;
    String resourceBinary;
    if (SystemUtils.IS_OS_LINUX) {
      executablePath = System.getProperty("user.home") + "/.local/bin/ogre_scripts_LSP";
      resourceBinary = "ogre_scripts_LSP";
    }  else if (SystemUtils.IS_OS_WINDOWS) {
      executablePath = System.getProperty("user.home") + "\\AppData\\Local\\Programs\\ogre_scripts_LSP.exe";
      resourceBinary = "ogre_scripts_LSP.exe";
    } else {
      throw new CopyLspAppException("plugin not supported in OS");
    }
    try {
      if (!new File(executablePath).exists()) {
        //noinspection DataFlowIssue
        FileUtils.copyURLToFile(getClass().getResource("/lsp/" + resourceBinary), new File(executablePath));
        if (!new File(executablePath).setExecutable(true)) {
          throw new CopyLspAppException("Couldn't make the LSP application executable");
        }
      }
    } catch (IOException | NullPointerException e) {
      throw new CopyLspAppException("Couldn't copy the LSP (Language Server Protocol) application", e);
    }
    return executablePath;
  }

  @Override
  public boolean isSupportedFile(@NotNull VirtualFile virtualFile) {
    return "material".equals(virtualFile.getExtension());
  }
}
