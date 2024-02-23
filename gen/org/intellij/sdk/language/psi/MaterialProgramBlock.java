// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.ogre.scriptlsp.lang.psi.MaterialElement;

public interface MaterialProgramBlock extends MaterialElement {

  @NotNull
  List<MaterialParam> getParamList();

  @NotNull
  List<MaterialProgramDefault> getProgramDefaultList();

  @NotNull
  MaterialProgramType getProgramType();

  @NotNull
  List<MaterialSharedParamRef> getSharedParamRefList();

}
