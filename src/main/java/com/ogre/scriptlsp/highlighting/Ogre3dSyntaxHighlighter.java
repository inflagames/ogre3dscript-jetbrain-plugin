package com.ogre.scriptlsp.highlighting;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import com.ogre.scriptlsp.lang.MaterialLexer;
import com.ogre.scriptlsp.lang.MaterialTypes;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

public class Ogre3dSyntaxHighlighter extends SyntaxHighlighterBase {

  @Override
  public @NotNull Lexer getHighlightingLexer() {
    return new MaterialLexer();
  }

  @Override
  public TextAttributesKey @NotNull [] getTokenHighlights(IElementType iElementType) {
    HashMap<IElementType, TextAttributesKey> map = new HashMap<>();
    map.put(MaterialTypes.ABSTRACT, Ogre3dColors.KEYWORD);
    map.put(MaterialTypes.DEFAULT_PARAMS, Ogre3dColors.KEYWORD);
    map.put(MaterialTypes.ENTRY_POINT, Ogre3dColors.KEYWORD);
    map.put(MaterialTypes.FRAGMENT_PROGRAM, Ogre3dColors.KEYWORD);
    map.put(MaterialTypes.FRAGMENT_PROGRAM_REF, Ogre3dColors.KEYWORD);
    map.put(MaterialTypes.IMPORT, Ogre3dColors.KEYWORD);
    map.put(MaterialTypes.MATERIAL, Ogre3dColors.KEYWORD);
    map.put(MaterialTypes.PASS, Ogre3dColors.KEYWORD);
    map.put(MaterialTypes.PROFILES, Ogre3dColors.KEYWORD);
    map.put(MaterialTypes.TECHNIQUE, Ogre3dColors.KEYWORD);
    map.put(MaterialTypes.TEXTURE_UNIT, Ogre3dColors.KEYWORD);
    map.put(MaterialTypes.VERTEX_PROGRAM, Ogre3dColors.KEYWORD);
    map.put(MaterialTypes.VERTEX_PROGRAM_REF, Ogre3dColors.KEYWORD);

    map.put(MaterialTypes.LBRACE, Ogre3dColors.BRACKETS);
    map.put(MaterialTypes.RBRACE, Ogre3dColors.BRACKETS);
    map.put(MaterialTypes.COLON, Ogre3dColors.KEYWORD);

    map.put(MaterialTypes.IDENTIFIER, Ogre3dColors.IDENTIFIER);
    map.put(MaterialTypes.NUMERIC_LITERAL, Ogre3dColors.IDENTIFIER);
    map.put(MaterialTypes.STRING_LITERAL, Ogre3dColors.IDENTIFIER);
    map.put(MaterialTypes.MATCH_LITERAL, Ogre3dColors.IDENTIFIER);
    map.put(MaterialTypes.VARIABLE, Ogre3dColors.IDENTIFIER);
    map.put(MaterialTypes.LINE_COMMENT, Ogre3dColors.IDENTIFIER);

    return new TextAttributesKey[]{map.get(iElementType)};
  }

}
