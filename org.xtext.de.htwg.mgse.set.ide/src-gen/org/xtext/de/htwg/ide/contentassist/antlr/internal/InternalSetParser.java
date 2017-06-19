package org.xtext.de.htwg.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.de.htwg.services.SetGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSetParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(SetGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRulePACK"
    // InternalSet.g:53:1: entryRulePACK : rulePACK EOF ;
    public final void entryRulePACK() throws RecognitionException {
        try {
            // InternalSet.g:54:1: ( rulePACK EOF )
            // InternalSet.g:55:1: rulePACK EOF
            {
             before(grammarAccess.getPACKRule()); 
            pushFollow(FOLLOW_1);
            rulePACK();

            state._fsp--;

             after(grammarAccess.getPACKRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePACK"


    // $ANTLR start "rulePACK"
    // InternalSet.g:62:1: rulePACK : ( ( rule__PACK__PackAssignment ) ) ;
    public final void rulePACK() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:66:2: ( ( ( rule__PACK__PackAssignment ) ) )
            // InternalSet.g:67:2: ( ( rule__PACK__PackAssignment ) )
            {
            // InternalSet.g:67:2: ( ( rule__PACK__PackAssignment ) )
            // InternalSet.g:68:3: ( rule__PACK__PackAssignment )
            {
             before(grammarAccess.getPACKAccess().getPackAssignment()); 
            // InternalSet.g:69:3: ( rule__PACK__PackAssignment )
            // InternalSet.g:69:4: rule__PACK__PackAssignment
            {
            pushFollow(FOLLOW_2);
            rule__PACK__PackAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPACKAccess().getPackAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePACK"


    // $ANTLR start "entryRulePACKTYPE"
    // InternalSet.g:78:1: entryRulePACKTYPE : rulePACKTYPE EOF ;
    public final void entryRulePACKTYPE() throws RecognitionException {
        try {
            // InternalSet.g:79:1: ( rulePACKTYPE EOF )
            // InternalSet.g:80:1: rulePACKTYPE EOF
            {
             before(grammarAccess.getPACKTYPERule()); 
            pushFollow(FOLLOW_1);
            rulePACKTYPE();

            state._fsp--;

             after(grammarAccess.getPACKTYPERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePACKTYPE"


    // $ANTLR start "rulePACKTYPE"
    // InternalSet.g:87:1: rulePACKTYPE : ( ( rule__PACKTYPE__UnorderedGroup ) ) ;
    public final void rulePACKTYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:91:2: ( ( ( rule__PACKTYPE__UnorderedGroup ) ) )
            // InternalSet.g:92:2: ( ( rule__PACKTYPE__UnorderedGroup ) )
            {
            // InternalSet.g:92:2: ( ( rule__PACKTYPE__UnorderedGroup ) )
            // InternalSet.g:93:3: ( rule__PACKTYPE__UnorderedGroup )
            {
             before(grammarAccess.getPACKTYPEAccess().getUnorderedGroup()); 
            // InternalSet.g:94:3: ( rule__PACKTYPE__UnorderedGroup )
            // InternalSet.g:94:4: rule__PACKTYPE__UnorderedGroup
            {
            pushFollow(FOLLOW_2);
            rule__PACKTYPE__UnorderedGroup();

            state._fsp--;


            }

             after(grammarAccess.getPACKTYPEAccess().getUnorderedGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePACKTYPE"


    // $ANTLR start "entryRuleFORMS"
    // InternalSet.g:103:1: entryRuleFORMS : ruleFORMS EOF ;
    public final void entryRuleFORMS() throws RecognitionException {
        try {
            // InternalSet.g:104:1: ( ruleFORMS EOF )
            // InternalSet.g:105:1: ruleFORMS EOF
            {
             before(grammarAccess.getFORMSRule()); 
            pushFollow(FOLLOW_1);
            ruleFORMS();

            state._fsp--;

             after(grammarAccess.getFORMSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFORMS"


    // $ANTLR start "ruleFORMS"
    // InternalSet.g:112:1: ruleFORMS : ( ( rule__FORMS__Alternatives ) ) ;
    public final void ruleFORMS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:116:2: ( ( ( rule__FORMS__Alternatives ) ) )
            // InternalSet.g:117:2: ( ( rule__FORMS__Alternatives ) )
            {
            // InternalSet.g:117:2: ( ( rule__FORMS__Alternatives ) )
            // InternalSet.g:118:3: ( rule__FORMS__Alternatives )
            {
             before(grammarAccess.getFORMSAccess().getAlternatives()); 
            // InternalSet.g:119:3: ( rule__FORMS__Alternatives )
            // InternalSet.g:119:4: rule__FORMS__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FORMS__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFORMSAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFORMS"


    // $ANTLR start "entryRuleFORM_GAMEOFTHRONES"
    // InternalSet.g:128:1: entryRuleFORM_GAMEOFTHRONES : ruleFORM_GAMEOFTHRONES EOF ;
    public final void entryRuleFORM_GAMEOFTHRONES() throws RecognitionException {
        try {
            // InternalSet.g:129:1: ( ruleFORM_GAMEOFTHRONES EOF )
            // InternalSet.g:130:1: ruleFORM_GAMEOFTHRONES EOF
            {
             before(grammarAccess.getFORM_GAMEOFTHRONESRule()); 
            pushFollow(FOLLOW_1);
            ruleFORM_GAMEOFTHRONES();

            state._fsp--;

             after(grammarAccess.getFORM_GAMEOFTHRONESRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFORM_GAMEOFTHRONES"


    // $ANTLR start "ruleFORM_GAMEOFTHRONES"
    // InternalSet.g:137:1: ruleFORM_GAMEOFTHRONES : ( '{ \"stark\", \"lennister\", \"targaryen\" };' ) ;
    public final void ruleFORM_GAMEOFTHRONES() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:141:2: ( ( '{ \"stark\", \"lennister\", \"targaryen\" };' ) )
            // InternalSet.g:142:2: ( '{ \"stark\", \"lennister\", \"targaryen\" };' )
            {
            // InternalSet.g:142:2: ( '{ \"stark\", \"lennister\", \"targaryen\" };' )
            // InternalSet.g:143:3: '{ \"stark\", \"lennister\", \"targaryen\" };'
            {
             before(grammarAccess.getFORM_GAMEOFTHRONESAccess().getStarkLennisterTargaryenKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getFORM_GAMEOFTHRONESAccess().getStarkLennisterTargaryenKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFORM_GAMEOFTHRONES"


    // $ANTLR start "entryRuleFORM_ORIGINAL"
    // InternalSet.g:153:1: entryRuleFORM_ORIGINAL : ruleFORM_ORIGINAL EOF ;
    public final void entryRuleFORM_ORIGINAL() throws RecognitionException {
        try {
            // InternalSet.g:154:1: ( ruleFORM_ORIGINAL EOF )
            // InternalSet.g:155:1: ruleFORM_ORIGINAL EOF
            {
             before(grammarAccess.getFORM_ORIGINALRule()); 
            pushFollow(FOLLOW_1);
            ruleFORM_ORIGINAL();

            state._fsp--;

             after(grammarAccess.getFORM_ORIGINALRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFORM_ORIGINAL"


    // $ANTLR start "ruleFORM_ORIGINAL"
    // InternalSet.g:162:1: ruleFORM_ORIGINAL : ( '{ \"ovally\", \"wave\", \"balk\" };' ) ;
    public final void ruleFORM_ORIGINAL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:166:2: ( ( '{ \"ovally\", \"wave\", \"balk\" };' ) )
            // InternalSet.g:167:2: ( '{ \"ovally\", \"wave\", \"balk\" };' )
            {
            // InternalSet.g:167:2: ( '{ \"ovally\", \"wave\", \"balk\" };' )
            // InternalSet.g:168:3: '{ \"ovally\", \"wave\", \"balk\" };'
            {
             before(grammarAccess.getFORM_ORIGINALAccess().getOvallyWaveBalkKeyword()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getFORM_ORIGINALAccess().getOvallyWaveBalkKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFORM_ORIGINAL"


    // $ANTLR start "entryRuleFORM_DOCTORWHO"
    // InternalSet.g:178:1: entryRuleFORM_DOCTORWHO : ruleFORM_DOCTORWHO EOF ;
    public final void entryRuleFORM_DOCTORWHO() throws RecognitionException {
        try {
            // InternalSet.g:179:1: ( ruleFORM_DOCTORWHO EOF )
            // InternalSet.g:180:1: ruleFORM_DOCTORWHO EOF
            {
             before(grammarAccess.getFORM_DOCTORWHORule()); 
            pushFollow(FOLLOW_1);
            ruleFORM_DOCTORWHO();

            state._fsp--;

             after(grammarAccess.getFORM_DOCTORWHORule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFORM_DOCTORWHO"


    // $ANTLR start "ruleFORM_DOCTORWHO"
    // InternalSet.g:187:1: ruleFORM_DOCTORWHO : ( '{ \"tardis\", \"dalek\", \"cyberman\" };' ) ;
    public final void ruleFORM_DOCTORWHO() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:191:2: ( ( '{ \"tardis\", \"dalek\", \"cyberman\" };' ) )
            // InternalSet.g:192:2: ( '{ \"tardis\", \"dalek\", \"cyberman\" };' )
            {
            // InternalSet.g:192:2: ( '{ \"tardis\", \"dalek\", \"cyberman\" };' )
            // InternalSet.g:193:3: '{ \"tardis\", \"dalek\", \"cyberman\" };'
            {
             before(grammarAccess.getFORM_DOCTORWHOAccess().getTardisDalekCybermanKeyword()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFORM_DOCTORWHOAccess().getTardisDalekCybermanKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFORM_DOCTORWHO"


    // $ANTLR start "entryRuleURL"
    // InternalSet.g:203:1: entryRuleURL : ruleURL EOF ;
    public final void entryRuleURL() throws RecognitionException {
        try {
            // InternalSet.g:204:1: ( ruleURL EOF )
            // InternalSet.g:205:1: ruleURL EOF
            {
             before(grammarAccess.getURLRule()); 
            pushFollow(FOLLOW_1);
            ruleURL();

            state._fsp--;

             after(grammarAccess.getURLRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleURL"


    // $ANTLR start "ruleURL"
    // InternalSet.g:212:1: ruleURL : ( ( rule__URL__Alternatives ) ) ;
    public final void ruleURL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:216:2: ( ( ( rule__URL__Alternatives ) ) )
            // InternalSet.g:217:2: ( ( rule__URL__Alternatives ) )
            {
            // InternalSet.g:217:2: ( ( rule__URL__Alternatives ) )
            // InternalSet.g:218:3: ( rule__URL__Alternatives )
            {
             before(grammarAccess.getURLAccess().getAlternatives()); 
            // InternalSet.g:219:3: ( rule__URL__Alternatives )
            // InternalSet.g:219:4: rule__URL__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__URL__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getURLAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleURL"


    // $ANTLR start "entryRuleURL_GAMEOFTHRONES"
    // InternalSet.g:228:1: entryRuleURL_GAMEOFTHRONES : ruleURL_GAMEOFTHRONES EOF ;
    public final void entryRuleURL_GAMEOFTHRONES() throws RecognitionException {
        try {
            // InternalSet.g:229:1: ( ruleURL_GAMEOFTHRONES EOF )
            // InternalSet.g:230:1: ruleURL_GAMEOFTHRONES EOF
            {
             before(grammarAccess.getURL_GAMEOFTHRONESRule()); 
            pushFollow(FOLLOW_1);
            ruleURL_GAMEOFTHRONES();

            state._fsp--;

             after(grammarAccess.getURL_GAMEOFTHRONESRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleURL_GAMEOFTHRONES"


    // $ANTLR start "ruleURL_GAMEOFTHRONES"
    // InternalSet.g:237:1: ruleURL_GAMEOFTHRONES : ( '/pack/got/' ) ;
    public final void ruleURL_GAMEOFTHRONES() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:241:2: ( ( '/pack/got/' ) )
            // InternalSet.g:242:2: ( '/pack/got/' )
            {
            // InternalSet.g:242:2: ( '/pack/got/' )
            // InternalSet.g:243:3: '/pack/got/'
            {
             before(grammarAccess.getURL_GAMEOFTHRONESAccess().getPackGotKeyword()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getURL_GAMEOFTHRONESAccess().getPackGotKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleURL_GAMEOFTHRONES"


    // $ANTLR start "entryRuleURL_DOCTORWHO"
    // InternalSet.g:253:1: entryRuleURL_DOCTORWHO : ruleURL_DOCTORWHO EOF ;
    public final void entryRuleURL_DOCTORWHO() throws RecognitionException {
        try {
            // InternalSet.g:254:1: ( ruleURL_DOCTORWHO EOF )
            // InternalSet.g:255:1: ruleURL_DOCTORWHO EOF
            {
             before(grammarAccess.getURL_DOCTORWHORule()); 
            pushFollow(FOLLOW_1);
            ruleURL_DOCTORWHO();

            state._fsp--;

             after(grammarAccess.getURL_DOCTORWHORule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleURL_DOCTORWHO"


    // $ANTLR start "ruleURL_DOCTORWHO"
    // InternalSet.g:262:1: ruleURL_DOCTORWHO : ( '/pack/dw/' ) ;
    public final void ruleURL_DOCTORWHO() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:266:2: ( ( '/pack/dw/' ) )
            // InternalSet.g:267:2: ( '/pack/dw/' )
            {
            // InternalSet.g:267:2: ( '/pack/dw/' )
            // InternalSet.g:268:3: '/pack/dw/'
            {
             before(grammarAccess.getURL_DOCTORWHOAccess().getPackDwKeyword()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getURL_DOCTORWHOAccess().getPackDwKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleURL_DOCTORWHO"


    // $ANTLR start "entryRuleURL_ORIGINAL"
    // InternalSet.g:278:1: entryRuleURL_ORIGINAL : ruleURL_ORIGINAL EOF ;
    public final void entryRuleURL_ORIGINAL() throws RecognitionException {
        try {
            // InternalSet.g:279:1: ( ruleURL_ORIGINAL EOF )
            // InternalSet.g:280:1: ruleURL_ORIGINAL EOF
            {
             before(grammarAccess.getURL_ORIGINALRule()); 
            pushFollow(FOLLOW_1);
            ruleURL_ORIGINAL();

            state._fsp--;

             after(grammarAccess.getURL_ORIGINALRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleURL_ORIGINAL"


    // $ANTLR start "ruleURL_ORIGINAL"
    // InternalSet.g:287:1: ruleURL_ORIGINAL : ( '/pack/original/' ) ;
    public final void ruleURL_ORIGINAL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:291:2: ( ( '/pack/original/' ) )
            // InternalSet.g:292:2: ( '/pack/original/' )
            {
            // InternalSet.g:292:2: ( '/pack/original/' )
            // InternalSet.g:293:3: '/pack/original/'
            {
             before(grammarAccess.getURL_ORIGINALAccess().getPackOriginalKeyword()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getURL_ORIGINALAccess().getPackOriginalKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleURL_ORIGINAL"


    // $ANTLR start "rule__FORMS__Alternatives"
    // InternalSet.g:302:1: rule__FORMS__Alternatives : ( ( ruleFORM_ORIGINAL ) | ( ruleFORM_DOCTORWHO ) | ( ruleFORM_GAMEOFTHRONES ) );
    public final void rule__FORMS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:306:1: ( ( ruleFORM_ORIGINAL ) | ( ruleFORM_DOCTORWHO ) | ( ruleFORM_GAMEOFTHRONES ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt1=1;
                }
                break;
            case 13:
                {
                alt1=2;
                }
                break;
            case 11:
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
                    // InternalSet.g:307:2: ( ruleFORM_ORIGINAL )
                    {
                    // InternalSet.g:307:2: ( ruleFORM_ORIGINAL )
                    // InternalSet.g:308:3: ruleFORM_ORIGINAL
                    {
                     before(grammarAccess.getFORMSAccess().getFORM_ORIGINALParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFORM_ORIGINAL();

                    state._fsp--;

                     after(grammarAccess.getFORMSAccess().getFORM_ORIGINALParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSet.g:313:2: ( ruleFORM_DOCTORWHO )
                    {
                    // InternalSet.g:313:2: ( ruleFORM_DOCTORWHO )
                    // InternalSet.g:314:3: ruleFORM_DOCTORWHO
                    {
                     before(grammarAccess.getFORMSAccess().getFORM_DOCTORWHOParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFORM_DOCTORWHO();

                    state._fsp--;

                     after(grammarAccess.getFORMSAccess().getFORM_DOCTORWHOParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSet.g:319:2: ( ruleFORM_GAMEOFTHRONES )
                    {
                    // InternalSet.g:319:2: ( ruleFORM_GAMEOFTHRONES )
                    // InternalSet.g:320:3: ruleFORM_GAMEOFTHRONES
                    {
                     before(grammarAccess.getFORMSAccess().getFORM_GAMEOFTHRONESParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFORM_GAMEOFTHRONES();

                    state._fsp--;

                     after(grammarAccess.getFORMSAccess().getFORM_GAMEOFTHRONESParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FORMS__Alternatives"


    // $ANTLR start "rule__URL__Alternatives"
    // InternalSet.g:329:1: rule__URL__Alternatives : ( ( ruleURL_ORIGINAL ) | ( ruleURL_DOCTORWHO ) | ( ruleURL_GAMEOFTHRONES ) );
    public final void rule__URL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:333:1: ( ( ruleURL_ORIGINAL ) | ( ruleURL_DOCTORWHO ) | ( ruleURL_GAMEOFTHRONES ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 14:
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
                    // InternalSet.g:334:2: ( ruleURL_ORIGINAL )
                    {
                    // InternalSet.g:334:2: ( ruleURL_ORIGINAL )
                    // InternalSet.g:335:3: ruleURL_ORIGINAL
                    {
                     before(grammarAccess.getURLAccess().getURL_ORIGINALParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleURL_ORIGINAL();

                    state._fsp--;

                     after(grammarAccess.getURLAccess().getURL_ORIGINALParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSet.g:340:2: ( ruleURL_DOCTORWHO )
                    {
                    // InternalSet.g:340:2: ( ruleURL_DOCTORWHO )
                    // InternalSet.g:341:3: ruleURL_DOCTORWHO
                    {
                     before(grammarAccess.getURLAccess().getURL_DOCTORWHOParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleURL_DOCTORWHO();

                    state._fsp--;

                     after(grammarAccess.getURLAccess().getURL_DOCTORWHOParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSet.g:346:2: ( ruleURL_GAMEOFTHRONES )
                    {
                    // InternalSet.g:346:2: ( ruleURL_GAMEOFTHRONES )
                    // InternalSet.g:347:3: ruleURL_GAMEOFTHRONES
                    {
                     before(grammarAccess.getURLAccess().getURL_GAMEOFTHRONESParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleURL_GAMEOFTHRONES();

                    state._fsp--;

                     after(grammarAccess.getURLAccess().getURL_GAMEOFTHRONESParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URL__Alternatives"


    // $ANTLR start "rule__PACKTYPE__UnorderedGroup"
    // InternalSet.g:356:1: rule__PACKTYPE__UnorderedGroup : rule__PACKTYPE__UnorderedGroup__0 {...}?;
    public final void rule__PACKTYPE__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getPACKTYPEAccess().getUnorderedGroup());
        	
        try {
            // InternalSet.g:361:1: ( rule__PACKTYPE__UnorderedGroup__0 {...}?)
            // InternalSet.g:362:2: rule__PACKTYPE__UnorderedGroup__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__PACKTYPE__UnorderedGroup__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getPACKTYPEAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "rule__PACKTYPE__UnorderedGroup", "getUnorderedGroupHelper().canLeave(grammarAccess.getPACKTYPEAccess().getUnorderedGroup())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getPACKTYPEAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PACKTYPE__UnorderedGroup"


    // $ANTLR start "rule__PACKTYPE__UnorderedGroup__Impl"
    // InternalSet.g:370:1: rule__PACKTYPE__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__PACKTYPE__FormsAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__PACKTYPE__UrlAssignment_1 ) ) ) ) ) ;
    public final void rule__PACKTYPE__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalSet.g:375:1: ( ( ({...}? => ( ( ( rule__PACKTYPE__FormsAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__PACKTYPE__UrlAssignment_1 ) ) ) ) ) )
            // InternalSet.g:376:3: ( ({...}? => ( ( ( rule__PACKTYPE__FormsAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__PACKTYPE__UrlAssignment_1 ) ) ) ) )
            {
            // InternalSet.g:376:3: ( ({...}? => ( ( ( rule__PACKTYPE__FormsAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__PACKTYPE__UrlAssignment_1 ) ) ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( LA3_0 >= 11 && LA3_0 <= 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getPACKTYPEAccess().getUnorderedGroup(), 0) ) {
                alt3=1;
            }
            else if ( LA3_0 >= 14 && LA3_0 <= 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getPACKTYPEAccess().getUnorderedGroup(), 1) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSet.g:377:3: ({...}? => ( ( ( rule__PACKTYPE__FormsAssignment_0 ) ) ) )
                    {
                    // InternalSet.g:377:3: ({...}? => ( ( ( rule__PACKTYPE__FormsAssignment_0 ) ) ) )
                    // InternalSet.g:378:4: {...}? => ( ( ( rule__PACKTYPE__FormsAssignment_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPACKTYPEAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__PACKTYPE__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPACKTYPEAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalSet.g:378:102: ( ( ( rule__PACKTYPE__FormsAssignment_0 ) ) )
                    // InternalSet.g:379:5: ( ( rule__PACKTYPE__FormsAssignment_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPACKTYPEAccess().getUnorderedGroup(), 0);
                    				

                    					selected = true;
                    				
                    // InternalSet.g:385:5: ( ( rule__PACKTYPE__FormsAssignment_0 ) )
                    // InternalSet.g:386:6: ( rule__PACKTYPE__FormsAssignment_0 )
                    {
                     before(grammarAccess.getPACKTYPEAccess().getFormsAssignment_0()); 
                    // InternalSet.g:387:6: ( rule__PACKTYPE__FormsAssignment_0 )
                    // InternalSet.g:387:7: rule__PACKTYPE__FormsAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PACKTYPE__FormsAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPACKTYPEAccess().getFormsAssignment_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSet.g:392:3: ({...}? => ( ( ( rule__PACKTYPE__UrlAssignment_1 ) ) ) )
                    {
                    // InternalSet.g:392:3: ({...}? => ( ( ( rule__PACKTYPE__UrlAssignment_1 ) ) ) )
                    // InternalSet.g:393:4: {...}? => ( ( ( rule__PACKTYPE__UrlAssignment_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPACKTYPEAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__PACKTYPE__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPACKTYPEAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalSet.g:393:102: ( ( ( rule__PACKTYPE__UrlAssignment_1 ) ) )
                    // InternalSet.g:394:5: ( ( rule__PACKTYPE__UrlAssignment_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPACKTYPEAccess().getUnorderedGroup(), 1);
                    				

                    					selected = true;
                    				
                    // InternalSet.g:400:5: ( ( rule__PACKTYPE__UrlAssignment_1 ) )
                    // InternalSet.g:401:6: ( rule__PACKTYPE__UrlAssignment_1 )
                    {
                     before(grammarAccess.getPACKTYPEAccess().getUrlAssignment_1()); 
                    // InternalSet.g:402:6: ( rule__PACKTYPE__UrlAssignment_1 )
                    // InternalSet.g:402:7: rule__PACKTYPE__UrlAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PACKTYPE__UrlAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPACKTYPEAccess().getUrlAssignment_1()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPACKTYPEAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PACKTYPE__UnorderedGroup__Impl"


    // $ANTLR start "rule__PACKTYPE__UnorderedGroup__0"
    // InternalSet.g:415:1: rule__PACKTYPE__UnorderedGroup__0 : rule__PACKTYPE__UnorderedGroup__Impl ( rule__PACKTYPE__UnorderedGroup__1 )? ;
    public final void rule__PACKTYPE__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:419:1: ( rule__PACKTYPE__UnorderedGroup__Impl ( rule__PACKTYPE__UnorderedGroup__1 )? )
            // InternalSet.g:420:2: rule__PACKTYPE__UnorderedGroup__Impl ( rule__PACKTYPE__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_3);
            rule__PACKTYPE__UnorderedGroup__Impl();

            state._fsp--;

            // InternalSet.g:421:2: ( rule__PACKTYPE__UnorderedGroup__1 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( LA4_0 >= 11 && LA4_0 <= 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getPACKTYPEAccess().getUnorderedGroup(), 0) ) {
                alt4=1;
            }
            else if ( LA4_0 >= 14 && LA4_0 <= 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getPACKTYPEAccess().getUnorderedGroup(), 1) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSet.g:421:2: rule__PACKTYPE__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PACKTYPE__UnorderedGroup__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PACKTYPE__UnorderedGroup__0"


    // $ANTLR start "rule__PACKTYPE__UnorderedGroup__1"
    // InternalSet.g:427:1: rule__PACKTYPE__UnorderedGroup__1 : rule__PACKTYPE__UnorderedGroup__Impl ;
    public final void rule__PACKTYPE__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:431:1: ( rule__PACKTYPE__UnorderedGroup__Impl )
            // InternalSet.g:432:2: rule__PACKTYPE__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PACKTYPE__UnorderedGroup__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PACKTYPE__UnorderedGroup__1"


    // $ANTLR start "rule__PACK__PackAssignment"
    // InternalSet.g:439:1: rule__PACK__PackAssignment : ( rulePACKTYPE ) ;
    public final void rule__PACK__PackAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:443:1: ( ( rulePACKTYPE ) )
            // InternalSet.g:444:2: ( rulePACKTYPE )
            {
            // InternalSet.g:444:2: ( rulePACKTYPE )
            // InternalSet.g:445:3: rulePACKTYPE
            {
             before(grammarAccess.getPACKAccess().getPackPACKTYPEParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePACKTYPE();

            state._fsp--;

             after(grammarAccess.getPACKAccess().getPackPACKTYPEParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PACK__PackAssignment"


    // $ANTLR start "rule__PACKTYPE__FormsAssignment_0"
    // InternalSet.g:454:1: rule__PACKTYPE__FormsAssignment_0 : ( ruleFORMS ) ;
    public final void rule__PACKTYPE__FormsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:458:1: ( ( ruleFORMS ) )
            // InternalSet.g:459:2: ( ruleFORMS )
            {
            // InternalSet.g:459:2: ( ruleFORMS )
            // InternalSet.g:460:3: ruleFORMS
            {
             before(grammarAccess.getPACKTYPEAccess().getFormsFORMSParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFORMS();

            state._fsp--;

             after(grammarAccess.getPACKTYPEAccess().getFormsFORMSParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PACKTYPE__FormsAssignment_0"


    // $ANTLR start "rule__PACKTYPE__UrlAssignment_1"
    // InternalSet.g:469:1: rule__PACKTYPE__UrlAssignment_1 : ( ruleURL ) ;
    public final void rule__PACKTYPE__UrlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:473:1: ( ( ruleURL ) )
            // InternalSet.g:474:2: ( ruleURL )
            {
            // InternalSet.g:474:2: ( ruleURL )
            // InternalSet.g:475:3: ruleURL
            {
             before(grammarAccess.getPACKTYPEAccess().getUrlURLParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleURL();

            state._fsp--;

             after(grammarAccess.getPACKTYPEAccess().getUrlURLParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PACKTYPE__UrlAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000001F802L});

}
