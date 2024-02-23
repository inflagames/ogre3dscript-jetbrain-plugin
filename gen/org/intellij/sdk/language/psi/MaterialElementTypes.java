// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.ogre.scriptlsp.lang.MaterialElementType;
import com.ogre.scriptlsp.lang.psi.MaterialTokenType;
import org.intellij.sdk.language.psi.impl.*;

public interface MaterialElementTypes {

  IElementType ABSTRACT_BLOCK = new MaterialElementType("ABSTRACT_BLOCK");
  IElementType ABSTRACT_ITEM = new MaterialElementType("ABSTRACT_ITEM");
  IElementType ABSTRACT_MATERIAL = new MaterialElementType("ABSTRACT_MATERIAL");
  IElementType ABSTRACT_PASS = new MaterialElementType("ABSTRACT_PASS");
  IElementType ABSTRACT_TECHNIQUE = new MaterialElementType("ABSTRACT_TECHNIQUE");
  IElementType ABSTRACT_TEXTURE = new MaterialElementType("ABSTRACT_TEXTURE");
  IElementType IMPORT_BLOCK = new MaterialElementType("IMPORT_BLOCK");
  IElementType IMPORT_NAME = new MaterialElementType("IMPORT_NAME");
  IElementType IMPORT_SOURCE = new MaterialElementType("IMPORT_SOURCE");
  IElementType MATERIAL_BLOCK = new MaterialElementType("MATERIAL_BLOCK");
  IElementType MATERIAL_ITEM = new MaterialElementType("MATERIAL_ITEM");
  IElementType MATERIAL_NAME = new MaterialElementType("MATERIAL_NAME");
  IElementType MATERIAL_PARENT = new MaterialElementType("MATERIAL_PARENT");
  IElementType MATERIAL_PASS = new MaterialElementType("MATERIAL_PASS");
  IElementType MATERIAL_PASS_ITEM = new MaterialElementType("MATERIAL_PASS_ITEM");
  IElementType MATERIAL_PASS_PARENT = new MaterialElementType("MATERIAL_PASS_PARENT");
  IElementType MATERIAL_PROGRAM = new MaterialElementType("MATERIAL_PROGRAM");
  IElementType MATERIAL_PROGRAM_ITEM = new MaterialElementType("MATERIAL_PROGRAM_ITEM");
  IElementType MATERIAL_PROGRAM_TYPE = new MaterialElementType("MATERIAL_PROGRAM_TYPE");
  IElementType MATERIAL_SAMPLER_REF = new MaterialElementType("MATERIAL_SAMPLER_REF");
  IElementType MATERIAL_TECHNIQUE = new MaterialElementType("MATERIAL_TECHNIQUE");
  IElementType MATERIAL_TECHNIQUE_ITEM = new MaterialElementType("MATERIAL_TECHNIQUE_ITEM");
  IElementType MATERIAL_TEXTURE = new MaterialElementType("MATERIAL_TEXTURE");
  IElementType MATERIAL_TEXTURE_ITEM = new MaterialElementType("MATERIAL_TEXTURE_ITEM");
  IElementType MATERIAL_TEXTURE_NAME = new MaterialElementType("MATERIAL_TEXTURE_NAME");
  IElementType MATERIAL_TEXTURE_SOURCE = new MaterialElementType("MATERIAL_TEXTURE_SOURCE");
  IElementType MATERIAL_TEXTURE_SOURCE_ITEM = new MaterialElementType("MATERIAL_TEXTURE_SOURCE_ITEM");
  IElementType PARAM = new MaterialElementType("PARAM");
  IElementType PROGRAM_BLOCK = new MaterialElementType("PROGRAM_BLOCK");
  IElementType PROGRAM_DEFAULT = new MaterialElementType("PROGRAM_DEFAULT");
  IElementType PROGRAM_DEFAULT_ITEM = new MaterialElementType("PROGRAM_DEFAULT_ITEM");
  IElementType PROGRAM_TYPE = new MaterialElementType("PROGRAM_TYPE");
  IElementType RT_SHADER_SYSTEM = new MaterialElementType("RT_SHADER_SYSTEM");
  IElementType RT_SHADER_SYSTEM_ITEM = new MaterialElementType("RT_SHADER_SYSTEM_ITEM");
  IElementType SAMPLER_BLOCK = new MaterialElementType("SAMPLER_BLOCK");
  IElementType SAMPLER_ITEM = new MaterialElementType("SAMPLER_ITEM");
  IElementType SHARED_PARAM_REF = new MaterialElementType("SHARED_PARAM_REF");
  IElementType TECHNIQUE_SHADOW_MATERIAL = new MaterialElementType("TECHNIQUE_SHADOW_MATERIAL");
  IElementType TECHNIQUE_SHADOW_MATERIAL_TYPE = new MaterialElementType("TECHNIQUE_SHADOW_MATERIAL_TYPE");

