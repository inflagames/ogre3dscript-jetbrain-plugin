package com.ogre.scriptlsp.lang;

import com.intellij.lang.Language;

public class MaterialLanguage extends Language {

  public static final MaterialLanguage language = new MaterialLanguage();

  private MaterialLanguage() {
    super("Ogre3d-material-script");
  }
}
