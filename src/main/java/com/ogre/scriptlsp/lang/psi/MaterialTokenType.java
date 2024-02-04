package com.ogre.scriptlsp.lang.psi;

import com.intellij.psi.tree.IElementType;
import com.ogre.scriptlsp.lang.MaterialLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class MaterialTokenType extends IElementType {

  public MaterialTokenType(@NonNls @NotNull String debugName) {
    super(debugName, MaterialLanguage.language);
  }
}
