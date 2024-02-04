package com.ogre.scriptlsp.highlighting;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import com.ogre.scriptlsp.lang.MaterialLexer;
import com.ogre.scriptlsp.lang.parser.MaterialParserDefinition;
import java.util.HashMap;
import org.intellij.sdk.language.psi.MaterialElementTypes;
import org.jetbrains.annotations.NotNull;

public class Ogre3dSyntaxHighlighter extends SyntaxHighlighterBase {

  @Override
  public @NotNull Lexer getHighlightingLexer() {
    return new MaterialLexer();
  }

  @Override
  public TextAttributesKey @NotNull [] getTokenHighlights(IElementType iElementType) {
    HashMap<IElementType, TextAttributesKey> map = new HashMap<>();
    map.put(MaterialElementTypes.ABSTRACT, Ogre3dColors.KEYWORD);
    map.put(MaterialElementTypes.DEFAULT_PARAMS, Ogre3dColors.KEYWORD);
    map.put(MaterialElementTypes.ENTRY_POINT, Ogre3dColors.KEYWORD);
    map.put(MaterialElementTypes.FRAGMENT_PROGRAM, Ogre3dColors.KEYWORD);
    map.put(MaterialElementTypes.FRAGMENT_PROGRAM_REF, Ogre3dColors.KEYWORD);
    map.put(MaterialElementTypes.IMPORT, Ogre3dColors.KEYWORD);
    map.put(MaterialElementTypes.MATERIAL, Ogre3dColors.KEYWORD);
    map.put(MaterialElementTypes.PASS, Ogre3dColors.KEYWORD);
    map.put(MaterialElementTypes.PROFILES, Ogre3dColors.KEYWORD);
    map.put(MaterialElementTypes.TECHNIQUE, Ogre3dColors.KEYWORD);
    map.put(MaterialElementTypes.TEXTURE_UNIT, Ogre3dColors.KEYWORD);
    map.put(MaterialElementTypes.VERTEX_PROGRAM, Ogre3dColors.KEYWORD);
    map.put(MaterialElementTypes.VERTEX_PROGRAM_REF, Ogre3dColors.KEYWORD);

    map.put(MaterialElementTypes.LBRACE, Ogre3dColors.BRACKETS);
    map.put(MaterialElementTypes.RBRACE, Ogre3dColors.BRACKETS);
    map.put(MaterialElementTypes.COLON, Ogre3dColors.KEYWORD);

    map.put(MaterialElementTypes.IDENTIFIER, Ogre3dColors.IDENTIFIER);
    map.put(MaterialElementTypes.NUMERIC_LITERAL, Ogre3dColors.IDENTIFIER);
    map.put(MaterialElementTypes.STRING_LITERAL, Ogre3dColors.IDENTIFIER);
    map.put(MaterialElementTypes.MATCH_LITERAL, Ogre3dColors.IDENTIFIER);
    map.put(MaterialElementTypes.VARIABLE, Ogre3dColors.IDENTIFIER);
    map.put(MaterialParserDefinition.LINE_COMMENT, Ogre3dColors.IDENTIFIER);

    return new TextAttributesKey[]{map.get(iElementType)};
  }

}
