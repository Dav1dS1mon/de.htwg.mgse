package org.xtext.mgse.ide.contentassist.antlr.internal;

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
import org.xtext.mgse.services.SetGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSetParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'FORM_ORIGINAL'", "'FORM_DOCTORWHO'", "'FORM_GAMEOFTHRONES'", "'URL_ORIGINAL'", "'URL_DOCTORWHO'", "'URL_GAMEOFTHRONES'", "'pack'", "'{'", "'}'", "'='", "'FORM'", "'URL'"
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
    // InternalSet.g:62:1: rulePACK : ( ( rule__PACK__Group__0 ) ) ;
    public final void rulePACK() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:66:2: ( ( ( rule__PACK__Group__0 ) ) )
            // InternalSet.g:67:2: ( ( rule__PACK__Group__0 ) )
            {
            // InternalSet.g:67:2: ( ( rule__PACK__Group__0 ) )
            // InternalSet.g:68:3: ( rule__PACK__Group__0 )
            {
             before(grammarAccess.getPACKAccess().getGroup()); 
            // InternalSet.g:69:3: ( rule__PACK__Group__0 )
            // InternalSet.g:69:4: rule__PACK__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PACK__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPACKAccess().getGroup()); 

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
    // InternalSet.g:87:1: rulePACKTYPE : ( ( rule__PACKTYPE__Group__0 ) ) ;
    public final void rulePACKTYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:91:2: ( ( ( rule__PACKTYPE__Group__0 ) ) )
            // InternalSet.g:92:2: ( ( rule__PACKTYPE__Group__0 ) )
            {
            // InternalSet.g:92:2: ( ( rule__PACKTYPE__Group__0 ) )
            // InternalSet.g:93:3: ( rule__PACKTYPE__Group__0 )
            {
             before(grammarAccess.getPACKTYPEAccess().getGroup()); 
            // InternalSet.g:94:3: ( rule__PACKTYPE__Group__0 )
            // InternalSet.g:94:4: rule__PACKTYPE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PACKTYPE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPACKTYPEAccess().getGroup()); 

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
    // InternalSet.g:112:1: ruleFORMS : ( ( rule__FORMS__Group__0 ) ) ;
    public final void ruleFORMS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:116:2: ( ( ( rule__FORMS__Group__0 ) ) )
            // InternalSet.g:117:2: ( ( rule__FORMS__Group__0 ) )
            {
            // InternalSet.g:117:2: ( ( rule__FORMS__Group__0 ) )
            // InternalSet.g:118:3: ( rule__FORMS__Group__0 )
            {
             before(grammarAccess.getFORMSAccess().getGroup()); 
            // InternalSet.g:119:3: ( rule__FORMS__Group__0 )
            // InternalSet.g:119:4: rule__FORMS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FORMS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFORMSAccess().getGroup()); 

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


    // $ANTLR start "entryRuleURL"
    // InternalSet.g:128:1: entryRuleURL : ruleURL EOF ;
    public final void entryRuleURL() throws RecognitionException {
        try {
            // InternalSet.g:129:1: ( ruleURL EOF )
            // InternalSet.g:130:1: ruleURL EOF
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
    // InternalSet.g:137:1: ruleURL : ( ( rule__URL__Group__0 ) ) ;
    public final void ruleURL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:141:2: ( ( ( rule__URL__Group__0 ) ) )
            // InternalSet.g:142:2: ( ( rule__URL__Group__0 ) )
            {
            // InternalSet.g:142:2: ( ( rule__URL__Group__0 ) )
            // InternalSet.g:143:3: ( rule__URL__Group__0 )
            {
             before(grammarAccess.getURLAccess().getGroup()); 
            // InternalSet.g:144:3: ( rule__URL__Group__0 )
            // InternalSet.g:144:4: rule__URL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__URL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getURLAccess().getGroup()); 

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


    // $ANTLR start "ruleTYPE_FORMS"
    // InternalSet.g:153:1: ruleTYPE_FORMS : ( ( rule__TYPE_FORMS__Alternatives ) ) ;
    public final void ruleTYPE_FORMS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:157:1: ( ( ( rule__TYPE_FORMS__Alternatives ) ) )
            // InternalSet.g:158:2: ( ( rule__TYPE_FORMS__Alternatives ) )
            {
            // InternalSet.g:158:2: ( ( rule__TYPE_FORMS__Alternatives ) )
            // InternalSet.g:159:3: ( rule__TYPE_FORMS__Alternatives )
            {
             before(grammarAccess.getTYPE_FORMSAccess().getAlternatives()); 
            // InternalSet.g:160:3: ( rule__TYPE_FORMS__Alternatives )
            // InternalSet.g:160:4: rule__TYPE_FORMS__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TYPE_FORMS__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTYPE_FORMSAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTYPE_FORMS"


    // $ANTLR start "ruleURL_TYPES"
    // InternalSet.g:169:1: ruleURL_TYPES : ( ( rule__URL_TYPES__Alternatives ) ) ;
    public final void ruleURL_TYPES() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:173:1: ( ( ( rule__URL_TYPES__Alternatives ) ) )
            // InternalSet.g:174:2: ( ( rule__URL_TYPES__Alternatives ) )
            {
            // InternalSet.g:174:2: ( ( rule__URL_TYPES__Alternatives ) )
            // InternalSet.g:175:3: ( rule__URL_TYPES__Alternatives )
            {
             before(grammarAccess.getURL_TYPESAccess().getAlternatives()); 
            // InternalSet.g:176:3: ( rule__URL_TYPES__Alternatives )
            // InternalSet.g:176:4: rule__URL_TYPES__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__URL_TYPES__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getURL_TYPESAccess().getAlternatives()); 

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
    // $ANTLR end "ruleURL_TYPES"


    // $ANTLR start "rule__TYPE_FORMS__Alternatives"
    // InternalSet.g:184:1: rule__TYPE_FORMS__Alternatives : ( ( ( 'FORM_ORIGINAL' ) ) | ( ( 'FORM_DOCTORWHO' ) ) | ( ( 'FORM_GAMEOFTHRONES' ) ) );
    public final void rule__TYPE_FORMS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:188:1: ( ( ( 'FORM_ORIGINAL' ) ) | ( ( 'FORM_DOCTORWHO' ) ) | ( ( 'FORM_GAMEOFTHRONES' ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
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
                    // InternalSet.g:189:2: ( ( 'FORM_ORIGINAL' ) )
                    {
                    // InternalSet.g:189:2: ( ( 'FORM_ORIGINAL' ) )
                    // InternalSet.g:190:3: ( 'FORM_ORIGINAL' )
                    {
                     before(grammarAccess.getTYPE_FORMSAccess().getFORM_ORIGINALEnumLiteralDeclaration_0()); 
                    // InternalSet.g:191:3: ( 'FORM_ORIGINAL' )
                    // InternalSet.g:191:4: 'FORM_ORIGINAL'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getTYPE_FORMSAccess().getFORM_ORIGINALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSet.g:195:2: ( ( 'FORM_DOCTORWHO' ) )
                    {
                    // InternalSet.g:195:2: ( ( 'FORM_DOCTORWHO' ) )
                    // InternalSet.g:196:3: ( 'FORM_DOCTORWHO' )
                    {
                     before(grammarAccess.getTYPE_FORMSAccess().getFORM_DOCTORWHOEnumLiteralDeclaration_1()); 
                    // InternalSet.g:197:3: ( 'FORM_DOCTORWHO' )
                    // InternalSet.g:197:4: 'FORM_DOCTORWHO'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTYPE_FORMSAccess().getFORM_DOCTORWHOEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSet.g:201:2: ( ( 'FORM_GAMEOFTHRONES' ) )
                    {
                    // InternalSet.g:201:2: ( ( 'FORM_GAMEOFTHRONES' ) )
                    // InternalSet.g:202:3: ( 'FORM_GAMEOFTHRONES' )
                    {
                     before(grammarAccess.getTYPE_FORMSAccess().getFORM_GAMEOFTHRONESEnumLiteralDeclaration_2()); 
                    // InternalSet.g:203:3: ( 'FORM_GAMEOFTHRONES' )
                    // InternalSet.g:203:4: 'FORM_GAMEOFTHRONES'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTYPE_FORMSAccess().getFORM_GAMEOFTHRONESEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__TYPE_FORMS__Alternatives"


    // $ANTLR start "rule__URL_TYPES__Alternatives"
    // InternalSet.g:211:1: rule__URL_TYPES__Alternatives : ( ( ( 'URL_ORIGINAL' ) ) | ( ( 'URL_DOCTORWHO' ) ) | ( ( 'URL_GAMEOFTHRONES' ) ) );
    public final void rule__URL_TYPES__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:215:1: ( ( ( 'URL_ORIGINAL' ) ) | ( ( 'URL_DOCTORWHO' ) ) | ( ( 'URL_GAMEOFTHRONES' ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 16:
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
                    // InternalSet.g:216:2: ( ( 'URL_ORIGINAL' ) )
                    {
                    // InternalSet.g:216:2: ( ( 'URL_ORIGINAL' ) )
                    // InternalSet.g:217:3: ( 'URL_ORIGINAL' )
                    {
                     before(grammarAccess.getURL_TYPESAccess().getURL_ORIGINALEnumLiteralDeclaration_0()); 
                    // InternalSet.g:218:3: ( 'URL_ORIGINAL' )
                    // InternalSet.g:218:4: 'URL_ORIGINAL'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getURL_TYPESAccess().getURL_ORIGINALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSet.g:222:2: ( ( 'URL_DOCTORWHO' ) )
                    {
                    // InternalSet.g:222:2: ( ( 'URL_DOCTORWHO' ) )
                    // InternalSet.g:223:3: ( 'URL_DOCTORWHO' )
                    {
                     before(grammarAccess.getURL_TYPESAccess().getURL_DOCTORWHOEnumLiteralDeclaration_1()); 
                    // InternalSet.g:224:3: ( 'URL_DOCTORWHO' )
                    // InternalSet.g:224:4: 'URL_DOCTORWHO'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getURL_TYPESAccess().getURL_DOCTORWHOEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSet.g:228:2: ( ( 'URL_GAMEOFTHRONES' ) )
                    {
                    // InternalSet.g:228:2: ( ( 'URL_GAMEOFTHRONES' ) )
                    // InternalSet.g:229:3: ( 'URL_GAMEOFTHRONES' )
                    {
                     before(grammarAccess.getURL_TYPESAccess().getURL_GAMEOFTHRONESEnumLiteralDeclaration_2()); 
                    // InternalSet.g:230:3: ( 'URL_GAMEOFTHRONES' )
                    // InternalSet.g:230:4: 'URL_GAMEOFTHRONES'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getURL_TYPESAccess().getURL_GAMEOFTHRONESEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__URL_TYPES__Alternatives"


    // $ANTLR start "rule__PACK__Group__0"
    // InternalSet.g:238:1: rule__PACK__Group__0 : rule__PACK__Group__0__Impl rule__PACK__Group__1 ;
    public final void rule__PACK__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:242:1: ( rule__PACK__Group__0__Impl rule__PACK__Group__1 )
            // InternalSet.g:243:2: rule__PACK__Group__0__Impl rule__PACK__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__PACK__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PACK__Group__1();

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
    // $ANTLR end "rule__PACK__Group__0"


    // $ANTLR start "rule__PACK__Group__0__Impl"
    // InternalSet.g:250:1: rule__PACK__Group__0__Impl : ( 'pack' ) ;
    public final void rule__PACK__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:254:1: ( ( 'pack' ) )
            // InternalSet.g:255:1: ( 'pack' )
            {
            // InternalSet.g:255:1: ( 'pack' )
            // InternalSet.g:256:2: 'pack'
            {
             before(grammarAccess.getPACKAccess().getPackKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPACKAccess().getPackKeyword_0()); 

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
    // $ANTLR end "rule__PACK__Group__0__Impl"


    // $ANTLR start "rule__PACK__Group__1"
    // InternalSet.g:265:1: rule__PACK__Group__1 : rule__PACK__Group__1__Impl rule__PACK__Group__2 ;
    public final void rule__PACK__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:269:1: ( rule__PACK__Group__1__Impl rule__PACK__Group__2 )
            // InternalSet.g:270:2: rule__PACK__Group__1__Impl rule__PACK__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__PACK__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PACK__Group__2();

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
    // $ANTLR end "rule__PACK__Group__1"


    // $ANTLR start "rule__PACK__Group__1__Impl"
    // InternalSet.g:277:1: rule__PACK__Group__1__Impl : ( ( rule__PACK__NameAssignment_1 ) ) ;
    public final void rule__PACK__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:281:1: ( ( ( rule__PACK__NameAssignment_1 ) ) )
            // InternalSet.g:282:1: ( ( rule__PACK__NameAssignment_1 ) )
            {
            // InternalSet.g:282:1: ( ( rule__PACK__NameAssignment_1 ) )
            // InternalSet.g:283:2: ( rule__PACK__NameAssignment_1 )
            {
             before(grammarAccess.getPACKAccess().getNameAssignment_1()); 
            // InternalSet.g:284:2: ( rule__PACK__NameAssignment_1 )
            // InternalSet.g:284:3: rule__PACK__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PACK__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPACKAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__PACK__Group__1__Impl"


    // $ANTLR start "rule__PACK__Group__2"
    // InternalSet.g:292:1: rule__PACK__Group__2 : rule__PACK__Group__2__Impl rule__PACK__Group__3 ;
    public final void rule__PACK__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:296:1: ( rule__PACK__Group__2__Impl rule__PACK__Group__3 )
            // InternalSet.g:297:2: rule__PACK__Group__2__Impl rule__PACK__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__PACK__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PACK__Group__3();

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
    // $ANTLR end "rule__PACK__Group__2"


    // $ANTLR start "rule__PACK__Group__2__Impl"
    // InternalSet.g:304:1: rule__PACK__Group__2__Impl : ( '{' ) ;
    public final void rule__PACK__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:308:1: ( ( '{' ) )
            // InternalSet.g:309:1: ( '{' )
            {
            // InternalSet.g:309:1: ( '{' )
            // InternalSet.g:310:2: '{'
            {
             before(grammarAccess.getPACKAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPACKAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__PACK__Group__2__Impl"


    // $ANTLR start "rule__PACK__Group__3"
    // InternalSet.g:319:1: rule__PACK__Group__3 : rule__PACK__Group__3__Impl rule__PACK__Group__4 ;
    public final void rule__PACK__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:323:1: ( rule__PACK__Group__3__Impl rule__PACK__Group__4 )
            // InternalSet.g:324:2: rule__PACK__Group__3__Impl rule__PACK__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__PACK__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PACK__Group__4();

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
    // $ANTLR end "rule__PACK__Group__3"


    // $ANTLR start "rule__PACK__Group__3__Impl"
    // InternalSet.g:331:1: rule__PACK__Group__3__Impl : ( ( rule__PACK__TypeAssignment_3 ) ) ;
    public final void rule__PACK__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:335:1: ( ( ( rule__PACK__TypeAssignment_3 ) ) )
            // InternalSet.g:336:1: ( ( rule__PACK__TypeAssignment_3 ) )
            {
            // InternalSet.g:336:1: ( ( rule__PACK__TypeAssignment_3 ) )
            // InternalSet.g:337:2: ( rule__PACK__TypeAssignment_3 )
            {
             before(grammarAccess.getPACKAccess().getTypeAssignment_3()); 
            // InternalSet.g:338:2: ( rule__PACK__TypeAssignment_3 )
            // InternalSet.g:338:3: rule__PACK__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PACK__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPACKAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__PACK__Group__3__Impl"


    // $ANTLR start "rule__PACK__Group__4"
    // InternalSet.g:346:1: rule__PACK__Group__4 : rule__PACK__Group__4__Impl ;
    public final void rule__PACK__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:350:1: ( rule__PACK__Group__4__Impl )
            // InternalSet.g:351:2: rule__PACK__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PACK__Group__4__Impl();

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
    // $ANTLR end "rule__PACK__Group__4"


    // $ANTLR start "rule__PACK__Group__4__Impl"
    // InternalSet.g:357:1: rule__PACK__Group__4__Impl : ( '}' ) ;
    public final void rule__PACK__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:361:1: ( ( '}' ) )
            // InternalSet.g:362:1: ( '}' )
            {
            // InternalSet.g:362:1: ( '}' )
            // InternalSet.g:363:2: '}'
            {
             before(grammarAccess.getPACKAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPACKAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__PACK__Group__4__Impl"


    // $ANTLR start "rule__PACKTYPE__Group__0"
    // InternalSet.g:373:1: rule__PACKTYPE__Group__0 : rule__PACKTYPE__Group__0__Impl rule__PACKTYPE__Group__1 ;
    public final void rule__PACKTYPE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:377:1: ( rule__PACKTYPE__Group__0__Impl rule__PACKTYPE__Group__1 )
            // InternalSet.g:378:2: rule__PACKTYPE__Group__0__Impl rule__PACKTYPE__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__PACKTYPE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PACKTYPE__Group__1();

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
    // $ANTLR end "rule__PACKTYPE__Group__0"


    // $ANTLR start "rule__PACKTYPE__Group__0__Impl"
    // InternalSet.g:385:1: rule__PACKTYPE__Group__0__Impl : ( ( rule__PACKTYPE__FormsAssignment_0 ) ) ;
    public final void rule__PACKTYPE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:389:1: ( ( ( rule__PACKTYPE__FormsAssignment_0 ) ) )
            // InternalSet.g:390:1: ( ( rule__PACKTYPE__FormsAssignment_0 ) )
            {
            // InternalSet.g:390:1: ( ( rule__PACKTYPE__FormsAssignment_0 ) )
            // InternalSet.g:391:2: ( rule__PACKTYPE__FormsAssignment_0 )
            {
             before(grammarAccess.getPACKTYPEAccess().getFormsAssignment_0()); 
            // InternalSet.g:392:2: ( rule__PACKTYPE__FormsAssignment_0 )
            // InternalSet.g:392:3: rule__PACKTYPE__FormsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PACKTYPE__FormsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPACKTYPEAccess().getFormsAssignment_0()); 

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
    // $ANTLR end "rule__PACKTYPE__Group__0__Impl"


    // $ANTLR start "rule__PACKTYPE__Group__1"
    // InternalSet.g:400:1: rule__PACKTYPE__Group__1 : rule__PACKTYPE__Group__1__Impl ;
    public final void rule__PACKTYPE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:404:1: ( rule__PACKTYPE__Group__1__Impl )
            // InternalSet.g:405:2: rule__PACKTYPE__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PACKTYPE__Group__1__Impl();

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
    // $ANTLR end "rule__PACKTYPE__Group__1"


    // $ANTLR start "rule__PACKTYPE__Group__1__Impl"
    // InternalSet.g:411:1: rule__PACKTYPE__Group__1__Impl : ( ( rule__PACKTYPE__UrlAssignment_1 ) ) ;
    public final void rule__PACKTYPE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:415:1: ( ( ( rule__PACKTYPE__UrlAssignment_1 ) ) )
            // InternalSet.g:416:1: ( ( rule__PACKTYPE__UrlAssignment_1 ) )
            {
            // InternalSet.g:416:1: ( ( rule__PACKTYPE__UrlAssignment_1 ) )
            // InternalSet.g:417:2: ( rule__PACKTYPE__UrlAssignment_1 )
            {
             before(grammarAccess.getPACKTYPEAccess().getUrlAssignment_1()); 
            // InternalSet.g:418:2: ( rule__PACKTYPE__UrlAssignment_1 )
            // InternalSet.g:418:3: rule__PACKTYPE__UrlAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PACKTYPE__UrlAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPACKTYPEAccess().getUrlAssignment_1()); 

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
    // $ANTLR end "rule__PACKTYPE__Group__1__Impl"


    // $ANTLR start "rule__FORMS__Group__0"
    // InternalSet.g:427:1: rule__FORMS__Group__0 : rule__FORMS__Group__0__Impl rule__FORMS__Group__1 ;
    public final void rule__FORMS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:431:1: ( rule__FORMS__Group__0__Impl rule__FORMS__Group__1 )
            // InternalSet.g:432:2: rule__FORMS__Group__0__Impl rule__FORMS__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__FORMS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FORMS__Group__1();

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
    // $ANTLR end "rule__FORMS__Group__0"


    // $ANTLR start "rule__FORMS__Group__0__Impl"
    // InternalSet.g:439:1: rule__FORMS__Group__0__Impl : ( ( rule__FORMS__NameAssignment_0 ) ) ;
    public final void rule__FORMS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:443:1: ( ( ( rule__FORMS__NameAssignment_0 ) ) )
            // InternalSet.g:444:1: ( ( rule__FORMS__NameAssignment_0 ) )
            {
            // InternalSet.g:444:1: ( ( rule__FORMS__NameAssignment_0 ) )
            // InternalSet.g:445:2: ( rule__FORMS__NameAssignment_0 )
            {
             before(grammarAccess.getFORMSAccess().getNameAssignment_0()); 
            // InternalSet.g:446:2: ( rule__FORMS__NameAssignment_0 )
            // InternalSet.g:446:3: rule__FORMS__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FORMS__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFORMSAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__FORMS__Group__0__Impl"


    // $ANTLR start "rule__FORMS__Group__1"
    // InternalSet.g:454:1: rule__FORMS__Group__1 : rule__FORMS__Group__1__Impl rule__FORMS__Group__2 ;
    public final void rule__FORMS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:458:1: ( rule__FORMS__Group__1__Impl rule__FORMS__Group__2 )
            // InternalSet.g:459:2: rule__FORMS__Group__1__Impl rule__FORMS__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__FORMS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FORMS__Group__2();

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
    // $ANTLR end "rule__FORMS__Group__1"


    // $ANTLR start "rule__FORMS__Group__1__Impl"
    // InternalSet.g:466:1: rule__FORMS__Group__1__Impl : ( '=' ) ;
    public final void rule__FORMS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:470:1: ( ( '=' ) )
            // InternalSet.g:471:1: ( '=' )
            {
            // InternalSet.g:471:1: ( '=' )
            // InternalSet.g:472:2: '='
            {
             before(grammarAccess.getFORMSAccess().getEqualsSignKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFORMSAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__FORMS__Group__1__Impl"


    // $ANTLR start "rule__FORMS__Group__2"
    // InternalSet.g:481:1: rule__FORMS__Group__2 : rule__FORMS__Group__2__Impl ;
    public final void rule__FORMS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:485:1: ( rule__FORMS__Group__2__Impl )
            // InternalSet.g:486:2: rule__FORMS__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FORMS__Group__2__Impl();

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
    // $ANTLR end "rule__FORMS__Group__2"


    // $ANTLR start "rule__FORMS__Group__2__Impl"
    // InternalSet.g:492:1: rule__FORMS__Group__2__Impl : ( ( rule__FORMS__TypeAssignment_2 ) ) ;
    public final void rule__FORMS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:496:1: ( ( ( rule__FORMS__TypeAssignment_2 ) ) )
            // InternalSet.g:497:1: ( ( rule__FORMS__TypeAssignment_2 ) )
            {
            // InternalSet.g:497:1: ( ( rule__FORMS__TypeAssignment_2 ) )
            // InternalSet.g:498:2: ( rule__FORMS__TypeAssignment_2 )
            {
             before(grammarAccess.getFORMSAccess().getTypeAssignment_2()); 
            // InternalSet.g:499:2: ( rule__FORMS__TypeAssignment_2 )
            // InternalSet.g:499:3: rule__FORMS__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FORMS__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFORMSAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__FORMS__Group__2__Impl"


    // $ANTLR start "rule__URL__Group__0"
    // InternalSet.g:508:1: rule__URL__Group__0 : rule__URL__Group__0__Impl rule__URL__Group__1 ;
    public final void rule__URL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:512:1: ( rule__URL__Group__0__Impl rule__URL__Group__1 )
            // InternalSet.g:513:2: rule__URL__Group__0__Impl rule__URL__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__URL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__URL__Group__1();

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
    // $ANTLR end "rule__URL__Group__0"


    // $ANTLR start "rule__URL__Group__0__Impl"
    // InternalSet.g:520:1: rule__URL__Group__0__Impl : ( ( rule__URL__NameAssignment_0 ) ) ;
    public final void rule__URL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:524:1: ( ( ( rule__URL__NameAssignment_0 ) ) )
            // InternalSet.g:525:1: ( ( rule__URL__NameAssignment_0 ) )
            {
            // InternalSet.g:525:1: ( ( rule__URL__NameAssignment_0 ) )
            // InternalSet.g:526:2: ( rule__URL__NameAssignment_0 )
            {
             before(grammarAccess.getURLAccess().getNameAssignment_0()); 
            // InternalSet.g:527:2: ( rule__URL__NameAssignment_0 )
            // InternalSet.g:527:3: rule__URL__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__URL__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getURLAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__URL__Group__0__Impl"


    // $ANTLR start "rule__URL__Group__1"
    // InternalSet.g:535:1: rule__URL__Group__1 : rule__URL__Group__1__Impl rule__URL__Group__2 ;
    public final void rule__URL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:539:1: ( rule__URL__Group__1__Impl rule__URL__Group__2 )
            // InternalSet.g:540:2: rule__URL__Group__1__Impl rule__URL__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__URL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__URL__Group__2();

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
    // $ANTLR end "rule__URL__Group__1"


    // $ANTLR start "rule__URL__Group__1__Impl"
    // InternalSet.g:547:1: rule__URL__Group__1__Impl : ( '=' ) ;
    public final void rule__URL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:551:1: ( ( '=' ) )
            // InternalSet.g:552:1: ( '=' )
            {
            // InternalSet.g:552:1: ( '=' )
            // InternalSet.g:553:2: '='
            {
             before(grammarAccess.getURLAccess().getEqualsSignKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getURLAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__URL__Group__1__Impl"


    // $ANTLR start "rule__URL__Group__2"
    // InternalSet.g:562:1: rule__URL__Group__2 : rule__URL__Group__2__Impl ;
    public final void rule__URL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:566:1: ( rule__URL__Group__2__Impl )
            // InternalSet.g:567:2: rule__URL__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__URL__Group__2__Impl();

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
    // $ANTLR end "rule__URL__Group__2"


    // $ANTLR start "rule__URL__Group__2__Impl"
    // InternalSet.g:573:1: rule__URL__Group__2__Impl : ( ( rule__URL__TypeAssignment_2 ) ) ;
    public final void rule__URL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:577:1: ( ( ( rule__URL__TypeAssignment_2 ) ) )
            // InternalSet.g:578:1: ( ( rule__URL__TypeAssignment_2 ) )
            {
            // InternalSet.g:578:1: ( ( rule__URL__TypeAssignment_2 ) )
            // InternalSet.g:579:2: ( rule__URL__TypeAssignment_2 )
            {
             before(grammarAccess.getURLAccess().getTypeAssignment_2()); 
            // InternalSet.g:580:2: ( rule__URL__TypeAssignment_2 )
            // InternalSet.g:580:3: rule__URL__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__URL__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getURLAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__URL__Group__2__Impl"


    // $ANTLR start "rule__PACK__NameAssignment_1"
    // InternalSet.g:589:1: rule__PACK__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PACK__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:593:1: ( ( RULE_ID ) )
            // InternalSet.g:594:2: ( RULE_ID )
            {
            // InternalSet.g:594:2: ( RULE_ID )
            // InternalSet.g:595:3: RULE_ID
            {
             before(grammarAccess.getPACKAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPACKAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__PACK__NameAssignment_1"


    // $ANTLR start "rule__PACK__TypeAssignment_3"
    // InternalSet.g:604:1: rule__PACK__TypeAssignment_3 : ( rulePACKTYPE ) ;
    public final void rule__PACK__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:608:1: ( ( rulePACKTYPE ) )
            // InternalSet.g:609:2: ( rulePACKTYPE )
            {
            // InternalSet.g:609:2: ( rulePACKTYPE )
            // InternalSet.g:610:3: rulePACKTYPE
            {
             before(grammarAccess.getPACKAccess().getTypePACKTYPEParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePACKTYPE();

            state._fsp--;

             after(grammarAccess.getPACKAccess().getTypePACKTYPEParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__PACK__TypeAssignment_3"


    // $ANTLR start "rule__PACKTYPE__FormsAssignment_0"
    // InternalSet.g:619:1: rule__PACKTYPE__FormsAssignment_0 : ( ruleFORMS ) ;
    public final void rule__PACKTYPE__FormsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:623:1: ( ( ruleFORMS ) )
            // InternalSet.g:624:2: ( ruleFORMS )
            {
            // InternalSet.g:624:2: ( ruleFORMS )
            // InternalSet.g:625:3: ruleFORMS
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
    // InternalSet.g:634:1: rule__PACKTYPE__UrlAssignment_1 : ( ruleURL ) ;
    public final void rule__PACKTYPE__UrlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:638:1: ( ( ruleURL ) )
            // InternalSet.g:639:2: ( ruleURL )
            {
            // InternalSet.g:639:2: ( ruleURL )
            // InternalSet.g:640:3: ruleURL
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


    // $ANTLR start "rule__FORMS__NameAssignment_0"
    // InternalSet.g:649:1: rule__FORMS__NameAssignment_0 : ( ( 'FORM' ) ) ;
    public final void rule__FORMS__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:653:1: ( ( ( 'FORM' ) ) )
            // InternalSet.g:654:2: ( ( 'FORM' ) )
            {
            // InternalSet.g:654:2: ( ( 'FORM' ) )
            // InternalSet.g:655:3: ( 'FORM' )
            {
             before(grammarAccess.getFORMSAccess().getNameFORMKeyword_0_0()); 
            // InternalSet.g:656:3: ( 'FORM' )
            // InternalSet.g:657:4: 'FORM'
            {
             before(grammarAccess.getFORMSAccess().getNameFORMKeyword_0_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFORMSAccess().getNameFORMKeyword_0_0()); 

            }

             after(grammarAccess.getFORMSAccess().getNameFORMKeyword_0_0()); 

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
    // $ANTLR end "rule__FORMS__NameAssignment_0"


    // $ANTLR start "rule__FORMS__TypeAssignment_2"
    // InternalSet.g:668:1: rule__FORMS__TypeAssignment_2 : ( ruleTYPE_FORMS ) ;
    public final void rule__FORMS__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:672:1: ( ( ruleTYPE_FORMS ) )
            // InternalSet.g:673:2: ( ruleTYPE_FORMS )
            {
            // InternalSet.g:673:2: ( ruleTYPE_FORMS )
            // InternalSet.g:674:3: ruleTYPE_FORMS
            {
             before(grammarAccess.getFORMSAccess().getTypeTYPE_FORMSEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTYPE_FORMS();

            state._fsp--;

             after(grammarAccess.getFORMSAccess().getTypeTYPE_FORMSEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__FORMS__TypeAssignment_2"


    // $ANTLR start "rule__URL__NameAssignment_0"
    // InternalSet.g:683:1: rule__URL__NameAssignment_0 : ( ( 'URL' ) ) ;
    public final void rule__URL__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:687:1: ( ( ( 'URL' ) ) )
            // InternalSet.g:688:2: ( ( 'URL' ) )
            {
            // InternalSet.g:688:2: ( ( 'URL' ) )
            // InternalSet.g:689:3: ( 'URL' )
            {
             before(grammarAccess.getURLAccess().getNameURLKeyword_0_0()); 
            // InternalSet.g:690:3: ( 'URL' )
            // InternalSet.g:691:4: 'URL'
            {
             before(grammarAccess.getURLAccess().getNameURLKeyword_0_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getURLAccess().getNameURLKeyword_0_0()); 

            }

             after(grammarAccess.getURLAccess().getNameURLKeyword_0_0()); 

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
    // $ANTLR end "rule__URL__NameAssignment_0"


    // $ANTLR start "rule__URL__TypeAssignment_2"
    // InternalSet.g:702:1: rule__URL__TypeAssignment_2 : ( ruleURL_TYPES ) ;
    public final void rule__URL__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSet.g:706:1: ( ( ruleURL_TYPES ) )
            // InternalSet.g:707:2: ( ruleURL_TYPES )
            {
            // InternalSet.g:707:2: ( ruleURL_TYPES )
            // InternalSet.g:708:3: ruleURL_TYPES
            {
             before(grammarAccess.getURLAccess().getTypeURL_TYPESEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleURL_TYPES();

            state._fsp--;

             after(grammarAccess.getURLAccess().getTypeURL_TYPESEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__URL__TypeAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000001C000L});

}