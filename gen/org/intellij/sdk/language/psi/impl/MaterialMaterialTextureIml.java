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

public class MaterialMaterialTextureIml extends MaterialElementImp implements MaterialMaterialTexture {

  public MaterialMaterialTextureIml(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MaterialVisitor visitor) {
    visitor.visitMaterialTexture(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MaterialVisitor) accept((MaterialVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<MaterialMaterialTextureItem> getMaterialTextureItemList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MaterialMaterialTextureItem.class);
  }

  @Override
  @NotNull
  public List<MaterialMaterialTextureName> getMaterialTextureNameList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MaterialMaterialTextureName.class);
  }

}
