// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static org.intellij.sdk.language.psi.MaterialElementTypes.*;
import static com.ogre.scriptlsp.lang.parser.MaterialParserUtil.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class MaterialParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return Script(b, l + 1);
  }

  /* ********************************************************** */
  // ABSTRACT AbstractItem*
  public static boolean AbstractBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AbstractBlock")) return false;
    if (!nextTokenIs(b, ABSTRACT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ABSTRACT);
    r = r && AbstractBlock_1(b, l + 1);
    exit_section_(b, m, ABSTRACT_BLOCK, r);
    return r;
  }

  // AbstractItem*
  private static boolean AbstractBlock_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AbstractBlock_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!AbstractItem(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AbstractBlock_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // AbstractMaterial | AbstractTechnique | AbstractPass | AbstractTexture
  public static boolean AbstractItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AbstractItem")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ABSTRACT_ITEM, "<abstract item>");
    r = AbstractMaterial(b, l + 1);
    if (!r) r = AbstractTechnique(b, l + 1);
    if (!r) r = AbstractPass(b, l + 1);
    if (!r) r = AbstractTexture(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // MATERIAL IDENTIFIER ENDL* LBRACE MaterialItem* RBRACE
  public static boolean AbstractMaterial(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AbstractMaterial")) return false;
    if (!nextTokenIs(b, MATERIAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, MATERIAL, IDENTIFIER);
    r = r && AbstractMaterial_2(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && AbstractMaterial_4(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, ABSTRACT_MATERIAL, r);
    return r;
  }

  // ENDL*
  private static boolean AbstractMaterial_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AbstractMaterial_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, ENDL)) break;
      if (!empty_element_parsed_guard_(b, "AbstractMaterial_2", c)) break;
    }
    return true;
  }

  // MaterialItem*
  private static boolean AbstractMaterial_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AbstractMaterial_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MaterialItem(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AbstractMaterial_4", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // PASS IDENTIFIER ENDL* LBRACE MaterialPassItem* RBRACE
  public static boolean AbstractPass(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AbstractPass")) return false;
    if (!nextTokenIs(b, PASS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PASS, IDENTIFIER);
    r = r && AbstractPass_2(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && AbstractPass_4(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, ABSTRACT_PASS, r);
    return r;
  }

  // ENDL*
  private static boolean AbstractPass_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AbstractPass_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, ENDL)) break;
      if (!empty_element_parsed_guard_(b, "AbstractPass_2", c)) break;
    }
    return true;
  }

  // MaterialPassItem*
  private static boolean AbstractPass_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AbstractPass_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MaterialPassItem(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AbstractPass_4", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // TECHNIQUE IDENTIFIER ENDL* LBRACE MaterialTechniqueItem* RBRACE
  public static boolean AbstractTechnique(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AbstractTechnique")) return false;
    if (!nextTokenIs(b, TECHNIQUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TECHNIQUE, IDENTIFIER);
    r = r && AbstractTechnique_2(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && AbstractTechnique_4(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, ABSTRACT_TECHNIQUE, r);
    return r;
  }

  // ENDL*
  private static boolean AbstractTechnique_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AbstractTechnique_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, ENDL)) break;
      if (!empty_element_parsed_guard_(b, "AbstractTechnique_2", c)) break;
    }
    return true;
  }

  // MaterialTechniqueItem*
  private static boolean AbstractTechnique_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AbstractTechnique_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MaterialTechniqueItem(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AbstractTechnique_4", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // TEXTURE_UNIT IDENTIFIER ENDL* LBRACE MaterialTextureItem* RBRACE
  public static boolean AbstractTexture(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AbstractTexture")) return false;
    if (!nextTokenIs(b, TEXTURE_UNIT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TEXTURE_UNIT, IDENTIFIER);
    r = r && AbstractTexture_2(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && AbstractTexture_4(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, ABSTRACT_TEXTURE, r);
    return r;
  }

  // ENDL*
  private static boolean AbstractTexture_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AbstractTexture_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, ENDL)) break;
      if (!empty_element_parsed_guard_(b, "AbstractTexture_2", c)) break;
    }
    return true;
  }

  // MaterialTextureItem*
  private static boolean AbstractTexture_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AbstractTexture_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MaterialTextureItem(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AbstractTexture_4", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // FRAGMENT_PROGRAM | VERTEX_PROGRAM | MATERIAL | ABSTRACT
  static boolean DeclarationToken(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclarationToken")) return false;
    boolean r;
    r = consumeToken(b, FRAGMENT_PROGRAM);
    if (!r) r = consumeToken(b, VERTEX_PROGRAM);
    if (!r) r = consumeToken(b, MATERIAL);
    if (!r) r = consumeToken(b, ABSTRACT);
    return r;
  }

  /* ********************************************************** */
  // IMPORT ImportName FROM ImportSource ENDL
  public static boolean ImportBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportBlock")) return false;
    if (!nextTokenIs(b, IMPORT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IMPORT);
    r = r && ImportName(b, l + 1);
    r = r && consumeToken(b, FROM);
    r = r && ImportSource(b, l + 1);
    r = r && consumeToken(b, ENDL);
    exit_section_(b, m, IMPORT_BLOCK, r);
    return r;
  }

  /* ********************************************************** */
  // ASTERISK | IDENTIFIER
  public static boolean ImportName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportName")) return false;
    if (!nextTokenIs(b, "<import name>", ASTERISK, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IMPORT_NAME, "<import name>");
    r = consumeToken(b, ASTERISK);
    if (!r) r = consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // STRING_LITERAL | IDENTIFIER
  public static boolean ImportSource(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportSource")) return false;
    if (!nextTokenIs(b, "<import source>", IDENTIFIER, STRING_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IMPORT_SOURCE, "<import source>");
    r = consumeToken(b, STRING_LITERAL);
    if (!r) r = consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // MATERIAL MaterialName MaterialParent? ENDL* LBRACE MaterialItem* RBRACE
  public static boolean MaterialBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaterialBlock")) return false;
    if (!nextTokenIs(b, MATERIAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MATERIAL);
    r = r && MaterialName(b, l + 1);
    r = r && MaterialBlock_2(b, l + 1);
    r = r && MaterialBlock_3(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && MaterialBlock_5(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, MATERIAL_BLOCK, r);
    return r;
  }

  // MaterialParent?
  private static boolean MaterialBlock_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaterialBlock_2")) return false;
    MaterialParent(b, l + 1);
    return true;
  }

  // ENDL*
  private static boolean MaterialBlock_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaterialBlock_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, ENDL)) break;
      if (!empty_element_parsed_guard_(b, "MaterialBlock_3", c)) break;
    }
    return true;
  }

  // MaterialItem*
  private static boolean MaterialBlock_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaterialBlock_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MaterialItem(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MaterialBlock_5", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // MaterialTechnique | ParamLine | ENDL
  public static boolean MaterialItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaterialItem")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MATERIAL_ITEM, "<material item>");
    r = MaterialTechnique(b, l + 1);
    if (!r) r = ParamLine(b, l + 1);
    if (!r) r = consumeToken(b, ENDL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean MaterialName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaterialName")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, MATERIAL_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // COLON IDENTIFIER
  public static boolean MaterialParent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaterialParent")) return false;
    if (!nextTokenIs(b, COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COLON, IDENTIFIER);
    exit_section_(b, m, MATERIAL_PARENT, r);
    return r;
  }

  /* ********************************************************** */
  // PASS IDENTIFIER* MaterialPassParent? ENDL* LBRACE MaterialPassItem* RBRACE
  public static boolean MaterialPass(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaterialPass")) return false;
    if (!nextTokenIs(b, PASS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PASS);
    r = r && MaterialPass_1(b, l + 1);
    r = r && MaterialPass_2(b, l + 1);
    r = r && MaterialPass_3(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && MaterialPass_5(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, MATERIAL_PASS, r);
    return r;
  }

  // IDENTIFIER*
  private static boolean MaterialPass_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaterialPass_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "MaterialPass_1", c)) break;
    }
    return true;
  }

  // MaterialPassParent?
  private static boolean MaterialPass_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaterialPass_2")) return false;
    MaterialPassParent(b, l + 1);
    return true;
  }

  // ENDL*
  private static boolean MaterialPass_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaterialPass_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, ENDL)) break;
      if (!empty_element_parsed_guard_(b, "MaterialPass_3", c)) break;
    }
    return true;
  }

  // MaterialPassItem*
  private static boolean MaterialPass_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaterialPass_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MaterialPassItem(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MaterialPass_5", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ParamLine | MaterialTexture | MaterialProgram | RtShaderSystem | ENDL
  public static boolean MaterialPassItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaterialPassItem")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MATERIAL_PASS_ITEM, "<material pass item>");
    r = ParamLine(b, l + 1);
    if (!r) r = MaterialTexture(b, l + 1);
    if (!r) r = MaterialProgram(b, l + 1);
    if (!r) r = RtShaderSystem(b, l + 1);
    if (!r) r = consumeToken(b, ENDL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // COLON IDENTIFIER | MATCH_LITERAL
  public static boolean MaterialPassParent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaterialPassParent")) return false;
    if (!nextTokenIs(b, "<material pass parent>", COLON, MATCH_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MATERIAL_PASS_PARENT, "<material pass parent>");
    r = parseTokens(b, 0, COLON, IDENTIFIER);
    if (!r) r = consumeToken(b, MATCH_LITERAL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // MaterialProgramType IDENTIFIER ENDL* LBRACE MaterialProgramItem* RBRACE
  public static boolean MaterialProgram(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaterialProgram")) return false;
    if (!nextTokenIs(b, "<material program>", FRAGMENT_PROGRAM_REF, VERTEX_PROGRAM_REF)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MATERIAL_PROGRAM, "<material program>");
    r = MaterialProgramType(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && MaterialProgram_2(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && MaterialProgram_4(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ENDL*
  private static boolean MaterialProgram_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaterialProgram_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, ENDL)) break;
      if (!empty_element_parsed_guard_(b, "MaterialProgram_2", c)) break;
    }
    return true;
  }

  // MaterialProgramItem*
  private static boolean MaterialProgram_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaterialProgram_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MaterialProgramItem(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MaterialProgram_4", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ParamLine | SharedParamRef | ENDL
  public static boolean MaterialProgramItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaterialProgramItem")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MATERIAL_PROGRAM_ITEM, "<material program item>");
    r = ParamLine(b, l + 1);
    if (!r) r = SharedParamRef(b, l + 1);
    if (!r) r = consumeToken(b, ENDL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // VERTEX_PROGRAM_REF | FRAGMENT_PROGRAM_REF
  public static boolean MaterialProgramType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaterialProgramType")) return false;
    if (!nextTokenIs(b, "<material program type>", FRAGMENT_PROGRAM_REF, VERTEX_PROGRAM_REF)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MATERIAL_PROGRAM_TYPE, "<material program type>");
    r = consumeToken(b, VERTEX_PROGRAM_REF);
    if (!r) r = consumeToken(b, FRAGMENT_PROGRAM_REF);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SAMPLER_REF IDENTIFIER ENDL
  public static boolean MaterialSamplerRef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaterialSamplerRef")) return false;
    if (!nextTokenIs(b, SAMPLER_REF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SAMPLER_REF, IDENTIFIER, ENDL);
    exit_section_(b, m, MATERIAL_SAMPLER_REF, r);
    return r;
  }

  /* ********************************************************** */
  // TECHNIQUE IDENTIFIER* LBRACE ENDL* MaterialTechniqueItem* RBRACE
  public static boolean MaterialTechnique(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaterialTechnique")) return false;
    if (!nextTokenIs(b, TECHNIQUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TECHNIQUE);
    r = r && MaterialTechnique_1(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && MaterialTechnique_3(b, l + 1);
    r = r && MaterialTechnique_4(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, MATERIAL_TECHNIQUE, r);
    return r;
  }

  // IDENTIFIER*
  private static boolean MaterialTechnique_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaterialTechnique_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "MaterialTechnique_1", c)) break;
    }
    return true;
  }

  // ENDL*
  private static boolean MaterialTechnique_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaterialTechnique_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, ENDL)) break;
      if (!empty_element_parsed_guard_(b, "MaterialTechnique_3", c)) break;
    }
    return true;
  }

  // MaterialTechniqueItem*
  private static boolean MaterialTechnique_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaterialTechnique_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MaterialTechniqueItem(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MaterialTechnique_4", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // MaterialPass | ParamLine | Technique_shadow_material | ENDL
  public static boolean MaterialTechniqueItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaterialTechniqueItem")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MATERIAL_TECHNIQUE_ITEM, "<material technique item>");
    r = MaterialPass(b, l + 1);
    if (!r) r = ParamLine(b, l + 1);
    if (!r) r = Technique_shadow_material(b, l + 1);
    if (!r) r = consumeToken(b, ENDL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TEXTURE_UNIT MaterialTextureName+ ENDL* LBRACE MaterialTextureItem* RBRACE
  public static boolean MaterialTexture(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaterialTexture")) return false;
    if (!nextTokenIs(b, TEXTURE_UNIT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TEXTURE_UNIT);
    r = r && MaterialTexture_1(b, l + 1);
    r = r && MaterialTexture_2(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && MaterialTexture_4(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, MATERIAL_TEXTURE, r);
    return r;
  }

  // MaterialTextureName+
  private static boolean MaterialTexture_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaterialTexture_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MaterialTextureName(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!MaterialTextureName(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MaterialTexture_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ENDL*
  private static boolean MaterialTexture_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaterialTexture_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, ENDL)) break;
      if (!empty_element_parsed_guard_(b, "MaterialTexture_2", c)) break;
    }
    return true;
  }

  // MaterialTextureItem*
  private static boolean MaterialTexture_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaterialTexture_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MaterialTextureItem(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MaterialTexture_4", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ParamLine | MaterialSamplerRef | MaterialTextureSource | RtShaderSystem | ENDL
  public static boolean MaterialTextureItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaterialTextureItem")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MATERIAL_TEXTURE_ITEM, "<material texture item>");
    r = ParamLine(b, l + 1);
    if (!r) r = MaterialSamplerRef(b, l + 1);
    if (!r) r = MaterialTextureSource(b, l + 1);
    if (!r) r = RtShaderSystem(b, l + 1);
    if (!r) r = consumeToken(b, ENDL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean MaterialTextureName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaterialTextureName")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, MATERIAL_TEXTURE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // TEXTURE_SOURCE IDENTIFIER* ENDL* LBRACE MaterialTextureSourceItem* RBRACE
  public static boolean MaterialTextureSource(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaterialTextureSource")) return false;
    if (!nextTokenIs(b, TEXTURE_SOURCE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TEXTURE_SOURCE);
    r = r && MaterialTextureSource_1(b, l + 1);
    r = r && MaterialTextureSource_2(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && MaterialTextureSource_4(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, MATERIAL_TEXTURE_SOURCE, r);
    return r;
  }

  // IDENTIFIER*
  private static boolean MaterialTextureSource_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaterialTextureSource_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "MaterialTextureSource_1", c)) break;
    }
    return true;
  }

  // ENDL*
  private static boolean MaterialTextureSource_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaterialTextureSource_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, ENDL)) break;
      if (!empty_element_parsed_guard_(b, "MaterialTextureSource_2", c)) break;
    }
    return true;
  }

  // MaterialTextureSourceItem*
  private static boolean MaterialTextureSource_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaterialTextureSource_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MaterialTextureSourceItem(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MaterialTextureSource_4", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ParamLine | ENDL
  public static boolean MaterialTextureSourceItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaterialTextureSourceItem")) return false;
    if (!nextTokenIs(b, "<material texture source item>", ENDL, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MATERIAL_TEXTURE_SOURCE_ITEM, "<material texture source item>");
    r = ParamLine(b, l + 1);
    if (!r) r = consumeToken(b, ENDL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER | STRING_LITERAL | NUMERIC_LITERAL | VARIABLE
  public static boolean Param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Param")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAM, "<param>");
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, STRING_LITERAL);
    if (!r) r = consumeToken(b, NUMERIC_LITERAL);
    if (!r) r = consumeToken(b, VARIABLE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER Param* ENDL
  static boolean ParamLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParamLine")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && ParamLine_1(b, l + 1);
    r = r && consumeToken(b, ENDL);
    exit_section_(b, m, null, r);
    return r;
  }

  // Param*
  private static boolean ParamLine_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParamLine_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Param(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ParamLine_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ProgramType IDENTIFIER+ ENDL* LBRACE ProgramItem* RBRACE
  public static boolean ProgramBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProgramBlock")) return false;
    if (!nextTokenIs(b, "<program block>", FRAGMENT_PROGRAM, VERTEX_PROGRAM)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROGRAM_BLOCK, "<program block>");
    r = ProgramType(b, l + 1);
    r = r && ProgramBlock_1(b, l + 1);
    r = r && ProgramBlock_2(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && ProgramBlock_4(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // IDENTIFIER+
  private static boolean ProgramBlock_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProgramBlock_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "ProgramBlock_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ENDL*
  private static boolean ProgramBlock_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProgramBlock_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, ENDL)) break;
      if (!empty_element_parsed_guard_(b, "ProgramBlock_2", c)) break;
    }
    return true;
  }

  // ProgramItem*
  private static boolean ProgramBlock_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProgramBlock_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ProgramItem(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ProgramBlock_4", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // DEFAULT_PARAMS LBRACE ProgramDefaultItem* RBRACE
  public static boolean ProgramDefault(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProgramDefault")) return false;
    if (!nextTokenIs(b, DEFAULT_PARAMS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DEFAULT_PARAMS, LBRACE);
    r = r && ProgramDefault_2(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, PROGRAM_DEFAULT, r);
    return r;
  }

  // ProgramDefaultItem*
  private static boolean ProgramDefault_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProgramDefault_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ProgramDefaultItem(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ProgramDefault_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ParamLine
  public static boolean ProgramDefaultItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProgramDefaultItem")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ParamLine(b, l + 1);
    exit_section_(b, m, PROGRAM_DEFAULT_ITEM, r);
    return r;
  }

  /* ********************************************************** */
  // ParamLine | ProgramDefault | SharedParamRef | ENDL
  static boolean ProgramItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProgramItem")) return false;
    boolean r;
    r = ParamLine(b, l + 1);
    if (!r) r = ProgramDefault(b, l + 1);
    if (!r) r = SharedParamRef(b, l + 1);
    if (!r) r = consumeToken(b, ENDL);
    return r;
  }

  /* ********************************************************** */
  // FRAGMENT_PROGRAM | VERTEX_PROGRAM
  public static boolean ProgramType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProgramType")) return false;
    if (!nextTokenIs(b, "<program type>", FRAGMENT_PROGRAM, VERTEX_PROGRAM)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROGRAM_TYPE, "<program type>");
    r = consumeToken(b, FRAGMENT_PROGRAM);
    if (!r) r = consumeToken(b, VERTEX_PROGRAM);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // !DeclarationToken
  static boolean RecoverDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RecoverDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !DeclarationToken(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // RTSHADER_SYSTEM IDENTIFIER+ ENDL* LBRACE RtShaderSystemItem* RBRACE
  public static boolean RtShaderSystem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RtShaderSystem")) return false;
    if (!nextTokenIs(b, RTSHADER_SYSTEM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RTSHADER_SYSTEM);
    r = r && RtShaderSystem_1(b, l + 1);
    r = r && RtShaderSystem_2(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && RtShaderSystem_4(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, RT_SHADER_SYSTEM, r);
    return r;
  }

  // IDENTIFIER+
  private static boolean RtShaderSystem_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RtShaderSystem_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "RtShaderSystem_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ENDL*
  private static boolean RtShaderSystem_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RtShaderSystem_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, ENDL)) break;
      if (!empty_element_parsed_guard_(b, "RtShaderSystem_2", c)) break;
    }
    return true;
  }

  // RtShaderSystemItem*
  private static boolean RtShaderSystem_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RtShaderSystem_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!RtShaderSystemItem(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RtShaderSystem_4", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ParamLine | ENDL
  public static boolean RtShaderSystemItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RtShaderSystemItem")) return false;
    if (!nextTokenIs(b, "<rt shader system item>", ENDL, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RT_SHADER_SYSTEM_ITEM, "<rt shader system item>");
    r = ParamLine(b, l + 1);
    if (!r) r = consumeToken(b, ENDL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SAMPLER IDENTIFIER ENDL* LBRACE SamplerItem* RBRACE
  public static boolean SamplerBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SamplerBlock")) return false;
    if (!nextTokenIs(b, SAMPLER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SAMPLER, IDENTIFIER);
    r = r && SamplerBlock_2(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && SamplerBlock_4(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, SAMPLER_BLOCK, r);
    return r;
  }

  // ENDL*
  private static boolean SamplerBlock_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SamplerBlock_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, ENDL)) break;
      if (!empty_element_parsed_guard_(b, "SamplerBlock_2", c)) break;
    }
    return true;
  }

  // SamplerItem*
  private static boolean SamplerBlock_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SamplerBlock_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!SamplerItem(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SamplerBlock_4", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ParamLine | ENDL
  public static boolean SamplerItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SamplerItem")) return false;
    if (!nextTokenIs(b, "<sampler item>", ENDL, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SAMPLER_ITEM, "<sampler item>");
    r = ParamLine(b, l + 1);
    if (!r) r = consumeToken(b, ENDL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ScriptBody*
  static boolean Script(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Script")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ScriptBody(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Script", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ImportBlock | SamplerBlock | AbstractBlock | ProgramBlock | MaterialBlock | ENDL
  static boolean ScriptBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ScriptBody")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_);
    r = ImportBlock(b, l + 1);
    if (!r) r = SamplerBlock(b, l + 1);
    if (!r) r = AbstractBlock(b, l + 1);
    if (!r) r = ProgramBlock(b, l + 1);
    if (!r) r = MaterialBlock(b, l + 1);
    if (!r) r = consumeToken(b, ENDL);
    exit_section_(b, l, m, r, false, MaterialParser::RecoverDeclaration);
    return r;
  }

  /* ********************************************************** */
  // SHARED_PARAMS_REF IDENTIFIER ENDL
  public static boolean SharedParamRef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SharedParamRef")) return false;
    if (!nextTokenIs(b, SHARED_PARAMS_REF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SHARED_PARAMS_REF, IDENTIFIER, ENDL);
    exit_section_(b, m, SHARED_PARAM_REF, r);
    return r;
  }

  /* ********************************************************** */
  // Technique_shadow_materialType IDENTIFIER ENDL
  public static boolean Technique_shadow_material(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Technique_shadow_material")) return false;
    if (!nextTokenIs(b, "<technique shadow material>", SHADOW_CASTER_MATERIAL, SHADOW_RECEIVER_MATERIAL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TECHNIQUE_SHADOW_MATERIAL, "<technique shadow material>");
    r = Technique_shadow_materialType(b, l + 1);
    r = r && consumeTokens(b, 0, IDENTIFIER, ENDL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SHADOW_CASTER_MATERIAL | SHADOW_RECEIVER_MATERIAL
  public static boolean Technique_shadow_materialType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Technique_shadow_materialType")) return false;
    if (!nextTokenIs(b, "<technique shadow material type>", SHADOW_CASTER_MATERIAL, SHADOW_RECEIVER_MATERIAL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TECHNIQUE_SHADOW_MATERIAL_TYPE, "<technique shadow material type>");
    r = consumeToken(b, SHADOW_CASTER_MATERIAL);
    if (!r) r = consumeToken(b, SHADOW_RECEIVER_MATERIAL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
