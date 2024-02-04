package com.ogre.scriptlsp.lang;

import com.intellij.psi.tree.IElementType;

public interface MaterialTypes {

  IElementType ABSTRACT = new MaterialElementType("ABSTRACT");
  IElementType DEFAULT_PARAMS = new MaterialElementType("DEFAULT_PARAMS");
  IElementType ENTRY_POINT = new MaterialElementType("ENTRY_POINT");
  IElementType FRAGMENT_PROGRAM = new MaterialElementType("FRAGMENT_PROGRAM");
  IElementType FRAGMENT_PROGRAM_REF = new MaterialElementType("FRAGMENT_PROGRAM_REF");
  IElementType IMPORT = new MaterialElementType("IMPORT");
  IElementType MATERIAL = new MaterialElementType("MATERIAL");
  IElementType PASS = new MaterialElementType("PASS");
  IElementType PROFILES = new MaterialElementType("PROFILES");
  IElementType TECHNIQUE = new MaterialElementType("TECHNIQUE");
  IElementType TEXTURE_UNIT = new MaterialElementType("TEXTURE_UNIT");
  IElementType VERTEX_PROGRAM = new MaterialElementType("VERTEX_PROGRAM");
  IElementType VERTEX_PROGRAM_REF = new MaterialElementType("VERTEX_PROGRAM_REF");

  IElementType LBRACE = new MaterialElementType("LBRACE");
  IElementType RBRACE = new MaterialElementType("RBRACE");
  IElementType COLON = new MaterialElementType("COLON");

  IElementType IDENTIFIER = new MaterialElementType("IDENTIFIER");
  IElementType NUMERIC_LITERAL = new MaterialElementType("NUMERIC_LITERAL");
  IElementType STRING_LITERAL = new MaterialElementType("STRING_LITERAL");
  IElementType MATCH_LITERAL = new MaterialElementType("MATCH_LITERAL");
  IElementType VARIABLE = new MaterialElementType("VARIABLE");
  IElementType LINE_COMMENT = new MaterialElementType("LINE_COMMENT");
  IElementType BAD_CHARACTER = new MaterialElementType("BAD_CHARACTER");
}
