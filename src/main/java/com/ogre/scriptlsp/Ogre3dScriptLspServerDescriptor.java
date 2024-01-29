package com.ogre.scriptlsp;

import com.intellij.execution.ExecutionException;
import com.intellij.execution.configurations.GeneralCommandLine;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.platform.lsp.api.ProjectWideLspServerDescriptor;
import com.intellij.platform.lsp.api.customization.LspFormattingSupport;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Ogre3dScriptLspServerDescriptor extends ProjectWideLspServerDescriptor {

  public Ogre3dScriptLspServerDescriptor(@NotNull Project project) {
    super(project, "Ogre3dScriptLsp");
  }

  @NotNull
  @Override
  public GeneralCommandLine createCommandLine() throws ExecutionException {
    return new GeneralCommandLine("ogre_scripts_LSP");
  }

  @Override
  public boolean isSupportedFile(@NotNull VirtualFile virtualFile) {
    return "material".equals(virtualFile.getExtension());
  }
}
