// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.ogre.scriptlsp.lang.psi.MaterialElement;

public interface MaterialAbstractItem extends MaterialElement {

  @Nullable
  MaterialAbstractMaterial getAbstractMaterial();

  @Nullable
  MaterialAbstractPass getAbstractPass();

  @Nullable
  MaterialAbstractTechnique getAbstractTechnique();

  @Nullable
  MaterialAbstractTexture getAbstractTexture();

}
