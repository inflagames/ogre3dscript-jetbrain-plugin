package com.ogre.scriptlsp.lang;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.NlsContexts.Label;
import com.intellij.openapi.util.NlsSafe;
import javax.swing.Icon;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public final class MaterialFileType extends LanguageFileType {

  public static final MaterialFileType instance = new MaterialFileType();

  private MaterialFileType() {
    super(MaterialLanguage.language);
  }

  @Override
  public @NonNls @NotNull String getName() {
    return "Ogre3d scripting";
  }

  @Override
  public @Label @NotNull String getDescription() {
    return "Ogre3d material scripting";
  }

  @Override
  public @NlsSafe @NotNull String getDefaultExtension() {
    return "material";
  }

  @Override
  public Icon getIcon() {
    return MaterialIcon.icon;
  }
}
