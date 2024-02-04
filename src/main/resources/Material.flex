// Copyright 2000-2022 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package org.intellij.sdk.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;

import static com.ogre.scriptlsp.lang.MaterialTypes.*;

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

IDENTIFIER       =  [:jletter:]([:jletterdigit:]|\/)*
STRING_LITERAL   =  \"([^\\\"\r\n]|\\[^\r\n])*\"?
MATCH_LITERAL    =  \*([^\\\"\r\n]|\\[^\r\n])*\*?
VARIABLE         =  \$[:jletter:][:jletterdigit:]*
NUMERIC_LITERAL  =  "-"? [:digit:]+ ("." [:digit:]+)?
LINE_COMMENT     =  "//" .*

//%state IDEN

%%

<YYINITIAL> {
  "abstract"                     { return ABSTRACT; }
  "default_params"               { return DEFAULT_PARAMS; }
  "entry_point"                  { return ENTRY_POINT; }
  "fragment_program"             { return FRAGMENT_PROGRAM; }
  "fragment_program_ref"         { return FRAGMENT_PROGRAM_REF; }
  "import"                       { return IMPORT; }
  "material"                     { return MATERIAL; }
  "pass"                         { return PASS; }
  "profiles"                     { return PROFILES; }
  "technique"                    { return TECHNIQUE; }
  "texture_unit"                 { return TEXTURE_UNIT; }
  "vertex_program"               { return VERTEX_PROGRAM; }
  "vertex_program_ref"           { return VERTEX_PROGRAM_REF; }

  "{"                            { return LBRACE; }
  "}"                            { return RBRACE; }
  ":"                            { return COLON; }
}

{IDENTIFIER}                     { return IDENTIFIER; }
{NUMERIC_LITERAL}                { return NUMERIC_LITERAL; }
{STRING_LITERAL}                 { return STRING_LITERAL; }
{MATCH_LITERAL}                  { return MATCH_LITERAL; }
{VARIABLE}                       { return VARIABLE; }
{LINE_COMMENT}                   { return LINE_COMMENT; }

[^]                              { return BAD_CHARACTER; }
