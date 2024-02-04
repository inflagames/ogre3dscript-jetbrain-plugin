package com.ogre.scriptlsp;

import com.intellij.execution.ExecutionException;
import com.intellij.execution.configurations.GeneralCommandLine;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.platform.lsp.api.ProjectWideLspServerDescriptor;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import org.apache.commons.io.FileUtils;
import org.jetbrains.annotations.NotNull;

public class Ogre3dScriptLspServerDescriptor extends ProjectWideLspServerDescriptor {

  public Ogre3dScriptLspServerDescriptor(@NotNull Project project) {
    super(project, "Ogre3dScriptLsp");
  }

  @NotNull
  @Override
  public GeneralCommandLine createCommandLine() throws ExecutionException {
    // copy lsp to tmp files before being executed
    String executablePath = copyLspToSystem();

    return new GeneralCommandLine(executablePath);
  }

  private String copyLspToSystem() {
    return "ogre_scripts_LSP";
//    // todo: research where to copy the lsp script in the system
//    String executablePath = "";
//    try {
//      executablePath = System.getProperty("user.home") + "/ogre_scripts_LSP";
//      FileUtils.copyURLToFile(getClass().getResource("/lsp/ogre_scripts_LSP"), new File(executablePath));
//      if (new File(executablePath).setExecutable(true)) {
//        // todo exception here
//      }
//    } catch (IOException | NullPointerException e) {
//      // todo
//      throw new RuntimeException(e);
//    }
//    return executablePath;
  }

  @Override
  public boolean isSupportedFile(@NotNull VirtualFile virtualFile) {
    return "material".equals(virtualFile.getExtension());
  }
}
