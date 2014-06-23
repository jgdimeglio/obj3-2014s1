package org.xtext.unq.planificador.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.unq.planificador.services.PdmGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPdmParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'simple'", "'semi'", "'exclusiva'", "'profesor'", "'dedicacion'", "'hora'", "'materia'", "'con'", "'aula'", "'cargaHoraria'", "'dias'", "'tiene'", "':'", "'a'", "'hs se dicta'", "'en'", "'semestre'", "'dia'", "'horarios {'", "'}'", "'planificacion'", "'{'", "'a dictar:'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalPdmParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPdmParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPdmParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g"; }


     
     	private PdmGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(PdmGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleModel"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:61:1: ( ruleModel EOF )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:76:1: ( rule__Model__Group__0 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleProfesor"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:88:1: entryRuleProfesor : ruleProfesor EOF ;
    public final void entryRuleProfesor() throws RecognitionException {
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:89:1: ( ruleProfesor EOF )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:90:1: ruleProfesor EOF
            {
             before(grammarAccess.getProfesorRule()); 
            pushFollow(FOLLOW_ruleProfesor_in_entryRuleProfesor121);
            ruleProfesor();

            state._fsp--;

             after(grammarAccess.getProfesorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProfesor128); 

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
    // $ANTLR end "entryRuleProfesor"


    // $ANTLR start "ruleProfesor"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:97:1: ruleProfesor : ( ( rule__Profesor__Group__0 ) ) ;
    public final void ruleProfesor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:101:2: ( ( ( rule__Profesor__Group__0 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:102:1: ( ( rule__Profesor__Group__0 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:102:1: ( ( rule__Profesor__Group__0 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:103:1: ( rule__Profesor__Group__0 )
            {
             before(grammarAccess.getProfesorAccess().getGroup()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:104:1: ( rule__Profesor__Group__0 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:104:2: rule__Profesor__Group__0
            {
            pushFollow(FOLLOW_rule__Profesor__Group__0_in_ruleProfesor154);
            rule__Profesor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProfesorAccess().getGroup()); 

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
    // $ANTLR end "ruleProfesor"


    // $ANTLR start "entryRuleHora"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:116:1: entryRuleHora : ruleHora EOF ;
    public final void entryRuleHora() throws RecognitionException {
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:117:1: ( ruleHora EOF )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:118:1: ruleHora EOF
            {
             before(grammarAccess.getHoraRule()); 
            pushFollow(FOLLOW_ruleHora_in_entryRuleHora181);
            ruleHora();

            state._fsp--;

             after(grammarAccess.getHoraRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHora188); 

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
    // $ANTLR end "entryRuleHora"


    // $ANTLR start "ruleHora"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:125:1: ruleHora : ( ( rule__Hora__Group__0 ) ) ;
    public final void ruleHora() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:129:2: ( ( ( rule__Hora__Group__0 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:130:1: ( ( rule__Hora__Group__0 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:130:1: ( ( rule__Hora__Group__0 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:131:1: ( rule__Hora__Group__0 )
            {
             before(grammarAccess.getHoraAccess().getGroup()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:132:1: ( rule__Hora__Group__0 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:132:2: rule__Hora__Group__0
            {
            pushFollow(FOLLOW_rule__Hora__Group__0_in_ruleHora214);
            rule__Hora__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHoraAccess().getGroup()); 

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
    // $ANTLR end "ruleHora"


    // $ANTLR start "entryRuleDedicacion"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:144:1: entryRuleDedicacion : ruleDedicacion EOF ;
    public final void entryRuleDedicacion() throws RecognitionException {
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:145:1: ( ruleDedicacion EOF )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:146:1: ruleDedicacion EOF
            {
             before(grammarAccess.getDedicacionRule()); 
            pushFollow(FOLLOW_ruleDedicacion_in_entryRuleDedicacion241);
            ruleDedicacion();

            state._fsp--;

             after(grammarAccess.getDedicacionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDedicacion248); 

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
    // $ANTLR end "entryRuleDedicacion"


    // $ANTLR start "ruleDedicacion"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:153:1: ruleDedicacion : ( ( rule__Dedicacion__Alternatives ) ) ;
    public final void ruleDedicacion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:157:2: ( ( ( rule__Dedicacion__Alternatives ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:158:1: ( ( rule__Dedicacion__Alternatives ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:158:1: ( ( rule__Dedicacion__Alternatives ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:159:1: ( rule__Dedicacion__Alternatives )
            {
             before(grammarAccess.getDedicacionAccess().getAlternatives()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:160:1: ( rule__Dedicacion__Alternatives )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:160:2: rule__Dedicacion__Alternatives
            {
            pushFollow(FOLLOW_rule__Dedicacion__Alternatives_in_ruleDedicacion274);
            rule__Dedicacion__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDedicacionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDedicacion"


    // $ANTLR start "entryRuleSIMPLE"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:172:1: entryRuleSIMPLE : ruleSIMPLE EOF ;
    public final void entryRuleSIMPLE() throws RecognitionException {
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:173:1: ( ruleSIMPLE EOF )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:174:1: ruleSIMPLE EOF
            {
             before(grammarAccess.getSIMPLERule()); 
            pushFollow(FOLLOW_ruleSIMPLE_in_entryRuleSIMPLE301);
            ruleSIMPLE();

            state._fsp--;

             after(grammarAccess.getSIMPLERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSIMPLE308); 

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
    // $ANTLR end "entryRuleSIMPLE"


    // $ANTLR start "ruleSIMPLE"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:181:1: ruleSIMPLE : ( 'simple' ) ;
    public final void ruleSIMPLE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:185:2: ( ( 'simple' ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:186:1: ( 'simple' )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:186:1: ( 'simple' )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:187:1: 'simple'
            {
             before(grammarAccess.getSIMPLEAccess().getSimpleKeyword()); 
            match(input,11,FOLLOW_11_in_ruleSIMPLE335); 
             after(grammarAccess.getSIMPLEAccess().getSimpleKeyword()); 

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
    // $ANTLR end "ruleSIMPLE"


    // $ANTLR start "entryRuleSEMI"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:202:1: entryRuleSEMI : ruleSEMI EOF ;
    public final void entryRuleSEMI() throws RecognitionException {
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:203:1: ( ruleSEMI EOF )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:204:1: ruleSEMI EOF
            {
             before(grammarAccess.getSEMIRule()); 
            pushFollow(FOLLOW_ruleSEMI_in_entryRuleSEMI363);
            ruleSEMI();

            state._fsp--;

             after(grammarAccess.getSEMIRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSEMI370); 

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
    // $ANTLR end "entryRuleSEMI"


    // $ANTLR start "ruleSEMI"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:211:1: ruleSEMI : ( 'semi' ) ;
    public final void ruleSEMI() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:215:2: ( ( 'semi' ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:216:1: ( 'semi' )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:216:1: ( 'semi' )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:217:1: 'semi'
            {
             before(grammarAccess.getSEMIAccess().getSemiKeyword()); 
            match(input,12,FOLLOW_12_in_ruleSEMI397); 
             after(grammarAccess.getSEMIAccess().getSemiKeyword()); 

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
    // $ANTLR end "ruleSEMI"


    // $ANTLR start "entryRuleEXCLUSIVA"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:232:1: entryRuleEXCLUSIVA : ruleEXCLUSIVA EOF ;
    public final void entryRuleEXCLUSIVA() throws RecognitionException {
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:233:1: ( ruleEXCLUSIVA EOF )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:234:1: ruleEXCLUSIVA EOF
            {
             before(grammarAccess.getEXCLUSIVARule()); 
            pushFollow(FOLLOW_ruleEXCLUSIVA_in_entryRuleEXCLUSIVA425);
            ruleEXCLUSIVA();

            state._fsp--;

             after(grammarAccess.getEXCLUSIVARule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEXCLUSIVA432); 

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
    // $ANTLR end "entryRuleEXCLUSIVA"


    // $ANTLR start "ruleEXCLUSIVA"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:241:1: ruleEXCLUSIVA : ( 'exclusiva' ) ;
    public final void ruleEXCLUSIVA() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:245:2: ( ( 'exclusiva' ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:246:1: ( 'exclusiva' )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:246:1: ( 'exclusiva' )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:247:1: 'exclusiva'
            {
             before(grammarAccess.getEXCLUSIVAAccess().getExclusivaKeyword()); 
            match(input,13,FOLLOW_13_in_ruleEXCLUSIVA459); 
             after(grammarAccess.getEXCLUSIVAAccess().getExclusivaKeyword()); 

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
    // $ANTLR end "ruleEXCLUSIVA"


    // $ANTLR start "entryRuleMateria"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:262:1: entryRuleMateria : ruleMateria EOF ;
    public final void entryRuleMateria() throws RecognitionException {
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:263:1: ( ruleMateria EOF )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:264:1: ruleMateria EOF
            {
             before(grammarAccess.getMateriaRule()); 
            pushFollow(FOLLOW_ruleMateria_in_entryRuleMateria487);
            ruleMateria();

            state._fsp--;

             after(grammarAccess.getMateriaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMateria494); 

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
    // $ANTLR end "entryRuleMateria"


    // $ANTLR start "ruleMateria"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:271:1: ruleMateria : ( ( rule__Materia__Group__0 ) ) ;
    public final void ruleMateria() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:275:2: ( ( ( rule__Materia__Group__0 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:276:1: ( ( rule__Materia__Group__0 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:276:1: ( ( rule__Materia__Group__0 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:277:1: ( rule__Materia__Group__0 )
            {
             before(grammarAccess.getMateriaAccess().getGroup()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:278:1: ( rule__Materia__Group__0 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:278:2: rule__Materia__Group__0
            {
            pushFollow(FOLLOW_rule__Materia__Group__0_in_ruleMateria520);
            rule__Materia__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMateriaAccess().getGroup()); 

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
    // $ANTLR end "ruleMateria"


    // $ANTLR start "entryRuleAula"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:290:1: entryRuleAula : ruleAula EOF ;
    public final void entryRuleAula() throws RecognitionException {
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:291:1: ( ruleAula EOF )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:292:1: ruleAula EOF
            {
             before(grammarAccess.getAulaRule()); 
            pushFollow(FOLLOW_ruleAula_in_entryRuleAula547);
            ruleAula();

            state._fsp--;

             after(grammarAccess.getAulaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAula554); 

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
    // $ANTLR end "entryRuleAula"


    // $ANTLR start "ruleAula"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:299:1: ruleAula : ( ( rule__Aula__Group__0 ) ) ;
    public final void ruleAula() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:303:2: ( ( ( rule__Aula__Group__0 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:304:1: ( ( rule__Aula__Group__0 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:304:1: ( ( rule__Aula__Group__0 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:305:1: ( rule__Aula__Group__0 )
            {
             before(grammarAccess.getAulaAccess().getGroup()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:306:1: ( rule__Aula__Group__0 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:306:2: rule__Aula__Group__0
            {
            pushFollow(FOLLOW_rule__Aula__Group__0_in_ruleAula580);
            rule__Aula__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAulaAccess().getGroup()); 

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
    // $ANTLR end "ruleAula"


    // $ANTLR start "entryRuleCargaHoraria"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:318:1: entryRuleCargaHoraria : ruleCargaHoraria EOF ;
    public final void entryRuleCargaHoraria() throws RecognitionException {
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:319:1: ( ruleCargaHoraria EOF )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:320:1: ruleCargaHoraria EOF
            {
             before(grammarAccess.getCargaHorariaRule()); 
            pushFollow(FOLLOW_ruleCargaHoraria_in_entryRuleCargaHoraria607);
            ruleCargaHoraria();

            state._fsp--;

             after(grammarAccess.getCargaHorariaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCargaHoraria614); 

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
    // $ANTLR end "entryRuleCargaHoraria"


    // $ANTLR start "ruleCargaHoraria"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:327:1: ruleCargaHoraria : ( ( rule__CargaHoraria__Group__0 ) ) ;
    public final void ruleCargaHoraria() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:331:2: ( ( ( rule__CargaHoraria__Group__0 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:332:1: ( ( rule__CargaHoraria__Group__0 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:332:1: ( ( rule__CargaHoraria__Group__0 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:333:1: ( rule__CargaHoraria__Group__0 )
            {
             before(grammarAccess.getCargaHorariaAccess().getGroup()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:334:1: ( rule__CargaHoraria__Group__0 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:334:2: rule__CargaHoraria__Group__0
            {
            pushFollow(FOLLOW_rule__CargaHoraria__Group__0_in_ruleCargaHoraria640);
            rule__CargaHoraria__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCargaHorariaAccess().getGroup()); 

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
    // $ANTLR end "ruleCargaHoraria"


    // $ANTLR start "entryRuleCargaHorariaDocente"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:346:1: entryRuleCargaHorariaDocente : ruleCargaHorariaDocente EOF ;
    public final void entryRuleCargaHorariaDocente() throws RecognitionException {
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:347:1: ( ruleCargaHorariaDocente EOF )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:348:1: ruleCargaHorariaDocente EOF
            {
             before(grammarAccess.getCargaHorariaDocenteRule()); 
            pushFollow(FOLLOW_ruleCargaHorariaDocente_in_entryRuleCargaHorariaDocente667);
            ruleCargaHorariaDocente();

            state._fsp--;

             after(grammarAccess.getCargaHorariaDocenteRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCargaHorariaDocente674); 

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
    // $ANTLR end "entryRuleCargaHorariaDocente"


    // $ANTLR start "ruleCargaHorariaDocente"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:355:1: ruleCargaHorariaDocente : ( ( rule__CargaHorariaDocente__Group__0 ) ) ;
    public final void ruleCargaHorariaDocente() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:359:2: ( ( ( rule__CargaHorariaDocente__Group__0 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:360:1: ( ( rule__CargaHorariaDocente__Group__0 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:360:1: ( ( rule__CargaHorariaDocente__Group__0 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:361:1: ( rule__CargaHorariaDocente__Group__0 )
            {
             before(grammarAccess.getCargaHorariaDocenteAccess().getGroup()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:362:1: ( rule__CargaHorariaDocente__Group__0 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:362:2: rule__CargaHorariaDocente__Group__0
            {
            pushFollow(FOLLOW_rule__CargaHorariaDocente__Group__0_in_ruleCargaHorariaDocente700);
            rule__CargaHorariaDocente__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCargaHorariaDocenteAccess().getGroup()); 

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
    // $ANTLR end "ruleCargaHorariaDocente"


    // $ANTLR start "entryRuleHorario"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:374:1: entryRuleHorario : ruleHorario EOF ;
    public final void entryRuleHorario() throws RecognitionException {
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:375:1: ( ruleHorario EOF )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:376:1: ruleHorario EOF
            {
             before(grammarAccess.getHorarioRule()); 
            pushFollow(FOLLOW_ruleHorario_in_entryRuleHorario727);
            ruleHorario();

            state._fsp--;

             after(grammarAccess.getHorarioRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHorario734); 

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
    // $ANTLR end "entryRuleHorario"


    // $ANTLR start "ruleHorario"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:383:1: ruleHorario : ( ( rule__Horario__Group__0 ) ) ;
    public final void ruleHorario() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:387:2: ( ( ( rule__Horario__Group__0 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:388:1: ( ( rule__Horario__Group__0 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:388:1: ( ( rule__Horario__Group__0 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:389:1: ( rule__Horario__Group__0 )
            {
             before(grammarAccess.getHorarioAccess().getGroup()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:390:1: ( rule__Horario__Group__0 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:390:2: rule__Horario__Group__0
            {
            pushFollow(FOLLOW_rule__Horario__Group__0_in_ruleHorario760);
            rule__Horario__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHorarioAccess().getGroup()); 

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
    // $ANTLR end "ruleHorario"


    // $ANTLR start "entryRuleSemestre"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:402:1: entryRuleSemestre : ruleSemestre EOF ;
    public final void entryRuleSemestre() throws RecognitionException {
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:403:1: ( ruleSemestre EOF )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:404:1: ruleSemestre EOF
            {
             before(grammarAccess.getSemestreRule()); 
            pushFollow(FOLLOW_ruleSemestre_in_entryRuleSemestre787);
            ruleSemestre();

            state._fsp--;

             after(grammarAccess.getSemestreRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSemestre794); 

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
    // $ANTLR end "entryRuleSemestre"


    // $ANTLR start "ruleSemestre"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:411:1: ruleSemestre : ( ( rule__Semestre__Group__0 ) ) ;
    public final void ruleSemestre() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:415:2: ( ( ( rule__Semestre__Group__0 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:416:1: ( ( rule__Semestre__Group__0 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:416:1: ( ( rule__Semestre__Group__0 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:417:1: ( rule__Semestre__Group__0 )
            {
             before(grammarAccess.getSemestreAccess().getGroup()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:418:1: ( rule__Semestre__Group__0 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:418:2: rule__Semestre__Group__0
            {
            pushFollow(FOLLOW_rule__Semestre__Group__0_in_ruleSemestre820);
            rule__Semestre__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSemestreAccess().getGroup()); 

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
    // $ANTLR end "ruleSemestre"


    // $ANTLR start "entryRuleDia"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:430:1: entryRuleDia : ruleDia EOF ;
    public final void entryRuleDia() throws RecognitionException {
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:431:1: ( ruleDia EOF )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:432:1: ruleDia EOF
            {
             before(grammarAccess.getDiaRule()); 
            pushFollow(FOLLOW_ruleDia_in_entryRuleDia847);
            ruleDia();

            state._fsp--;

             after(grammarAccess.getDiaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDia854); 

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
    // $ANTLR end "entryRuleDia"


    // $ANTLR start "ruleDia"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:439:1: ruleDia : ( ( rule__Dia__Group__0 ) ) ;
    public final void ruleDia() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:443:2: ( ( ( rule__Dia__Group__0 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:444:1: ( ( rule__Dia__Group__0 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:444:1: ( ( rule__Dia__Group__0 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:445:1: ( rule__Dia__Group__0 )
            {
             before(grammarAccess.getDiaAccess().getGroup()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:446:1: ( rule__Dia__Group__0 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:446:2: rule__Dia__Group__0
            {
            pushFollow(FOLLOW_rule__Dia__Group__0_in_ruleDia880);
            rule__Dia__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDiaAccess().getGroup()); 

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
    // $ANTLR end "ruleDia"


    // $ANTLR start "entryRuleHorarios"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:458:1: entryRuleHorarios : ruleHorarios EOF ;
    public final void entryRuleHorarios() throws RecognitionException {
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:459:1: ( ruleHorarios EOF )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:460:1: ruleHorarios EOF
            {
             before(grammarAccess.getHorariosRule()); 
            pushFollow(FOLLOW_ruleHorarios_in_entryRuleHorarios907);
            ruleHorarios();

            state._fsp--;

             after(grammarAccess.getHorariosRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHorarios914); 

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
    // $ANTLR end "entryRuleHorarios"


    // $ANTLR start "ruleHorarios"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:467:1: ruleHorarios : ( ( rule__Horarios__Group__0 ) ) ;
    public final void ruleHorarios() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:471:2: ( ( ( rule__Horarios__Group__0 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:472:1: ( ( rule__Horarios__Group__0 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:472:1: ( ( rule__Horarios__Group__0 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:473:1: ( rule__Horarios__Group__0 )
            {
             before(grammarAccess.getHorariosAccess().getGroup()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:474:1: ( rule__Horarios__Group__0 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:474:2: rule__Horarios__Group__0
            {
            pushFollow(FOLLOW_rule__Horarios__Group__0_in_ruleHorarios940);
            rule__Horarios__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHorariosAccess().getGroup()); 

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
    // $ANTLR end "ruleHorarios"


    // $ANTLR start "entryRulePlanificacion"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:486:1: entryRulePlanificacion : rulePlanificacion EOF ;
    public final void entryRulePlanificacion() throws RecognitionException {
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:487:1: ( rulePlanificacion EOF )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:488:1: rulePlanificacion EOF
            {
             before(grammarAccess.getPlanificacionRule()); 
            pushFollow(FOLLOW_rulePlanificacion_in_entryRulePlanificacion967);
            rulePlanificacion();

            state._fsp--;

             after(grammarAccess.getPlanificacionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlanificacion974); 

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
    // $ANTLR end "entryRulePlanificacion"


    // $ANTLR start "rulePlanificacion"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:495:1: rulePlanificacion : ( ( rule__Planificacion__Group__0 ) ) ;
    public final void rulePlanificacion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:499:2: ( ( ( rule__Planificacion__Group__0 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:500:1: ( ( rule__Planificacion__Group__0 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:500:1: ( ( rule__Planificacion__Group__0 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:501:1: ( rule__Planificacion__Group__0 )
            {
             before(grammarAccess.getPlanificacionAccess().getGroup()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:502:1: ( rule__Planificacion__Group__0 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:502:2: rule__Planificacion__Group__0
            {
            pushFollow(FOLLOW_rule__Planificacion__Group__0_in_rulePlanificacion1000);
            rule__Planificacion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlanificacionAccess().getGroup()); 

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
    // $ANTLR end "rulePlanificacion"


    // $ANTLR start "rule__Dedicacion__Alternatives"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:514:1: rule__Dedicacion__Alternatives : ( ( ruleSIMPLE ) | ( ruleSEMI ) | ( ruleEXCLUSIVA ) );
    public final void rule__Dedicacion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:518:1: ( ( ruleSIMPLE ) | ( ruleSEMI ) | ( ruleEXCLUSIVA ) )
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
                    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:519:1: ( ruleSIMPLE )
                    {
                    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:519:1: ( ruleSIMPLE )
                    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:520:1: ruleSIMPLE
                    {
                     before(grammarAccess.getDedicacionAccess().getSIMPLEParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSIMPLE_in_rule__Dedicacion__Alternatives1036);
                    ruleSIMPLE();

                    state._fsp--;

                     after(grammarAccess.getDedicacionAccess().getSIMPLEParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:525:6: ( ruleSEMI )
                    {
                    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:525:6: ( ruleSEMI )
                    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:526:1: ruleSEMI
                    {
                     before(grammarAccess.getDedicacionAccess().getSEMIParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSEMI_in_rule__Dedicacion__Alternatives1053);
                    ruleSEMI();

                    state._fsp--;

                     after(grammarAccess.getDedicacionAccess().getSEMIParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:531:6: ( ruleEXCLUSIVA )
                    {
                    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:531:6: ( ruleEXCLUSIVA )
                    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:532:1: ruleEXCLUSIVA
                    {
                     before(grammarAccess.getDedicacionAccess().getEXCLUSIVAParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleEXCLUSIVA_in_rule__Dedicacion__Alternatives1070);
                    ruleEXCLUSIVA();

                    state._fsp--;

                     after(grammarAccess.getDedicacionAccess().getEXCLUSIVAParserRuleCall_2()); 

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
    // $ANTLR end "rule__Dedicacion__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:544:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:548:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:549:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01100);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01103);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:556:1: rule__Model__Group__0__Impl : ( ( rule__Model__ProfesorsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:560:1: ( ( ( rule__Model__ProfesorsAssignment_0 )* ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:561:1: ( ( rule__Model__ProfesorsAssignment_0 )* )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:561:1: ( ( rule__Model__ProfesorsAssignment_0 )* )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:562:1: ( rule__Model__ProfesorsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getProfesorsAssignment_0()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:563:1: ( rule__Model__ProfesorsAssignment_0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    int LA2_2 = input.LA(2);

                    if ( (LA2_2==RULE_ID) ) {
                        int LA2_3 = input.LA(3);

                        if ( (LA2_3==15) ) {
                            switch ( input.LA(4) ) {
                            case 11:
                                {
                                int LA2_5 = input.LA(5);

                                if ( (LA2_5==EOF||LA2_5==RULE_INT||LA2_5==14||(LA2_5>=16 && LA2_5<=17)||(LA2_5>=19 && LA2_5<=20)||(LA2_5>=28 && LA2_5<=29)||LA2_5==31) ) {
                                    alt2=1;
                                }


                                }
                                break;
                            case 12:
                                {
                                int LA2_6 = input.LA(5);

                                if ( (LA2_6==EOF||LA2_6==RULE_INT||LA2_6==14||(LA2_6>=16 && LA2_6<=17)||(LA2_6>=19 && LA2_6<=20)||(LA2_6>=28 && LA2_6<=29)||LA2_6==31) ) {
                                    alt2=1;
                                }


                                }
                                break;
                            case 13:
                                {
                                int LA2_7 = input.LA(5);

                                if ( (LA2_7==EOF||LA2_7==RULE_INT||LA2_7==14||(LA2_7>=16 && LA2_7<=17)||(LA2_7>=19 && LA2_7<=20)||(LA2_7>=28 && LA2_7<=29)||LA2_7==31) ) {
                                    alt2=1;
                                }


                                }
                                break;

                            }

                        }


                    }


                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:563:2: rule__Model__ProfesorsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Model__ProfesorsAssignment_0_in_rule__Model__Group__0__Impl1130);
            	    rule__Model__ProfesorsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getProfesorsAssignment_0()); 

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:573:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:577:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:578:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11161);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11164);
            rule__Model__Group__2();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:585:1: rule__Model__Group__1__Impl : ( ( rule__Model__HorasAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:589:1: ( ( ( rule__Model__HorasAssignment_1 )* ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:590:1: ( ( rule__Model__HorasAssignment_1 )* )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:590:1: ( ( rule__Model__HorasAssignment_1 )* )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:591:1: ( rule__Model__HorasAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getHorasAssignment_1()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:592:1: ( rule__Model__HorasAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:592:2: rule__Model__HorasAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__HorasAssignment_1_in_rule__Model__Group__1__Impl1191);
            	    rule__Model__HorasAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getHorasAssignment_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:602:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:606:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:607:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21222);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21225);
            rule__Model__Group__3();

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
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:614:1: rule__Model__Group__2__Impl : ( ( rule__Model__MateriasAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:618:1: ( ( ( rule__Model__MateriasAssignment_2 )* ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:619:1: ( ( rule__Model__MateriasAssignment_2 )* )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:619:1: ( ( rule__Model__MateriasAssignment_2 )* )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:620:1: ( rule__Model__MateriasAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getMateriasAssignment_2()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:621:1: ( rule__Model__MateriasAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:621:2: rule__Model__MateriasAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__MateriasAssignment_2_in_rule__Model__Group__2__Impl1252);
            	    rule__Model__MateriasAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getMateriasAssignment_2()); 

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
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:631:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:635:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:636:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31283);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31286);
            rule__Model__Group__4();

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
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:643:1: rule__Model__Group__3__Impl : ( ( rule__Model__AulasAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:647:1: ( ( ( rule__Model__AulasAssignment_3 )* ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:648:1: ( ( rule__Model__AulasAssignment_3 )* )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:648:1: ( ( rule__Model__AulasAssignment_3 )* )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:649:1: ( rule__Model__AulasAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getAulasAssignment_3()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:650:1: ( rule__Model__AulasAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:650:2: rule__Model__AulasAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Model__AulasAssignment_3_in_rule__Model__Group__3__Impl1313);
            	    rule__Model__AulasAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAulasAssignment_3()); 

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
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:660:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:664:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:665:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41344);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__5_in_rule__Model__Group__41347);
            rule__Model__Group__5();

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
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:672:1: rule__Model__Group__4__Impl : ( ( rule__Model__CargasHorariasAssignment_4 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:676:1: ( ( ( rule__Model__CargasHorariasAssignment_4 )* ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:677:1: ( ( rule__Model__CargasHorariasAssignment_4 )* )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:677:1: ( ( rule__Model__CargasHorariasAssignment_4 )* )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:678:1: ( rule__Model__CargasHorariasAssignment_4 )*
            {
             before(grammarAccess.getModelAccess().getCargasHorariasAssignment_4()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:679:1: ( rule__Model__CargasHorariasAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:679:2: rule__Model__CargasHorariasAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Model__CargasHorariasAssignment_4_in_rule__Model__Group__4__Impl1374);
            	    rule__Model__CargasHorariasAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getCargasHorariasAssignment_4()); 

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
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:689:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:693:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:694:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__51405);
            rule__Model__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__6_in_rule__Model__Group__51408);
            rule__Model__Group__6();

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
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:701:1: rule__Model__Group__5__Impl : ( ( rule__Model__CargasHorariasDocentesAssignment_5 )* ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:705:1: ( ( ( rule__Model__CargasHorariasDocentesAssignment_5 )* ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:706:1: ( ( rule__Model__CargasHorariasDocentesAssignment_5 )* )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:706:1: ( ( rule__Model__CargasHorariasDocentesAssignment_5 )* )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:707:1: ( rule__Model__CargasHorariasDocentesAssignment_5 )*
            {
             before(grammarAccess.getModelAccess().getCargasHorariasDocentesAssignment_5()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:708:1: ( rule__Model__CargasHorariasDocentesAssignment_5 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:708:2: rule__Model__CargasHorariasDocentesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Model__CargasHorariasDocentesAssignment_5_in_rule__Model__Group__5__Impl1435);
            	    rule__Model__CargasHorariasDocentesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getCargasHorariasDocentesAssignment_5()); 

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
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Model__Group__6"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:718:1: rule__Model__Group__6 : rule__Model__Group__6__Impl rule__Model__Group__7 ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:722:1: ( rule__Model__Group__6__Impl rule__Model__Group__7 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:723:2: rule__Model__Group__6__Impl rule__Model__Group__7
            {
            pushFollow(FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__61466);
            rule__Model__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__7_in_rule__Model__Group__61469);
            rule__Model__Group__7();

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
    // $ANTLR end "rule__Model__Group__6"


    // $ANTLR start "rule__Model__Group__6__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:730:1: rule__Model__Group__6__Impl : ( ( rule__Model__HorariosAssignment_6 )* ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:734:1: ( ( ( rule__Model__HorariosAssignment_6 )* ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:735:1: ( ( rule__Model__HorariosAssignment_6 )* )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:735:1: ( ( rule__Model__HorariosAssignment_6 )* )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:736:1: ( rule__Model__HorariosAssignment_6 )*
            {
             before(grammarAccess.getModelAccess().getHorariosAssignment_6()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:737:1: ( rule__Model__HorariosAssignment_6 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==29) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:737:2: rule__Model__HorariosAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Model__HorariosAssignment_6_in_rule__Model__Group__6__Impl1496);
            	    rule__Model__HorariosAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getHorariosAssignment_6()); 

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
    // $ANTLR end "rule__Model__Group__6__Impl"


    // $ANTLR start "rule__Model__Group__7"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:747:1: rule__Model__Group__7 : rule__Model__Group__7__Impl rule__Model__Group__8 ;
    public final void rule__Model__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:751:1: ( rule__Model__Group__7__Impl rule__Model__Group__8 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:752:2: rule__Model__Group__7__Impl rule__Model__Group__8
            {
            pushFollow(FOLLOW_rule__Model__Group__7__Impl_in_rule__Model__Group__71527);
            rule__Model__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__8_in_rule__Model__Group__71530);
            rule__Model__Group__8();

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
    // $ANTLR end "rule__Model__Group__7"


    // $ANTLR start "rule__Model__Group__7__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:759:1: rule__Model__Group__7__Impl : ( ( rule__Model__DiasAssignment_7 )* ) ;
    public final void rule__Model__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:763:1: ( ( ( rule__Model__DiasAssignment_7 )* ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:764:1: ( ( rule__Model__DiasAssignment_7 )* )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:764:1: ( ( rule__Model__DiasAssignment_7 )* )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:765:1: ( rule__Model__DiasAssignment_7 )*
            {
             before(grammarAccess.getModelAccess().getDiasAssignment_7()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:766:1: ( rule__Model__DiasAssignment_7 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==28) ) {
                    int LA9_2 = input.LA(2);

                    if ( (LA9_2==RULE_ID) ) {
                        int LA9_3 = input.LA(3);

                        if ( (LA9_3==EOF||LA9_3==RULE_INT||LA9_3==28||LA9_3==31) ) {
                            alt9=1;
                        }


                    }


                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:766:2: rule__Model__DiasAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Model__DiasAssignment_7_in_rule__Model__Group__7__Impl1557);
            	    rule__Model__DiasAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getDiasAssignment_7()); 

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
    // $ANTLR end "rule__Model__Group__7__Impl"


    // $ANTLR start "rule__Model__Group__8"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:776:1: rule__Model__Group__8 : rule__Model__Group__8__Impl rule__Model__Group__9 ;
    public final void rule__Model__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:780:1: ( rule__Model__Group__8__Impl rule__Model__Group__9 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:781:2: rule__Model__Group__8__Impl rule__Model__Group__9
            {
            pushFollow(FOLLOW_rule__Model__Group__8__Impl_in_rule__Model__Group__81588);
            rule__Model__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__9_in_rule__Model__Group__81591);
            rule__Model__Group__9();

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
    // $ANTLR end "rule__Model__Group__8"


    // $ANTLR start "rule__Model__Group__8__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:788:1: rule__Model__Group__8__Impl : ( ( rule__Model__SemestreAssignment_8 )* ) ;
    public final void rule__Model__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:792:1: ( ( ( rule__Model__SemestreAssignment_8 )* ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:793:1: ( ( rule__Model__SemestreAssignment_8 )* )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:793:1: ( ( rule__Model__SemestreAssignment_8 )* )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:794:1: ( rule__Model__SemestreAssignment_8 )*
            {
             before(grammarAccess.getModelAccess().getSemestreAssignment_8()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:795:1: ( rule__Model__SemestreAssignment_8 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_INT) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:795:2: rule__Model__SemestreAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__Model__SemestreAssignment_8_in_rule__Model__Group__8__Impl1618);
            	    rule__Model__SemestreAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getSemestreAssignment_8()); 

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
    // $ANTLR end "rule__Model__Group__8__Impl"


    // $ANTLR start "rule__Model__Group__9"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:805:1: rule__Model__Group__9 : rule__Model__Group__9__Impl rule__Model__Group__10 ;
    public final void rule__Model__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:809:1: ( rule__Model__Group__9__Impl rule__Model__Group__10 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:810:2: rule__Model__Group__9__Impl rule__Model__Group__10
            {
            pushFollow(FOLLOW_rule__Model__Group__9__Impl_in_rule__Model__Group__91649);
            rule__Model__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__10_in_rule__Model__Group__91652);
            rule__Model__Group__10();

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
    // $ANTLR end "rule__Model__Group__9"


    // $ANTLR start "rule__Model__Group__9__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:817:1: rule__Model__Group__9__Impl : ( ( rule__Model__PlanificacionesAssignment_9 )* ) ;
    public final void rule__Model__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:821:1: ( ( ( rule__Model__PlanificacionesAssignment_9 )* ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:822:1: ( ( rule__Model__PlanificacionesAssignment_9 )* )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:822:1: ( ( rule__Model__PlanificacionesAssignment_9 )* )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:823:1: ( rule__Model__PlanificacionesAssignment_9 )*
            {
             before(grammarAccess.getModelAccess().getPlanificacionesAssignment_9()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:824:1: ( rule__Model__PlanificacionesAssignment_9 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==31) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:824:2: rule__Model__PlanificacionesAssignment_9
            	    {
            	    pushFollow(FOLLOW_rule__Model__PlanificacionesAssignment_9_in_rule__Model__Group__9__Impl1679);
            	    rule__Model__PlanificacionesAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getPlanificacionesAssignment_9()); 

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
    // $ANTLR end "rule__Model__Group__9__Impl"


    // $ANTLR start "rule__Model__Group__10"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:834:1: rule__Model__Group__10 : rule__Model__Group__10__Impl ;
    public final void rule__Model__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:838:1: ( rule__Model__Group__10__Impl )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:839:2: rule__Model__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__10__Impl_in_rule__Model__Group__101710);
            rule__Model__Group__10__Impl();

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
    // $ANTLR end "rule__Model__Group__10"


    // $ANTLR start "rule__Model__Group__10__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:845:1: rule__Model__Group__10__Impl : ( ( rule__Model__HorariosAssignment_10 )* ) ;
    public final void rule__Model__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:849:1: ( ( ( rule__Model__HorariosAssignment_10 )* ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:850:1: ( ( rule__Model__HorariosAssignment_10 )* )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:850:1: ( ( rule__Model__HorariosAssignment_10 )* )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:851:1: ( rule__Model__HorariosAssignment_10 )*
            {
             before(grammarAccess.getModelAccess().getHorariosAssignment_10()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:852:1: ( rule__Model__HorariosAssignment_10 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==28) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:852:2: rule__Model__HorariosAssignment_10
            	    {
            	    pushFollow(FOLLOW_rule__Model__HorariosAssignment_10_in_rule__Model__Group__10__Impl1737);
            	    rule__Model__HorariosAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getHorariosAssignment_10()); 

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
    // $ANTLR end "rule__Model__Group__10__Impl"


    // $ANTLR start "rule__Profesor__Group__0"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:884:1: rule__Profesor__Group__0 : rule__Profesor__Group__0__Impl rule__Profesor__Group__1 ;
    public final void rule__Profesor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:888:1: ( rule__Profesor__Group__0__Impl rule__Profesor__Group__1 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:889:2: rule__Profesor__Group__0__Impl rule__Profesor__Group__1
            {
            pushFollow(FOLLOW_rule__Profesor__Group__0__Impl_in_rule__Profesor__Group__01790);
            rule__Profesor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Profesor__Group__1_in_rule__Profesor__Group__01793);
            rule__Profesor__Group__1();

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
    // $ANTLR end "rule__Profesor__Group__0"


    // $ANTLR start "rule__Profesor__Group__0__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:896:1: rule__Profesor__Group__0__Impl : ( 'profesor' ) ;
    public final void rule__Profesor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:900:1: ( ( 'profesor' ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:901:1: ( 'profesor' )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:901:1: ( 'profesor' )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:902:1: 'profesor'
            {
             before(grammarAccess.getProfesorAccess().getProfesorKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Profesor__Group__0__Impl1821); 
             after(grammarAccess.getProfesorAccess().getProfesorKeyword_0()); 

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
    // $ANTLR end "rule__Profesor__Group__0__Impl"


    // $ANTLR start "rule__Profesor__Group__1"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:915:1: rule__Profesor__Group__1 : rule__Profesor__Group__1__Impl rule__Profesor__Group__2 ;
    public final void rule__Profesor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:919:1: ( rule__Profesor__Group__1__Impl rule__Profesor__Group__2 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:920:2: rule__Profesor__Group__1__Impl rule__Profesor__Group__2
            {
            pushFollow(FOLLOW_rule__Profesor__Group__1__Impl_in_rule__Profesor__Group__11852);
            rule__Profesor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Profesor__Group__2_in_rule__Profesor__Group__11855);
            rule__Profesor__Group__2();

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
    // $ANTLR end "rule__Profesor__Group__1"


    // $ANTLR start "rule__Profesor__Group__1__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:927:1: rule__Profesor__Group__1__Impl : ( ( rule__Profesor__NombreAssignment_1 ) ) ;
    public final void rule__Profesor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:931:1: ( ( ( rule__Profesor__NombreAssignment_1 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:932:1: ( ( rule__Profesor__NombreAssignment_1 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:932:1: ( ( rule__Profesor__NombreAssignment_1 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:933:1: ( rule__Profesor__NombreAssignment_1 )
            {
             before(grammarAccess.getProfesorAccess().getNombreAssignment_1()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:934:1: ( rule__Profesor__NombreAssignment_1 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:934:2: rule__Profesor__NombreAssignment_1
            {
            pushFollow(FOLLOW_rule__Profesor__NombreAssignment_1_in_rule__Profesor__Group__1__Impl1882);
            rule__Profesor__NombreAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProfesorAccess().getNombreAssignment_1()); 

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
    // $ANTLR end "rule__Profesor__Group__1__Impl"


    // $ANTLR start "rule__Profesor__Group__2"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:944:1: rule__Profesor__Group__2 : rule__Profesor__Group__2__Impl rule__Profesor__Group__3 ;
    public final void rule__Profesor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:948:1: ( rule__Profesor__Group__2__Impl rule__Profesor__Group__3 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:949:2: rule__Profesor__Group__2__Impl rule__Profesor__Group__3
            {
            pushFollow(FOLLOW_rule__Profesor__Group__2__Impl_in_rule__Profesor__Group__21912);
            rule__Profesor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Profesor__Group__3_in_rule__Profesor__Group__21915);
            rule__Profesor__Group__3();

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
    // $ANTLR end "rule__Profesor__Group__2"


    // $ANTLR start "rule__Profesor__Group__2__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:956:1: rule__Profesor__Group__2__Impl : ( 'dedicacion' ) ;
    public final void rule__Profesor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:960:1: ( ( 'dedicacion' ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:961:1: ( 'dedicacion' )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:961:1: ( 'dedicacion' )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:962:1: 'dedicacion'
            {
             before(grammarAccess.getProfesorAccess().getDedicacionKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Profesor__Group__2__Impl1943); 
             after(grammarAccess.getProfesorAccess().getDedicacionKeyword_2()); 

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
    // $ANTLR end "rule__Profesor__Group__2__Impl"


    // $ANTLR start "rule__Profesor__Group__3"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:975:1: rule__Profesor__Group__3 : rule__Profesor__Group__3__Impl ;
    public final void rule__Profesor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:979:1: ( rule__Profesor__Group__3__Impl )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:980:2: rule__Profesor__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Profesor__Group__3__Impl_in_rule__Profesor__Group__31974);
            rule__Profesor__Group__3__Impl();

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
    // $ANTLR end "rule__Profesor__Group__3"


    // $ANTLR start "rule__Profesor__Group__3__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:986:1: rule__Profesor__Group__3__Impl : ( ( rule__Profesor__DedicacionAssignment_3 ) ) ;
    public final void rule__Profesor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:990:1: ( ( ( rule__Profesor__DedicacionAssignment_3 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:991:1: ( ( rule__Profesor__DedicacionAssignment_3 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:991:1: ( ( rule__Profesor__DedicacionAssignment_3 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:992:1: ( rule__Profesor__DedicacionAssignment_3 )
            {
             before(grammarAccess.getProfesorAccess().getDedicacionAssignment_3()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:993:1: ( rule__Profesor__DedicacionAssignment_3 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:993:2: rule__Profesor__DedicacionAssignment_3
            {
            pushFollow(FOLLOW_rule__Profesor__DedicacionAssignment_3_in_rule__Profesor__Group__3__Impl2001);
            rule__Profesor__DedicacionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProfesorAccess().getDedicacionAssignment_3()); 

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
    // $ANTLR end "rule__Profesor__Group__3__Impl"


    // $ANTLR start "rule__Hora__Group__0"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1011:1: rule__Hora__Group__0 : rule__Hora__Group__0__Impl rule__Hora__Group__1 ;
    public final void rule__Hora__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1015:1: ( rule__Hora__Group__0__Impl rule__Hora__Group__1 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1016:2: rule__Hora__Group__0__Impl rule__Hora__Group__1
            {
            pushFollow(FOLLOW_rule__Hora__Group__0__Impl_in_rule__Hora__Group__02039);
            rule__Hora__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Hora__Group__1_in_rule__Hora__Group__02042);
            rule__Hora__Group__1();

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
    // $ANTLR end "rule__Hora__Group__0"


    // $ANTLR start "rule__Hora__Group__0__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1023:1: rule__Hora__Group__0__Impl : ( 'hora' ) ;
    public final void rule__Hora__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1027:1: ( ( 'hora' ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1028:1: ( 'hora' )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1028:1: ( 'hora' )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1029:1: 'hora'
            {
             before(grammarAccess.getHoraAccess().getHoraKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Hora__Group__0__Impl2070); 
             after(grammarAccess.getHoraAccess().getHoraKeyword_0()); 

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
    // $ANTLR end "rule__Hora__Group__0__Impl"


    // $ANTLR start "rule__Hora__Group__1"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1042:1: rule__Hora__Group__1 : rule__Hora__Group__1__Impl ;
    public final void rule__Hora__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1046:1: ( rule__Hora__Group__1__Impl )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1047:2: rule__Hora__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Hora__Group__1__Impl_in_rule__Hora__Group__12101);
            rule__Hora__Group__1__Impl();

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
    // $ANTLR end "rule__Hora__Group__1"


    // $ANTLR start "rule__Hora__Group__1__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1053:1: rule__Hora__Group__1__Impl : ( ( rule__Hora__HoraAssignment_1 ) ) ;
    public final void rule__Hora__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1057:1: ( ( ( rule__Hora__HoraAssignment_1 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1058:1: ( ( rule__Hora__HoraAssignment_1 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1058:1: ( ( rule__Hora__HoraAssignment_1 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1059:1: ( rule__Hora__HoraAssignment_1 )
            {
             before(grammarAccess.getHoraAccess().getHoraAssignment_1()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1060:1: ( rule__Hora__HoraAssignment_1 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1060:2: rule__Hora__HoraAssignment_1
            {
            pushFollow(FOLLOW_rule__Hora__HoraAssignment_1_in_rule__Hora__Group__1__Impl2128);
            rule__Hora__HoraAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHoraAccess().getHoraAssignment_1()); 

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
    // $ANTLR end "rule__Hora__Group__1__Impl"


    // $ANTLR start "rule__Materia__Group__0"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1074:1: rule__Materia__Group__0 : rule__Materia__Group__0__Impl rule__Materia__Group__1 ;
    public final void rule__Materia__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1078:1: ( rule__Materia__Group__0__Impl rule__Materia__Group__1 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1079:2: rule__Materia__Group__0__Impl rule__Materia__Group__1
            {
            pushFollow(FOLLOW_rule__Materia__Group__0__Impl_in_rule__Materia__Group__02162);
            rule__Materia__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Materia__Group__1_in_rule__Materia__Group__02165);
            rule__Materia__Group__1();

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
    // $ANTLR end "rule__Materia__Group__0"


    // $ANTLR start "rule__Materia__Group__0__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1086:1: rule__Materia__Group__0__Impl : ( 'materia' ) ;
    public final void rule__Materia__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1090:1: ( ( 'materia' ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1091:1: ( 'materia' )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1091:1: ( 'materia' )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1092:1: 'materia'
            {
             before(grammarAccess.getMateriaAccess().getMateriaKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Materia__Group__0__Impl2193); 
             after(grammarAccess.getMateriaAccess().getMateriaKeyword_0()); 

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
    // $ANTLR end "rule__Materia__Group__0__Impl"


    // $ANTLR start "rule__Materia__Group__1"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1105:1: rule__Materia__Group__1 : rule__Materia__Group__1__Impl rule__Materia__Group__2 ;
    public final void rule__Materia__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1109:1: ( rule__Materia__Group__1__Impl rule__Materia__Group__2 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1110:2: rule__Materia__Group__1__Impl rule__Materia__Group__2
            {
            pushFollow(FOLLOW_rule__Materia__Group__1__Impl_in_rule__Materia__Group__12224);
            rule__Materia__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Materia__Group__2_in_rule__Materia__Group__12227);
            rule__Materia__Group__2();

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
    // $ANTLR end "rule__Materia__Group__1"


    // $ANTLR start "rule__Materia__Group__1__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1117:1: rule__Materia__Group__1__Impl : ( ( rule__Materia__NombreAssignment_1 ) ) ;
    public final void rule__Materia__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1121:1: ( ( ( rule__Materia__NombreAssignment_1 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1122:1: ( ( rule__Materia__NombreAssignment_1 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1122:1: ( ( rule__Materia__NombreAssignment_1 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1123:1: ( rule__Materia__NombreAssignment_1 )
            {
             before(grammarAccess.getMateriaAccess().getNombreAssignment_1()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1124:1: ( rule__Materia__NombreAssignment_1 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1124:2: rule__Materia__NombreAssignment_1
            {
            pushFollow(FOLLOW_rule__Materia__NombreAssignment_1_in_rule__Materia__Group__1__Impl2254);
            rule__Materia__NombreAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMateriaAccess().getNombreAssignment_1()); 

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
    // $ANTLR end "rule__Materia__Group__1__Impl"


    // $ANTLR start "rule__Materia__Group__2"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1134:1: rule__Materia__Group__2 : rule__Materia__Group__2__Impl rule__Materia__Group__3 ;
    public final void rule__Materia__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1138:1: ( rule__Materia__Group__2__Impl rule__Materia__Group__3 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1139:2: rule__Materia__Group__2__Impl rule__Materia__Group__3
            {
            pushFollow(FOLLOW_rule__Materia__Group__2__Impl_in_rule__Materia__Group__22284);
            rule__Materia__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Materia__Group__3_in_rule__Materia__Group__22287);
            rule__Materia__Group__3();

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
    // $ANTLR end "rule__Materia__Group__2"


    // $ANTLR start "rule__Materia__Group__2__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1146:1: rule__Materia__Group__2__Impl : ( 'con' ) ;
    public final void rule__Materia__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1150:1: ( ( 'con' ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1151:1: ( 'con' )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1151:1: ( 'con' )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1152:1: 'con'
            {
             before(grammarAccess.getMateriaAccess().getConKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Materia__Group__2__Impl2315); 
             after(grammarAccess.getMateriaAccess().getConKeyword_2()); 

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
    // $ANTLR end "rule__Materia__Group__2__Impl"


    // $ANTLR start "rule__Materia__Group__3"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1165:1: rule__Materia__Group__3 : rule__Materia__Group__3__Impl ;
    public final void rule__Materia__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1169:1: ( rule__Materia__Group__3__Impl )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1170:2: rule__Materia__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Materia__Group__3__Impl_in_rule__Materia__Group__32346);
            rule__Materia__Group__3__Impl();

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
    // $ANTLR end "rule__Materia__Group__3"


    // $ANTLR start "rule__Materia__Group__3__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1176:1: rule__Materia__Group__3__Impl : ( ( rule__Materia__CargaHorariaAssignment_3 ) ) ;
    public final void rule__Materia__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1180:1: ( ( ( rule__Materia__CargaHorariaAssignment_3 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1181:1: ( ( rule__Materia__CargaHorariaAssignment_3 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1181:1: ( ( rule__Materia__CargaHorariaAssignment_3 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1182:1: ( rule__Materia__CargaHorariaAssignment_3 )
            {
             before(grammarAccess.getMateriaAccess().getCargaHorariaAssignment_3()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1183:1: ( rule__Materia__CargaHorariaAssignment_3 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1183:2: rule__Materia__CargaHorariaAssignment_3
            {
            pushFollow(FOLLOW_rule__Materia__CargaHorariaAssignment_3_in_rule__Materia__Group__3__Impl2373);
            rule__Materia__CargaHorariaAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMateriaAccess().getCargaHorariaAssignment_3()); 

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
    // $ANTLR end "rule__Materia__Group__3__Impl"


    // $ANTLR start "rule__Aula__Group__0"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1201:1: rule__Aula__Group__0 : rule__Aula__Group__0__Impl rule__Aula__Group__1 ;
    public final void rule__Aula__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1205:1: ( rule__Aula__Group__0__Impl rule__Aula__Group__1 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1206:2: rule__Aula__Group__0__Impl rule__Aula__Group__1
            {
            pushFollow(FOLLOW_rule__Aula__Group__0__Impl_in_rule__Aula__Group__02411);
            rule__Aula__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Aula__Group__1_in_rule__Aula__Group__02414);
            rule__Aula__Group__1();

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
    // $ANTLR end "rule__Aula__Group__0"


    // $ANTLR start "rule__Aula__Group__0__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1213:1: rule__Aula__Group__0__Impl : ( 'aula' ) ;
    public final void rule__Aula__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1217:1: ( ( 'aula' ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1218:1: ( 'aula' )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1218:1: ( 'aula' )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1219:1: 'aula'
            {
             before(grammarAccess.getAulaAccess().getAulaKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Aula__Group__0__Impl2442); 
             after(grammarAccess.getAulaAccess().getAulaKeyword_0()); 

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
    // $ANTLR end "rule__Aula__Group__0__Impl"


    // $ANTLR start "rule__Aula__Group__1"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1232:1: rule__Aula__Group__1 : rule__Aula__Group__1__Impl ;
    public final void rule__Aula__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1236:1: ( rule__Aula__Group__1__Impl )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1237:2: rule__Aula__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Aula__Group__1__Impl_in_rule__Aula__Group__12473);
            rule__Aula__Group__1__Impl();

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
    // $ANTLR end "rule__Aula__Group__1"


    // $ANTLR start "rule__Aula__Group__1__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1243:1: rule__Aula__Group__1__Impl : ( ( rule__Aula__NombreAssignment_1 ) ) ;
    public final void rule__Aula__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1247:1: ( ( ( rule__Aula__NombreAssignment_1 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1248:1: ( ( rule__Aula__NombreAssignment_1 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1248:1: ( ( rule__Aula__NombreAssignment_1 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1249:1: ( rule__Aula__NombreAssignment_1 )
            {
             before(grammarAccess.getAulaAccess().getNombreAssignment_1()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1250:1: ( rule__Aula__NombreAssignment_1 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1250:2: rule__Aula__NombreAssignment_1
            {
            pushFollow(FOLLOW_rule__Aula__NombreAssignment_1_in_rule__Aula__Group__1__Impl2500);
            rule__Aula__NombreAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAulaAccess().getNombreAssignment_1()); 

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
    // $ANTLR end "rule__Aula__Group__1__Impl"


    // $ANTLR start "rule__CargaHoraria__Group__0"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1264:1: rule__CargaHoraria__Group__0 : rule__CargaHoraria__Group__0__Impl rule__CargaHoraria__Group__1 ;
    public final void rule__CargaHoraria__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1268:1: ( rule__CargaHoraria__Group__0__Impl rule__CargaHoraria__Group__1 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1269:2: rule__CargaHoraria__Group__0__Impl rule__CargaHoraria__Group__1
            {
            pushFollow(FOLLOW_rule__CargaHoraria__Group__0__Impl_in_rule__CargaHoraria__Group__02534);
            rule__CargaHoraria__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CargaHoraria__Group__1_in_rule__CargaHoraria__Group__02537);
            rule__CargaHoraria__Group__1();

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
    // $ANTLR end "rule__CargaHoraria__Group__0"


    // $ANTLR start "rule__CargaHoraria__Group__0__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1276:1: rule__CargaHoraria__Group__0__Impl : ( 'cargaHoraria' ) ;
    public final void rule__CargaHoraria__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1280:1: ( ( 'cargaHoraria' ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1281:1: ( 'cargaHoraria' )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1281:1: ( 'cargaHoraria' )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1282:1: 'cargaHoraria'
            {
             before(grammarAccess.getCargaHorariaAccess().getCargaHorariaKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__CargaHoraria__Group__0__Impl2565); 
             after(grammarAccess.getCargaHorariaAccess().getCargaHorariaKeyword_0()); 

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
    // $ANTLR end "rule__CargaHoraria__Group__0__Impl"


    // $ANTLR start "rule__CargaHoraria__Group__1"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1295:1: rule__CargaHoraria__Group__1 : rule__CargaHoraria__Group__1__Impl rule__CargaHoraria__Group__2 ;
    public final void rule__CargaHoraria__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1299:1: ( rule__CargaHoraria__Group__1__Impl rule__CargaHoraria__Group__2 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1300:2: rule__CargaHoraria__Group__1__Impl rule__CargaHoraria__Group__2
            {
            pushFollow(FOLLOW_rule__CargaHoraria__Group__1__Impl_in_rule__CargaHoraria__Group__12596);
            rule__CargaHoraria__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CargaHoraria__Group__2_in_rule__CargaHoraria__Group__12599);
            rule__CargaHoraria__Group__2();

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
    // $ANTLR end "rule__CargaHoraria__Group__1"


    // $ANTLR start "rule__CargaHoraria__Group__1__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1307:1: rule__CargaHoraria__Group__1__Impl : ( ( rule__CargaHoraria__TipoAssignment_1 ) ) ;
    public final void rule__CargaHoraria__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1311:1: ( ( ( rule__CargaHoraria__TipoAssignment_1 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1312:1: ( ( rule__CargaHoraria__TipoAssignment_1 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1312:1: ( ( rule__CargaHoraria__TipoAssignment_1 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1313:1: ( rule__CargaHoraria__TipoAssignment_1 )
            {
             before(grammarAccess.getCargaHorariaAccess().getTipoAssignment_1()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1314:1: ( rule__CargaHoraria__TipoAssignment_1 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1314:2: rule__CargaHoraria__TipoAssignment_1
            {
            pushFollow(FOLLOW_rule__CargaHoraria__TipoAssignment_1_in_rule__CargaHoraria__Group__1__Impl2626);
            rule__CargaHoraria__TipoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCargaHorariaAccess().getTipoAssignment_1()); 

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
    // $ANTLR end "rule__CargaHoraria__Group__1__Impl"


    // $ANTLR start "rule__CargaHoraria__Group__2"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1324:1: rule__CargaHoraria__Group__2 : rule__CargaHoraria__Group__2__Impl rule__CargaHoraria__Group__3 ;
    public final void rule__CargaHoraria__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1328:1: ( rule__CargaHoraria__Group__2__Impl rule__CargaHoraria__Group__3 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1329:2: rule__CargaHoraria__Group__2__Impl rule__CargaHoraria__Group__3
            {
            pushFollow(FOLLOW_rule__CargaHoraria__Group__2__Impl_in_rule__CargaHoraria__Group__22656);
            rule__CargaHoraria__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CargaHoraria__Group__3_in_rule__CargaHoraria__Group__22659);
            rule__CargaHoraria__Group__3();

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
    // $ANTLR end "rule__CargaHoraria__Group__2"


    // $ANTLR start "rule__CargaHoraria__Group__2__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1336:1: rule__CargaHoraria__Group__2__Impl : ( 'dias' ) ;
    public final void rule__CargaHoraria__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1340:1: ( ( 'dias' ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1341:1: ( 'dias' )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1341:1: ( 'dias' )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1342:1: 'dias'
            {
             before(grammarAccess.getCargaHorariaAccess().getDiasKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__CargaHoraria__Group__2__Impl2687); 
             after(grammarAccess.getCargaHorariaAccess().getDiasKeyword_2()); 

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
    // $ANTLR end "rule__CargaHoraria__Group__2__Impl"


    // $ANTLR start "rule__CargaHoraria__Group__3"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1355:1: rule__CargaHoraria__Group__3 : rule__CargaHoraria__Group__3__Impl ;
    public final void rule__CargaHoraria__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1359:1: ( rule__CargaHoraria__Group__3__Impl )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1360:2: rule__CargaHoraria__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__CargaHoraria__Group__3__Impl_in_rule__CargaHoraria__Group__32718);
            rule__CargaHoraria__Group__3__Impl();

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
    // $ANTLR end "rule__CargaHoraria__Group__3"


    // $ANTLR start "rule__CargaHoraria__Group__3__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1366:1: rule__CargaHoraria__Group__3__Impl : ( ( rule__CargaHoraria__DiasAssignment_3 ) ) ;
    public final void rule__CargaHoraria__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1370:1: ( ( ( rule__CargaHoraria__DiasAssignment_3 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1371:1: ( ( rule__CargaHoraria__DiasAssignment_3 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1371:1: ( ( rule__CargaHoraria__DiasAssignment_3 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1372:1: ( rule__CargaHoraria__DiasAssignment_3 )
            {
             before(grammarAccess.getCargaHorariaAccess().getDiasAssignment_3()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1373:1: ( rule__CargaHoraria__DiasAssignment_3 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1373:2: rule__CargaHoraria__DiasAssignment_3
            {
            pushFollow(FOLLOW_rule__CargaHoraria__DiasAssignment_3_in_rule__CargaHoraria__Group__3__Impl2745);
            rule__CargaHoraria__DiasAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCargaHorariaAccess().getDiasAssignment_3()); 

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
    // $ANTLR end "rule__CargaHoraria__Group__3__Impl"


    // $ANTLR start "rule__CargaHorariaDocente__Group__0"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1391:1: rule__CargaHorariaDocente__Group__0 : rule__CargaHorariaDocente__Group__0__Impl rule__CargaHorariaDocente__Group__1 ;
    public final void rule__CargaHorariaDocente__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1395:1: ( rule__CargaHorariaDocente__Group__0__Impl rule__CargaHorariaDocente__Group__1 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1396:2: rule__CargaHorariaDocente__Group__0__Impl rule__CargaHorariaDocente__Group__1
            {
            pushFollow(FOLLOW_rule__CargaHorariaDocente__Group__0__Impl_in_rule__CargaHorariaDocente__Group__02783);
            rule__CargaHorariaDocente__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CargaHorariaDocente__Group__1_in_rule__CargaHorariaDocente__Group__02786);
            rule__CargaHorariaDocente__Group__1();

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
    // $ANTLR end "rule__CargaHorariaDocente__Group__0"


    // $ANTLR start "rule__CargaHorariaDocente__Group__0__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1403:1: rule__CargaHorariaDocente__Group__0__Impl : ( ( rule__CargaHorariaDocente__NombreAssignment_0 ) ) ;
    public final void rule__CargaHorariaDocente__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1407:1: ( ( ( rule__CargaHorariaDocente__NombreAssignment_0 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1408:1: ( ( rule__CargaHorariaDocente__NombreAssignment_0 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1408:1: ( ( rule__CargaHorariaDocente__NombreAssignment_0 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1409:1: ( rule__CargaHorariaDocente__NombreAssignment_0 )
            {
             before(grammarAccess.getCargaHorariaDocenteAccess().getNombreAssignment_0()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1410:1: ( rule__CargaHorariaDocente__NombreAssignment_0 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1410:2: rule__CargaHorariaDocente__NombreAssignment_0
            {
            pushFollow(FOLLOW_rule__CargaHorariaDocente__NombreAssignment_0_in_rule__CargaHorariaDocente__Group__0__Impl2813);
            rule__CargaHorariaDocente__NombreAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCargaHorariaDocenteAccess().getNombreAssignment_0()); 

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
    // $ANTLR end "rule__CargaHorariaDocente__Group__0__Impl"


    // $ANTLR start "rule__CargaHorariaDocente__Group__1"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1420:1: rule__CargaHorariaDocente__Group__1 : rule__CargaHorariaDocente__Group__1__Impl rule__CargaHorariaDocente__Group__2 ;
    public final void rule__CargaHorariaDocente__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1424:1: ( rule__CargaHorariaDocente__Group__1__Impl rule__CargaHorariaDocente__Group__2 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1425:2: rule__CargaHorariaDocente__Group__1__Impl rule__CargaHorariaDocente__Group__2
            {
            pushFollow(FOLLOW_rule__CargaHorariaDocente__Group__1__Impl_in_rule__CargaHorariaDocente__Group__12843);
            rule__CargaHorariaDocente__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CargaHorariaDocente__Group__2_in_rule__CargaHorariaDocente__Group__12846);
            rule__CargaHorariaDocente__Group__2();

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
    // $ANTLR end "rule__CargaHorariaDocente__Group__1"


    // $ANTLR start "rule__CargaHorariaDocente__Group__1__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1432:1: rule__CargaHorariaDocente__Group__1__Impl : ( 'tiene' ) ;
    public final void rule__CargaHorariaDocente__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1436:1: ( ( 'tiene' ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1437:1: ( 'tiene' )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1437:1: ( 'tiene' )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1438:1: 'tiene'
            {
             before(grammarAccess.getCargaHorariaDocenteAccess().getTieneKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__CargaHorariaDocente__Group__1__Impl2874); 
             after(grammarAccess.getCargaHorariaDocenteAccess().getTieneKeyword_1()); 

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
    // $ANTLR end "rule__CargaHorariaDocente__Group__1__Impl"


    // $ANTLR start "rule__CargaHorariaDocente__Group__2"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1451:1: rule__CargaHorariaDocente__Group__2 : rule__CargaHorariaDocente__Group__2__Impl ;
    public final void rule__CargaHorariaDocente__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1455:1: ( rule__CargaHorariaDocente__Group__2__Impl )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1456:2: rule__CargaHorariaDocente__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CargaHorariaDocente__Group__2__Impl_in_rule__CargaHorariaDocente__Group__22905);
            rule__CargaHorariaDocente__Group__2__Impl();

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
    // $ANTLR end "rule__CargaHorariaDocente__Group__2"


    // $ANTLR start "rule__CargaHorariaDocente__Group__2__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1462:1: rule__CargaHorariaDocente__Group__2__Impl : ( ( rule__CargaHorariaDocente__TipoAssignment_2 ) ) ;
    public final void rule__CargaHorariaDocente__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1466:1: ( ( ( rule__CargaHorariaDocente__TipoAssignment_2 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1467:1: ( ( rule__CargaHorariaDocente__TipoAssignment_2 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1467:1: ( ( rule__CargaHorariaDocente__TipoAssignment_2 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1468:1: ( rule__CargaHorariaDocente__TipoAssignment_2 )
            {
             before(grammarAccess.getCargaHorariaDocenteAccess().getTipoAssignment_2()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1469:1: ( rule__CargaHorariaDocente__TipoAssignment_2 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1469:2: rule__CargaHorariaDocente__TipoAssignment_2
            {
            pushFollow(FOLLOW_rule__CargaHorariaDocente__TipoAssignment_2_in_rule__CargaHorariaDocente__Group__2__Impl2932);
            rule__CargaHorariaDocente__TipoAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCargaHorariaDocenteAccess().getTipoAssignment_2()); 

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
    // $ANTLR end "rule__CargaHorariaDocente__Group__2__Impl"


    // $ANTLR start "rule__Horario__Group__0"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1485:1: rule__Horario__Group__0 : rule__Horario__Group__0__Impl rule__Horario__Group__1 ;
    public final void rule__Horario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1489:1: ( rule__Horario__Group__0__Impl rule__Horario__Group__1 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1490:2: rule__Horario__Group__0__Impl rule__Horario__Group__1
            {
            pushFollow(FOLLOW_rule__Horario__Group__0__Impl_in_rule__Horario__Group__02968);
            rule__Horario__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Horario__Group__1_in_rule__Horario__Group__02971);
            rule__Horario__Group__1();

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
    // $ANTLR end "rule__Horario__Group__0"


    // $ANTLR start "rule__Horario__Group__0__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1497:1: rule__Horario__Group__0__Impl : ( ( rule__Horario__DiaAssignment_0 ) ) ;
    public final void rule__Horario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1501:1: ( ( ( rule__Horario__DiaAssignment_0 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1502:1: ( ( rule__Horario__DiaAssignment_0 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1502:1: ( ( rule__Horario__DiaAssignment_0 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1503:1: ( rule__Horario__DiaAssignment_0 )
            {
             before(grammarAccess.getHorarioAccess().getDiaAssignment_0()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1504:1: ( rule__Horario__DiaAssignment_0 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1504:2: rule__Horario__DiaAssignment_0
            {
            pushFollow(FOLLOW_rule__Horario__DiaAssignment_0_in_rule__Horario__Group__0__Impl2998);
            rule__Horario__DiaAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getHorarioAccess().getDiaAssignment_0()); 

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
    // $ANTLR end "rule__Horario__Group__0__Impl"


    // $ANTLR start "rule__Horario__Group__1"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1514:1: rule__Horario__Group__1 : rule__Horario__Group__1__Impl rule__Horario__Group__2 ;
    public final void rule__Horario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1518:1: ( rule__Horario__Group__1__Impl rule__Horario__Group__2 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1519:2: rule__Horario__Group__1__Impl rule__Horario__Group__2
            {
            pushFollow(FOLLOW_rule__Horario__Group__1__Impl_in_rule__Horario__Group__13028);
            rule__Horario__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Horario__Group__2_in_rule__Horario__Group__13031);
            rule__Horario__Group__2();

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
    // $ANTLR end "rule__Horario__Group__1"


    // $ANTLR start "rule__Horario__Group__1__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1526:1: rule__Horario__Group__1__Impl : ( ':' ) ;
    public final void rule__Horario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1530:1: ( ( ':' ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1531:1: ( ':' )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1531:1: ( ':' )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1532:1: ':'
            {
             before(grammarAccess.getHorarioAccess().getColonKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__Horario__Group__1__Impl3059); 
             after(grammarAccess.getHorarioAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Horario__Group__1__Impl"


    // $ANTLR start "rule__Horario__Group__2"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1545:1: rule__Horario__Group__2 : rule__Horario__Group__2__Impl rule__Horario__Group__3 ;
    public final void rule__Horario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1549:1: ( rule__Horario__Group__2__Impl rule__Horario__Group__3 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1550:2: rule__Horario__Group__2__Impl rule__Horario__Group__3
            {
            pushFollow(FOLLOW_rule__Horario__Group__2__Impl_in_rule__Horario__Group__23090);
            rule__Horario__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Horario__Group__3_in_rule__Horario__Group__23093);
            rule__Horario__Group__3();

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
    // $ANTLR end "rule__Horario__Group__2"


    // $ANTLR start "rule__Horario__Group__2__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1557:1: rule__Horario__Group__2__Impl : ( ( rule__Horario__DesdeAssignment_2 ) ) ;
    public final void rule__Horario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1561:1: ( ( ( rule__Horario__DesdeAssignment_2 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1562:1: ( ( rule__Horario__DesdeAssignment_2 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1562:1: ( ( rule__Horario__DesdeAssignment_2 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1563:1: ( rule__Horario__DesdeAssignment_2 )
            {
             before(grammarAccess.getHorarioAccess().getDesdeAssignment_2()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1564:1: ( rule__Horario__DesdeAssignment_2 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1564:2: rule__Horario__DesdeAssignment_2
            {
            pushFollow(FOLLOW_rule__Horario__DesdeAssignment_2_in_rule__Horario__Group__2__Impl3120);
            rule__Horario__DesdeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getHorarioAccess().getDesdeAssignment_2()); 

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
    // $ANTLR end "rule__Horario__Group__2__Impl"


    // $ANTLR start "rule__Horario__Group__3"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1574:1: rule__Horario__Group__3 : rule__Horario__Group__3__Impl rule__Horario__Group__4 ;
    public final void rule__Horario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1578:1: ( rule__Horario__Group__3__Impl rule__Horario__Group__4 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1579:2: rule__Horario__Group__3__Impl rule__Horario__Group__4
            {
            pushFollow(FOLLOW_rule__Horario__Group__3__Impl_in_rule__Horario__Group__33150);
            rule__Horario__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Horario__Group__4_in_rule__Horario__Group__33153);
            rule__Horario__Group__4();

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
    // $ANTLR end "rule__Horario__Group__3"


    // $ANTLR start "rule__Horario__Group__3__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1586:1: rule__Horario__Group__3__Impl : ( 'a' ) ;
    public final void rule__Horario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1590:1: ( ( 'a' ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1591:1: ( 'a' )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1591:1: ( 'a' )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1592:1: 'a'
            {
             before(grammarAccess.getHorarioAccess().getAKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__Horario__Group__3__Impl3181); 
             after(grammarAccess.getHorarioAccess().getAKeyword_3()); 

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
    // $ANTLR end "rule__Horario__Group__3__Impl"


    // $ANTLR start "rule__Horario__Group__4"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1605:1: rule__Horario__Group__4 : rule__Horario__Group__4__Impl rule__Horario__Group__5 ;
    public final void rule__Horario__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1609:1: ( rule__Horario__Group__4__Impl rule__Horario__Group__5 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1610:2: rule__Horario__Group__4__Impl rule__Horario__Group__5
            {
            pushFollow(FOLLOW_rule__Horario__Group__4__Impl_in_rule__Horario__Group__43212);
            rule__Horario__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Horario__Group__5_in_rule__Horario__Group__43215);
            rule__Horario__Group__5();

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
    // $ANTLR end "rule__Horario__Group__4"


    // $ANTLR start "rule__Horario__Group__4__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1617:1: rule__Horario__Group__4__Impl : ( ( rule__Horario__HastaAssignment_4 ) ) ;
    public final void rule__Horario__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1621:1: ( ( ( rule__Horario__HastaAssignment_4 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1622:1: ( ( rule__Horario__HastaAssignment_4 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1622:1: ( ( rule__Horario__HastaAssignment_4 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1623:1: ( rule__Horario__HastaAssignment_4 )
            {
             before(grammarAccess.getHorarioAccess().getHastaAssignment_4()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1624:1: ( rule__Horario__HastaAssignment_4 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1624:2: rule__Horario__HastaAssignment_4
            {
            pushFollow(FOLLOW_rule__Horario__HastaAssignment_4_in_rule__Horario__Group__4__Impl3242);
            rule__Horario__HastaAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getHorarioAccess().getHastaAssignment_4()); 

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
    // $ANTLR end "rule__Horario__Group__4__Impl"


    // $ANTLR start "rule__Horario__Group__5"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1634:1: rule__Horario__Group__5 : rule__Horario__Group__5__Impl rule__Horario__Group__6 ;
    public final void rule__Horario__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1638:1: ( rule__Horario__Group__5__Impl rule__Horario__Group__6 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1639:2: rule__Horario__Group__5__Impl rule__Horario__Group__6
            {
            pushFollow(FOLLOW_rule__Horario__Group__5__Impl_in_rule__Horario__Group__53272);
            rule__Horario__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Horario__Group__6_in_rule__Horario__Group__53275);
            rule__Horario__Group__6();

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
    // $ANTLR end "rule__Horario__Group__5"


    // $ANTLR start "rule__Horario__Group__5__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1646:1: rule__Horario__Group__5__Impl : ( 'hs se dicta' ) ;
    public final void rule__Horario__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1650:1: ( ( 'hs se dicta' ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1651:1: ( 'hs se dicta' )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1651:1: ( 'hs se dicta' )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1652:1: 'hs se dicta'
            {
             before(grammarAccess.getHorarioAccess().getHsSeDictaKeyword_5()); 
            match(input,25,FOLLOW_25_in_rule__Horario__Group__5__Impl3303); 
             after(grammarAccess.getHorarioAccess().getHsSeDictaKeyword_5()); 

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
    // $ANTLR end "rule__Horario__Group__5__Impl"


    // $ANTLR start "rule__Horario__Group__6"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1665:1: rule__Horario__Group__6 : rule__Horario__Group__6__Impl rule__Horario__Group__7 ;
    public final void rule__Horario__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1669:1: ( rule__Horario__Group__6__Impl rule__Horario__Group__7 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1670:2: rule__Horario__Group__6__Impl rule__Horario__Group__7
            {
            pushFollow(FOLLOW_rule__Horario__Group__6__Impl_in_rule__Horario__Group__63334);
            rule__Horario__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Horario__Group__7_in_rule__Horario__Group__63337);
            rule__Horario__Group__7();

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
    // $ANTLR end "rule__Horario__Group__6"


    // $ANTLR start "rule__Horario__Group__6__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1677:1: rule__Horario__Group__6__Impl : ( ( rule__Horario__MateriaAssignment_6 ) ) ;
    public final void rule__Horario__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1681:1: ( ( ( rule__Horario__MateriaAssignment_6 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1682:1: ( ( rule__Horario__MateriaAssignment_6 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1682:1: ( ( rule__Horario__MateriaAssignment_6 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1683:1: ( rule__Horario__MateriaAssignment_6 )
            {
             before(grammarAccess.getHorarioAccess().getMateriaAssignment_6()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1684:1: ( rule__Horario__MateriaAssignment_6 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1684:2: rule__Horario__MateriaAssignment_6
            {
            pushFollow(FOLLOW_rule__Horario__MateriaAssignment_6_in_rule__Horario__Group__6__Impl3364);
            rule__Horario__MateriaAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getHorarioAccess().getMateriaAssignment_6()); 

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
    // $ANTLR end "rule__Horario__Group__6__Impl"


    // $ANTLR start "rule__Horario__Group__7"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1694:1: rule__Horario__Group__7 : rule__Horario__Group__7__Impl rule__Horario__Group__8 ;
    public final void rule__Horario__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1698:1: ( rule__Horario__Group__7__Impl rule__Horario__Group__8 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1699:2: rule__Horario__Group__7__Impl rule__Horario__Group__8
            {
            pushFollow(FOLLOW_rule__Horario__Group__7__Impl_in_rule__Horario__Group__73394);
            rule__Horario__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Horario__Group__8_in_rule__Horario__Group__73397);
            rule__Horario__Group__8();

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
    // $ANTLR end "rule__Horario__Group__7"


    // $ANTLR start "rule__Horario__Group__7__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1706:1: rule__Horario__Group__7__Impl : ( 'en' ) ;
    public final void rule__Horario__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1710:1: ( ( 'en' ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1711:1: ( 'en' )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1711:1: ( 'en' )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1712:1: 'en'
            {
             before(grammarAccess.getHorarioAccess().getEnKeyword_7()); 
            match(input,26,FOLLOW_26_in_rule__Horario__Group__7__Impl3425); 
             after(grammarAccess.getHorarioAccess().getEnKeyword_7()); 

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
    // $ANTLR end "rule__Horario__Group__7__Impl"


    // $ANTLR start "rule__Horario__Group__8"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1725:1: rule__Horario__Group__8 : rule__Horario__Group__8__Impl ;
    public final void rule__Horario__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1729:1: ( rule__Horario__Group__8__Impl )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1730:2: rule__Horario__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Horario__Group__8__Impl_in_rule__Horario__Group__83456);
            rule__Horario__Group__8__Impl();

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
    // $ANTLR end "rule__Horario__Group__8"


    // $ANTLR start "rule__Horario__Group__8__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1736:1: rule__Horario__Group__8__Impl : ( ( rule__Horario__AulaAssignment_8 ) ) ;
    public final void rule__Horario__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1740:1: ( ( ( rule__Horario__AulaAssignment_8 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1741:1: ( ( rule__Horario__AulaAssignment_8 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1741:1: ( ( rule__Horario__AulaAssignment_8 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1742:1: ( rule__Horario__AulaAssignment_8 )
            {
             before(grammarAccess.getHorarioAccess().getAulaAssignment_8()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1743:1: ( rule__Horario__AulaAssignment_8 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1743:2: rule__Horario__AulaAssignment_8
            {
            pushFollow(FOLLOW_rule__Horario__AulaAssignment_8_in_rule__Horario__Group__8__Impl3483);
            rule__Horario__AulaAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getHorarioAccess().getAulaAssignment_8()); 

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
    // $ANTLR end "rule__Horario__Group__8__Impl"


    // $ANTLR start "rule__Semestre__Group__0"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1771:1: rule__Semestre__Group__0 : rule__Semestre__Group__0__Impl rule__Semestre__Group__1 ;
    public final void rule__Semestre__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1775:1: ( rule__Semestre__Group__0__Impl rule__Semestre__Group__1 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1776:2: rule__Semestre__Group__0__Impl rule__Semestre__Group__1
            {
            pushFollow(FOLLOW_rule__Semestre__Group__0__Impl_in_rule__Semestre__Group__03531);
            rule__Semestre__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Semestre__Group__1_in_rule__Semestre__Group__03534);
            rule__Semestre__Group__1();

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
    // $ANTLR end "rule__Semestre__Group__0"


    // $ANTLR start "rule__Semestre__Group__0__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1783:1: rule__Semestre__Group__0__Impl : ( ( rule__Semestre__AnhoAssignment_0 ) ) ;
    public final void rule__Semestre__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1787:1: ( ( ( rule__Semestre__AnhoAssignment_0 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1788:1: ( ( rule__Semestre__AnhoAssignment_0 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1788:1: ( ( rule__Semestre__AnhoAssignment_0 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1789:1: ( rule__Semestre__AnhoAssignment_0 )
            {
             before(grammarAccess.getSemestreAccess().getAnhoAssignment_0()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1790:1: ( rule__Semestre__AnhoAssignment_0 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1790:2: rule__Semestre__AnhoAssignment_0
            {
            pushFollow(FOLLOW_rule__Semestre__AnhoAssignment_0_in_rule__Semestre__Group__0__Impl3561);
            rule__Semestre__AnhoAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSemestreAccess().getAnhoAssignment_0()); 

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
    // $ANTLR end "rule__Semestre__Group__0__Impl"


    // $ANTLR start "rule__Semestre__Group__1"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1800:1: rule__Semestre__Group__1 : rule__Semestre__Group__1__Impl rule__Semestre__Group__2 ;
    public final void rule__Semestre__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1804:1: ( rule__Semestre__Group__1__Impl rule__Semestre__Group__2 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1805:2: rule__Semestre__Group__1__Impl rule__Semestre__Group__2
            {
            pushFollow(FOLLOW_rule__Semestre__Group__1__Impl_in_rule__Semestre__Group__13591);
            rule__Semestre__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Semestre__Group__2_in_rule__Semestre__Group__13594);
            rule__Semestre__Group__2();

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
    // $ANTLR end "rule__Semestre__Group__1"


    // $ANTLR start "rule__Semestre__Group__1__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1812:1: rule__Semestre__Group__1__Impl : ( 'semestre' ) ;
    public final void rule__Semestre__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1816:1: ( ( 'semestre' ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1817:1: ( 'semestre' )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1817:1: ( 'semestre' )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1818:1: 'semestre'
            {
             before(grammarAccess.getSemestreAccess().getSemestreKeyword_1()); 
            match(input,27,FOLLOW_27_in_rule__Semestre__Group__1__Impl3622); 
             after(grammarAccess.getSemestreAccess().getSemestreKeyword_1()); 

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
    // $ANTLR end "rule__Semestre__Group__1__Impl"


    // $ANTLR start "rule__Semestre__Group__2"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1831:1: rule__Semestre__Group__2 : rule__Semestre__Group__2__Impl ;
    public final void rule__Semestre__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1835:1: ( rule__Semestre__Group__2__Impl )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1836:2: rule__Semestre__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Semestre__Group__2__Impl_in_rule__Semestre__Group__23653);
            rule__Semestre__Group__2__Impl();

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
    // $ANTLR end "rule__Semestre__Group__2"


    // $ANTLR start "rule__Semestre__Group__2__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1842:1: rule__Semestre__Group__2__Impl : ( ( rule__Semestre__NumeroAssignment_2 ) ) ;
    public final void rule__Semestre__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1846:1: ( ( ( rule__Semestre__NumeroAssignment_2 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1847:1: ( ( rule__Semestre__NumeroAssignment_2 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1847:1: ( ( rule__Semestre__NumeroAssignment_2 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1848:1: ( rule__Semestre__NumeroAssignment_2 )
            {
             before(grammarAccess.getSemestreAccess().getNumeroAssignment_2()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1849:1: ( rule__Semestre__NumeroAssignment_2 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1849:2: rule__Semestre__NumeroAssignment_2
            {
            pushFollow(FOLLOW_rule__Semestre__NumeroAssignment_2_in_rule__Semestre__Group__2__Impl3680);
            rule__Semestre__NumeroAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSemestreAccess().getNumeroAssignment_2()); 

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
    // $ANTLR end "rule__Semestre__Group__2__Impl"


    // $ANTLR start "rule__Dia__Group__0"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1865:1: rule__Dia__Group__0 : rule__Dia__Group__0__Impl rule__Dia__Group__1 ;
    public final void rule__Dia__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1869:1: ( rule__Dia__Group__0__Impl rule__Dia__Group__1 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1870:2: rule__Dia__Group__0__Impl rule__Dia__Group__1
            {
            pushFollow(FOLLOW_rule__Dia__Group__0__Impl_in_rule__Dia__Group__03716);
            rule__Dia__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Dia__Group__1_in_rule__Dia__Group__03719);
            rule__Dia__Group__1();

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
    // $ANTLR end "rule__Dia__Group__0"


    // $ANTLR start "rule__Dia__Group__0__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1877:1: rule__Dia__Group__0__Impl : ( 'dia' ) ;
    public final void rule__Dia__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1881:1: ( ( 'dia' ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1882:1: ( 'dia' )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1882:1: ( 'dia' )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1883:1: 'dia'
            {
             before(grammarAccess.getDiaAccess().getDiaKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__Dia__Group__0__Impl3747); 
             after(grammarAccess.getDiaAccess().getDiaKeyword_0()); 

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
    // $ANTLR end "rule__Dia__Group__0__Impl"


    // $ANTLR start "rule__Dia__Group__1"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1896:1: rule__Dia__Group__1 : rule__Dia__Group__1__Impl ;
    public final void rule__Dia__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1900:1: ( rule__Dia__Group__1__Impl )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1901:2: rule__Dia__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Dia__Group__1__Impl_in_rule__Dia__Group__13778);
            rule__Dia__Group__1__Impl();

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
    // $ANTLR end "rule__Dia__Group__1"


    // $ANTLR start "rule__Dia__Group__1__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1907:1: rule__Dia__Group__1__Impl : ( ( rule__Dia__DiaAssignment_1 ) ) ;
    public final void rule__Dia__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1911:1: ( ( ( rule__Dia__DiaAssignment_1 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1912:1: ( ( rule__Dia__DiaAssignment_1 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1912:1: ( ( rule__Dia__DiaAssignment_1 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1913:1: ( rule__Dia__DiaAssignment_1 )
            {
             before(grammarAccess.getDiaAccess().getDiaAssignment_1()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1914:1: ( rule__Dia__DiaAssignment_1 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1914:2: rule__Dia__DiaAssignment_1
            {
            pushFollow(FOLLOW_rule__Dia__DiaAssignment_1_in_rule__Dia__Group__1__Impl3805);
            rule__Dia__DiaAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDiaAccess().getDiaAssignment_1()); 

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
    // $ANTLR end "rule__Dia__Group__1__Impl"


    // $ANTLR start "rule__Horarios__Group__0"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1928:1: rule__Horarios__Group__0 : rule__Horarios__Group__0__Impl rule__Horarios__Group__1 ;
    public final void rule__Horarios__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1932:1: ( rule__Horarios__Group__0__Impl rule__Horarios__Group__1 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1933:2: rule__Horarios__Group__0__Impl rule__Horarios__Group__1
            {
            pushFollow(FOLLOW_rule__Horarios__Group__0__Impl_in_rule__Horarios__Group__03839);
            rule__Horarios__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Horarios__Group__1_in_rule__Horarios__Group__03842);
            rule__Horarios__Group__1();

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
    // $ANTLR end "rule__Horarios__Group__0"


    // $ANTLR start "rule__Horarios__Group__0__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1940:1: rule__Horarios__Group__0__Impl : ( 'horarios {' ) ;
    public final void rule__Horarios__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1944:1: ( ( 'horarios {' ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1945:1: ( 'horarios {' )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1945:1: ( 'horarios {' )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1946:1: 'horarios {'
            {
             before(grammarAccess.getHorariosAccess().getHorariosKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__Horarios__Group__0__Impl3870); 
             after(grammarAccess.getHorariosAccess().getHorariosKeyword_0()); 

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
    // $ANTLR end "rule__Horarios__Group__0__Impl"


    // $ANTLR start "rule__Horarios__Group__1"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1959:1: rule__Horarios__Group__1 : rule__Horarios__Group__1__Impl rule__Horarios__Group__2 ;
    public final void rule__Horarios__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1963:1: ( rule__Horarios__Group__1__Impl rule__Horarios__Group__2 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1964:2: rule__Horarios__Group__1__Impl rule__Horarios__Group__2
            {
            pushFollow(FOLLOW_rule__Horarios__Group__1__Impl_in_rule__Horarios__Group__13901);
            rule__Horarios__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Horarios__Group__2_in_rule__Horarios__Group__13904);
            rule__Horarios__Group__2();

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
    // $ANTLR end "rule__Horarios__Group__1"


    // $ANTLR start "rule__Horarios__Group__1__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1971:1: rule__Horarios__Group__1__Impl : ( ( ( rule__Horarios__HorariosAssignment_1 ) ) ( ( rule__Horarios__HorariosAssignment_1 )* ) ) ;
    public final void rule__Horarios__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1975:1: ( ( ( ( rule__Horarios__HorariosAssignment_1 ) ) ( ( rule__Horarios__HorariosAssignment_1 )* ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1976:1: ( ( ( rule__Horarios__HorariosAssignment_1 ) ) ( ( rule__Horarios__HorariosAssignment_1 )* ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1976:1: ( ( ( rule__Horarios__HorariosAssignment_1 ) ) ( ( rule__Horarios__HorariosAssignment_1 )* ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1977:1: ( ( rule__Horarios__HorariosAssignment_1 ) ) ( ( rule__Horarios__HorariosAssignment_1 )* )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1977:1: ( ( rule__Horarios__HorariosAssignment_1 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1978:1: ( rule__Horarios__HorariosAssignment_1 )
            {
             before(grammarAccess.getHorariosAccess().getHorariosAssignment_1()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1979:1: ( rule__Horarios__HorariosAssignment_1 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1979:2: rule__Horarios__HorariosAssignment_1
            {
            pushFollow(FOLLOW_rule__Horarios__HorariosAssignment_1_in_rule__Horarios__Group__1__Impl3933);
            rule__Horarios__HorariosAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHorariosAccess().getHorariosAssignment_1()); 

            }

            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1982:1: ( ( rule__Horarios__HorariosAssignment_1 )* )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1983:1: ( rule__Horarios__HorariosAssignment_1 )*
            {
             before(grammarAccess.getHorariosAccess().getHorariosAssignment_1()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1984:1: ( rule__Horarios__HorariosAssignment_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==28) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1984:2: rule__Horarios__HorariosAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Horarios__HorariosAssignment_1_in_rule__Horarios__Group__1__Impl3945);
            	    rule__Horarios__HorariosAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getHorariosAccess().getHorariosAssignment_1()); 

            }


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
    // $ANTLR end "rule__Horarios__Group__1__Impl"


    // $ANTLR start "rule__Horarios__Group__2"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1995:1: rule__Horarios__Group__2 : rule__Horarios__Group__2__Impl ;
    public final void rule__Horarios__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1999:1: ( rule__Horarios__Group__2__Impl )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2000:2: rule__Horarios__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Horarios__Group__2__Impl_in_rule__Horarios__Group__23978);
            rule__Horarios__Group__2__Impl();

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
    // $ANTLR end "rule__Horarios__Group__2"


    // $ANTLR start "rule__Horarios__Group__2__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2006:1: rule__Horarios__Group__2__Impl : ( '}' ) ;
    public final void rule__Horarios__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2010:1: ( ( '}' ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2011:1: ( '}' )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2011:1: ( '}' )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2012:1: '}'
            {
             before(grammarAccess.getHorariosAccess().getRightCurlyBracketKeyword_2()); 
            match(input,30,FOLLOW_30_in_rule__Horarios__Group__2__Impl4006); 
             after(grammarAccess.getHorariosAccess().getRightCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Horarios__Group__2__Impl"


    // $ANTLR start "rule__Planificacion__Group__0"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2031:1: rule__Planificacion__Group__0 : rule__Planificacion__Group__0__Impl rule__Planificacion__Group__1 ;
    public final void rule__Planificacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2035:1: ( rule__Planificacion__Group__0__Impl rule__Planificacion__Group__1 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2036:2: rule__Planificacion__Group__0__Impl rule__Planificacion__Group__1
            {
            pushFollow(FOLLOW_rule__Planificacion__Group__0__Impl_in_rule__Planificacion__Group__04043);
            rule__Planificacion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Planificacion__Group__1_in_rule__Planificacion__Group__04046);
            rule__Planificacion__Group__1();

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
    // $ANTLR end "rule__Planificacion__Group__0"


    // $ANTLR start "rule__Planificacion__Group__0__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2043:1: rule__Planificacion__Group__0__Impl : ( 'planificacion' ) ;
    public final void rule__Planificacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2047:1: ( ( 'planificacion' ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2048:1: ( 'planificacion' )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2048:1: ( 'planificacion' )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2049:1: 'planificacion'
            {
             before(grammarAccess.getPlanificacionAccess().getPlanificacionKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Planificacion__Group__0__Impl4074); 
             after(grammarAccess.getPlanificacionAccess().getPlanificacionKeyword_0()); 

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
    // $ANTLR end "rule__Planificacion__Group__0__Impl"


    // $ANTLR start "rule__Planificacion__Group__1"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2062:1: rule__Planificacion__Group__1 : rule__Planificacion__Group__1__Impl rule__Planificacion__Group__2 ;
    public final void rule__Planificacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2066:1: ( rule__Planificacion__Group__1__Impl rule__Planificacion__Group__2 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2067:2: rule__Planificacion__Group__1__Impl rule__Planificacion__Group__2
            {
            pushFollow(FOLLOW_rule__Planificacion__Group__1__Impl_in_rule__Planificacion__Group__14105);
            rule__Planificacion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Planificacion__Group__2_in_rule__Planificacion__Group__14108);
            rule__Planificacion__Group__2();

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
    // $ANTLR end "rule__Planificacion__Group__1"


    // $ANTLR start "rule__Planificacion__Group__1__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2074:1: rule__Planificacion__Group__1__Impl : ( ( rule__Planificacion__SemestreAssignment_1 ) ) ;
    public final void rule__Planificacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2078:1: ( ( ( rule__Planificacion__SemestreAssignment_1 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2079:1: ( ( rule__Planificacion__SemestreAssignment_1 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2079:1: ( ( rule__Planificacion__SemestreAssignment_1 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2080:1: ( rule__Planificacion__SemestreAssignment_1 )
            {
             before(grammarAccess.getPlanificacionAccess().getSemestreAssignment_1()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2081:1: ( rule__Planificacion__SemestreAssignment_1 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2081:2: rule__Planificacion__SemestreAssignment_1
            {
            pushFollow(FOLLOW_rule__Planificacion__SemestreAssignment_1_in_rule__Planificacion__Group__1__Impl4135);
            rule__Planificacion__SemestreAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPlanificacionAccess().getSemestreAssignment_1()); 

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
    // $ANTLR end "rule__Planificacion__Group__1__Impl"


    // $ANTLR start "rule__Planificacion__Group__2"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2091:1: rule__Planificacion__Group__2 : rule__Planificacion__Group__2__Impl rule__Planificacion__Group__3 ;
    public final void rule__Planificacion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2095:1: ( rule__Planificacion__Group__2__Impl rule__Planificacion__Group__3 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2096:2: rule__Planificacion__Group__2__Impl rule__Planificacion__Group__3
            {
            pushFollow(FOLLOW_rule__Planificacion__Group__2__Impl_in_rule__Planificacion__Group__24165);
            rule__Planificacion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Planificacion__Group__3_in_rule__Planificacion__Group__24168);
            rule__Planificacion__Group__3();

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
    // $ANTLR end "rule__Planificacion__Group__2"


    // $ANTLR start "rule__Planificacion__Group__2__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2103:1: rule__Planificacion__Group__2__Impl : ( '{' ) ;
    public final void rule__Planificacion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2107:1: ( ( '{' ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2108:1: ( '{' )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2108:1: ( '{' )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2109:1: '{'
            {
             before(grammarAccess.getPlanificacionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__Planificacion__Group__2__Impl4196); 
             after(grammarAccess.getPlanificacionAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Planificacion__Group__2__Impl"


    // $ANTLR start "rule__Planificacion__Group__3"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2122:1: rule__Planificacion__Group__3 : rule__Planificacion__Group__3__Impl rule__Planificacion__Group__4 ;
    public final void rule__Planificacion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2126:1: ( rule__Planificacion__Group__3__Impl rule__Planificacion__Group__4 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2127:2: rule__Planificacion__Group__3__Impl rule__Planificacion__Group__4
            {
            pushFollow(FOLLOW_rule__Planificacion__Group__3__Impl_in_rule__Planificacion__Group__34227);
            rule__Planificacion__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Planificacion__Group__4_in_rule__Planificacion__Group__34230);
            rule__Planificacion__Group__4();

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
    // $ANTLR end "rule__Planificacion__Group__3"


    // $ANTLR start "rule__Planificacion__Group__3__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2134:1: rule__Planificacion__Group__3__Impl : ( 'a dictar:' ) ;
    public final void rule__Planificacion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2138:1: ( ( 'a dictar:' ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2139:1: ( 'a dictar:' )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2139:1: ( 'a dictar:' )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2140:1: 'a dictar:'
            {
             before(grammarAccess.getPlanificacionAccess().getADictarKeyword_3()); 
            match(input,33,FOLLOW_33_in_rule__Planificacion__Group__3__Impl4258); 
             after(grammarAccess.getPlanificacionAccess().getADictarKeyword_3()); 

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
    // $ANTLR end "rule__Planificacion__Group__3__Impl"


    // $ANTLR start "rule__Planificacion__Group__4"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2153:1: rule__Planificacion__Group__4 : rule__Planificacion__Group__4__Impl rule__Planificacion__Group__5 ;
    public final void rule__Planificacion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2157:1: ( rule__Planificacion__Group__4__Impl rule__Planificacion__Group__5 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2158:2: rule__Planificacion__Group__4__Impl rule__Planificacion__Group__5
            {
            pushFollow(FOLLOW_rule__Planificacion__Group__4__Impl_in_rule__Planificacion__Group__44289);
            rule__Planificacion__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Planificacion__Group__5_in_rule__Planificacion__Group__44292);
            rule__Planificacion__Group__5();

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
    // $ANTLR end "rule__Planificacion__Group__4"


    // $ANTLR start "rule__Planificacion__Group__4__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2165:1: rule__Planificacion__Group__4__Impl : ( ( ( rule__Planificacion__MateriasAssignment_4 ) ) ( ( rule__Planificacion__MateriasAssignment_4 )* ) ) ;
    public final void rule__Planificacion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2169:1: ( ( ( ( rule__Planificacion__MateriasAssignment_4 ) ) ( ( rule__Planificacion__MateriasAssignment_4 )* ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2170:1: ( ( ( rule__Planificacion__MateriasAssignment_4 ) ) ( ( rule__Planificacion__MateriasAssignment_4 )* ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2170:1: ( ( ( rule__Planificacion__MateriasAssignment_4 ) ) ( ( rule__Planificacion__MateriasAssignment_4 )* ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2171:1: ( ( rule__Planificacion__MateriasAssignment_4 ) ) ( ( rule__Planificacion__MateriasAssignment_4 )* )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2171:1: ( ( rule__Planificacion__MateriasAssignment_4 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2172:1: ( rule__Planificacion__MateriasAssignment_4 )
            {
             before(grammarAccess.getPlanificacionAccess().getMateriasAssignment_4()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2173:1: ( rule__Planificacion__MateriasAssignment_4 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2173:2: rule__Planificacion__MateriasAssignment_4
            {
            pushFollow(FOLLOW_rule__Planificacion__MateriasAssignment_4_in_rule__Planificacion__Group__4__Impl4321);
            rule__Planificacion__MateriasAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPlanificacionAccess().getMateriasAssignment_4()); 

            }

            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2176:1: ( ( rule__Planificacion__MateriasAssignment_4 )* )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2177:1: ( rule__Planificacion__MateriasAssignment_4 )*
            {
             before(grammarAccess.getPlanificacionAccess().getMateriasAssignment_4()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2178:1: ( rule__Planificacion__MateriasAssignment_4 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==17) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2178:2: rule__Planificacion__MateriasAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Planificacion__MateriasAssignment_4_in_rule__Planificacion__Group__4__Impl4333);
            	    rule__Planificacion__MateriasAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getPlanificacionAccess().getMateriasAssignment_4()); 

            }


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
    // $ANTLR end "rule__Planificacion__Group__4__Impl"


    // $ANTLR start "rule__Planificacion__Group__5"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2189:1: rule__Planificacion__Group__5 : rule__Planificacion__Group__5__Impl rule__Planificacion__Group__6 ;
    public final void rule__Planificacion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2193:1: ( rule__Planificacion__Group__5__Impl rule__Planificacion__Group__6 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2194:2: rule__Planificacion__Group__5__Impl rule__Planificacion__Group__6
            {
            pushFollow(FOLLOW_rule__Planificacion__Group__5__Impl_in_rule__Planificacion__Group__54366);
            rule__Planificacion__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Planificacion__Group__6_in_rule__Planificacion__Group__54369);
            rule__Planificacion__Group__6();

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
    // $ANTLR end "rule__Planificacion__Group__5"


    // $ANTLR start "rule__Planificacion__Group__5__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2201:1: rule__Planificacion__Group__5__Impl : ( ( rule__Planificacion__HorariosAssignment_5 ) ) ;
    public final void rule__Planificacion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2205:1: ( ( ( rule__Planificacion__HorariosAssignment_5 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2206:1: ( ( rule__Planificacion__HorariosAssignment_5 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2206:1: ( ( rule__Planificacion__HorariosAssignment_5 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2207:1: ( rule__Planificacion__HorariosAssignment_5 )
            {
             before(grammarAccess.getPlanificacionAccess().getHorariosAssignment_5()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2208:1: ( rule__Planificacion__HorariosAssignment_5 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2208:2: rule__Planificacion__HorariosAssignment_5
            {
            pushFollow(FOLLOW_rule__Planificacion__HorariosAssignment_5_in_rule__Planificacion__Group__5__Impl4396);
            rule__Planificacion__HorariosAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPlanificacionAccess().getHorariosAssignment_5()); 

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
    // $ANTLR end "rule__Planificacion__Group__5__Impl"


    // $ANTLR start "rule__Planificacion__Group__6"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2218:1: rule__Planificacion__Group__6 : rule__Planificacion__Group__6__Impl ;
    public final void rule__Planificacion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2222:1: ( rule__Planificacion__Group__6__Impl )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2223:2: rule__Planificacion__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Planificacion__Group__6__Impl_in_rule__Planificacion__Group__64426);
            rule__Planificacion__Group__6__Impl();

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
    // $ANTLR end "rule__Planificacion__Group__6"


    // $ANTLR start "rule__Planificacion__Group__6__Impl"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2229:1: rule__Planificacion__Group__6__Impl : ( '}' ) ;
    public final void rule__Planificacion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2233:1: ( ( '}' ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2234:1: ( '}' )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2234:1: ( '}' )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2235:1: '}'
            {
             before(grammarAccess.getPlanificacionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,30,FOLLOW_30_in_rule__Planificacion__Group__6__Impl4454); 
             after(grammarAccess.getPlanificacionAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Planificacion__Group__6__Impl"


    // $ANTLR start "rule__Model__ProfesorsAssignment_0"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2263:1: rule__Model__ProfesorsAssignment_0 : ( ruleProfesor ) ;
    public final void rule__Model__ProfesorsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2267:1: ( ( ruleProfesor ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2268:1: ( ruleProfesor )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2268:1: ( ruleProfesor )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2269:1: ruleProfesor
            {
             before(grammarAccess.getModelAccess().getProfesorsProfesorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleProfesor_in_rule__Model__ProfesorsAssignment_04504);
            ruleProfesor();

            state._fsp--;

             after(grammarAccess.getModelAccess().getProfesorsProfesorParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Model__ProfesorsAssignment_0"


    // $ANTLR start "rule__Model__HorasAssignment_1"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2278:1: rule__Model__HorasAssignment_1 : ( ruleHora ) ;
    public final void rule__Model__HorasAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2282:1: ( ( ruleHora ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2283:1: ( ruleHora )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2283:1: ( ruleHora )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2284:1: ruleHora
            {
             before(grammarAccess.getModelAccess().getHorasHoraParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleHora_in_rule__Model__HorasAssignment_14535);
            ruleHora();

            state._fsp--;

             after(grammarAccess.getModelAccess().getHorasHoraParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__HorasAssignment_1"


    // $ANTLR start "rule__Model__MateriasAssignment_2"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2293:1: rule__Model__MateriasAssignment_2 : ( ruleMateria ) ;
    public final void rule__Model__MateriasAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2297:1: ( ( ruleMateria ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2298:1: ( ruleMateria )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2298:1: ( ruleMateria )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2299:1: ruleMateria
            {
             before(grammarAccess.getModelAccess().getMateriasMateriaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleMateria_in_rule__Model__MateriasAssignment_24566);
            ruleMateria();

            state._fsp--;

             after(grammarAccess.getModelAccess().getMateriasMateriaParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Model__MateriasAssignment_2"


    // $ANTLR start "rule__Model__AulasAssignment_3"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2308:1: rule__Model__AulasAssignment_3 : ( ruleAula ) ;
    public final void rule__Model__AulasAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2312:1: ( ( ruleAula ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2313:1: ( ruleAula )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2313:1: ( ruleAula )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2314:1: ruleAula
            {
             before(grammarAccess.getModelAccess().getAulasAulaParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAula_in_rule__Model__AulasAssignment_34597);
            ruleAula();

            state._fsp--;

             after(grammarAccess.getModelAccess().getAulasAulaParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Model__AulasAssignment_3"


    // $ANTLR start "rule__Model__CargasHorariasAssignment_4"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2323:1: rule__Model__CargasHorariasAssignment_4 : ( ruleCargaHoraria ) ;
    public final void rule__Model__CargasHorariasAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2327:1: ( ( ruleCargaHoraria ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2328:1: ( ruleCargaHoraria )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2328:1: ( ruleCargaHoraria )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2329:1: ruleCargaHoraria
            {
             before(grammarAccess.getModelAccess().getCargasHorariasCargaHorariaParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleCargaHoraria_in_rule__Model__CargasHorariasAssignment_44628);
            ruleCargaHoraria();

            state._fsp--;

             after(grammarAccess.getModelAccess().getCargasHorariasCargaHorariaParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Model__CargasHorariasAssignment_4"


    // $ANTLR start "rule__Model__CargasHorariasDocentesAssignment_5"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2338:1: rule__Model__CargasHorariasDocentesAssignment_5 : ( ruleCargaHorariaDocente ) ;
    public final void rule__Model__CargasHorariasDocentesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2342:1: ( ( ruleCargaHorariaDocente ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2343:1: ( ruleCargaHorariaDocente )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2343:1: ( ruleCargaHorariaDocente )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2344:1: ruleCargaHorariaDocente
            {
             before(grammarAccess.getModelAccess().getCargasHorariasDocentesCargaHorariaDocenteParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleCargaHorariaDocente_in_rule__Model__CargasHorariasDocentesAssignment_54659);
            ruleCargaHorariaDocente();

            state._fsp--;

             after(grammarAccess.getModelAccess().getCargasHorariasDocentesCargaHorariaDocenteParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Model__CargasHorariasDocentesAssignment_5"


    // $ANTLR start "rule__Model__HorariosAssignment_6"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2353:1: rule__Model__HorariosAssignment_6 : ( ruleHorarios ) ;
    public final void rule__Model__HorariosAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2357:1: ( ( ruleHorarios ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2358:1: ( ruleHorarios )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2358:1: ( ruleHorarios )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2359:1: ruleHorarios
            {
             before(grammarAccess.getModelAccess().getHorariosHorariosParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleHorarios_in_rule__Model__HorariosAssignment_64690);
            ruleHorarios();

            state._fsp--;

             after(grammarAccess.getModelAccess().getHorariosHorariosParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Model__HorariosAssignment_6"


    // $ANTLR start "rule__Model__DiasAssignment_7"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2368:1: rule__Model__DiasAssignment_7 : ( ruleDia ) ;
    public final void rule__Model__DiasAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2372:1: ( ( ruleDia ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2373:1: ( ruleDia )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2373:1: ( ruleDia )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2374:1: ruleDia
            {
             before(grammarAccess.getModelAccess().getDiasDiaParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleDia_in_rule__Model__DiasAssignment_74721);
            ruleDia();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDiasDiaParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Model__DiasAssignment_7"


    // $ANTLR start "rule__Model__SemestreAssignment_8"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2383:1: rule__Model__SemestreAssignment_8 : ( ruleSemestre ) ;
    public final void rule__Model__SemestreAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2387:1: ( ( ruleSemestre ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2388:1: ( ruleSemestre )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2388:1: ( ruleSemestre )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2389:1: ruleSemestre
            {
             before(grammarAccess.getModelAccess().getSemestreSemestreParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleSemestre_in_rule__Model__SemestreAssignment_84752);
            ruleSemestre();

            state._fsp--;

             after(grammarAccess.getModelAccess().getSemestreSemestreParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Model__SemestreAssignment_8"


    // $ANTLR start "rule__Model__PlanificacionesAssignment_9"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2398:1: rule__Model__PlanificacionesAssignment_9 : ( rulePlanificacion ) ;
    public final void rule__Model__PlanificacionesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2402:1: ( ( rulePlanificacion ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2403:1: ( rulePlanificacion )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2403:1: ( rulePlanificacion )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2404:1: rulePlanificacion
            {
             before(grammarAccess.getModelAccess().getPlanificacionesPlanificacionParserRuleCall_9_0()); 
            pushFollow(FOLLOW_rulePlanificacion_in_rule__Model__PlanificacionesAssignment_94783);
            rulePlanificacion();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPlanificacionesPlanificacionParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__Model__PlanificacionesAssignment_9"


    // $ANTLR start "rule__Model__HorariosAssignment_10"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2413:1: rule__Model__HorariosAssignment_10 : ( ruleHorario ) ;
    public final void rule__Model__HorariosAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2417:1: ( ( ruleHorario ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2418:1: ( ruleHorario )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2418:1: ( ruleHorario )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2419:1: ruleHorario
            {
             before(grammarAccess.getModelAccess().getHorariosHorarioParserRuleCall_10_0()); 
            pushFollow(FOLLOW_ruleHorario_in_rule__Model__HorariosAssignment_104814);
            ruleHorario();

            state._fsp--;

             after(grammarAccess.getModelAccess().getHorariosHorarioParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__Model__HorariosAssignment_10"


    // $ANTLR start "rule__Profesor__NombreAssignment_1"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2428:1: rule__Profesor__NombreAssignment_1 : ( RULE_ID ) ;
    public final void rule__Profesor__NombreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2432:1: ( ( RULE_ID ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2433:1: ( RULE_ID )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2433:1: ( RULE_ID )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2434:1: RULE_ID
            {
             before(grammarAccess.getProfesorAccess().getNombreIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Profesor__NombreAssignment_14845); 
             after(grammarAccess.getProfesorAccess().getNombreIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Profesor__NombreAssignment_1"


    // $ANTLR start "rule__Profesor__DedicacionAssignment_3"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2443:1: rule__Profesor__DedicacionAssignment_3 : ( ruleDedicacion ) ;
    public final void rule__Profesor__DedicacionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2447:1: ( ( ruleDedicacion ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2448:1: ( ruleDedicacion )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2448:1: ( ruleDedicacion )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2449:1: ruleDedicacion
            {
             before(grammarAccess.getProfesorAccess().getDedicacionDedicacionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleDedicacion_in_rule__Profesor__DedicacionAssignment_34876);
            ruleDedicacion();

            state._fsp--;

             after(grammarAccess.getProfesorAccess().getDedicacionDedicacionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Profesor__DedicacionAssignment_3"


    // $ANTLR start "rule__Hora__HoraAssignment_1"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2458:1: rule__Hora__HoraAssignment_1 : ( RULE_INT ) ;
    public final void rule__Hora__HoraAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2462:1: ( ( RULE_INT ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2463:1: ( RULE_INT )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2463:1: ( RULE_INT )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2464:1: RULE_INT
            {
             before(grammarAccess.getHoraAccess().getHoraINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Hora__HoraAssignment_14907); 
             after(grammarAccess.getHoraAccess().getHoraINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Hora__HoraAssignment_1"


    // $ANTLR start "rule__Materia__NombreAssignment_1"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2473:1: rule__Materia__NombreAssignment_1 : ( RULE_ID ) ;
    public final void rule__Materia__NombreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2477:1: ( ( RULE_ID ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2478:1: ( RULE_ID )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2478:1: ( RULE_ID )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2479:1: RULE_ID
            {
             before(grammarAccess.getMateriaAccess().getNombreIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Materia__NombreAssignment_14938); 
             after(grammarAccess.getMateriaAccess().getNombreIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Materia__NombreAssignment_1"


    // $ANTLR start "rule__Materia__CargaHorariaAssignment_3"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2488:1: rule__Materia__CargaHorariaAssignment_3 : ( ruleCargaHoraria ) ;
    public final void rule__Materia__CargaHorariaAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2492:1: ( ( ruleCargaHoraria ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2493:1: ( ruleCargaHoraria )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2493:1: ( ruleCargaHoraria )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2494:1: ruleCargaHoraria
            {
             before(grammarAccess.getMateriaAccess().getCargaHorariaCargaHorariaParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleCargaHoraria_in_rule__Materia__CargaHorariaAssignment_34969);
            ruleCargaHoraria();

            state._fsp--;

             after(grammarAccess.getMateriaAccess().getCargaHorariaCargaHorariaParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Materia__CargaHorariaAssignment_3"


    // $ANTLR start "rule__Aula__NombreAssignment_1"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2503:1: rule__Aula__NombreAssignment_1 : ( RULE_ID ) ;
    public final void rule__Aula__NombreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2507:1: ( ( RULE_ID ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2508:1: ( RULE_ID )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2508:1: ( RULE_ID )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2509:1: RULE_ID
            {
             before(grammarAccess.getAulaAccess().getNombreIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Aula__NombreAssignment_15000); 
             after(grammarAccess.getAulaAccess().getNombreIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Aula__NombreAssignment_1"


    // $ANTLR start "rule__CargaHoraria__TipoAssignment_1"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2518:1: rule__CargaHoraria__TipoAssignment_1 : ( RULE_ID ) ;
    public final void rule__CargaHoraria__TipoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2522:1: ( ( RULE_ID ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2523:1: ( RULE_ID )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2523:1: ( RULE_ID )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2524:1: RULE_ID
            {
             before(grammarAccess.getCargaHorariaAccess().getTipoIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CargaHoraria__TipoAssignment_15031); 
             after(grammarAccess.getCargaHorariaAccess().getTipoIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__CargaHoraria__TipoAssignment_1"


    // $ANTLR start "rule__CargaHoraria__DiasAssignment_3"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2533:1: rule__CargaHoraria__DiasAssignment_3 : ( RULE_INT ) ;
    public final void rule__CargaHoraria__DiasAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2537:1: ( ( RULE_INT ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2538:1: ( RULE_INT )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2538:1: ( RULE_INT )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2539:1: RULE_INT
            {
             before(grammarAccess.getCargaHorariaAccess().getDiasINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__CargaHoraria__DiasAssignment_35062); 
             after(grammarAccess.getCargaHorariaAccess().getDiasINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__CargaHoraria__DiasAssignment_3"


    // $ANTLR start "rule__CargaHorariaDocente__NombreAssignment_0"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2548:1: rule__CargaHorariaDocente__NombreAssignment_0 : ( ruleProfesor ) ;
    public final void rule__CargaHorariaDocente__NombreAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2552:1: ( ( ruleProfesor ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2553:1: ( ruleProfesor )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2553:1: ( ruleProfesor )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2554:1: ruleProfesor
            {
             before(grammarAccess.getCargaHorariaDocenteAccess().getNombreProfesorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleProfesor_in_rule__CargaHorariaDocente__NombreAssignment_05093);
            ruleProfesor();

            state._fsp--;

             after(grammarAccess.getCargaHorariaDocenteAccess().getNombreProfesorParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__CargaHorariaDocente__NombreAssignment_0"


    // $ANTLR start "rule__CargaHorariaDocente__TipoAssignment_2"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2563:1: rule__CargaHorariaDocente__TipoAssignment_2 : ( ruleCargaHoraria ) ;
    public final void rule__CargaHorariaDocente__TipoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2567:1: ( ( ruleCargaHoraria ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2568:1: ( ruleCargaHoraria )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2568:1: ( ruleCargaHoraria )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2569:1: ruleCargaHoraria
            {
             before(grammarAccess.getCargaHorariaDocenteAccess().getTipoCargaHorariaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleCargaHoraria_in_rule__CargaHorariaDocente__TipoAssignment_25124);
            ruleCargaHoraria();

            state._fsp--;

             after(grammarAccess.getCargaHorariaDocenteAccess().getTipoCargaHorariaParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__CargaHorariaDocente__TipoAssignment_2"


    // $ANTLR start "rule__Horario__DiaAssignment_0"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2578:1: rule__Horario__DiaAssignment_0 : ( ruleDia ) ;
    public final void rule__Horario__DiaAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2582:1: ( ( ruleDia ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2583:1: ( ruleDia )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2583:1: ( ruleDia )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2584:1: ruleDia
            {
             before(grammarAccess.getHorarioAccess().getDiaDiaParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDia_in_rule__Horario__DiaAssignment_05155);
            ruleDia();

            state._fsp--;

             after(grammarAccess.getHorarioAccess().getDiaDiaParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Horario__DiaAssignment_0"


    // $ANTLR start "rule__Horario__DesdeAssignment_2"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2593:1: rule__Horario__DesdeAssignment_2 : ( ruleHora ) ;
    public final void rule__Horario__DesdeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2597:1: ( ( ruleHora ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2598:1: ( ruleHora )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2598:1: ( ruleHora )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2599:1: ruleHora
            {
             before(grammarAccess.getHorarioAccess().getDesdeHoraParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleHora_in_rule__Horario__DesdeAssignment_25186);
            ruleHora();

            state._fsp--;

             after(grammarAccess.getHorarioAccess().getDesdeHoraParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Horario__DesdeAssignment_2"


    // $ANTLR start "rule__Horario__HastaAssignment_4"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2608:1: rule__Horario__HastaAssignment_4 : ( ruleHora ) ;
    public final void rule__Horario__HastaAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2612:1: ( ( ruleHora ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2613:1: ( ruleHora )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2613:1: ( ruleHora )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2614:1: ruleHora
            {
             before(grammarAccess.getHorarioAccess().getHastaHoraParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleHora_in_rule__Horario__HastaAssignment_45217);
            ruleHora();

            state._fsp--;

             after(grammarAccess.getHorarioAccess().getHastaHoraParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Horario__HastaAssignment_4"


    // $ANTLR start "rule__Horario__MateriaAssignment_6"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2623:1: rule__Horario__MateriaAssignment_6 : ( ruleMateria ) ;
    public final void rule__Horario__MateriaAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2627:1: ( ( ruleMateria ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2628:1: ( ruleMateria )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2628:1: ( ruleMateria )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2629:1: ruleMateria
            {
             before(grammarAccess.getHorarioAccess().getMateriaMateriaParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleMateria_in_rule__Horario__MateriaAssignment_65248);
            ruleMateria();

            state._fsp--;

             after(grammarAccess.getHorarioAccess().getMateriaMateriaParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Horario__MateriaAssignment_6"


    // $ANTLR start "rule__Horario__AulaAssignment_8"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2638:1: rule__Horario__AulaAssignment_8 : ( ruleAula ) ;
    public final void rule__Horario__AulaAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2642:1: ( ( ruleAula ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2643:1: ( ruleAula )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2643:1: ( ruleAula )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2644:1: ruleAula
            {
             before(grammarAccess.getHorarioAccess().getAulaAulaParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleAula_in_rule__Horario__AulaAssignment_85279);
            ruleAula();

            state._fsp--;

             after(grammarAccess.getHorarioAccess().getAulaAulaParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Horario__AulaAssignment_8"


    // $ANTLR start "rule__Semestre__AnhoAssignment_0"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2653:1: rule__Semestre__AnhoAssignment_0 : ( RULE_INT ) ;
    public final void rule__Semestre__AnhoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2657:1: ( ( RULE_INT ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2658:1: ( RULE_INT )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2658:1: ( RULE_INT )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2659:1: RULE_INT
            {
             before(grammarAccess.getSemestreAccess().getAnhoINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Semestre__AnhoAssignment_05310); 
             after(grammarAccess.getSemestreAccess().getAnhoINTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Semestre__AnhoAssignment_0"


    // $ANTLR start "rule__Semestre__NumeroAssignment_2"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2668:1: rule__Semestre__NumeroAssignment_2 : ( RULE_INT ) ;
    public final void rule__Semestre__NumeroAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2672:1: ( ( RULE_INT ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2673:1: ( RULE_INT )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2673:1: ( RULE_INT )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2674:1: RULE_INT
            {
             before(grammarAccess.getSemestreAccess().getNumeroINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Semestre__NumeroAssignment_25341); 
             after(grammarAccess.getSemestreAccess().getNumeroINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Semestre__NumeroAssignment_2"


    // $ANTLR start "rule__Dia__DiaAssignment_1"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2683:1: rule__Dia__DiaAssignment_1 : ( RULE_ID ) ;
    public final void rule__Dia__DiaAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2687:1: ( ( RULE_ID ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2688:1: ( RULE_ID )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2688:1: ( RULE_ID )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2689:1: RULE_ID
            {
             before(grammarAccess.getDiaAccess().getDiaIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Dia__DiaAssignment_15372); 
             after(grammarAccess.getDiaAccess().getDiaIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Dia__DiaAssignment_1"


    // $ANTLR start "rule__Horarios__HorariosAssignment_1"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2698:1: rule__Horarios__HorariosAssignment_1 : ( ruleHorario ) ;
    public final void rule__Horarios__HorariosAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2702:1: ( ( ruleHorario ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2703:1: ( ruleHorario )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2703:1: ( ruleHorario )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2704:1: ruleHorario
            {
             before(grammarAccess.getHorariosAccess().getHorariosHorarioParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleHorario_in_rule__Horarios__HorariosAssignment_15403);
            ruleHorario();

            state._fsp--;

             after(grammarAccess.getHorariosAccess().getHorariosHorarioParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Horarios__HorariosAssignment_1"


    // $ANTLR start "rule__Planificacion__SemestreAssignment_1"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2713:1: rule__Planificacion__SemestreAssignment_1 : ( ruleSemestre ) ;
    public final void rule__Planificacion__SemestreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2717:1: ( ( ruleSemestre ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2718:1: ( ruleSemestre )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2718:1: ( ruleSemestre )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2719:1: ruleSemestre
            {
             before(grammarAccess.getPlanificacionAccess().getSemestreSemestreParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSemestre_in_rule__Planificacion__SemestreAssignment_15434);
            ruleSemestre();

            state._fsp--;

             after(grammarAccess.getPlanificacionAccess().getSemestreSemestreParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Planificacion__SemestreAssignment_1"


    // $ANTLR start "rule__Planificacion__MateriasAssignment_4"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2728:1: rule__Planificacion__MateriasAssignment_4 : ( ruleMateria ) ;
    public final void rule__Planificacion__MateriasAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2732:1: ( ( ruleMateria ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2733:1: ( ruleMateria )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2733:1: ( ruleMateria )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2734:1: ruleMateria
            {
             before(grammarAccess.getPlanificacionAccess().getMateriasMateriaParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleMateria_in_rule__Planificacion__MateriasAssignment_45465);
            ruleMateria();

            state._fsp--;

             after(grammarAccess.getPlanificacionAccess().getMateriasMateriaParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Planificacion__MateriasAssignment_4"


    // $ANTLR start "rule__Planificacion__HorariosAssignment_5"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2743:1: rule__Planificacion__HorariosAssignment_5 : ( ruleHorarios ) ;
    public final void rule__Planificacion__HorariosAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2747:1: ( ( ruleHorarios ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2748:1: ( ruleHorarios )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2748:1: ( ruleHorarios )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2749:1: ruleHorarios
            {
             before(grammarAccess.getPlanificacionAccess().getHorariosHorariosParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleHorarios_in_rule__Planificacion__HorariosAssignment_55496);
            ruleHorarios();

            state._fsp--;

             after(grammarAccess.getPlanificacionAccess().getHorariosHorariosParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Planificacion__HorariosAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProfesor_in_entryRuleProfesor121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProfesor128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Profesor__Group__0_in_ruleProfesor154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHora_in_entryRuleHora181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHora188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hora__Group__0_in_ruleHora214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDedicacion_in_entryRuleDedicacion241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDedicacion248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dedicacion__Alternatives_in_ruleDedicacion274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSIMPLE_in_entryRuleSIMPLE301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSIMPLE308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleSIMPLE335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSEMI_in_entryRuleSEMI363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSEMI370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleSEMI397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXCLUSIVA_in_entryRuleEXCLUSIVA425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEXCLUSIVA432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleEXCLUSIVA459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMateria_in_entryRuleMateria487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMateria494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Materia__Group__0_in_ruleMateria520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAula_in_entryRuleAula547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAula554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aula__Group__0_in_ruleAula580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCargaHoraria_in_entryRuleCargaHoraria607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCargaHoraria614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CargaHoraria__Group__0_in_ruleCargaHoraria640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCargaHorariaDocente_in_entryRuleCargaHorariaDocente667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCargaHorariaDocente674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CargaHorariaDocente__Group__0_in_ruleCargaHorariaDocente700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHorario_in_entryRuleHorario727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHorario734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Horario__Group__0_in_ruleHorario760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSemestre_in_entryRuleSemestre787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSemestre794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Semestre__Group__0_in_ruleSemestre820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDia_in_entryRuleDia847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDia854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dia__Group__0_in_ruleDia880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHorarios_in_entryRuleHorarios907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHorarios914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Horarios__Group__0_in_ruleHorarios940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlanificacion_in_entryRulePlanificacion967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlanificacion974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Planificacion__Group__0_in_rulePlanificacion1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSIMPLE_in_rule__Dedicacion__Alternatives1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSEMI_in_rule__Dedicacion__Alternatives1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXCLUSIVA_in_rule__Dedicacion__Alternatives1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01100 = new BitSet(new long[]{0x00000000B01B4020L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ProfesorsAssignment_0_in_rule__Model__Group__0__Impl1130 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11161 = new BitSet(new long[]{0x00000000B01B4020L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__HorasAssignment_1_in_rule__Model__Group__1__Impl1191 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21222 = new BitSet(new long[]{0x00000000B01B4020L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__MateriasAssignment_2_in_rule__Model__Group__2__Impl1252 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31283 = new BitSet(new long[]{0x00000000B01B4020L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__AulasAssignment_3_in_rule__Model__Group__3__Impl1313 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41344 = new BitSet(new long[]{0x00000000B01B4020L});
    public static final BitSet FOLLOW_rule__Model__Group__5_in_rule__Model__Group__41347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__CargasHorariasAssignment_4_in_rule__Model__Group__4__Impl1374 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__51405 = new BitSet(new long[]{0x00000000B01B4020L});
    public static final BitSet FOLLOW_rule__Model__Group__6_in_rule__Model__Group__51408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__CargasHorariasDocentesAssignment_5_in_rule__Model__Group__5__Impl1435 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__61466 = new BitSet(new long[]{0x00000000B01B4020L});
    public static final BitSet FOLLOW_rule__Model__Group__7_in_rule__Model__Group__61469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__HorariosAssignment_6_in_rule__Model__Group__6__Impl1496 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Model__Group__7__Impl_in_rule__Model__Group__71527 = new BitSet(new long[]{0x00000000B01B4020L});
    public static final BitSet FOLLOW_rule__Model__Group__8_in_rule__Model__Group__71530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DiasAssignment_7_in_rule__Model__Group__7__Impl1557 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__Model__Group__8__Impl_in_rule__Model__Group__81588 = new BitSet(new long[]{0x00000000B01B4020L});
    public static final BitSet FOLLOW_rule__Model__Group__9_in_rule__Model__Group__81591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__SemestreAssignment_8_in_rule__Model__Group__8__Impl1618 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Model__Group__9__Impl_in_rule__Model__Group__91649 = new BitSet(new long[]{0x00000000B01B4020L});
    public static final BitSet FOLLOW_rule__Model__Group__10_in_rule__Model__Group__91652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PlanificacionesAssignment_9_in_rule__Model__Group__9__Impl1679 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Model__Group__10__Impl_in_rule__Model__Group__101710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__HorariosAssignment_10_in_rule__Model__Group__10__Impl1737 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__Profesor__Group__0__Impl_in_rule__Profesor__Group__01790 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Profesor__Group__1_in_rule__Profesor__Group__01793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Profesor__Group__0__Impl1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Profesor__Group__1__Impl_in_rule__Profesor__Group__11852 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Profesor__Group__2_in_rule__Profesor__Group__11855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Profesor__NombreAssignment_1_in_rule__Profesor__Group__1__Impl1882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Profesor__Group__2__Impl_in_rule__Profesor__Group__21912 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_rule__Profesor__Group__3_in_rule__Profesor__Group__21915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Profesor__Group__2__Impl1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Profesor__Group__3__Impl_in_rule__Profesor__Group__31974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Profesor__DedicacionAssignment_3_in_rule__Profesor__Group__3__Impl2001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hora__Group__0__Impl_in_rule__Hora__Group__02039 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Hora__Group__1_in_rule__Hora__Group__02042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Hora__Group__0__Impl2070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hora__Group__1__Impl_in_rule__Hora__Group__12101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hora__HoraAssignment_1_in_rule__Hora__Group__1__Impl2128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Materia__Group__0__Impl_in_rule__Materia__Group__02162 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Materia__Group__1_in_rule__Materia__Group__02165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Materia__Group__0__Impl2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Materia__Group__1__Impl_in_rule__Materia__Group__12224 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Materia__Group__2_in_rule__Materia__Group__12227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Materia__NombreAssignment_1_in_rule__Materia__Group__1__Impl2254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Materia__Group__2__Impl_in_rule__Materia__Group__22284 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Materia__Group__3_in_rule__Materia__Group__22287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Materia__Group__2__Impl2315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Materia__Group__3__Impl_in_rule__Materia__Group__32346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Materia__CargaHorariaAssignment_3_in_rule__Materia__Group__3__Impl2373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aula__Group__0__Impl_in_rule__Aula__Group__02411 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Aula__Group__1_in_rule__Aula__Group__02414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Aula__Group__0__Impl2442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aula__Group__1__Impl_in_rule__Aula__Group__12473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aula__NombreAssignment_1_in_rule__Aula__Group__1__Impl2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CargaHoraria__Group__0__Impl_in_rule__CargaHoraria__Group__02534 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CargaHoraria__Group__1_in_rule__CargaHoraria__Group__02537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__CargaHoraria__Group__0__Impl2565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CargaHoraria__Group__1__Impl_in_rule__CargaHoraria__Group__12596 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__CargaHoraria__Group__2_in_rule__CargaHoraria__Group__12599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CargaHoraria__TipoAssignment_1_in_rule__CargaHoraria__Group__1__Impl2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CargaHoraria__Group__2__Impl_in_rule__CargaHoraria__Group__22656 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CargaHoraria__Group__3_in_rule__CargaHoraria__Group__22659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__CargaHoraria__Group__2__Impl2687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CargaHoraria__Group__3__Impl_in_rule__CargaHoraria__Group__32718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CargaHoraria__DiasAssignment_3_in_rule__CargaHoraria__Group__3__Impl2745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CargaHorariaDocente__Group__0__Impl_in_rule__CargaHorariaDocente__Group__02783 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__CargaHorariaDocente__Group__1_in_rule__CargaHorariaDocente__Group__02786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CargaHorariaDocente__NombreAssignment_0_in_rule__CargaHorariaDocente__Group__0__Impl2813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CargaHorariaDocente__Group__1__Impl_in_rule__CargaHorariaDocente__Group__12843 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__CargaHorariaDocente__Group__2_in_rule__CargaHorariaDocente__Group__12846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__CargaHorariaDocente__Group__1__Impl2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CargaHorariaDocente__Group__2__Impl_in_rule__CargaHorariaDocente__Group__22905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CargaHorariaDocente__TipoAssignment_2_in_rule__CargaHorariaDocente__Group__2__Impl2932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Horario__Group__0__Impl_in_rule__Horario__Group__02968 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Horario__Group__1_in_rule__Horario__Group__02971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Horario__DiaAssignment_0_in_rule__Horario__Group__0__Impl2998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Horario__Group__1__Impl_in_rule__Horario__Group__13028 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Horario__Group__2_in_rule__Horario__Group__13031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Horario__Group__1__Impl3059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Horario__Group__2__Impl_in_rule__Horario__Group__23090 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Horario__Group__3_in_rule__Horario__Group__23093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Horario__DesdeAssignment_2_in_rule__Horario__Group__2__Impl3120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Horario__Group__3__Impl_in_rule__Horario__Group__33150 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Horario__Group__4_in_rule__Horario__Group__33153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Horario__Group__3__Impl3181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Horario__Group__4__Impl_in_rule__Horario__Group__43212 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Horario__Group__5_in_rule__Horario__Group__43215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Horario__HastaAssignment_4_in_rule__Horario__Group__4__Impl3242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Horario__Group__5__Impl_in_rule__Horario__Group__53272 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Horario__Group__6_in_rule__Horario__Group__53275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Horario__Group__5__Impl3303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Horario__Group__6__Impl_in_rule__Horario__Group__63334 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Horario__Group__7_in_rule__Horario__Group__63337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Horario__MateriaAssignment_6_in_rule__Horario__Group__6__Impl3364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Horario__Group__7__Impl_in_rule__Horario__Group__73394 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Horario__Group__8_in_rule__Horario__Group__73397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Horario__Group__7__Impl3425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Horario__Group__8__Impl_in_rule__Horario__Group__83456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Horario__AulaAssignment_8_in_rule__Horario__Group__8__Impl3483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Semestre__Group__0__Impl_in_rule__Semestre__Group__03531 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Semestre__Group__1_in_rule__Semestre__Group__03534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Semestre__AnhoAssignment_0_in_rule__Semestre__Group__0__Impl3561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Semestre__Group__1__Impl_in_rule__Semestre__Group__13591 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Semestre__Group__2_in_rule__Semestre__Group__13594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Semestre__Group__1__Impl3622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Semestre__Group__2__Impl_in_rule__Semestre__Group__23653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Semestre__NumeroAssignment_2_in_rule__Semestre__Group__2__Impl3680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dia__Group__0__Impl_in_rule__Dia__Group__03716 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Dia__Group__1_in_rule__Dia__Group__03719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Dia__Group__0__Impl3747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dia__Group__1__Impl_in_rule__Dia__Group__13778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dia__DiaAssignment_1_in_rule__Dia__Group__1__Impl3805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Horarios__Group__0__Impl_in_rule__Horarios__Group__03839 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Horarios__Group__1_in_rule__Horarios__Group__03842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Horarios__Group__0__Impl3870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Horarios__Group__1__Impl_in_rule__Horarios__Group__13901 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Horarios__Group__2_in_rule__Horarios__Group__13904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Horarios__HorariosAssignment_1_in_rule__Horarios__Group__1__Impl3933 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__Horarios__HorariosAssignment_1_in_rule__Horarios__Group__1__Impl3945 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__Horarios__Group__2__Impl_in_rule__Horarios__Group__23978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Horarios__Group__2__Impl4006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Planificacion__Group__0__Impl_in_rule__Planificacion__Group__04043 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Planificacion__Group__1_in_rule__Planificacion__Group__04046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Planificacion__Group__0__Impl4074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Planificacion__Group__1__Impl_in_rule__Planificacion__Group__14105 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Planificacion__Group__2_in_rule__Planificacion__Group__14108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Planificacion__SemestreAssignment_1_in_rule__Planificacion__Group__1__Impl4135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Planificacion__Group__2__Impl_in_rule__Planificacion__Group__24165 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Planificacion__Group__3_in_rule__Planificacion__Group__24168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Planificacion__Group__2__Impl4196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Planificacion__Group__3__Impl_in_rule__Planificacion__Group__34227 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Planificacion__Group__4_in_rule__Planificacion__Group__34230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Planificacion__Group__3__Impl4258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Planificacion__Group__4__Impl_in_rule__Planificacion__Group__44289 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Planificacion__Group__5_in_rule__Planificacion__Group__44292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Planificacion__MateriasAssignment_4_in_rule__Planificacion__Group__4__Impl4321 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Planificacion__MateriasAssignment_4_in_rule__Planificacion__Group__4__Impl4333 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Planificacion__Group__5__Impl_in_rule__Planificacion__Group__54366 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Planificacion__Group__6_in_rule__Planificacion__Group__54369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Planificacion__HorariosAssignment_5_in_rule__Planificacion__Group__5__Impl4396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Planificacion__Group__6__Impl_in_rule__Planificacion__Group__64426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Planificacion__Group__6__Impl4454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProfesor_in_rule__Model__ProfesorsAssignment_04504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHora_in_rule__Model__HorasAssignment_14535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMateria_in_rule__Model__MateriasAssignment_24566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAula_in_rule__Model__AulasAssignment_34597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCargaHoraria_in_rule__Model__CargasHorariasAssignment_44628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCargaHorariaDocente_in_rule__Model__CargasHorariasDocentesAssignment_54659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHorarios_in_rule__Model__HorariosAssignment_64690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDia_in_rule__Model__DiasAssignment_74721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSemestre_in_rule__Model__SemestreAssignment_84752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlanificacion_in_rule__Model__PlanificacionesAssignment_94783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHorario_in_rule__Model__HorariosAssignment_104814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Profesor__NombreAssignment_14845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDedicacion_in_rule__Profesor__DedicacionAssignment_34876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Hora__HoraAssignment_14907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Materia__NombreAssignment_14938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCargaHoraria_in_rule__Materia__CargaHorariaAssignment_34969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Aula__NombreAssignment_15000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CargaHoraria__TipoAssignment_15031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__CargaHoraria__DiasAssignment_35062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProfesor_in_rule__CargaHorariaDocente__NombreAssignment_05093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCargaHoraria_in_rule__CargaHorariaDocente__TipoAssignment_25124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDia_in_rule__Horario__DiaAssignment_05155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHora_in_rule__Horario__DesdeAssignment_25186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHora_in_rule__Horario__HastaAssignment_45217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMateria_in_rule__Horario__MateriaAssignment_65248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAula_in_rule__Horario__AulaAssignment_85279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Semestre__AnhoAssignment_05310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Semestre__NumeroAssignment_25341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Dia__DiaAssignment_15372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHorario_in_rule__Horarios__HorariosAssignment_15403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSemestre_in_rule__Planificacion__SemestreAssignment_15434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMateria_in_rule__Planificacion__MateriasAssignment_45465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHorarios_in_rule__Planificacion__HorariosAssignment_55496 = new BitSet(new long[]{0x0000000000000002L});

}