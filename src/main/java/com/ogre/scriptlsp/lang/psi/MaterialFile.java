package com.ogre.scriptlsp.lang.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.ogre.scriptlsp.lang.MaterialFileType;
import com.ogre.scriptlsp.lang.MaterialLanguage;
import org.jetbrains.annotations.NotNull;

public class MaterialFile extends PsiFileBase {

  public MaterialFile(@NotNull FileViewProvider viewProvider) {
    super(viewProvider, MaterialLanguage.language);
  }

  @Override
  public @NotNull FileType getFileType() {
    return MaterialFileType.instance;
  }
}
