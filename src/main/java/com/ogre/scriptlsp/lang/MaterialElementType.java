package com.ogre.scriptlsp.lang;

import com.intellij.lang.Language;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MaterialElementType extends IElementType {

  public MaterialElementType(@NonNls @NotNull String debugName) {
    super(debugName, MaterialLanguage.language);
  }
}
