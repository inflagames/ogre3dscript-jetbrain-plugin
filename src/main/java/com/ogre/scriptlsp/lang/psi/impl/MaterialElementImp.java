package com.ogre.scriptlsp.lang.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.ogre.scriptlsp.lang.psi.MaterialElement;
import org.jetbrains.annotations.NotNull;

public class MaterialElementImp extends ASTWrapperPsiElement implements MaterialElement {

  public MaterialElementImp(@NotNull ASTNode node) {
    super(node);
  }
}
