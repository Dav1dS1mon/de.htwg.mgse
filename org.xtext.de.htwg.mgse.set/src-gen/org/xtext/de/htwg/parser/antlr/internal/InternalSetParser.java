package org.xtext.de.htwg.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.de.htwg.services.SetGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSetParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{ \"stark\", \"lennister\", \"targaryen\" };'", "'{ \"ovally\", \"wave\", \"balk\" };'", "'{ \"tardis\", \"dalek\", \"cyberman\" };'", "'/pack/got/'", "'/pack/dw/'", "'/pack/original/'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

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
    // InternalSet.g:64:1: entryRulePACK returns [EObject current=null] : iv_rulePACK= rulePACK EOF ;
    public final EObject entryRulePACK() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePACK = null;


        try {
            // InternalSet.g:64:45: (iv_rulePACK= rulePACK EOF )
            // InternalSet.g:65:2: iv_rulePACK= rulePACK EOF
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
    // InternalSet.g:71:1: rulePACK returns [EObject current=null] : ( (lv_pack_0_0= rulePACKTYPE ) ) ;
    public final EObject rulePACK() throws RecognitionException {
        EObject current = null;

        EObject lv_pack_0_0 = null;



        	enterRule();

        try {
            // InternalSet.g:77:2: ( ( (lv_pack_0_0= rulePACKTYPE ) ) )
            // InternalSet.g:78:2: ( (lv_pack_0_0= rulePACKTYPE ) )
            {
            // InternalSet.g:78:2: ( (lv_pack_0_0= rulePACKTYPE ) )
            // InternalSet.g:79:3: (lv_pack_0_0= rulePACKTYPE )
            {
            // InternalSet.g:79:3: (lv_pack_0_0= rulePACKTYPE )
            // InternalSet.g:80:4: lv_pack_0_0= rulePACKTYPE
            {

            				newCompositeNode(grammarAccess.getPACKAccess().getPackPACKTYPEParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_pack_0_0=rulePACKTYPE();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getPACKRule());
            				}
            				set(
            					current,
            					"pack",
            					lv_pack_0_0,
            					"org.xtext.de.htwg.Set.PACKTYPE");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "rulePACK"


    // $ANTLR start "entryRulePACKTYPE"
    // InternalSet.g:100:1: entryRulePACKTYPE returns [EObject current=null] : iv_rulePACKTYPE= rulePACKTYPE EOF ;
    public final EObject entryRulePACKTYPE() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePACKTYPE = null;


        try {
            // InternalSet.g:100:49: (iv_rulePACKTYPE= rulePACKTYPE EOF )
            // InternalSet.g:101:2: iv_rulePACKTYPE= rulePACKTYPE EOF
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
    // InternalSet.g:107:1: rulePACKTYPE returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_forms_1_0= ruleFORMS ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_url_2_0= ruleURL ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject rulePACKTYPE() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_forms_1_0 = null;

        AntlrDatatypeRuleToken lv_url_2_0 = null;



        	enterRule();

        try {
            // InternalSet.g:113:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_forms_1_0= ruleFORMS ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_url_2_0= ruleURL ) ) ) ) ) )+ {...}?) ) ) )
            // InternalSet.g:114:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_forms_1_0= ruleFORMS ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_url_2_0= ruleURL ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalSet.g:114:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_forms_1_0= ruleFORMS ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_url_2_0= ruleURL ) ) ) ) ) )+ {...}?) ) )
            // InternalSet.g:115:3: ( ( ( ({...}? => ( ({...}? => ( (lv_forms_1_0= ruleFORMS ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_url_2_0= ruleURL ) ) ) ) ) )+ {...}?) )
            {
            // InternalSet.g:115:3: ( ( ( ({...}? => ( ({...}? => ( (lv_forms_1_0= ruleFORMS ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_url_2_0= ruleURL ) ) ) ) ) )+ {...}?) )
            // InternalSet.g:116:4: ( ( ({...}? => ( ({...}? => ( (lv_forms_1_0= ruleFORMS ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_url_2_0= ruleURL ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getPACKTYPEAccess().getUnorderedGroup());
            			
            // InternalSet.g:119:4: ( ( ({...}? => ( ({...}? => ( (lv_forms_1_0= ruleFORMS ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_url_2_0= ruleURL ) ) ) ) ) )+ {...}?)
            // InternalSet.g:120:5: ( ({...}? => ( ({...}? => ( (lv_forms_1_0= ruleFORMS ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_url_2_0= ruleURL ) ) ) ) ) )+ {...}?
            {
            // InternalSet.g:120:5: ( ({...}? => ( ({...}? => ( (lv_forms_1_0= ruleFORMS ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_url_2_0= ruleURL ) ) ) ) ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( LA1_0 >= 11 && LA1_0 <= 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getPACKTYPEAccess().getUnorderedGroup(), 0) ) {
                    alt1=1;
                }
                else if ( LA1_0 >= 14 && LA1_0 <= 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getPACKTYPEAccess().getUnorderedGroup(), 1) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSet.g:121:3: ({...}? => ( ({...}? => ( (lv_forms_1_0= ruleFORMS ) ) ) ) )
            	    {
            	    // InternalSet.g:121:3: ({...}? => ( ({...}? => ( (lv_forms_1_0= ruleFORMS ) ) ) ) )
            	    // InternalSet.g:122:4: {...}? => ( ({...}? => ( (lv_forms_1_0= ruleFORMS ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPACKTYPEAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePACKTYPE", "getUnorderedGroupHelper().canSelect(grammarAccess.getPACKTYPEAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalSet.g:122:102: ( ({...}? => ( (lv_forms_1_0= ruleFORMS ) ) ) )
            	    // InternalSet.g:123:5: ({...}? => ( (lv_forms_1_0= ruleFORMS ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPACKTYPEAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalSet.g:126:8: ({...}? => ( (lv_forms_1_0= ruleFORMS ) ) )
            	    // InternalSet.g:126:9: {...}? => ( (lv_forms_1_0= ruleFORMS ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePACKTYPE", "true");
            	    }
            	    // InternalSet.g:126:18: ( (lv_forms_1_0= ruleFORMS ) )
            	    // InternalSet.g:126:19: (lv_forms_1_0= ruleFORMS )
            	    {
            	    // InternalSet.g:126:19: (lv_forms_1_0= ruleFORMS )
            	    // InternalSet.g:127:9: lv_forms_1_0= ruleFORMS
            	    {

            	    									newCompositeNode(grammarAccess.getPACKTYPEAccess().getFormsFORMSParserRuleCall_0_0());
            	    								
            	    pushFollow(FOLLOW_3);
            	    lv_forms_1_0=ruleFORMS();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getPACKTYPERule());
            	    									}
            	    									set(
            	    										current,
            	    										"forms",
            	    										lv_forms_1_0,
            	    										"org.xtext.de.htwg.Set.FORMS");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPACKTYPEAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSet.g:149:3: ({...}? => ( ({...}? => ( (lv_url_2_0= ruleURL ) ) ) ) )
            	    {
            	    // InternalSet.g:149:3: ({...}? => ( ({...}? => ( (lv_url_2_0= ruleURL ) ) ) ) )
            	    // InternalSet.g:150:4: {...}? => ( ({...}? => ( (lv_url_2_0= ruleURL ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPACKTYPEAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePACKTYPE", "getUnorderedGroupHelper().canSelect(grammarAccess.getPACKTYPEAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalSet.g:150:102: ( ({...}? => ( (lv_url_2_0= ruleURL ) ) ) )
            	    // InternalSet.g:151:5: ({...}? => ( (lv_url_2_0= ruleURL ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPACKTYPEAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalSet.g:154:8: ({...}? => ( (lv_url_2_0= ruleURL ) ) )
            	    // InternalSet.g:154:9: {...}? => ( (lv_url_2_0= ruleURL ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePACKTYPE", "true");
            	    }
            	    // InternalSet.g:154:18: ( (lv_url_2_0= ruleURL ) )
            	    // InternalSet.g:154:19: (lv_url_2_0= ruleURL )
            	    {
            	    // InternalSet.g:154:19: (lv_url_2_0= ruleURL )
            	    // InternalSet.g:155:9: lv_url_2_0= ruleURL
            	    {

            	    									newCompositeNode(grammarAccess.getPACKTYPEAccess().getUrlURLParserRuleCall_1_0());
            	    								
            	    pushFollow(FOLLOW_3);
            	    lv_url_2_0=ruleURL();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getPACKTYPERule());
            	    									}
            	    									set(
            	    										current,
            	    										"url",
            	    										lv_url_2_0,
            	    										"org.xtext.de.htwg.Set.URL");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPACKTYPEAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getPACKTYPEAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "rulePACKTYPE", "getUnorderedGroupHelper().canLeave(grammarAccess.getPACKTYPEAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getPACKTYPEAccess().getUnorderedGroup());
            			

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
    // InternalSet.g:188:1: entryRuleFORMS returns [String current=null] : iv_ruleFORMS= ruleFORMS EOF ;
    public final String entryRuleFORMS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFORMS = null;


        try {
            // InternalSet.g:188:45: (iv_ruleFORMS= ruleFORMS EOF )
            // InternalSet.g:189:2: iv_ruleFORMS= ruleFORMS EOF
            {
             newCompositeNode(grammarAccess.getFORMSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFORMS=ruleFORMS();

            state._fsp--;

             current =iv_ruleFORMS.getText(); 
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
    // InternalSet.g:195:1: ruleFORMS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FORM_ORIGINAL_0= ruleFORM_ORIGINAL | this_FORM_DOCTORWHO_1= ruleFORM_DOCTORWHO | this_FORM_GAMEOFTHRONES_2= ruleFORM_GAMEOFTHRONES ) ;
    public final AntlrDatatypeRuleToken ruleFORMS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_FORM_ORIGINAL_0 = null;

        AntlrDatatypeRuleToken this_FORM_DOCTORWHO_1 = null;

        AntlrDatatypeRuleToken this_FORM_GAMEOFTHRONES_2 = null;



        	enterRule();

        try {
            // InternalSet.g:201:2: ( (this_FORM_ORIGINAL_0= ruleFORM_ORIGINAL | this_FORM_DOCTORWHO_1= ruleFORM_DOCTORWHO | this_FORM_GAMEOFTHRONES_2= ruleFORM_GAMEOFTHRONES ) )
            // InternalSet.g:202:2: (this_FORM_ORIGINAL_0= ruleFORM_ORIGINAL | this_FORM_DOCTORWHO_1= ruleFORM_DOCTORWHO | this_FORM_GAMEOFTHRONES_2= ruleFORM_GAMEOFTHRONES )
            {
            // InternalSet.g:202:2: (this_FORM_ORIGINAL_0= ruleFORM_ORIGINAL | this_FORM_DOCTORWHO_1= ruleFORM_DOCTORWHO | this_FORM_GAMEOFTHRONES_2= ruleFORM_GAMEOFTHRONES )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 11:
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
                    // InternalSet.g:203:3: this_FORM_ORIGINAL_0= ruleFORM_ORIGINAL
                    {

                    			newCompositeNode(grammarAccess.getFORMSAccess().getFORM_ORIGINALParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FORM_ORIGINAL_0=ruleFORM_ORIGINAL();

                    state._fsp--;


                    			current.merge(this_FORM_ORIGINAL_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSet.g:214:3: this_FORM_DOCTORWHO_1= ruleFORM_DOCTORWHO
                    {

                    			newCompositeNode(grammarAccess.getFORMSAccess().getFORM_DOCTORWHOParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FORM_DOCTORWHO_1=ruleFORM_DOCTORWHO();

                    state._fsp--;


                    			current.merge(this_FORM_DOCTORWHO_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSet.g:225:3: this_FORM_GAMEOFTHRONES_2= ruleFORM_GAMEOFTHRONES
                    {

                    			newCompositeNode(grammarAccess.getFORMSAccess().getFORM_GAMEOFTHRONESParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_FORM_GAMEOFTHRONES_2=ruleFORM_GAMEOFTHRONES();

                    state._fsp--;


                    			current.merge(this_FORM_GAMEOFTHRONES_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleFORMS"


    // $ANTLR start "entryRuleFORM_GAMEOFTHRONES"
    // InternalSet.g:239:1: entryRuleFORM_GAMEOFTHRONES returns [String current=null] : iv_ruleFORM_GAMEOFTHRONES= ruleFORM_GAMEOFTHRONES EOF ;
    public final String entryRuleFORM_GAMEOFTHRONES() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFORM_GAMEOFTHRONES = null;


        try {
            // InternalSet.g:239:58: (iv_ruleFORM_GAMEOFTHRONES= ruleFORM_GAMEOFTHRONES EOF )
            // InternalSet.g:240:2: iv_ruleFORM_GAMEOFTHRONES= ruleFORM_GAMEOFTHRONES EOF
            {
             newCompositeNode(grammarAccess.getFORM_GAMEOFTHRONESRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFORM_GAMEOFTHRONES=ruleFORM_GAMEOFTHRONES();

            state._fsp--;

             current =iv_ruleFORM_GAMEOFTHRONES.getText(); 
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
    // $ANTLR end "entryRuleFORM_GAMEOFTHRONES"


    // $ANTLR start "ruleFORM_GAMEOFTHRONES"
    // InternalSet.g:246:1: ruleFORM_GAMEOFTHRONES returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '{ \"stark\", \"lennister\", \"targaryen\" };' ;
    public final AntlrDatatypeRuleToken ruleFORM_GAMEOFTHRONES() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSet.g:252:2: (kw= '{ \"stark\", \"lennister\", \"targaryen\" };' )
            // InternalSet.g:253:2: kw= '{ \"stark\", \"lennister\", \"targaryen\" };'
            {
            kw=(Token)match(input,11,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getFORM_GAMEOFTHRONESAccess().getStarkLennisterTargaryenKeyword());
            	

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
    // $ANTLR end "ruleFORM_GAMEOFTHRONES"


    // $ANTLR start "entryRuleFORM_ORIGINAL"
    // InternalSet.g:261:1: entryRuleFORM_ORIGINAL returns [String current=null] : iv_ruleFORM_ORIGINAL= ruleFORM_ORIGINAL EOF ;
    public final String entryRuleFORM_ORIGINAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFORM_ORIGINAL = null;


        try {
            // InternalSet.g:261:53: (iv_ruleFORM_ORIGINAL= ruleFORM_ORIGINAL EOF )
            // InternalSet.g:262:2: iv_ruleFORM_ORIGINAL= ruleFORM_ORIGINAL EOF
            {
             newCompositeNode(grammarAccess.getFORM_ORIGINALRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFORM_ORIGINAL=ruleFORM_ORIGINAL();

            state._fsp--;

             current =iv_ruleFORM_ORIGINAL.getText(); 
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
    // $ANTLR end "entryRuleFORM_ORIGINAL"


    // $ANTLR start "ruleFORM_ORIGINAL"
    // InternalSet.g:268:1: ruleFORM_ORIGINAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '{ \"ovally\", \"wave\", \"balk\" };' ;
    public final AntlrDatatypeRuleToken ruleFORM_ORIGINAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSet.g:274:2: (kw= '{ \"ovally\", \"wave\", \"balk\" };' )
            // InternalSet.g:275:2: kw= '{ \"ovally\", \"wave\", \"balk\" };'
            {
            kw=(Token)match(input,12,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getFORM_ORIGINALAccess().getOvallyWaveBalkKeyword());
            	

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
    // $ANTLR end "ruleFORM_ORIGINAL"


    // $ANTLR start "entryRuleFORM_DOCTORWHO"
    // InternalSet.g:283:1: entryRuleFORM_DOCTORWHO returns [String current=null] : iv_ruleFORM_DOCTORWHO= ruleFORM_DOCTORWHO EOF ;
    public final String entryRuleFORM_DOCTORWHO() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFORM_DOCTORWHO = null;


        try {
            // InternalSet.g:283:54: (iv_ruleFORM_DOCTORWHO= ruleFORM_DOCTORWHO EOF )
            // InternalSet.g:284:2: iv_ruleFORM_DOCTORWHO= ruleFORM_DOCTORWHO EOF
            {
             newCompositeNode(grammarAccess.getFORM_DOCTORWHORule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFORM_DOCTORWHO=ruleFORM_DOCTORWHO();

            state._fsp--;

             current =iv_ruleFORM_DOCTORWHO.getText(); 
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
    // $ANTLR end "entryRuleFORM_DOCTORWHO"


    // $ANTLR start "ruleFORM_DOCTORWHO"
    // InternalSet.g:290:1: ruleFORM_DOCTORWHO returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '{ \"tardis\", \"dalek\", \"cyberman\" };' ;
    public final AntlrDatatypeRuleToken ruleFORM_DOCTORWHO() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSet.g:296:2: (kw= '{ \"tardis\", \"dalek\", \"cyberman\" };' )
            // InternalSet.g:297:2: kw= '{ \"tardis\", \"dalek\", \"cyberman\" };'
            {
            kw=(Token)match(input,13,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getFORM_DOCTORWHOAccess().getTardisDalekCybermanKeyword());
            	

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
    // $ANTLR end "ruleFORM_DOCTORWHO"


    // $ANTLR start "entryRuleURL"
    // InternalSet.g:305:1: entryRuleURL returns [String current=null] : iv_ruleURL= ruleURL EOF ;
    public final String entryRuleURL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleURL = null;


        try {
            // InternalSet.g:305:43: (iv_ruleURL= ruleURL EOF )
            // InternalSet.g:306:2: iv_ruleURL= ruleURL EOF
            {
             newCompositeNode(grammarAccess.getURLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleURL=ruleURL();

            state._fsp--;

             current =iv_ruleURL.getText(); 
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
    // InternalSet.g:312:1: ruleURL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_URL_ORIGINAL_0= ruleURL_ORIGINAL | this_URL_DOCTORWHO_1= ruleURL_DOCTORWHO | this_URL_GAMEOFTHRONES_2= ruleURL_GAMEOFTHRONES ) ;
    public final AntlrDatatypeRuleToken ruleURL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_URL_ORIGINAL_0 = null;

        AntlrDatatypeRuleToken this_URL_DOCTORWHO_1 = null;

        AntlrDatatypeRuleToken this_URL_GAMEOFTHRONES_2 = null;



        	enterRule();

        try {
            // InternalSet.g:318:2: ( (this_URL_ORIGINAL_0= ruleURL_ORIGINAL | this_URL_DOCTORWHO_1= ruleURL_DOCTORWHO | this_URL_GAMEOFTHRONES_2= ruleURL_GAMEOFTHRONES ) )
            // InternalSet.g:319:2: (this_URL_ORIGINAL_0= ruleURL_ORIGINAL | this_URL_DOCTORWHO_1= ruleURL_DOCTORWHO | this_URL_GAMEOFTHRONES_2= ruleURL_GAMEOFTHRONES )
            {
            // InternalSet.g:319:2: (this_URL_ORIGINAL_0= ruleURL_ORIGINAL | this_URL_DOCTORWHO_1= ruleURL_DOCTORWHO | this_URL_GAMEOFTHRONES_2= ruleURL_GAMEOFTHRONES )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSet.g:320:3: this_URL_ORIGINAL_0= ruleURL_ORIGINAL
                    {

                    			newCompositeNode(grammarAccess.getURLAccess().getURL_ORIGINALParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_URL_ORIGINAL_0=ruleURL_ORIGINAL();

                    state._fsp--;


                    			current.merge(this_URL_ORIGINAL_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSet.g:331:3: this_URL_DOCTORWHO_1= ruleURL_DOCTORWHO
                    {

                    			newCompositeNode(grammarAccess.getURLAccess().getURL_DOCTORWHOParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_URL_DOCTORWHO_1=ruleURL_DOCTORWHO();

                    state._fsp--;


                    			current.merge(this_URL_DOCTORWHO_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSet.g:342:3: this_URL_GAMEOFTHRONES_2= ruleURL_GAMEOFTHRONES
                    {

                    			newCompositeNode(grammarAccess.getURLAccess().getURL_GAMEOFTHRONESParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_URL_GAMEOFTHRONES_2=ruleURL_GAMEOFTHRONES();

                    state._fsp--;


                    			current.merge(this_URL_GAMEOFTHRONES_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleURL"


    // $ANTLR start "entryRuleURL_GAMEOFTHRONES"
    // InternalSet.g:356:1: entryRuleURL_GAMEOFTHRONES returns [String current=null] : iv_ruleURL_GAMEOFTHRONES= ruleURL_GAMEOFTHRONES EOF ;
    public final String entryRuleURL_GAMEOFTHRONES() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleURL_GAMEOFTHRONES = null;


        try {
            // InternalSet.g:356:57: (iv_ruleURL_GAMEOFTHRONES= ruleURL_GAMEOFTHRONES EOF )
            // InternalSet.g:357:2: iv_ruleURL_GAMEOFTHRONES= ruleURL_GAMEOFTHRONES EOF
            {
             newCompositeNode(grammarAccess.getURL_GAMEOFTHRONESRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleURL_GAMEOFTHRONES=ruleURL_GAMEOFTHRONES();

            state._fsp--;

             current =iv_ruleURL_GAMEOFTHRONES.getText(); 
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
    // $ANTLR end "entryRuleURL_GAMEOFTHRONES"


    // $ANTLR start "ruleURL_GAMEOFTHRONES"
    // InternalSet.g:363:1: ruleURL_GAMEOFTHRONES returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '/pack/got/' ;
    public final AntlrDatatypeRuleToken ruleURL_GAMEOFTHRONES() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSet.g:369:2: (kw= '/pack/got/' )
            // InternalSet.g:370:2: kw= '/pack/got/'
            {
            kw=(Token)match(input,14,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getURL_GAMEOFTHRONESAccess().getPackGotKeyword());
            	

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
    // $ANTLR end "ruleURL_GAMEOFTHRONES"


    // $ANTLR start "entryRuleURL_DOCTORWHO"
    // InternalSet.g:378:1: entryRuleURL_DOCTORWHO returns [String current=null] : iv_ruleURL_DOCTORWHO= ruleURL_DOCTORWHO EOF ;
    public final String entryRuleURL_DOCTORWHO() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleURL_DOCTORWHO = null;


        try {
            // InternalSet.g:378:53: (iv_ruleURL_DOCTORWHO= ruleURL_DOCTORWHO EOF )
            // InternalSet.g:379:2: iv_ruleURL_DOCTORWHO= ruleURL_DOCTORWHO EOF
            {
             newCompositeNode(grammarAccess.getURL_DOCTORWHORule()); 
            pushFollow(FOLLOW_1);
            iv_ruleURL_DOCTORWHO=ruleURL_DOCTORWHO();

            state._fsp--;

             current =iv_ruleURL_DOCTORWHO.getText(); 
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
    // $ANTLR end "entryRuleURL_DOCTORWHO"


    // $ANTLR start "ruleURL_DOCTORWHO"
    // InternalSet.g:385:1: ruleURL_DOCTORWHO returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '/pack/dw/' ;
    public final AntlrDatatypeRuleToken ruleURL_DOCTORWHO() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSet.g:391:2: (kw= '/pack/dw/' )
            // InternalSet.g:392:2: kw= '/pack/dw/'
            {
            kw=(Token)match(input,15,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getURL_DOCTORWHOAccess().getPackDwKeyword());
            	

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
    // $ANTLR end "ruleURL_DOCTORWHO"


    // $ANTLR start "entryRuleURL_ORIGINAL"
    // InternalSet.g:400:1: entryRuleURL_ORIGINAL returns [String current=null] : iv_ruleURL_ORIGINAL= ruleURL_ORIGINAL EOF ;
    public final String entryRuleURL_ORIGINAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleURL_ORIGINAL = null;


        try {
            // InternalSet.g:400:52: (iv_ruleURL_ORIGINAL= ruleURL_ORIGINAL EOF )
            // InternalSet.g:401:2: iv_ruleURL_ORIGINAL= ruleURL_ORIGINAL EOF
            {
             newCompositeNode(grammarAccess.getURL_ORIGINALRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleURL_ORIGINAL=ruleURL_ORIGINAL();

            state._fsp--;

             current =iv_ruleURL_ORIGINAL.getText(); 
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
    // $ANTLR end "entryRuleURL_ORIGINAL"


    // $ANTLR start "ruleURL_ORIGINAL"
    // InternalSet.g:407:1: ruleURL_ORIGINAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '/pack/original/' ;
    public final AntlrDatatypeRuleToken ruleURL_ORIGINAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSet.g:413:2: (kw= '/pack/original/' )
            // InternalSet.g:414:2: kw= '/pack/original/'
            {
            kw=(Token)match(input,16,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getURL_ORIGINALAccess().getPackOriginalKeyword());
            	

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
    // $ANTLR end "ruleURL_ORIGINAL"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000001F802L});

}
