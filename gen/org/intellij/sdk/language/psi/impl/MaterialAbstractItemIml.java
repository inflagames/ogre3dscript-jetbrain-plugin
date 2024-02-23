// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.sdk.language.psi.MaterialElementTypes.*;
import com.ogre.scriptlsp.lang.psi.impl.MaterialElementImp;
import org.intellij.sdk.language.psi.*;

public class MaterialAbstractItemIml extends MaterialElementImp implements MaterialAbstractItem {

  public MaterialAbstractItemIml(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MaterialVisitor visitor) {
    visitor.visitAbstractItem(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MaterialVisitor) accept((MaterialVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MaterialAbstractMaterial getAbstractMaterial() {
    return findChildByClass(MaterialAbstractMaterial.class);
  }

  @Override
  @Nullable
  public MaterialAbstractPass getAbstractPass() {
    return findChildByClass(MaterialAbstractPass.class);
  }

  @Override
  @Nullable
  public MaterialAbstractTechnique getAbstractTechnique() {
    return findChildByClass(MaterialAbstractTechnique.class);
  }

  @Override
  @Nullable
  public MaterialAbstractTexture getAbstractTexture() {
    return findChildByClass(MaterialAbstractTexture.class);
  }

}
