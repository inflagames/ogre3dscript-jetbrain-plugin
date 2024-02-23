// Copyright 2000-2022 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package org.intellij.sdk.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import static com.intellij.psi.TokenType.*;

import static org.intellij.sdk.language.psi.MaterialElementTypes.*;
import static com.ogre.scriptlsp.lang.parser.MaterialParserDefinition.*;

%%

%{
  public _MaterialLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _MaterialLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType

LineTerminator        = \r|\n|\r\n

IDENTIFIER            =  ([:jletterdigit:]-){1}([:jletterdigit:]|\/)*
STRING_LITERAL        =  \"([^\\\"\r\n]|\\[^\r\n])*\"?
MATCH_LITERAL         =  \*([^\\\"\r\n]|\\[^\r\n])*\*?
VARIABLE              =  \$[:jletter:][:jletterdigit:]*
NUMERIC_LITERAL       =  "-"? [:digit:]+ ("." [:digit:]+)?
LINE_COMMENT          =  "//" [^\r\n]* {LineTerminator}?
MULTILINE_COMMENT     =  "/*" [^*] ~"*/" | "/*" "*"+ "/"

//%state IDEN

%%

<YYINITIAL> {
  "abstract"                         { return ABSTRACT; }
  "default_params"                   { return DEFAULT_PARAMS; }
  "from"                             { return FROM; }
  "import"                           { return IMPORT; }
  "material"                         { return MATERIAL; }
  "pass"                             { return PASS; }
  "technique"                        { return TECHNIQUE; }
  "texture_unit"                     { return TEXTURE_UNIT; }
  "rtshader_system"                  { return RTSHADER_SYSTEM; }
  "shared_params"                    { return SHARED_PARAMS; }
  "shared_params_ref"                { return SHARED_PARAMS_REF; }
  "shadow_caster_material"           { return SHADOW_CASTER_MATERIAL; }
  "shadow_receiver_material"         { return SHADOW_RECEIVER_MATERIAL; }
  "texture_source"                   { return TEXTURE_SOURCE; }
  "sampler"                          { return SAMPLER; }
  "sampler_ref"                      { return SAMPLER_REF; }

  "fragment_program"                 { return FRAGMENT_PROGRAM; }
  "fragment_program_ref"             { return FRAGMENT_PROGRAM_REF; }
  "vertex_program"                   { return VERTEX_PROGRAM; }
  "vertex_program_ref"               { return VERTEX_PROGRAM_REF; }
  "geometry_program"                 { return VERTEX_PROGRAM_REF; }
  "geometry_program_ref"             { return VERTEX_PROGRAM_REF; }
  "tessellation_hull_program"        { return VERTEX_PROGRAM_REF; }
  "tessellation_hull_program_ref"    { return VERTEX_PROGRAM_REF; }
  "tessellation_domain_program"      { return VERTEX_PROGRAM_REF; }
  "tessellation_domain_program_ref"  { return VERTEX_PROGRAM_REF; }
  "compute_program"                  { return VERTEX_PROGRAM_REF; }
  "compute_program_ref"              { return VERTEX_PROGRAM_REF; }

  "{"                                { return LBRACE; }
  "*"                                { return ASTERISK; }
  "}"                                { return RBRACE; }
  ":"                                { return COLON; }
  ","                                { return COMMA; }
}

{IDENTIFIER}                         { return IDENTIFIER; }
{NUMERIC_LITERAL}                    { return NUMERIC_LITERAL; }
{STRING_LITERAL}                     { return STRING_LITERAL; }
{MATCH_LITERAL}                      { return MATCH_LITERAL; }
{VARIABLE}                           { return VARIABLE; }
{LINE_COMMENT}                       { return LINE_COMMENT; }
{MULTILINE_COMMENT}                  { return MULTILINE_COMMENT; }

[^]                                  { return BAD_CHARACTER; }
