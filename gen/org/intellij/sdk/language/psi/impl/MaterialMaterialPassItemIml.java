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

public class MaterialMaterialPassItemIml extends MaterialElementImp implements MaterialMaterialPassItem {

  public MaterialMaterialPassItemIml(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MaterialVisitor visitor) {
    visitor.visitMaterialPassItem(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MaterialVisitor) accept((MaterialVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MaterialMaterialProgram getMaterialProgram() {
    return findChildByClass(MaterialMaterialProgram.class);
  }

  @Override
  @Nullable
  public MaterialMaterialTexture getMaterialTexture() {
    return findChildByClass(MaterialMaterialTexture.class);
  }

  @Override
  @NotNull
  public List<MaterialParam> getParamList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MaterialParam.class);
  }

  @Override
  @Nullable
  public PsiElement getIdentifier() {
    return findChildByType(IDENTIFIER);
  }

}
