package com.ogre.scriptlsp;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.platform.lsp.api.LspServerSupportProvider;
import org.jetbrains.annotations.NotNull;

public class Ogre3dScriptLspServerSupportProvider implements LspServerSupportProvider {

  @Override
  public void fileOpened(@NotNull Project project, @NotNull VirtualFile virtualFile,
      @NotNull LspServerSupportProvider.LspServerStarter lspServerStarter) {
    if ("material".equals(virtualFile.getExtension())) {
      lspServerStarter.ensureServerStarted(new Ogre3dScriptLspServerDescriptor(project));
    }
  }
}
