package com.ogre.scriptlsp.lang;

import com.intellij.lexer.FlexAdapter;
import org.intellij.sdk.language._MaterialLexer;

public class MaterialLexer extends FlexAdapter {

  public MaterialLexer() {
    super(new _MaterialLexer());
  }
}
