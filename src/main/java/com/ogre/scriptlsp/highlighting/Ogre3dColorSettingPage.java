package com.ogre.scriptlsp.highlighting;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory;
import com.intellij.openapi.options.OptionsBundle;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import com.intellij.openapi.util.NlsContexts.ConfigurableName;
import com.ogre.scriptlsp.lang.MaterialIcon;
import com.ogre.scriptlsp.lang.MaterialLanguage;
import java.util.Map;
import javax.swing.Icon;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Ogre3dColorSettingPage implements ColorSettingsPage {

  @Override
  public @Nullable Icon getIcon() {
    return MaterialIcon.icon;
  }

  @Override
  public @NotNull SyntaxHighlighter getHighlighter() {
    return SyntaxHighlighterFactory.getSyntaxHighlighter(MaterialLanguage.language, null, null);
  }

  @Override
  public @NonNls @NotNull String getDemoText() {
    return "";
  }

  @Override
  public @Nullable Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
    return null;
  }

  @Override
  public AttributesDescriptor @NotNull [] getAttributeDescriptors() {
    return new AttributesDescriptor[]{
        new AttributesDescriptor(
            OptionsBundle.messagePointer("options.language.defaults.line.comment"),
            Ogre3dColors.COMMENT
        ),
        new AttributesDescriptor(
            OptionsBundle.messagePointer("options.language.defaults.brackets"),
            Ogre3dColors.BRACKETS
        ),
    };
  }

  @Override
  public ColorDescriptor @NotNull [] getColorDescriptors() {
    return ColorDescriptor.EMPTY_ARRAY;
  }

  @Override
  public @NotNull @ConfigurableName String getDisplayName() {
    return MaterialLanguage.language.getDisplayName();
  }
}
