package com.ogre.scriptlsp.highlighting;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.psi.PsiElement;
import org.intellij.sdk.language.psi.MaterialElementTypes;
import org.jetbrains.annotations.NotNull;

public class Ogre3dHighlightingAnnotator implements Annotator {

  @Override
  public void annotate(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
    if (psiElement == MaterialElementTypes.IDENTIFIER) {
      annotationHolder.newSilentAnnotation(HighlightSeverity.INFORMATION)
          .textAttributes(Ogre3dColors.IDENTIFIER)
          .range(psiElement)
          .create();
    }
  }
}
