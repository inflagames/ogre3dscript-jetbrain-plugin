package com.ogre.scriptlsp;

import com.intellij.lang.Language;

public class MaterialLanguage extends Language {

  public static final MaterialLanguage language = new MaterialLanguage();

  private MaterialLanguage() {
    super("Ogre3d-material-script");
  }
}