  IElementType ABSTRACT = new MaterialTokenType("abstract");
  IElementType ASTERISK = new MaterialTokenType("*");
  IElementType COLON = new MaterialTokenType(":");
  IElementType COMMA = new MaterialTokenType(",");
  IElementType COMPUTE_PROGRAM = new MaterialTokenType("compute_program");
  IElementType COMPUTE_PROGRAM_REF = new MaterialTokenType("compute_program_ref");
  IElementType DEFAULT_PARAMS = new MaterialTokenType("default_params");
  IElementType ENDL = new MaterialTokenType("\\n");
  IElementType FRAGMENT_PROGRAM = new MaterialTokenType("fragment_program");
  IElementType FRAGMENT_PROGRAM_REF = new MaterialTokenType("fragment_program_ref");
  IElementType FROM = new MaterialTokenType("from");
  IElementType GEOMETRY_PROGRAM = new MaterialTokenType("geometry_program");
  IElementType GEOMETRY_PROGRAM_REF = new MaterialTokenType("geometry_program_ref");
  IElementType IDENTIFIER = new MaterialTokenType("IDENTIFIER");
  IElementType IMPORT = new MaterialTokenType("import");
  IElementType LBRACE = new MaterialTokenType("{");
  IElementType MATCH_LITERAL = new MaterialTokenType("MATCH_LITERAL");
  IElementType MATERIAL = new MaterialTokenType("material");
  IElementType NUMERIC_LITERAL = new MaterialTokenType("NUMERIC_LITERAL");
  IElementType PASS = new MaterialTokenType("pass");
  IElementType RBRACE = new MaterialTokenType("}");
  IElementType RTSHADER_SYSTEM = new MaterialTokenType("rtshader_system");
  IElementType SAMPLER = new MaterialTokenType("sampler");
  IElementType SAMPLER_REF = new MaterialTokenType("sampler_ref");
  IElementType SHADOW_CASTER_MATERIAL = new MaterialTokenType("shadow_caster_material");
  IElementType SHADOW_RECEIVER_MATERIAL = new MaterialTokenType("shadow_receiver_material");
  IElementType SHARED_PARAMS = new MaterialTokenType("shared_params");
  IElementType SHARED_PARAMS_REF = new MaterialTokenType("shared_params_ref");
  IElementType STRING_LITERAL = new MaterialTokenType("STRING_LITERAL");
  IElementType TECHNIQUE = new MaterialTokenType("technique");
  IElementType TESSELLATION_DOMAIN_PROGRAM = new MaterialTokenType("tessellation_domain_program");
  IElementType TESSELLATION_DOMAIN_PROGRAM_REF = new MaterialTokenType("tessellation_domain_program_ref");
  IElementType TESSELLATION_HULL_PROGRAM = new MaterialTokenType("tessellation_hull_program");
  IElementType TESSELLATION_HULL_PROGRAM_REF = new MaterialTokenType("tessellation_hull_program_ref");
  IElementType TEXTURE_SOURCE = new MaterialTokenType("texture_source");
  IElementType TEXTURE_UNIT = new MaterialTokenType("texture_unit");
  IElementType VARIABLE = new MaterialTokenType("VARIABLE");
  IElementType VERTEX_PROGRAM = new MaterialTokenType("vertex_program");
  IElementType VERTEX_PROGRAM_REF = new MaterialTokenType("vertex_program_ref");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ABSTRACT_BLOCK) {
        return new MaterialAbstractBlockIml(node);
      }
      else if (type == ABSTRACT_ITEM) {
        return new MaterialAbstractItemIml(node);
      }
      else if (type == ABSTRACT_MATERIAL) {
        return new MaterialAbstractMaterialIml(node);
      }
      else if (type == ABSTRACT_PASS) {
        return new MaterialAbstractPassIml(node);
      }
      else if (type == ABSTRACT_TECHNIQUE) {
        return new MaterialAbstractTechniqueIml(node);
      }
      else if (type == ABSTRACT_TEXTURE) {
        return new MaterialAbstractTextureIml(node);
      }
      else if (type == IMPORT_BLOCK) {
        return new MaterialImportBlockIml(node);
      }
      else if (type == IMPORT_NAME) {
        return new MaterialImportNameIml(node);
      }
      else if (type == IMPORT_SOURCE) {
        return new MaterialImportSourceIml(node);
      }
      else if (type == MATERIAL_BLOCK) {
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
      else if (type == MATERIAL_SAMPLER_REF) {
        return new MaterialMaterialSamplerRefIml(node);
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
      else if (type == MATERIAL_TEXTURE_SOURCE) {
        return new MaterialMaterialTextureSourceIml(node);
      }
      else if (type == MATERIAL_TEXTURE_SOURCE_ITEM) {
        return new MaterialMaterialTextureSourceItemIml(node);
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
      else if (type == PROGRAM_TYPE) {
        return new MaterialProgramTypeIml(node);
      }
      else if (type == RT_SHADER_SYSTEM) {
        return new MaterialRtShaderSystemIml(node);
      }
      else if (type == RT_SHADER_SYSTEM_ITEM) {
        return new MaterialRtShaderSystemItemIml(node);
      }
      else if (type == SAMPLER_BLOCK) {
        return new MaterialSamplerBlockIml(node);
      }
      else if (type == SAMPLER_ITEM) {
        return new MaterialSamplerItemIml(node);
      }
      else if (type == SHARED_PARAM_REF) {
        return new MaterialSharedParamRefIml(node);
      }
      else if (type == TECHNIQUE_SHADOW_MATERIAL) {
        return new MaterialTechniqueShadowMaterialIml(node);
      }
      else if (type == TECHNIQUE_SHADOW_MATERIAL_TYPE) {
        return new MaterialTechniqueShadowMaterialTypeIml(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
