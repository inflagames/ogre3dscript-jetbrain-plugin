package com.ogre.scriptlsp.lang.parser;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import com.ogre.scriptlsp.lang.MaterialLexer;
import com.ogre.scriptlsp.lang.psi.MaterialTokenType;
import org.intellij.sdk.language.parser.MaterialParser;
import org.jetbrains.annotations.NotNull;

public class MaterialParserDefinition implements ParserDefinition {

  static public IElementType LINE_COMMENT = new MaterialTokenType("LINE_COMMENT");

  @Override
  public @NotNull Lexer createLexer(Project project) {
    return new MaterialLexer();
  }

  @Override
  public @NotNull PsiParser createParser(Project project) {
    return new MaterialParser();
  }

  @Override
  public @NotNull IFileElementType getFileNodeType() {
    return null;
  }

  @Override
  public @NotNull TokenSet getCommentTokens() {
    return TokenSet.create(LINE_COMMENT);
  }

  @Override
  public @NotNull TokenSet getStringLiteralElements() {
    return null;
  }

  @Override
  public @NotNull PsiElement createElement(ASTNode node) {
    return null;
  }

  @Override
  public @NotNull PsiFile createFile(@NotNull FileViewProvider viewProvider) {
    return null;
  }
}
