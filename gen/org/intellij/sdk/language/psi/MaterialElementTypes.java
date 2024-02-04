// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.ogre.scriptlsp.lang.MaterialElementType;
import com.ogre.scriptlsp.lang.psi.MaterialTokenType;
import org.intellij.sdk.language.psi.impl.*;

public interface MaterialElementTypes {

  IElementType MATERIAL_BLOCK = new MaterialElementType("MATERIAL_BLOCK");
  IElementType MATERIAL_ITEM = new MaterialElementType("MATERIAL_ITEM");
  IElementType MATERIAL_NAME = new MaterialElementType("MATERIAL_NAME");
  IElementType MATERIAL_PARENT = new MaterialElementType("MATERIAL_PARENT");
  IElementType MATERIAL_PASS = new MaterialElementType("MATERIAL_PASS");
  IElementType MATERIAL_PASS_ITEM = new MaterialElementType("MATERIAL_PASS_ITEM");
  IElementType MATERIAL_PASS_NAME = new MaterialElementType("MATERIAL_PASS_NAME");
  IElementType MATERIAL_PASS_PARENT = new MaterialElementType("MATERIAL_PASS_PARENT");
  IElementType MATERIAL_PROGRAM = new MaterialElementType("MATERIAL_PROGRAM");
  IElementType MATERIAL_PROGRAM_ITEM = new MaterialElementType("MATERIAL_PROGRAM_ITEM");
  IElementType MATERIAL_PROGRAM_TYPE = new MaterialElementType("MATERIAL_PROGRAM_TYPE");
  IElementType MATERIAL_TECHNIQUE = new MaterialElementType("MATERIAL_TECHNIQUE");
  IElementType MATERIAL_TECHNIQUE_ITEM = new MaterialElementType("MATERIAL_TECHNIQUE_ITEM");
  IElementType MATERIAL_TEXTURE = new MaterialElementType("MATERIAL_TEXTURE");
  IElementType MATERIAL_TEXTURE_ITEM = new MaterialElementType("MATERIAL_TEXTURE_ITEM");
  IElementType MATERIAL_TEXTURE_NAME = new MaterialElementType("MATERIAL_TEXTURE_NAME");
  IElementType PARAM = new MaterialElementType("PARAM");
  IElementType PROGRAM_BLOCK = new MaterialElementType("PROGRAM_BLOCK");
  IElementType PROGRAM_DEFAULT = new MaterialElementType("PROGRAM_DEFAULT");
  IElementType PROGRAM_DEFAULT_ITEM = new MaterialElementType("PROGRAM_DEFAULT_ITEM");
  IElementType PROGRAM_OPT = new MaterialElementType("PROGRAM_OPT");
  IElementType PROGRAM_TYPE = new MaterialElementType("PROGRAM_TYPE");

  IElementType ABSTRACT = new MaterialTokenType("abstract");
  IElementType COLON = new MaterialTokenType(":");
  IElementType DEFAULT_PARAMS = new MaterialTokenType("default_params");
  IElementType ENDL = new MaterialTokenType("\\n");
  IElementType ENTRY_POINT = new MaterialTokenType("entry_point");
  IElementType FRAGMENT_PROGRAM = new MaterialTokenType("fragment_program");
  IElementType FRAGMENT_PROGRAM_REF = new MaterialTokenType("fragment_program_ref");
  IElementType IDENTIFIER = new MaterialTokenType("IDENTIFIER");
  IElementType IMPORT = new MaterialTokenType("import");
  IElementType LBRACE = new MaterialTokenType("{");
  IElementType MATCH_LITERAL = new MaterialTokenType("MATCH_LITERAL");
  IElementType MATERIAL = new MaterialTokenType("material");
  IElementType NUMERIC_LITERAL = new MaterialTokenType("NUMERIC_LITERAL");
  IElementType PASS = new MaterialTokenType("pass");
  IElementType PROFILES = new MaterialTokenType("profiles");
  IElementType RBRACE = new MaterialTokenType("}");
  IElementType STRING_LITERAL = new MaterialTokenType("STRING_LITERAL");
  IElementType TECHNIQUE = new MaterialTokenType("technique");
  IElementType TEXTURE_UNIT = new MaterialTokenType("texture_unit");
  IElementType VARIABLE = new MaterialTokenType("VARIABLE");
  IElementType VERTEX_PROGRAM = new MaterialTokenType("vertex_program");
  IElementType VERTEX_PROGRAM_REF = new MaterialTokenType("vertex_program_ref");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == MATERIAL_BLOCK) {
        return new MaterialMaterialBlockIml(node);
      }
      else if (type == MATERIAL_ITEM) {
        return new MaterialMaterialItemIml(node);
      }
      else if (type == MATERIAL_NAME) {
        return new MaterialMaterialNameIml(node);
      }
      else if (type == MATERIAL_PARENT) {
        return new MaterialMaterialParentIml(node);
      }
      else if (type == MATERIAL_PASS) {
        return new MaterialMaterialPassIml(node);
      }
      else if (type == MATERIAL_PASS_ITEM) {
        return new MaterialMaterialPassItemIml(node);
      }
      else if (type == MATERIAL_PASS_NAME) {
        return new MaterialMaterialPassNameIml(node);
      }
      else if (type == MATERIAL_PASS_PARENT) {
        return new MaterialMaterialPassParentIml(node);
      }
      else if (type == MATERIAL_PROGRAM) {
        return new MaterialMaterialProgramIml(node);
      }
      else if (type == MATERIAL_PROGRAM_ITEM) {
        return new MaterialMaterialProgramItemIml(node);
      }
      else if (type == MATERIAL_PROGRAM_TYPE) {
        return new MaterialMaterialProgramTypeIml(node);
      }
      else if (type == MATERIAL_TECHNIQUE) {
        return new MaterialMaterialTechniqueIml(node);
      }
      else if (type == MATERIAL_TECHNIQUE_ITEM) {
        return new MaterialMaterialTechniqueItemIml(node);
      }
      else if (type == MATERIAL_TEXTURE) {
        return new MaterialMaterialTextureIml(node);
      }
      else if (type == MATERIAL_TEXTURE_ITEM) {
        return new MaterialMaterialTextureItemIml(node);
      }
      else if (type == MATERIAL_TEXTURE_NAME) {
        return new MaterialMaterialTextureNameIml(node);
      }
      else if (type == PARAM) {
        return new MaterialParamIml(node);
      }
      else if (type == PROGRAM_BLOCK) {
        return new MaterialProgramBlockIml(node);
      }
      else if (type == PROGRAM_DEFAULT) {
        return new MaterialProgramDefaultIml(node);
      }
      else if (type == PROGRAM_DEFAULT_ITEM) {
        return new MaterialProgramDefaultItemIml(node);
      }
      else if (type == PROGRAM_OPT) {
        return new MaterialProgramOptIml(node);
      }
      else if (type == PROGRAM_TYPE) {
        return new MaterialProgramTypeIml(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
