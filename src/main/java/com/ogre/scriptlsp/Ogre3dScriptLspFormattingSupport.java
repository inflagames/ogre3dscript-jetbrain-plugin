package com.ogre.scriptlsp;

import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.platform.lsp.api.customization.LspFormattingSupport;
import org.jetbrains.annotations.NotNull;

public class Ogre3dScriptLspFormattingSupport extends LspFormattingSupport {

  @Override
  public boolean shouldFormatThisFileExclusivelyByServer(@NotNull VirtualFile file, boolean ideCanFormatThisFileItself,
      boolean serverExplicitlyWantsToFormatThisFile) {
    return "material".equals(file.getExtension());
  }
}
