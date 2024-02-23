// Generated by JFlex 1.9.1 http://jflex.de/  (tweaked for IntelliJ platform)
// source: Material.flex

// Copyright 2000-2022 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package org.intellij.sdk.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import static com.intellij.psi.TokenType.*;

import static org.intellij.sdk.language.psi.MaterialElementTypes.*;
import static com.ogre.scriptlsp.lang.parser.MaterialParserDefinition.*;


public class _MaterialLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\1\u0100\1\u0200\1\u0300\1\u0400\1\u0500\1\u0600\1\u0700"+
    "\1\u0800\1\u0900\1\u0a00\1\u0b00\1\u0c00\1\u0d00\1\u0e00\1\u0f00"+
    "\1\u1000\1\u0100\1\u1100\1\u1200\1\u1300\1\u0100\1\u1400\1\u1500"+
    "\1\u1600\1\u1700\1\u1800\1\u1900\1\u1a00\1\u1b00\1\u0100\1\u1c00"+
    "\1\u1d00\1\u1e00\12\u1f00\1\u2000\1\u2100\1\u2200\1\u1f00\1\u2300"+
    "\1\u2400\2\u1f00\31\u0100\1\u2500\121\u0100\1\u2600\4\u0100\1\u2700"+
    "\1\u0100\1\u2800\1\u2900\1\u2a00\1\u2b00\1\u2c00\1\u2d00\53\u0100"+
    "\1\u2e00\41\u1f00\1\u0100\1\u2f00\1\u3000\1\u0100\1\u3100\1\u3200"+
    "\1\u3300\1\u3400\1\u3500\1\u3600\1\u3700\1\u3800\1\u3900\1\u0100"+
    "\1\u3a00\1\u3b00\1\u3c00\1\u3d00\1\u3e00\1\u3f00\1\u4000\1\u4100"+
    "\1\u4200\1\u4300\1\u4400\1\u4500\1\u4600\1\u4700\1\u4800\1\u4900"+
    "\1\u4a00\1\u4b00\1\u4c00\1\u4d00\1\u1f00\1\u4e00\1\u4f00\1\u5000"+
    "\1\u5100\3\u0100\1\u5200\1\u5300\1\u5400\12\u1f00\4\u0100\1\u5500"+
    "\17\u1f00\2\u0100\1\u5600\41\u1f00\2\u0100\1\u5700\1\u5800\2\u1f00"+
    "\1\u5900\1\u5a00\27\u0100\1\u5b00\4\u0100\1\u5c00\1\u5d00\42\u1f00"+
    "\1\u0100\1\u5e00\1\u5f00\11\u1f00\1\u6000\24\u1f00\1\u6100\1\u6200"+
    "\1\u1f00\1\u6300\1\u6400\1\u6500\1\u6600\2\u1f00\1\u6700\5\u1f00"+
    "\1\u6800\1\u6900\1\u6a00\5\u1f00\1\u6b00\1\u6c00\2\u1f00\1\u6d00"+
    "\1\u1f00\1\u6e00\14\u1f00\1\u6f00\4\u1f00\246\u0100\1\u7000\20\u0100"+
    "\1\u7100\1\u7200\25\u0100\1\u7300\34\u0100\1\u7400\14\u1f00\2\u0100"+
    "\1\u7500\5\u1f00\23\u0100\1\u7600\u0aec\u1f00\1\u7700\1\u7800\u02fe\u1f00";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\2\1\1\3\16\0\6\1\1\4"+
    "\1\1\1\5\5\1\1\6\1\1\1\7\1\10\1\11"+
    "\1\12\12\13\1\14\6\1\32\15\1\1\1\16\2\1"+
    "\1\17\1\1\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\2\15\1\31\1\32\1\33\1\34"+
    "\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44"+
    "\1\45\1\46\1\15\1\47\1\1\1\50\1\1\41\0"+
    "\2\1\4\15\4\1\1\15\2\1\1\0\7\1\1\15"+
    "\4\1\1\15\5\1\27\15\1\1\37\15\1\1\u01ca\15"+
    "\4\1\14\15\16\1\5\15\7\1\1\15\1\1\1\15"+
    "\21\1\160\0\5\15\1\1\2\15\2\1\4\15\1\1"+
    "\1\15\6\1\1\15\1\1\3\15\1\1\1\15\1\1"+
    "\24\15\1\1\123\15\1\1\213\15\1\1\5\0\2\1"+
    "\246\15\1\1\46\15\2\1\1\15\6\1\51\15\6\1"+
    "\1\15\1\1\55\0\1\1\1\0\1\1\2\0\1\1"+
    "\2\0\1\1\1\0\10\1\33\15\4\1\4\15\15\1"+
    "\6\0\5\1\1\15\4\1\13\0\1\1\1\0\3\1"+
    "\53\15\25\0\12\13\4\1\2\15\1\0\143\15\1\1"+
    "\1\15\10\0\1\1\6\0\2\15\2\0\1\1\4\0"+
    "\2\15\12\13\3\15\2\1\1\15\17\1\1\0\1\15"+
    "\1\0\36\15\33\0\2\1\131\15\13\0\1\15\16\1"+
    "\12\13\41\15\11\0\2\15\4\1\1\15\2\1\1\0"+
    "\30\15\4\0\1\15\11\0\1\15\3\0\1\15\5\0"+
    "\22\1\31\15\3\0\4\1\13\15\65\1\25\15\1\1"+
    "\22\15\13\1\61\0\66\15\3\0\1\15\22\0\1\15"+
    "\7\0\12\15\2\0\2\1\12\13\1\1\20\15\3\0"+
    "\1\1\10\15\2\1\2\15\2\1\26\15\1\1\7\15"+
    "\1\1\1\15\3\1\4\15\2\1\1\0\1\15\7\0"+
    "\2\1\2\0\2\1\3\0\1\15\10\1\1\0\4\1"+
    "\2\15\1\1\3\15\2\0\2\1\12\13\4\15\7\1"+
    "\2\15\1\1\1\0\2\1\3\0\1\1\6\15\4\1"+
    "\2\15\2\1\26\15\1\1\7\15\1\1\2\15\1\1"+
    "\2\15\1\1\2\15\2\1\1\0\1\1\5\0\4\1"+
    "\2\0\2\1\3\0\3\1\1\0\7\1\4\15\1\1"+
    "\1\15\7\1\12\13\2\0\3\15\1\0\13\1\3\0"+
    "\1\1\11\15\1\1\3\15\1\1\26\15\1\1\7\15"+
    "\1\1\2\15\1\1\5\15\2\1\1\0\1\15\10\0"+
    "\1\1\3\0\1\1\3\0\2\1\1\15\17\1\2\15"+
    "\2\0\2\1\12\13\1\1\1\15\7\1\1\15\6\0"+
    "\1\1\3\0\1\1\10\15\2\1\2\15\2\1\26\15"+
    "\1\1\7\15\1\1\2\15\1\1\5\15\2\1\1\0"+
    "\1\15\7\0\2\1\2\0\2\1\3\0\7\1\3\0"+
    "\4\1\2\15\1\1\3\15\2\0\2\1\12\13\1\1"+
    "\1\15\20\1\1\0\1\15\1\1\6\15\3\1\3\15"+
    "\1\1\4\15\3\1\2\15\1\1\1\15\1\1\2\15"+
    "\3\1\2\15\3\1\3\15\3\1\14\15\4\1\5\0"+
    "\3\1\3\0\1\1\4\0\2\1\1\15\6\1\1\0"+
    "\16\1\12\13\11\1\1\15\6\1\5\0\10\15\1\1"+
    "\3\15\1\1\27\15\1\1\20\15\3\1\1\15\7\0"+
    "\1\1\3\0\1\1\4\0\7\1\2\0\1\1\3\15"+
    "\5\1\2\15\2\0\2\1\12\13\20\1\1\15\3\0"+
    "\1\1\10\15\1\1\3\15\1\1\27\15\1\1\12\15"+
    "\1\1\5\15\2\1\1\0\1\15\7\0\1\1\3\0"+
    "\1\1\4\0\7\1\2\0\7\1\1\15\1\1\2\15"+
    "\2\0\2\1\12\13\1\1\2\15\15\1\4\0\11\15"+
    "\1\1\3\15\1\1\51\15\2\0\1\15\7\0\1\1"+
    "\3\0\1\1\4\0\1\15\5\1\3\15\1\0\7\1"+
    "\3\15\2\0\2\1\12\13\12\1\6\15\1\1\3\0"+
    "\1\1\22\15\3\1\30\15\1\1\11\15\1\1\1\15"+
    "\2\1\7\15\3\1\1\0\4\1\6\0\1\1\1\0"+
    "\1\1\10\0\6\1\12\13\2\1\2\0\15\1\60\15"+
    "\1\0\2\15\7\0\4\1\10\15\10\0\1\1\12\13"+
    "\47\1\2\15\1\1\1\15\1\1\5\15\1\1\30\15"+
    "\1\1\1\15\1\1\12\15\1\0\2\15\11\0\1\15"+
    "\2\1\5\15\1\1\1\15\1\1\6\0\2\1\12\13"+
    "\2\1\4\15\40\1\1\15\27\1\2\0\6\1\12\13"+
    "\13\1\1\0\1\1\1\0\1\1\1\0\4\1\2\0"+
    "\10\15\1\1\44\15\4\1\24\0\1\1\2\0\5\15"+
    "\13\0\1\1\44\0\11\1\1\0\71\1\53\15\24\0"+
    "\1\15\12\13\6\1\6\15\4\0\4\15\3\0\1\15"+
    "\3\0\2\15\7\0\3\15\4\0\15\15\14\0\1\15"+
    "\1\0\12\13\4\0\2\1\46\15\1\1\1\15\5\1"+
    "\1\15\2\1\53\15\1\1\115\15\1\1\4\15\2\1"+
    "\7\15\1\1\1\15\1\1\4\15\2\1\51\15\1\1"+
    "\4\15\2\1\41\15\1\1\4\15\2\1\7\15\1\1"+
    "\1\15\1\1\4\15\2\1\17\15\1\1\71\15\1\1"+
    "\4\15\2\1\103\15\2\1\3\0\40\1\20\15\20\1"+
    "\126\15\2\1\6\15\3\1\u016c\15\2\1\21\15\1\1"+
    "\32\15\5\1\113\15\3\1\13\15\7\1\15\15\1\1"+
    "\4\15\3\0\13\1\22\15\3\0\13\1\22\15\2\0"+
    "\14\1\15\15\1\1\3\15\1\1\2\0\14\1\64\15"+
    "\40\0\3\1\1\15\3\1\2\15\1\0\2\1\12\13"+
    "\41\1\4\0\1\1\12\13\6\1\131\15\7\1\5\15"+
    "\2\0\42\15\1\0\1\15\5\1\106\15\12\1\37\15"+
    "\1\1\14\0\4\1\14\0\12\1\12\13\36\15\2\1"+
    "\5\15\13\1\54\15\4\1\32\15\6\1\12\13\46\1"+
    "\27\15\5\0\4\1\65\15\12\0\1\1\35\0\2\1"+
    "\1\0\12\13\6\1\12\13\15\1\1\15\10\1\16\0"+
    "\1\1\2\0\77\1\5\0\57\15\21\0\7\15\4\1"+
    "\12\13\21\1\11\0\14\1\3\0\36\15\15\0\2\15"+
    "\12\13\54\15\16\0\14\1\44\15\24\0\10\1\12\13"+
    "\3\1\3\15\12\13\44\15\2\1\11\15\7\1\53\15"+
    "\2\1\3\15\20\1\3\0\1\1\25\0\4\15\1\0"+
    "\6\15\1\0\2\15\3\0\1\15\5\1\300\15\72\0"+
    "\1\1\5\0\26\15\2\1\6\15\2\1\46\15\2\1"+
    "\6\15\2\1\10\15\1\1\1\15\1\1\1\15\1\1"+
    "\1\15\1\1\37\15\2\1\65\15\1\1\7\15\1\1"+
    "\1\15\3\1\3\15\1\1\7\15\3\1\4\15\2\1"+
    "\6\15\4\1\15\15\5\1\3\15\1\1\7\15\16\1"+
    "\5\0\32\1\5\0\20\1\2\15\23\1\1\15\13\1"+
    "\5\0\1\1\12\0\1\1\1\15\15\1\1\15\20\1"+
    "\15\15\3\1\40\15\20\1\15\0\4\1\1\0\3\1"+
    "\14\0\21\1\1\15\4\1\1\15\2\1\12\15\1\1"+
    "\1\15\3\1\5\15\6\1\1\15\1\1\1\15\1\1"+
    "\1\15\1\1\4\15\1\1\13\15\2\1\4\15\5\1"+
    "\5\15\4\1\1\15\21\1\51\15\u0177\1\57\15\1\1"+
    "\57\15\1\1\205\15\6\1\4\15\3\0\2\15\14\1"+
    "\46\15\1\1\1\15\5\1\1\15\2\1\70\15\7\1"+
    "\1\15\17\1\1\0\27\15\11\1\7\15\1\1\7\15"+
    "\1\1\7\15\1\1\7\15\1\1\7\15\1\1\7\15"+
    "\1\1\7\15\1\1\7\15\1\1\40\0\57\1\1\15"+
    "\325\1\3\15\31\1\11\15\6\0\1\1\5\15\2\1"+
    "\5\15\4\1\126\15\2\1\2\0\2\1\3\15\1\1"+
    "\132\15\1\1\4\15\5\1\53\15\1\1\136\15\21\1"+
    "\40\15\60\1\320\15\100\1\375\15\3\1\215\15\103\1"+
    "\56\15\2\1\15\15\3\1\20\15\12\13\2\15\24\1"+
    "\57\15\1\0\4\1\12\0\1\1\37\15\2\0\120\15"+
    "\2\0\45\1\11\15\2\1\147\15\2\1\65\15\2\1"+
    "\11\15\52\1\15\15\1\0\3\15\1\0\4\15\1\0"+
    "\27\15\5\0\4\1\1\0\13\1\1\15\7\1\64\15"+
    "\14\1\2\0\62\15\22\0\12\1\12\13\6\1\22\0"+
    "\6\15\3\1\1\15\1\1\2\15\1\0\12\13\34\15"+
    "\10\0\2\1\27\15\15\0\14\1\35\15\3\1\4\0"+
    "\57\15\16\0\16\1\1\15\12\13\6\1\5\15\1\0"+
    "\12\15\12\13\5\15\1\1\51\15\16\0\11\1\3\15"+
    "\1\0\10\15\2\0\2\1\12\13\6\1\27\15\3\1"+
    "\1\15\3\0\62\15\1\0\1\15\3\0\2\15\2\0"+
    "\5\15\2\0\1\15\1\0\1\15\30\1\3\15\2\1"+
    "\13\15\5\0\2\1\3\15\2\0\12\1\6\15\2\1"+
    "\6\15\2\1\6\15\11\1\7\15\1\1\7\15\1\1"+
    "\53\15\1\1\16\15\6\1\163\15\10\0\1\1\2\0"+
    "\2\1\12\13\6\1\244\15\14\1\27\15\4\1\61\15"+
    "\4\1\156\15\2\1\152\15\46\1\7\15\14\1\5\15"+
    "\5\1\1\15\1\0\12\15\1\1\15\15\1\1\5\15"+
    "\1\1\1\15\1\1\2\15\1\1\2\15\1\1\154\15"+
    "\41\1\153\15\22\1\100\15\2\1\66\15\50\1\15\15"+
    "\3\1\20\0\20\1\20\0\3\1\2\15\30\1\3\15"+
    "\31\1\1\15\6\1\5\15\1\1\207\15\2\1\1\0"+
    "\4\1\1\15\13\1\12\13\7\1\32\15\4\1\1\15"+
    "\1\1\32\15\13\1\131\15\3\1\6\15\2\1\6\15"+
    "\2\1\6\15\2\1\3\15\3\1\2\15\3\1\2\15"+
    "\22\1\3\0\4\1\14\15\1\1\32\15\1\1\23\15"+
    "\1\1\2\15\1\1\17\15\2\1\16\15\42\1\173\15"+
    "\105\1\65\15\210\1\1\0\202\1\35\15\3\1\61\15"+
    "\17\1\1\0\37\1\40\15\15\1\36\15\5\1\46\15"+
    "\5\0\5\1\36\15\2\1\44\15\4\1\10\15\1\1"+
    "\5\15\52\1\236\15\2\1\12\13\6\1\44\15\4\1"+
    "\44\15\4\1\50\15\10\1\64\15\234\1\67\15\11\1"+
    "\26\15\12\1\10\15\230\1\6\15\2\1\1\15\1\1"+
    "\54\15\1\1\2\15\3\1\1\15\2\1\27\15\12\1"+
    "\27\15\11\1\37\15\101\1\23\15\1\1\2\15\12\1"+
    "\26\15\12\1\32\15\106\1\70\15\6\1\2\15\100\1"+
    "\1\15\3\0\1\1\2\0\5\1\4\0\4\15\1\1"+
    "\3\15\1\1\35\15\2\1\3\0\4\1\1\0\40\1"+
    "\35\15\3\1\35\15\43\1\10\15\1\1\34\15\2\0"+
    "\31\1\66\15\12\1\26\15\12\1\23\15\15\1\22\15"+
    "\156\1\111\15\67\1\63\15\15\1\63\15\15\1\44\15"+
    "\4\0\10\1\12\13\u0146\1\52\15\1\1\2\0\3\1"+
    "\2\15\116\1\35\15\12\1\1\15\10\1\26\15\13\0"+
    "\137\1\25\15\33\1\27\15\11\1\3\0\65\15\17\0"+
    "\37\1\12\13\17\1\4\0\55\15\13\0\2\1\1\0"+
    "\17\1\1\0\2\1\31\15\7\1\12\13\6\1\3\0"+
    "\44\15\16\0\1\1\12\13\4\1\1\15\2\0\1\15"+
    "\10\1\43\15\1\0\2\1\1\15\11\1\3\0\60\15"+
    "\16\0\4\15\4\1\4\0\1\1\2\0\12\13\1\15"+
    "\1\1\1\15\43\1\22\15\1\1\31\15\14\0\6\1"+
    "\1\0\101\1\7\15\1\1\1\15\1\1\4\15\1\1"+
    "\17\15\1\1\12\15\7\1\57\15\14\0\5\1\12\13"+
    "\6\1\4\0\1\1\10\15\2\1\2\15\2\1\26\15"+
    "\1\1\7\15\1\1\2\15\1\1\5\15\1\1\2\0"+
    "\1\15\7\0\2\1\2\0\2\1\3\0\2\1\1\15"+
    "\6\1\1\0\5\1\5\15\2\0\2\1\7\0\3\1"+
    "\5\0\213\1\65\15\22\0\4\15\5\1\12\13\4\1"+
    "\1\0\3\15\36\1\60\15\24\0\2\15\1\1\1\15"+
    "\10\1\12\13\246\1\57\15\7\0\2\1\11\0\27\1"+
    "\4\15\2\0\42\1\60\15\21\0\3\1\1\15\13\1"+
    "\12\13\46\1\53\15\15\0\1\15\7\1\12\13\66\1"+
    "\33\15\2\1\17\0\4\1\12\13\306\1\54\15\17\0"+
    "\145\1\100\15\12\13\25\1\10\15\2\1\1\15\2\1"+
    "\10\15\1\1\2\15\1\1\30\15\6\0\1\1\2\0"+
    "\2\1\4\0\1\15\1\0\1\15\2\0\14\1\12\0"+
    "\106\1\10\15\2\1\47\15\7\0\2\1\7\0\1\15"+
    "\1\1\1\15\1\0\33\1\1\15\12\0\50\15\7\0"+
    "\1\15\4\0\10\1\1\0\10\1\1\15\13\0\56\15"+
    "\20\0\3\1\1\15\42\1\71\15\7\1\11\15\1\1"+
    "\45\15\10\0\1\1\10\0\1\15\17\1\12\13\30\1"+
    "\36\15\2\1\26\0\1\1\16\0\111\1\7\15\1\1"+
    "\2\15\1\1\46\15\6\0\3\1\1\0\1\1\2\0"+
    "\1\1\7\0\1\15\1\0\10\1\12\13\6\1\6\15"+
    "\1\1\2\15\1\1\40\15\5\0\1\1\2\0\1\1"+
    "\5\0\1\15\7\1\12\13\u0136\1\23\15\4\0\271\1"+
    "\1\15\54\1\4\15\37\1\232\15\146\1\157\15\21\1"+
    "\304\15\274\1\57\15\1\1\11\0\307\1\107\15\271\1"+
    "\71\15\7\1\37\15\1\1\12\13\146\1\36\15\2\1"+
    "\5\0\13\1\60\15\7\0\11\1\4\15\14\1\12\13"+
    "\11\1\25\15\5\1\23\15\260\1\100\15\200\1\113\15"+
    "\4\1\1\0\1\15\67\0\7\1\4\0\15\15\100\1"+
    "\2\15\1\1\1\15\1\0\13\1\2\0\16\1\370\15"+
    "\10\1\326\15\52\1\11\15\367\1\37\15\61\1\3\15"+
    "\21\1\4\15\10\1\u018c\15\4\1\153\15\5\1\15\15"+
    "\3\1\11\15\7\1\12\15\3\1\2\0\1\1\4\0"+
    "\301\1\5\0\3\1\26\0\2\1\7\0\36\1\4\0"+
    "\224\1\3\0\273\1\125\15\1\1\107\15\1\1\2\15"+
    "\2\1\1\15\2\1\2\15\2\1\4\15\1\1\14\15"+
    "\1\1\1\15\1\1\7\15\1\1\101\15\1\1\4\15"+
    "\2\1\10\15\1\1\7\15\1\1\34\15\1\1\4\15"+
    "\1\1\5\15\1\1\1\15\3\1\7\15\1\1\u0154\15"+
    "\2\1\31\15\1\1\31\15\1\1\37\15\1\1\31\15"+
    "\1\1\37\15\1\1\31\15\1\1\37\15\1\1\31\15"+
    "\1\1\37\15\1\1\31\15\1\1\10\15\2\1\62\13"+
    "\67\0\4\1\62\0\10\1\1\0\16\1\1\0\26\1"+
    "\5\0\1\1\17\0\120\1\7\0\1\1\21\0\2\1"+
    "\7\0\1\1\2\0\1\1\5\0\325\1\55\15\3\1"+
    "\7\0\7\15\2\1\12\13\4\1\1\15\u0171\1\54\15"+
    "\4\0\12\13\5\1\306\15\13\1\7\0\51\1\104\15"+
    "\7\0\1\15\4\1\12\13\u0156\1\1\15\117\1\4\15"+
    "\1\1\33\15\1\1\2\15\1\1\1\15\2\1\1\15"+
    "\1\1\12\15\1\1\4\15\1\1\1\15\1\1\1\15"+
    "\6\1\1\15\4\1\1\15\1\1\1\15\1\1\1\15"+
    "\1\1\3\15\1\1\2\15\1\1\1\15\2\1\1\15"+
    "\1\1\1\15\1\1\1\15\1\1\1\15\1\1\1\15"+
    "\1\1\2\15\1\1\1\15\2\1\4\15\1\1\7\15"+
    "\1\1\4\15\1\1\4\15\1\1\1\15\1\1\12\15"+
    "\1\1\21\15\5\1\3\15\1\1\5\15\1\1\21\15"+
    "\u0134\1\12\0\6\1\336\15\42\1\65\15\13\1\336\15"+
    "\2\1\u0182\15\16\1\u0131\15\37\1\36\15\342\1\113\15"+
    "\266\1\1\0\36\1\140\0\200\1\360\0\20\1";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[30976];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\2\1\1\2\1\1\1\3\1\4\2\1\1\5"+
    "\1\6\14\1\1\7\1\10\1\11\1\2\1\0\1\12"+
    "\1\13\1\0\1\5\1\0\1\14\20\0\2\14\1\5"+
    "\21\0\1\15\4\0\1\16\3\0\1\17\34\0\1\20"+
    "\20\0\1\21\6\0\1\22\3\0\1\23\21\0\1\24"+
    "\24\0\1\25\20\0\1\26\7\0\1\27\4\0\1\30"+
    "\7\0\1\31\1\32\1\33\1\0\1\34\6\0\1\35"+
    "\11\0\1\36\6\0\1\33\3\0\1\37\4\0\1\40"+
    "\2\0\1\41";

  private static int [] zzUnpackAction() {
    int [] result = new int[254];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\51\0\122\0\173\0\244\0\315\0\122\0\366"+
    "\0\u011f\0\u0148\0\122\0\u0171\0\u019a\0\u01c3\0\u01ec\0\u0215"+
    "\0\u023e\0\u0267\0\u0290\0\u02b9\0\u02e2\0\u030b\0\u0334\0\122"+
    "\0\122\0\u035d\0\122\0\u0386\0\u03af\0\315\0\u03d8\0\u0401"+
    "\0\u042a\0\u0453\0\u047c\0\u04a5\0\u04ce\0\u04f7\0\u0520\0\u0549"+
    "\0\u0572\0\u059b\0\u05c4\0\u05ed\0\u0616\0\u063f\0\u0668\0\u0691"+
    "\0\u06ba\0\u06e3\0\122\0\u070c\0\u047c\0\u0735\0\u075e\0\u0787"+
    "\0\u07b0\0\u07d9\0\u0802\0\u082b\0\u0854\0\u087d\0\u08a6\0\u08cf"+
    "\0\u08f8\0\u0921\0\u094a\0\u0973\0\u099c\0\u09c5\0\122\0\u09ee"+
    "\0\u0a17\0\u0a40\0\u0a69\0\122\0\u0a92\0\u0abb\0\u0ae4\0\122"+
    "\0\u0b0d\0\u0b36\0\u0b5f\0\u0b88\0\u0bb1\0\u0bda\0\u0c03\0\u0c2c"+
    "\0\u0c55\0\u0c7e\0\u0ca7\0\u0cd0\0\u0cf9\0\u0d22\0\u0d4b\0\u0d74"+
    "\0\u0d9d\0\u0dc6\0\u0def\0\u0e18\0\u0e41\0\u0e6a\0\u0e93\0\u0ebc"+
    "\0\u0ee5\0\u0f0e\0\u0f37\0\u0f60\0\122\0\u0f89\0\u0fb2\0\u0fdb"+
    "\0\u1004\0\u102d\0\u1056\0\u107f\0\u10a8\0\u10d1\0\u10fa\0\u1123"+
    "\0\u114c\0\u1175\0\u119e\0\u11c7\0\u11f0\0\u1219\0\u1242\0\u126b"+
    "\0\u1294\0\u12bd\0\u12e6\0\u130f\0\122\0\u1338\0\u1361\0\u138a"+
    "\0\122\0\u13b3\0\u13dc\0\u1405\0\u142e\0\u1457\0\u1480\0\u14a9"+
    "\0\u14d2\0\u14fb\0\u1524\0\u154d\0\u1576\0\u159f\0\u15c8\0\u15f1"+
    "\0\u161a\0\u1643\0\122\0\u166c\0\u1695\0\u16be\0\u16e7\0\u1710"+
    "\0\u1739\0\u1762\0\u178b\0\u17b4\0\u17dd\0\u1806\0\u182f\0\u1858"+
    "\0\u1881\0\u18aa\0\u18d3\0\u18fc\0\u1925\0\u194e\0\u1977\0\122"+
    "\0\u19a0\0\u19c9\0\u19f2\0\u1a1b\0\u1a44\0\u1a6d\0\u1a96\0\u1abf"+
    "\0\u1ae8\0\u1b11\0\u1b3a\0\u1b63\0\u1b8c\0\u1bb5\0\u1bde\0\u1c07"+
    "\0\122\0\u1c30\0\u1c59\0\u1c82\0\u1cab\0\u1cd4\0\u1cfd\0\u1d26"+
    "\0\u1d4f\0\u1d78\0\u1da1\0\u1dca\0\u1df3\0\122\0\u1e1c\0\u1e45"+
    "\0\u1e6e\0\u1e97\0\u1ec0\0\u1ee9\0\u1f12\0\122\0\u1f3b\0\u1f3b"+
    "\0\u1f64\0\122\0\u1f8d\0\u1fb6\0\u1fdf\0\u2008\0\u2031\0\u205a"+
    "\0\u2083\0\u20ac\0\u20d5\0\u20fe\0\u2127\0\u2150\0\u2179\0\u21a2"+
    "\0\u21cb\0\u21f4\0\122\0\u221d\0\u2246\0\u226f\0\u2298\0\u22c1"+
    "\0\u22ea\0\122\0\u2313\0\u233c\0\u2365\0\122\0\u238e\0\u23b7"+
    "\0\u23e0\0\u2409\0\122\0\u2432\0\u245b\0\122";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[254];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\3\3\1\4\1\5\1\6\1\7\1\10\1\3"+
    "\1\11\1\12\1\13\1\2\1\3\1\2\1\14\1\2"+
    "\1\15\1\16\1\2\1\17\1\20\1\2\1\21\1\2"+
    "\1\22\2\2\1\23\1\2\1\24\1\25\1\26\1\2"+
    "\1\27\3\2\1\30\1\31\10\0\1\32\111\0\2\4"+
    "\2\0\1\33\11\4\1\34\32\4\5\0\1\35\2\0"+
    "\1\32\4\0\1\35\1\0\30\35\2\0\2\36\3\0"+
    "\11\36\1\37\32\36\13\0\1\40\43\0\1\41\3\0"+
    "\1\42\46\0\1\32\1\43\1\0\1\40\45\0\1\32"+
    "\10\0\1\44\37\0\1\32\23\0\1\45\24\0\1\32"+
    "\13\0\1\46\34\0\1\32\26\0\1\47\21\0\1\32"+
    "\13\0\1\50\34\0\1\32\21\0\1\51\26\0\1\32"+
    "\7\0\1\52\40\0\1\32\7\0\1\53\40\0\1\32"+
    "\30\0\1\54\17\0\1\32\7\0\1\55\6\0\1\56"+
    "\31\0\1\32\13\0\1\57\34\0\1\32\13\0\1\60"+
    "\24\0\1\32\4\0\1\32\4\0\2\32\1\0\1\32"+
    "\1\0\30\32\2\0\2\4\2\0\45\4\1\35\4\0"+
    "\1\35\5\0\1\35\1\0\1\35\1\0\30\35\2\0"+
    "\2\36\2\0\45\36\11\0\1\43\1\0\1\40\35\0"+
    "\6\61\1\62\42\61\2\42\1\63\1\64\45\42\13\0"+
    "\1\65\75\0\1\66\42\0\1\67\43\0\1\70\43\0"+
    "\1\71\13\0\1\72\50\0\1\73\51\0\1\74\54\0"+
    "\1\75\47\0\1\76\50\0\1\77\42\0\1\100\36\0"+
    "\1\101\52\0\1\102\15\0\1\103\4\0\1\104\42\0"+
    "\1\105\11\0\6\61\1\106\42\61\6\0\1\62\3\0"+
    "\1\107\40\0\1\63\107\0\1\110\44\0\1\111\33\0"+
    "\1\112\56\0\1\113\54\0\1\114\50\0\1\115\52\0"+
    "\1\116\40\0\1\117\64\0\1\120\37\0\1\121\56\0"+
    "\1\122\36\0\1\123\13\0\1\124\40\0\1\125\61\0"+
    "\1\126\51\0\1\127\50\0\1\130\7\0\6\61\1\106"+
    "\3\61\1\107\36\61\37\0\1\131\53\0\1\132\50\0"+
    "\1\133\40\0\1\134\42\0\1\135\63\0\1\136\50\0"+
    "\1\137\31\0\1\140\61\0\1\141\53\0\1\142\40\0"+
    "\1\143\57\0\1\144\41\0\1\145\66\0\1\146\32\0"+
    "\1\147\44\0\1\150\71\0\1\151\40\0\1\152\43\0"+
    "\1\153\65\0\1\154\50\0\1\155\37\0\1\156\43\0"+
    "\1\157\51\0\1\160\70\0\1\161\27\0\1\162\55\0"+
    "\1\163\51\0\1\164\56\0\1\165\56\0\1\166\25\0"+
    "\1\167\52\0\1\170\65\0\1\171\42\0\1\172\54\0"+
    "\1\173\31\0\1\174\54\0\1\175\63\0\1\176\30\0"+
    "\1\177\50\0\1\200\67\0\1\201\43\0\1\202\43\0"+
    "\1\203\43\0\1\204\72\0\1\205\26\0\1\206\50\0"+
    "\1\207\72\0\1\210\55\0\1\170\33\0\1\211\56\0"+
    "\1\212\30\0\1\213\53\0\1\214\14\0\1\215\46\0"+
    "\1\216\55\0\1\217\26\0\1\220\47\0\1\221\66\0"+
    "\1\222\50\0\1\223\50\0\1\224\32\0\1\225\50\0"+
    "\1\226\70\0\1\227\31\0\1\230\54\0\1\231\44\0"+
    "\1\232\54\0\1\233\65\0\1\234\47\0\1\235\1\0"+
    "\1\236\45\0\1\237\50\0\1\240\31\0\1\241\65\0"+
    "\1\242\53\0\1\243\34\0\1\244\64\0\1\245\32\0"+
    "\1\246\65\0\1\247\41\0\1\250\54\0\1\251\47\0"+
    "\1\252\51\0\1\253\50\0\1\254\53\0\1\255\50\0"+
    "\1\256\57\0\1\257\27\0\1\260\64\0\1\261\33\0"+
    "\1\262\44\0\1\263\64\0\1\264\56\0\1\265\36\0"+
    "\1\266\46\0\1\267\50\0\1\270\42\0\1\271\64\0"+
    "\1\272\54\0\1\273\34\0\1\274\54\0\1\275\52\0"+
    "\1\276\51\0\1\277\54\0\1\300\52\0\1\301\46\0"+
    "\1\302\50\0\1\303\43\0\1\304\44\0\1\305\63\0"+
    "\1\306\46\0\1\307\54\0\1\310\45\0\1\311\27\0"+
    "\1\312\53\0\1\313\46\0\1\314\50\0\1\315\70\0"+
    "\1\316\47\0\1\317\35\0\1\320\43\0\1\321\55\0"+
    "\1\322\43\0\1\323\54\0\1\324\3\0\1\325\45\0"+
    "\1\326\56\0\1\327\50\0\1\330\36\0\1\331\62\0"+
    "\1\332\50\0\1\333\55\0\1\334\50\0\1\335\45\0"+
    "\1\336\56\0\1\337\25\0\1\340\63\0\1\341\36\0"+
    "\1\342\47\0\1\343\55\0\1\344\56\0\1\345\47\0"+
    "\1\346\56\0\1\347\30\0\1\350\72\0\1\351\41\0"+
    "\1\352\43\0\1\353\43\0\1\354\61\0\1\170\43\0"+
    "\1\355\63\0\1\356\35\0\1\357\44\0\1\360\60\0"+
    "\1\361\45\0\1\362\47\0\1\363\63\0\1\364\52\0"+
    "\1\365\42\0\1\170\42\0\1\366\53\0\1\367\44\0"+
    "\1\370\44\0\1\371\67\0\1\372\42\0\1\373\47\0"+
    "\1\374\40\0\1\375\61\0\1\376\17\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[9348];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\1\1\11\3\1\1\11\3\1\1\11\14\1"+
    "\2\11\1\1\1\11\1\0\2\1\1\0\1\1\1\0"+
    "\1\1\20\0\1\11\2\1\21\0\1\11\4\0\1\11"+
    "\3\0\1\11\34\0\1\11\20\0\1\1\6\0\1\11"+
    "\3\0\1\11\21\0\1\11\24\0\1\11\20\0\1\11"+
    "\7\0\1\1\4\0\1\11\7\0\1\11\2\1\1\0"+
    "\1\11\6\0\1\1\11\0\1\11\6\0\1\11\3\0"+
    "\1\11\4\0\1\11\2\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[254];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** Number of newlines encountered up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  protected int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
  public _MaterialLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _MaterialLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { return BAD_CHARACTER;
            }
          // fall through
          case 34: break;
          case 2:
            { return STRING_LITERAL;
            }
          // fall through
          case 35: break;
          case 3:
            { return ASTERISK;
            }
          // fall through
          case 36: break;
          case 4:
            { return COMMA;
            }
          // fall through
          case 37: break;
          case 5:
            { return NUMERIC_LITERAL;
            }
          // fall through
          case 38: break;
          case 6:
            { return COLON;
            }
          // fall through
          case 39: break;
          case 7:
            { return LBRACE;
            }
          // fall through
          case 40: break;
          case 8:
            { return RBRACE;
            }
          // fall through
          case 41: break;
          case 9:
            { return IDENTIFIER;
            }
          // fall through
          case 42: break;
          case 10:
            { return VARIABLE;
            }
          // fall through
          case 43: break;
          case 11:
            { return MATCH_LITERAL;
            }
          // fall through
          case 44: break;
          case 12:
            { return LINE_COMMENT;
            }
          // fall through
          case 45: break;
          case 13:
            { return MULTILINE_COMMENT;
            }
          // fall through
          case 46: break;
          case 14:
            { return FROM;
            }
          // fall through
          case 47: break;
          case 15:
            { return PASS;
            }
          // fall through
          case 48: break;
          case 16:
            { return IMPORT;
            }
          // fall through
          case 49: break;
          case 17:
            { return SAMPLER;
            }
          // fall through
          case 50: break;
          case 18:
            { return ABSTRACT;
            }
          // fall through
          case 51: break;
          case 19:
            { return MATERIAL;
            }
          // fall through
          case 52: break;
          case 20:
            { return TECHNIQUE;
            }
          // fall through
          case 53: break;
          case 21:
            { return SAMPLER_REF;
            }
          // fall through
          case 54: break;
          case 22:
            { return TEXTURE_UNIT;
            }
          // fall through
          case 55: break;
          case 23:
            { return SHARED_PARAMS;
            }
          // fall through
          case 56: break;
          case 24:
            { return DEFAULT_PARAMS;
            }
          // fall through
          case 57: break;
          case 25:
            { return TEXTURE_SOURCE;
            }
          // fall through
          case 58: break;
          case 26:
            { return VERTEX_PROGRAM;
            }
          // fall through
          case 59: break;
          case 27:
            { return VERTEX_PROGRAM_REF;
            }
          // fall through
          case 60: break;
          case 28:
            { return RTSHADER_SYSTEM;
            }
          // fall through
          case 61: break;
          case 29:
            { return FRAGMENT_PROGRAM;
            }
          // fall through
          case 62: break;
          case 30:
            { return SHARED_PARAMS_REF;
            }
          // fall through
          case 63: break;
          case 31:
            { return FRAGMENT_PROGRAM_REF;
            }
          // fall through
          case 64: break;
          case 32:
            { return SHADOW_CASTER_MATERIAL;
            }
          // fall through
          case 65: break;
          case 33:
            { return SHADOW_RECEIVER_MATERIAL;
            }
          // fall through
          case 66: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
