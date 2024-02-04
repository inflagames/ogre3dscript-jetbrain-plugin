package com.ogre.scriptlsp.highlighting;

import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;

public interface Ogre3dColors {

  TextAttributesKey IDENTIFIER = TextAttributesKey.createTextAttributesKey("OGRE3D_IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER);
  TextAttributesKey BRACKETS = TextAttributesKey.createTextAttributesKey("OGRE3D_BRACKETS", DefaultLanguageHighlighterColors.BRACKETS);
  TextAttributesKey KEYWORD = TextAttributesKey.createTextAttributesKey("OGRE3D_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
  TextAttributesKey COMMENT = TextAttributesKey.createTextAttributesKey("OGRE3D_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
}
