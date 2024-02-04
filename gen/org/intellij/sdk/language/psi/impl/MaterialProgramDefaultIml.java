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

public class MaterialProgramDefaultIml extends MaterialElementImp implements MaterialProgramDefault {

  public MaterialProgramDefaultIml(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MaterialVisitor visitor) {
    visitor.visitProgramDefault(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MaterialVisitor) accept((MaterialVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<MaterialProgramDefaultItem> getProgramDefaultItemList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MaterialProgramDefaultItem.class);
  }

}
