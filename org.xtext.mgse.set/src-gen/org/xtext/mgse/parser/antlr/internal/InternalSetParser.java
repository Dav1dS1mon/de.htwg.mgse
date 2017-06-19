package org.xtext.mgse.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.mgse.services.SetGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSetParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'pack'", "'{'", "'}'", "'FORM'", "'='", "'URL'", "'FORM_ORIGINAL'", "'FORM_DOCTORWHO'", "'FORM_GAMEOFTHRONES'", "'URL_ORIGINAL'", "'URL_DOCTORWHO'", "'URL_GAMEOFTHRONES'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSetParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSetParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSetParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSet.g"; }



     	private SetGrammarAccess grammarAccess;

        public InternalSetParser(TokenStream input, SetGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "PACK";
       	}

       	@Override
       	protected SetGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePACK"
    // InternalSet.g:65:1: entryRulePACK returns [EObject current=null] : iv_rulePACK= rulePACK EOF ;
    public final EObject entryRulePACK() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePACK = null;


        try {
            // InternalSet.g:65:45: (iv_rulePACK= rulePACK EOF )
            // InternalSet.g:66:2: iv_rulePACK= rulePACK EOF
            {
             newCompositeNode(grammarAccess.getPACKRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePACK=rulePACK();

            state._fsp--;

             current =iv_rulePACK; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePACK"


    // $ANTLR start "rulePACK"
    // InternalSet.g:72:1: rulePACK returns [EObject current=null] : (otherlv_0= 'pack' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_type_3_0= rulePACKTYPE ) ) otherlv_4= '}' ) ;
    public final EObject rulePACK() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalSet.g:78:2: ( (otherlv_0= 'pack' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_type_3_0= rulePACKTYPE ) ) otherlv_4= '}' ) )
            // InternalSet.g:79:2: (otherlv_0= 'pack' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_type_3_0= rulePACKTYPE ) ) otherlv_4= '}' )
            {
            // InternalSet.g:79:2: (otherlv_0= 'pack' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_type_3_0= rulePACKTYPE ) ) otherlv_4= '}' )
            // InternalSet.g:80:3: otherlv_0= 'pack' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_type_3_0= rulePACKTYPE ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPACKAccess().getPackKeyword_0());
            		
            // InternalSet.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSet.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSet.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalSet.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPACKAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPACKRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getPACKAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSet.g:106:3: ( (lv_type_3_0= rulePACKTYPE ) )
            // InternalSet.g:107:4: (lv_type_3_0= rulePACKTYPE )
            {
            // InternalSet.g:107:4: (lv_type_3_0= rulePACKTYPE )
            // InternalSet.g:108:5: lv_type_3_0= rulePACKTYPE
            {

            					newCompositeNode(grammarAccess.getPACKAccess().getTypePACKTYPEParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_type_3_0=rulePACKTYPE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPACKRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.xtext.mgse.Set.PACKTYPE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPACKAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePACK"


    // $ANTLR start "entryRulePACKTYPE"
    // InternalSet.g:133:1: entryRulePACKTYPE returns [EObject current=null] : iv_rulePACKTYPE= rulePACKTYPE EOF ;
    public final EObject entryRulePACKTYPE() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePACKTYPE = null;


        try {
            // InternalSet.g:133:49: (iv_rulePACKTYPE= rulePACKTYPE EOF )
            // InternalSet.g:134:2: iv_rulePACKTYPE= rulePACKTYPE EOF
            {
             newCompositeNode(grammarAccess.getPACKTYPERule()); 
            pushFollow(FOLLOW_1);
            iv_rulePACKTYPE=rulePACKTYPE();

            state._fsp--;

             current =iv_rulePACKTYPE; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePACKTYPE"


    // $ANTLR start "rulePACKTYPE"
    // InternalSet.g:140:1: rulePACKTYPE returns [EObject current=null] : ( ( (lv_forms_0_0= ruleFORMS ) ) ( (lv_url_1_0= ruleURL ) ) ) ;
    public final EObject rulePACKTYPE() throws RecognitionException {
        EObject current = null;

        EObject lv_forms_0_0 = null;

        EObject lv_url_1_0 = null;



        	enterRule();

        try {
            // InternalSet.g:146:2: ( ( ( (lv_forms_0_0= ruleFORMS ) ) ( (lv_url_1_0= ruleURL ) ) ) )
            // InternalSet.g:147:2: ( ( (lv_forms_0_0= ruleFORMS ) ) ( (lv_url_1_0= ruleURL ) ) )
            {
            // InternalSet.g:147:2: ( ( (lv_forms_0_0= ruleFORMS ) ) ( (lv_url_1_0= ruleURL ) ) )
            // InternalSet.g:148:3: ( (lv_forms_0_0= ruleFORMS ) ) ( (lv_url_1_0= ruleURL ) )
            {
            // InternalSet.g:148:3: ( (lv_forms_0_0= ruleFORMS ) )
            // InternalSet.g:149:4: (lv_forms_0_0= ruleFORMS )
            {
            // InternalSet.g:149:4: (lv_forms_0_0= ruleFORMS )
            // InternalSet.g:150:5: lv_forms_0_0= ruleFORMS
            {

            					newCompositeNode(grammarAccess.getPACKTYPEAccess().getFormsFORMSParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_forms_0_0=ruleFORMS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPACKTYPERule());
            					}
            					set(
            						current,
            						"forms",
            						lv_forms_0_0,
            						"org.xtext.mgse.Set.FORMS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSet.g:167:3: ( (lv_url_1_0= ruleURL ) )
            // InternalSet.g:168:4: (lv_url_1_0= ruleURL )
            {
            // InternalSet.g:168:4: (lv_url_1_0= ruleURL )
            // InternalSet.g:169:5: lv_url_1_0= ruleURL
            {

            					newCompositeNode(grammarAccess.getPACKTYPEAccess().getUrlURLParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_url_1_0=ruleURL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPACKTYPERule());
            					}
            					set(
            						current,
            						"url",
            						lv_url_1_0,
            						"org.xtext.mgse.Set.URL");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePACKTYPE"


    // $ANTLR start "entryRuleFORMS"
    // InternalSet.g:190:1: entryRuleFORMS returns [EObject current=null] : iv_ruleFORMS= ruleFORMS EOF ;
    public final EObject entryRuleFORMS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFORMS = null;


        try {
            // InternalSet.g:190:46: (iv_ruleFORMS= ruleFORMS EOF )
            // InternalSet.g:191:2: iv_ruleFORMS= ruleFORMS EOF
            {
             newCompositeNode(grammarAccess.getFORMSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFORMS=ruleFORMS();

            state._fsp--;

             current =iv_ruleFORMS; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFORMS"


    // $ANTLR start "ruleFORMS"
    // InternalSet.g:197:1: ruleFORMS returns [EObject current=null] : ( ( (lv_name_0_0= 'FORM' ) ) otherlv_1= '=' ( (lv_type_2_0= ruleTYPE_FORMS ) ) ) ;
    public final EObject ruleFORMS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Enumerator lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalSet.g:203:2: ( ( ( (lv_name_0_0= 'FORM' ) ) otherlv_1= '=' ( (lv_type_2_0= ruleTYPE_FORMS ) ) ) )
            // InternalSet.g:204:2: ( ( (lv_name_0_0= 'FORM' ) ) otherlv_1= '=' ( (lv_type_2_0= ruleTYPE_FORMS ) ) )
            {
            // InternalSet.g:204:2: ( ( (lv_name_0_0= 'FORM' ) ) otherlv_1= '=' ( (lv_type_2_0= ruleTYPE_FORMS ) ) )
            // InternalSet.g:205:3: ( (lv_name_0_0= 'FORM' ) ) otherlv_1= '=' ( (lv_type_2_0= ruleTYPE_FORMS ) )
            {
            // InternalSet.g:205:3: ( (lv_name_0_0= 'FORM' ) )
            // InternalSet.g:206:4: (lv_name_0_0= 'FORM' )
            {
            // InternalSet.g:206:4: (lv_name_0_0= 'FORM' )
            // InternalSet.g:207:5: lv_name_0_0= 'FORM'
            {
            lv_name_0_0=(Token)match(input,14,FOLLOW_8); 

            					newLeafNode(lv_name_0_0, grammarAccess.getFORMSAccess().getNameFORMKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFORMSRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "FORM");
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getFORMSAccess().getEqualsSignKeyword_1());
            		
            // InternalSet.g:223:3: ( (lv_type_2_0= ruleTYPE_FORMS ) )
            // InternalSet.g:224:4: (lv_type_2_0= ruleTYPE_FORMS )
            {
            // InternalSet.g:224:4: (lv_type_2_0= ruleTYPE_FORMS )
            // InternalSet.g:225:5: lv_type_2_0= ruleTYPE_FORMS
            {

            					newCompositeNode(grammarAccess.getFORMSAccess().getTypeTYPE_FORMSEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleTYPE_FORMS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFORMSRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.mgse.Set.TYPE_FORMS");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFORMS"


    // $ANTLR start "entryRuleURL"
    // InternalSet.g:246:1: entryRuleURL returns [EObject current=null] : iv_ruleURL= ruleURL EOF ;
    public final EObject entryRuleURL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURL = null;


        try {
            // InternalSet.g:246:44: (iv_ruleURL= ruleURL EOF )
            // InternalSet.g:247:2: iv_ruleURL= ruleURL EOF
            {
             newCompositeNode(grammarAccess.getURLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleURL=ruleURL();

            state._fsp--;

             current =iv_ruleURL; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleURL"


    // $ANTLR start "ruleURL"
    // InternalSet.g:253:1: ruleURL returns [EObject current=null] : ( ( (lv_name_0_0= 'URL' ) ) otherlv_1= '=' ( (lv_type_2_0= ruleURL_TYPES ) ) ) ;
    public final EObject ruleURL() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Enumerator lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalSet.g:259:2: ( ( ( (lv_name_0_0= 'URL' ) ) otherlv_1= '=' ( (lv_type_2_0= ruleURL_TYPES ) ) ) )
            // InternalSet.g:260:2: ( ( (lv_name_0_0= 'URL' ) ) otherlv_1= '=' ( (lv_type_2_0= ruleURL_TYPES ) ) )
            {
            // InternalSet.g:260:2: ( ( (lv_name_0_0= 'URL' ) ) otherlv_1= '=' ( (lv_type_2_0= ruleURL_TYPES ) ) )
            // InternalSet.g:261:3: ( (lv_name_0_0= 'URL' ) ) otherlv_1= '=' ( (lv_type_2_0= ruleURL_TYPES ) )
            {
            // InternalSet.g:261:3: ( (lv_name_0_0= 'URL' ) )
            // InternalSet.g:262:4: (lv_name_0_0= 'URL' )
            {
            // InternalSet.g:262:4: (lv_name_0_0= 'URL' )
            // InternalSet.g:263:5: lv_name_0_0= 'URL'
            {
            lv_name_0_0=(Token)match(input,16,FOLLOW_8); 

            					newLeafNode(lv_name_0_0, grammarAccess.getURLAccess().getNameURLKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getURLRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "URL");
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getURLAccess().getEqualsSignKeyword_1());
            		
            // InternalSet.g:279:3: ( (lv_type_2_0= ruleURL_TYPES ) )
            // InternalSet.g:280:4: (lv_type_2_0= ruleURL_TYPES )
            {
            // InternalSet.g:280:4: (lv_type_2_0= ruleURL_TYPES )
            // InternalSet.g:281:5: lv_type_2_0= ruleURL_TYPES
            {

            					newCompositeNode(grammarAccess.getURLAccess().getTypeURL_TYPESEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleURL_TYPES();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getURLRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.mgse.Set.URL_TYPES");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleURL"


    // $ANTLR start "ruleTYPE_FORMS"
    // InternalSet.g:302:1: ruleTYPE_FORMS returns [Enumerator current=null] : ( (enumLiteral_0= 'FORM_ORIGINAL' ) | (enumLiteral_1= 'FORM_DOCTORWHO' ) | (enumLiteral_2= 'FORM_GAMEOFTHRONES' ) ) ;
    public final Enumerator ruleTYPE_FORMS() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSet.g:308:2: ( ( (enumLiteral_0= 'FORM_ORIGINAL' ) | (enumLiteral_1= 'FORM_DOCTORWHO' ) | (enumLiteral_2= 'FORM_GAMEOFTHRONES' ) ) )
            // InternalSet.g:309:2: ( (enumLiteral_0= 'FORM_ORIGINAL' ) | (enumLiteral_1= 'FORM_DOCTORWHO' ) | (enumLiteral_2= 'FORM_GAMEOFTHRONES' ) )
            {
            // InternalSet.g:309:2: ( (enumLiteral_0= 'FORM_ORIGINAL' ) | (enumLiteral_1= 'FORM_DOCTORWHO' ) | (enumLiteral_2= 'FORM_GAMEOFTHRONES' ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt1=1;
                }
                break;
            case 18:
                {
                alt1=2;
                }
                break;
            case 19:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalSet.g:310:3: (enumLiteral_0= 'FORM_ORIGINAL' )
                    {
                    // InternalSet.g:310:3: (enumLiteral_0= 'FORM_ORIGINAL' )
                    // InternalSet.g:311:4: enumLiteral_0= 'FORM_ORIGINAL'
                    {
                    enumLiteral_0=(Token)match(input,17,FOLLOW_2); 

                    				current = grammarAccess.getTYPE_FORMSAccess().getFORM_ORIGINALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTYPE_FORMSAccess().getFORM_ORIGINALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSet.g:318:3: (enumLiteral_1= 'FORM_DOCTORWHO' )
                    {
                    // InternalSet.g:318:3: (enumLiteral_1= 'FORM_DOCTORWHO' )
                    // InternalSet.g:319:4: enumLiteral_1= 'FORM_DOCTORWHO'
                    {
                    enumLiteral_1=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getTYPE_FORMSAccess().getFORM_DOCTORWHOEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTYPE_FORMSAccess().getFORM_DOCTORWHOEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSet.g:326:3: (enumLiteral_2= 'FORM_GAMEOFTHRONES' )
                    {
                    // InternalSet.g:326:3: (enumLiteral_2= 'FORM_GAMEOFTHRONES' )
                    // InternalSet.g:327:4: enumLiteral_2= 'FORM_GAMEOFTHRONES'
                    {
                    enumLiteral_2=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getTYPE_FORMSAccess().getFORM_GAMEOFTHRONESEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTYPE_FORMSAccess().getFORM_GAMEOFTHRONESEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTYPE_FORMS"


    // $ANTLR start "ruleURL_TYPES"
    // InternalSet.g:337:1: ruleURL_TYPES returns [Enumerator current=null] : ( (enumLiteral_0= 'URL_ORIGINAL' ) | (enumLiteral_1= 'URL_DOCTORWHO' ) | (enumLiteral_2= 'URL_GAMEOFTHRONES' ) ) ;
    public final Enumerator ruleURL_TYPES() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSet.g:343:2: ( ( (enumLiteral_0= 'URL_ORIGINAL' ) | (enumLiteral_1= 'URL_DOCTORWHO' ) | (enumLiteral_2= 'URL_GAMEOFTHRONES' ) ) )
            // InternalSet.g:344:2: ( (enumLiteral_0= 'URL_ORIGINAL' ) | (enumLiteral_1= 'URL_DOCTORWHO' ) | (enumLiteral_2= 'URL_GAMEOFTHRONES' ) )
            {
            // InternalSet.g:344:2: ( (enumLiteral_0= 'URL_ORIGINAL' ) | (enumLiteral_1= 'URL_DOCTORWHO' ) | (enumLiteral_2= 'URL_GAMEOFTHRONES' ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt2=1;
                }
                break;
            case 21:
                {
                alt2=2;
                }
                break;
            case 22:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSet.g:345:3: (enumLiteral_0= 'URL_ORIGINAL' )
                    {
                    // InternalSet.g:345:3: (enumLiteral_0= 'URL_ORIGINAL' )
                    // InternalSet.g:346:4: enumLiteral_0= 'URL_ORIGINAL'
                    {
                    enumLiteral_0=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getURL_TYPESAccess().getURL_ORIGINALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getURL_TYPESAccess().getURL_ORIGINALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSet.g:353:3: (enumLiteral_1= 'URL_DOCTORWHO' )
                    {
                    // InternalSet.g:353:3: (enumLiteral_1= 'URL_DOCTORWHO' )
                    // InternalSet.g:354:4: enumLiteral_1= 'URL_DOCTORWHO'
                    {
                    enumLiteral_1=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getURL_TYPESAccess().getURL_DOCTORWHOEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getURL_TYPESAccess().getURL_DOCTORWHOEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSet.g:361:3: (enumLiteral_2= 'URL_GAMEOFTHRONES' )
                    {
                    // InternalSet.g:361:3: (enumLiteral_2= 'URL_GAMEOFTHRONES' )
                    // InternalSet.g:362:4: enumLiteral_2= 'URL_GAMEOFTHRONES'
                    {
                    enumLiteral_2=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getURL_TYPESAccess().getURL_GAMEOFTHRONESEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getURL_TYPESAccess().getURL_GAMEOFTHRONESEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleURL_TYPES"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000700000L});

}