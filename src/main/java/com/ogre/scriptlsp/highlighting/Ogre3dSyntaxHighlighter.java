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
    map.put(MaterialElementTypes.FROM, Ogre3dColors.KEYWORD);
    map.put(MaterialElementTypes.IMPORT, Ogre3dColors.KEYWORD);
    map.put(MaterialElementTypes.MATERIAL, Ogre3dColors.KEYWORD);
    map.put(MaterialElementTypes.PASS, Ogre3dColors.KEYWORD);
    map.put(MaterialElementTypes.TECHNIQUE, Ogre3dColors.KEYWORD);
    map.put(MaterialElementTypes.TEXTURE_UNIT, Ogre3dColors.KEYWORD);
    map.put(MaterialElementTypes.RT_SHADER_SYSTEM, Ogre3dColors.KEYWORD);
    map.put(MaterialElementTypes.SHARED_PARAMS, Ogre3dColors.KEYWORD);
    map.put(MaterialElementTypes.SHARED_PARAMS_REF, Ogre3dColors.KEYWORD);
    map.put(MaterialElementTypes.SHADOW_CASTER_MATERIAL, Ogre3dColors.KEYWORD);
    map.put(MaterialElementTypes.SHADOW_RECEIVER_MATERIAL, Ogre3dColors.KEYWORD);
    map.put(MaterialElementTypes.TEXTURE_SOURCE, Ogre3dColors.KEYWORD);
    map.put(MaterialElementTypes.SAMPLER, Ogre3dColors.KEYWORD);
    map.put(MaterialElementTypes.SAMPLER_REF, Ogre3dColors.KEYWORD);

    map.put(MaterialElementTypes.FRAGMENT_PROGRAM, Ogre3dColors.KEYWORD);
    map.put(MaterialElementTypes.FRAGMENT_PROGRAM_REF, Ogre3dColors.KEYWORD);
    map.put(MaterialElementTypes.VERTEX_PROGRAM, Ogre3dColors.KEYWORD);
    map.put(MaterialElementTypes.VERTEX_PROGRAM_REF, Ogre3dColors.KEYWORD);
    map.put(MaterialElementTypes.GEOMETRY_PROGRAM, Ogre3dColors.KEYWORD);
    map.put(MaterialElementTypes.GEOMETRY_PROGRAM_REF, Ogre3dColors.KEYWORD);
    map.put(MaterialElementTypes.TESSELLATION_HULL_PROGRAM, Ogre3dColors.KEYWORD);
    map.put(MaterialElementTypes.TESSELLATION_HULL_PROGRAM_REF, Ogre3dColors.KEYWORD);
    map.put(MaterialElementTypes.TESSELLATION_DOMAIN_PROGRAM, Ogre3dColors.KEYWORD);
    map.put(MaterialElementTypes.TESSELLATION_DOMAIN_PROGRAM_REF, Ogre3dColors.KEYWORD);
    map.put(MaterialElementTypes.COMPUTE_PROGRAM, Ogre3dColors.KEYWORD);
    map.put(MaterialElementTypes.COMPUTE_PROGRAM_REF, Ogre3dColors.KEYWORD);

    map.put(MaterialElementTypes.LBRACE, Ogre3dColors.BRACKETS);
    map.put(MaterialElementTypes.RBRACE, Ogre3dColors.BRACKETS);
    map.put(MaterialElementTypes.COLON, Ogre3dColors.KEYWORD);

    map.put(MaterialElementTypes.IDENTIFIER, Ogre3dColors.IDENTIFIER);
    map.put(MaterialElementTypes.NUMERIC_LITERAL, Ogre3dColors.IDENTIFIER);
    map.put(MaterialElementTypes.STRING_LITERAL, Ogre3dColors.IDENTIFIER);
    map.put(MaterialElementTypes.MATCH_LITERAL, Ogre3dColors.IDENTIFIER);
    map.put(MaterialElementTypes.VARIABLE, Ogre3dColors.IDENTIFIER);

    map.put(MaterialParserDefinition.LINE_COMMENT, Ogre3dColors.COMMENT);
    map.put(MaterialParserDefinition.MULTILINE_COMMENT, Ogre3dColors.COMMENT);

    return new TextAttributesKey[]{map.get(iElementType)};
  }

}
