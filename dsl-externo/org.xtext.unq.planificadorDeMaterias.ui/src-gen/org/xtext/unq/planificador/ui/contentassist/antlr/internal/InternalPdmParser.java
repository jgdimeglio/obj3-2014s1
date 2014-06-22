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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'profesor'", "'hora'", "'materia'", "'aula'", "'cargaHoraria'", "'tiene'", "':'", "'a'", "'hs se dicta'", "'en'", "'semestre'", "'dia'", "'horarios {'", "'}'", "'planificacion'", "'{'", "'a dictar:'"
    };
    public static final int RULE_ID=4;
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
    public static final int T__19=19;
    public static final int RULE_STRING=6;
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


    // $ANTLR start "entryRuleMateria"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:144:1: entryRuleMateria : ruleMateria EOF ;
    public final void entryRuleMateria() throws RecognitionException {
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:145:1: ( ruleMateria EOF )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:146:1: ruleMateria EOF
            {
             before(grammarAccess.getMateriaRule()); 
            pushFollow(FOLLOW_ruleMateria_in_entryRuleMateria241);
            ruleMateria();

            state._fsp--;

             after(grammarAccess.getMateriaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMateria248); 

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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:153:1: ruleMateria : ( ( rule__Materia__Group__0 ) ) ;
    public final void ruleMateria() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:157:2: ( ( ( rule__Materia__Group__0 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:158:1: ( ( rule__Materia__Group__0 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:158:1: ( ( rule__Materia__Group__0 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:159:1: ( rule__Materia__Group__0 )
            {
             before(grammarAccess.getMateriaAccess().getGroup()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:160:1: ( rule__Materia__Group__0 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:160:2: rule__Materia__Group__0
            {
            pushFollow(FOLLOW_rule__Materia__Group__0_in_ruleMateria274);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:172:1: entryRuleAula : ruleAula EOF ;
    public final void entryRuleAula() throws RecognitionException {
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:173:1: ( ruleAula EOF )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:174:1: ruleAula EOF
            {
             before(grammarAccess.getAulaRule()); 
            pushFollow(FOLLOW_ruleAula_in_entryRuleAula301);
            ruleAula();

            state._fsp--;

             after(grammarAccess.getAulaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAula308); 

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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:181:1: ruleAula : ( ( rule__Aula__Group__0 ) ) ;
    public final void ruleAula() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:185:2: ( ( ( rule__Aula__Group__0 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:186:1: ( ( rule__Aula__Group__0 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:186:1: ( ( rule__Aula__Group__0 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:187:1: ( rule__Aula__Group__0 )
            {
             before(grammarAccess.getAulaAccess().getGroup()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:188:1: ( rule__Aula__Group__0 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:188:2: rule__Aula__Group__0
            {
            pushFollow(FOLLOW_rule__Aula__Group__0_in_ruleAula334);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:200:1: entryRuleCargaHoraria : ruleCargaHoraria EOF ;
    public final void entryRuleCargaHoraria() throws RecognitionException {
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:201:1: ( ruleCargaHoraria EOF )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:202:1: ruleCargaHoraria EOF
            {
             before(grammarAccess.getCargaHorariaRule()); 
            pushFollow(FOLLOW_ruleCargaHoraria_in_entryRuleCargaHoraria361);
            ruleCargaHoraria();

            state._fsp--;

             after(grammarAccess.getCargaHorariaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCargaHoraria368); 

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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:209:1: ruleCargaHoraria : ( ( rule__CargaHoraria__Group__0 ) ) ;
    public final void ruleCargaHoraria() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:213:2: ( ( ( rule__CargaHoraria__Group__0 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:214:1: ( ( rule__CargaHoraria__Group__0 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:214:1: ( ( rule__CargaHoraria__Group__0 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:215:1: ( rule__CargaHoraria__Group__0 )
            {
             before(grammarAccess.getCargaHorariaAccess().getGroup()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:216:1: ( rule__CargaHoraria__Group__0 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:216:2: rule__CargaHoraria__Group__0
            {
            pushFollow(FOLLOW_rule__CargaHoraria__Group__0_in_ruleCargaHoraria394);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:228:1: entryRuleCargaHorariaDocente : ruleCargaHorariaDocente EOF ;
    public final void entryRuleCargaHorariaDocente() throws RecognitionException {
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:229:1: ( ruleCargaHorariaDocente EOF )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:230:1: ruleCargaHorariaDocente EOF
            {
             before(grammarAccess.getCargaHorariaDocenteRule()); 
            pushFollow(FOLLOW_ruleCargaHorariaDocente_in_entryRuleCargaHorariaDocente421);
            ruleCargaHorariaDocente();

            state._fsp--;

             after(grammarAccess.getCargaHorariaDocenteRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCargaHorariaDocente428); 

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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:237:1: ruleCargaHorariaDocente : ( ( rule__CargaHorariaDocente__Group__0 ) ) ;
    public final void ruleCargaHorariaDocente() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:241:2: ( ( ( rule__CargaHorariaDocente__Group__0 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:242:1: ( ( rule__CargaHorariaDocente__Group__0 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:242:1: ( ( rule__CargaHorariaDocente__Group__0 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:243:1: ( rule__CargaHorariaDocente__Group__0 )
            {
             before(grammarAccess.getCargaHorariaDocenteAccess().getGroup()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:244:1: ( rule__CargaHorariaDocente__Group__0 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:244:2: rule__CargaHorariaDocente__Group__0
            {
            pushFollow(FOLLOW_rule__CargaHorariaDocente__Group__0_in_ruleCargaHorariaDocente454);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:256:1: entryRuleHorario : ruleHorario EOF ;
    public final void entryRuleHorario() throws RecognitionException {
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:257:1: ( ruleHorario EOF )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:258:1: ruleHorario EOF
            {
             before(grammarAccess.getHorarioRule()); 
            pushFollow(FOLLOW_ruleHorario_in_entryRuleHorario481);
            ruleHorario();

            state._fsp--;

             after(grammarAccess.getHorarioRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHorario488); 

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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:265:1: ruleHorario : ( ( rule__Horario__Group__0 ) ) ;
    public final void ruleHorario() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:269:2: ( ( ( rule__Horario__Group__0 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:270:1: ( ( rule__Horario__Group__0 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:270:1: ( ( rule__Horario__Group__0 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:271:1: ( rule__Horario__Group__0 )
            {
             before(grammarAccess.getHorarioAccess().getGroup()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:272:1: ( rule__Horario__Group__0 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:272:2: rule__Horario__Group__0
            {
            pushFollow(FOLLOW_rule__Horario__Group__0_in_ruleHorario514);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:284:1: entryRuleSemestre : ruleSemestre EOF ;
    public final void entryRuleSemestre() throws RecognitionException {
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:285:1: ( ruleSemestre EOF )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:286:1: ruleSemestre EOF
            {
             before(grammarAccess.getSemestreRule()); 
            pushFollow(FOLLOW_ruleSemestre_in_entryRuleSemestre541);
            ruleSemestre();

            state._fsp--;

             after(grammarAccess.getSemestreRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSemestre548); 

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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:293:1: ruleSemestre : ( ( rule__Semestre__Group__0 ) ) ;
    public final void ruleSemestre() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:297:2: ( ( ( rule__Semestre__Group__0 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:298:1: ( ( rule__Semestre__Group__0 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:298:1: ( ( rule__Semestre__Group__0 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:299:1: ( rule__Semestre__Group__0 )
            {
             before(grammarAccess.getSemestreAccess().getGroup()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:300:1: ( rule__Semestre__Group__0 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:300:2: rule__Semestre__Group__0
            {
            pushFollow(FOLLOW_rule__Semestre__Group__0_in_ruleSemestre574);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:312:1: entryRuleDia : ruleDia EOF ;
    public final void entryRuleDia() throws RecognitionException {
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:313:1: ( ruleDia EOF )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:314:1: ruleDia EOF
            {
             before(grammarAccess.getDiaRule()); 
            pushFollow(FOLLOW_ruleDia_in_entryRuleDia601);
            ruleDia();

            state._fsp--;

             after(grammarAccess.getDiaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDia608); 

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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:321:1: ruleDia : ( ( rule__Dia__Group__0 ) ) ;
    public final void ruleDia() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:325:2: ( ( ( rule__Dia__Group__0 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:326:1: ( ( rule__Dia__Group__0 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:326:1: ( ( rule__Dia__Group__0 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:327:1: ( rule__Dia__Group__0 )
            {
             before(grammarAccess.getDiaAccess().getGroup()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:328:1: ( rule__Dia__Group__0 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:328:2: rule__Dia__Group__0
            {
            pushFollow(FOLLOW_rule__Dia__Group__0_in_ruleDia634);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:340:1: entryRuleHorarios : ruleHorarios EOF ;
    public final void entryRuleHorarios() throws RecognitionException {
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:341:1: ( ruleHorarios EOF )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:342:1: ruleHorarios EOF
            {
             before(grammarAccess.getHorariosRule()); 
            pushFollow(FOLLOW_ruleHorarios_in_entryRuleHorarios661);
            ruleHorarios();

            state._fsp--;

             after(grammarAccess.getHorariosRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHorarios668); 

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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:349:1: ruleHorarios : ( ( rule__Horarios__Group__0 ) ) ;
    public final void ruleHorarios() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:353:2: ( ( ( rule__Horarios__Group__0 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:354:1: ( ( rule__Horarios__Group__0 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:354:1: ( ( rule__Horarios__Group__0 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:355:1: ( rule__Horarios__Group__0 )
            {
             before(grammarAccess.getHorariosAccess().getGroup()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:356:1: ( rule__Horarios__Group__0 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:356:2: rule__Horarios__Group__0
            {
            pushFollow(FOLLOW_rule__Horarios__Group__0_in_ruleHorarios694);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:368:1: entryRulePlanificacion : rulePlanificacion EOF ;
    public final void entryRulePlanificacion() throws RecognitionException {
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:369:1: ( rulePlanificacion EOF )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:370:1: rulePlanificacion EOF
            {
             before(grammarAccess.getPlanificacionRule()); 
            pushFollow(FOLLOW_rulePlanificacion_in_entryRulePlanificacion721);
            rulePlanificacion();

            state._fsp--;

             after(grammarAccess.getPlanificacionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlanificacion728); 

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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:377:1: rulePlanificacion : ( ( rule__Planificacion__Group__0 ) ) ;
    public final void rulePlanificacion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:381:2: ( ( ( rule__Planificacion__Group__0 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:382:1: ( ( rule__Planificacion__Group__0 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:382:1: ( ( rule__Planificacion__Group__0 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:383:1: ( rule__Planificacion__Group__0 )
            {
             before(grammarAccess.getPlanificacionAccess().getGroup()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:384:1: ( rule__Planificacion__Group__0 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:384:2: rule__Planificacion__Group__0
            {
            pushFollow(FOLLOW_rule__Planificacion__Group__0_in_rulePlanificacion754);
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


    // $ANTLR start "rule__Model__Group__0"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:398:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:402:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:403:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0788);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0791);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:410:1: rule__Model__Group__0__Impl : ( ( rule__Model__ProfesorsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:414:1: ( ( ( rule__Model__ProfesorsAssignment_0 )* ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:415:1: ( ( rule__Model__ProfesorsAssignment_0 )* )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:415:1: ( ( rule__Model__ProfesorsAssignment_0 )* )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:416:1: ( rule__Model__ProfesorsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getProfesorsAssignment_0()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:417:1: ( rule__Model__ProfesorsAssignment_0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    int LA1_2 = input.LA(2);

                    if ( (LA1_2==RULE_ID) ) {
                        int LA1_3 = input.LA(3);

                        if ( (LA1_3==EOF||LA1_3==RULE_INT||(LA1_3>=11 && LA1_3<=15)||(LA1_3>=22 && LA1_3<=23)||LA1_3==25) ) {
                            alt1=1;
                        }


                    }


                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:417:2: rule__Model__ProfesorsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Model__ProfesorsAssignment_0_in_rule__Model__Group__0__Impl818);
            	    rule__Model__ProfesorsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:427:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:431:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:432:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1849);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1852);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:439:1: rule__Model__Group__1__Impl : ( ( rule__Model__HorasAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:443:1: ( ( ( rule__Model__HorasAssignment_1 )* ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:444:1: ( ( rule__Model__HorasAssignment_1 )* )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:444:1: ( ( rule__Model__HorasAssignment_1 )* )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:445:1: ( rule__Model__HorasAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getHorasAssignment_1()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:446:1: ( rule__Model__HorasAssignment_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:446:2: rule__Model__HorasAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__HorasAssignment_1_in_rule__Model__Group__1__Impl879);
            	    rule__Model__HorasAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:456:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:460:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:461:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2910);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2913);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:468:1: rule__Model__Group__2__Impl : ( ( rule__Model__MateriasAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:472:1: ( ( ( rule__Model__MateriasAssignment_2 )* ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:473:1: ( ( rule__Model__MateriasAssignment_2 )* )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:473:1: ( ( rule__Model__MateriasAssignment_2 )* )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:474:1: ( rule__Model__MateriasAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getMateriasAssignment_2()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:475:1: ( rule__Model__MateriasAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:475:2: rule__Model__MateriasAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__MateriasAssignment_2_in_rule__Model__Group__2__Impl940);
            	    rule__Model__MateriasAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:485:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:489:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:490:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3971);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__3974);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:497:1: rule__Model__Group__3__Impl : ( ( rule__Model__AulasAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:501:1: ( ( ( rule__Model__AulasAssignment_3 )* ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:502:1: ( ( rule__Model__AulasAssignment_3 )* )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:502:1: ( ( rule__Model__AulasAssignment_3 )* )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:503:1: ( rule__Model__AulasAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getAulasAssignment_3()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:504:1: ( rule__Model__AulasAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:504:2: rule__Model__AulasAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Model__AulasAssignment_3_in_rule__Model__Group__3__Impl1001);
            	    rule__Model__AulasAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:514:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:518:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:519:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41032);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__5_in_rule__Model__Group__41035);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:526:1: rule__Model__Group__4__Impl : ( ( rule__Model__CargasHorariasAssignment_4 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:530:1: ( ( ( rule__Model__CargasHorariasAssignment_4 )* ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:531:1: ( ( rule__Model__CargasHorariasAssignment_4 )* )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:531:1: ( ( rule__Model__CargasHorariasAssignment_4 )* )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:532:1: ( rule__Model__CargasHorariasAssignment_4 )*
            {
             before(grammarAccess.getModelAccess().getCargasHorariasAssignment_4()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:533:1: ( rule__Model__CargasHorariasAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:533:2: rule__Model__CargasHorariasAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Model__CargasHorariasAssignment_4_in_rule__Model__Group__4__Impl1062);
            	    rule__Model__CargasHorariasAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:543:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:547:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:548:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__51093);
            rule__Model__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__6_in_rule__Model__Group__51096);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:555:1: rule__Model__Group__5__Impl : ( ( rule__Model__CargasHorariasDocentesAssignment_5 )* ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:559:1: ( ( ( rule__Model__CargasHorariasDocentesAssignment_5 )* ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:560:1: ( ( rule__Model__CargasHorariasDocentesAssignment_5 )* )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:560:1: ( ( rule__Model__CargasHorariasDocentesAssignment_5 )* )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:561:1: ( rule__Model__CargasHorariasDocentesAssignment_5 )*
            {
             before(grammarAccess.getModelAccess().getCargasHorariasDocentesAssignment_5()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:562:1: ( rule__Model__CargasHorariasDocentesAssignment_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==11) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:562:2: rule__Model__CargasHorariasDocentesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Model__CargasHorariasDocentesAssignment_5_in_rule__Model__Group__5__Impl1123);
            	    rule__Model__CargasHorariasDocentesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:572:1: rule__Model__Group__6 : rule__Model__Group__6__Impl rule__Model__Group__7 ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:576:1: ( rule__Model__Group__6__Impl rule__Model__Group__7 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:577:2: rule__Model__Group__6__Impl rule__Model__Group__7
            {
            pushFollow(FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__61154);
            rule__Model__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__7_in_rule__Model__Group__61157);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:584:1: rule__Model__Group__6__Impl : ( ( rule__Model__HorariosAssignment_6 )* ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:588:1: ( ( ( rule__Model__HorariosAssignment_6 )* ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:589:1: ( ( rule__Model__HorariosAssignment_6 )* )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:589:1: ( ( rule__Model__HorariosAssignment_6 )* )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:590:1: ( rule__Model__HorariosAssignment_6 )*
            {
             before(grammarAccess.getModelAccess().getHorariosAssignment_6()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:591:1: ( rule__Model__HorariosAssignment_6 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:591:2: rule__Model__HorariosAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Model__HorariosAssignment_6_in_rule__Model__Group__6__Impl1184);
            	    rule__Model__HorariosAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:601:1: rule__Model__Group__7 : rule__Model__Group__7__Impl rule__Model__Group__8 ;
    public final void rule__Model__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:605:1: ( rule__Model__Group__7__Impl rule__Model__Group__8 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:606:2: rule__Model__Group__7__Impl rule__Model__Group__8
            {
            pushFollow(FOLLOW_rule__Model__Group__7__Impl_in_rule__Model__Group__71215);
            rule__Model__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__8_in_rule__Model__Group__71218);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:613:1: rule__Model__Group__7__Impl : ( ( rule__Model__DiasAssignment_7 )* ) ;
    public final void rule__Model__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:617:1: ( ( ( rule__Model__DiasAssignment_7 )* ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:618:1: ( ( rule__Model__DiasAssignment_7 )* )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:618:1: ( ( rule__Model__DiasAssignment_7 )* )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:619:1: ( rule__Model__DiasAssignment_7 )*
            {
             before(grammarAccess.getModelAccess().getDiasAssignment_7()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:620:1: ( rule__Model__DiasAssignment_7 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    int LA8_2 = input.LA(2);

                    if ( (LA8_2==RULE_ID) ) {
                        int LA8_3 = input.LA(3);

                        if ( (LA8_3==EOF||LA8_3==RULE_INT||LA8_3==22||LA8_3==25) ) {
                            alt8=1;
                        }


                    }


                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:620:2: rule__Model__DiasAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Model__DiasAssignment_7_in_rule__Model__Group__7__Impl1245);
            	    rule__Model__DiasAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:630:1: rule__Model__Group__8 : rule__Model__Group__8__Impl rule__Model__Group__9 ;
    public final void rule__Model__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:634:1: ( rule__Model__Group__8__Impl rule__Model__Group__9 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:635:2: rule__Model__Group__8__Impl rule__Model__Group__9
            {
            pushFollow(FOLLOW_rule__Model__Group__8__Impl_in_rule__Model__Group__81276);
            rule__Model__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__9_in_rule__Model__Group__81279);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:642:1: rule__Model__Group__8__Impl : ( ( rule__Model__SemestreAssignment_8 )* ) ;
    public final void rule__Model__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:646:1: ( ( ( rule__Model__SemestreAssignment_8 )* ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:647:1: ( ( rule__Model__SemestreAssignment_8 )* )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:647:1: ( ( rule__Model__SemestreAssignment_8 )* )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:648:1: ( rule__Model__SemestreAssignment_8 )*
            {
             before(grammarAccess.getModelAccess().getSemestreAssignment_8()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:649:1: ( rule__Model__SemestreAssignment_8 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_INT) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:649:2: rule__Model__SemestreAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__Model__SemestreAssignment_8_in_rule__Model__Group__8__Impl1306);
            	    rule__Model__SemestreAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:659:1: rule__Model__Group__9 : rule__Model__Group__9__Impl rule__Model__Group__10 ;
    public final void rule__Model__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:663:1: ( rule__Model__Group__9__Impl rule__Model__Group__10 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:664:2: rule__Model__Group__9__Impl rule__Model__Group__10
            {
            pushFollow(FOLLOW_rule__Model__Group__9__Impl_in_rule__Model__Group__91337);
            rule__Model__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__10_in_rule__Model__Group__91340);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:671:1: rule__Model__Group__9__Impl : ( ( rule__Model__PlanificacionesAssignment_9 )* ) ;
    public final void rule__Model__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:675:1: ( ( ( rule__Model__PlanificacionesAssignment_9 )* ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:676:1: ( ( rule__Model__PlanificacionesAssignment_9 )* )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:676:1: ( ( rule__Model__PlanificacionesAssignment_9 )* )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:677:1: ( rule__Model__PlanificacionesAssignment_9 )*
            {
             before(grammarAccess.getModelAccess().getPlanificacionesAssignment_9()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:678:1: ( rule__Model__PlanificacionesAssignment_9 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==25) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:678:2: rule__Model__PlanificacionesAssignment_9
            	    {
            	    pushFollow(FOLLOW_rule__Model__PlanificacionesAssignment_9_in_rule__Model__Group__9__Impl1367);
            	    rule__Model__PlanificacionesAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:688:1: rule__Model__Group__10 : rule__Model__Group__10__Impl ;
    public final void rule__Model__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:692:1: ( rule__Model__Group__10__Impl )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:693:2: rule__Model__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__10__Impl_in_rule__Model__Group__101398);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:699:1: rule__Model__Group__10__Impl : ( ( rule__Model__HorariosAssignment_10 )* ) ;
    public final void rule__Model__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:703:1: ( ( ( rule__Model__HorariosAssignment_10 )* ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:704:1: ( ( rule__Model__HorariosAssignment_10 )* )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:704:1: ( ( rule__Model__HorariosAssignment_10 )* )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:705:1: ( rule__Model__HorariosAssignment_10 )*
            {
             before(grammarAccess.getModelAccess().getHorariosAssignment_10()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:706:1: ( rule__Model__HorariosAssignment_10 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:706:2: rule__Model__HorariosAssignment_10
            	    {
            	    pushFollow(FOLLOW_rule__Model__HorariosAssignment_10_in_rule__Model__Group__10__Impl1425);
            	    rule__Model__HorariosAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:738:1: rule__Profesor__Group__0 : rule__Profesor__Group__0__Impl rule__Profesor__Group__1 ;
    public final void rule__Profesor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:742:1: ( rule__Profesor__Group__0__Impl rule__Profesor__Group__1 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:743:2: rule__Profesor__Group__0__Impl rule__Profesor__Group__1
            {
            pushFollow(FOLLOW_rule__Profesor__Group__0__Impl_in_rule__Profesor__Group__01478);
            rule__Profesor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Profesor__Group__1_in_rule__Profesor__Group__01481);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:750:1: rule__Profesor__Group__0__Impl : ( 'profesor' ) ;
    public final void rule__Profesor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:754:1: ( ( 'profesor' ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:755:1: ( 'profesor' )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:755:1: ( 'profesor' )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:756:1: 'profesor'
            {
             before(grammarAccess.getProfesorAccess().getProfesorKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Profesor__Group__0__Impl1509); 
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:769:1: rule__Profesor__Group__1 : rule__Profesor__Group__1__Impl ;
    public final void rule__Profesor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:773:1: ( rule__Profesor__Group__1__Impl )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:774:2: rule__Profesor__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Profesor__Group__1__Impl_in_rule__Profesor__Group__11540);
            rule__Profesor__Group__1__Impl();

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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:780:1: rule__Profesor__Group__1__Impl : ( ( rule__Profesor__NombreAssignment_1 ) ) ;
    public final void rule__Profesor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:784:1: ( ( ( rule__Profesor__NombreAssignment_1 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:785:1: ( ( rule__Profesor__NombreAssignment_1 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:785:1: ( ( rule__Profesor__NombreAssignment_1 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:786:1: ( rule__Profesor__NombreAssignment_1 )
            {
             before(grammarAccess.getProfesorAccess().getNombreAssignment_1()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:787:1: ( rule__Profesor__NombreAssignment_1 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:787:2: rule__Profesor__NombreAssignment_1
            {
            pushFollow(FOLLOW_rule__Profesor__NombreAssignment_1_in_rule__Profesor__Group__1__Impl1567);
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


    // $ANTLR start "rule__Hora__Group__0"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:801:1: rule__Hora__Group__0 : rule__Hora__Group__0__Impl rule__Hora__Group__1 ;
    public final void rule__Hora__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:805:1: ( rule__Hora__Group__0__Impl rule__Hora__Group__1 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:806:2: rule__Hora__Group__0__Impl rule__Hora__Group__1
            {
            pushFollow(FOLLOW_rule__Hora__Group__0__Impl_in_rule__Hora__Group__01601);
            rule__Hora__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Hora__Group__1_in_rule__Hora__Group__01604);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:813:1: rule__Hora__Group__0__Impl : ( 'hora' ) ;
    public final void rule__Hora__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:817:1: ( ( 'hora' ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:818:1: ( 'hora' )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:818:1: ( 'hora' )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:819:1: 'hora'
            {
             before(grammarAccess.getHoraAccess().getHoraKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Hora__Group__0__Impl1632); 
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:832:1: rule__Hora__Group__1 : rule__Hora__Group__1__Impl ;
    public final void rule__Hora__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:836:1: ( rule__Hora__Group__1__Impl )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:837:2: rule__Hora__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Hora__Group__1__Impl_in_rule__Hora__Group__11663);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:843:1: rule__Hora__Group__1__Impl : ( ( rule__Hora__HoraAssignment_1 ) ) ;
    public final void rule__Hora__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:847:1: ( ( ( rule__Hora__HoraAssignment_1 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:848:1: ( ( rule__Hora__HoraAssignment_1 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:848:1: ( ( rule__Hora__HoraAssignment_1 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:849:1: ( rule__Hora__HoraAssignment_1 )
            {
             before(grammarAccess.getHoraAccess().getHoraAssignment_1()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:850:1: ( rule__Hora__HoraAssignment_1 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:850:2: rule__Hora__HoraAssignment_1
            {
            pushFollow(FOLLOW_rule__Hora__HoraAssignment_1_in_rule__Hora__Group__1__Impl1690);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:864:1: rule__Materia__Group__0 : rule__Materia__Group__0__Impl rule__Materia__Group__1 ;
    public final void rule__Materia__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:868:1: ( rule__Materia__Group__0__Impl rule__Materia__Group__1 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:869:2: rule__Materia__Group__0__Impl rule__Materia__Group__1
            {
            pushFollow(FOLLOW_rule__Materia__Group__0__Impl_in_rule__Materia__Group__01724);
            rule__Materia__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Materia__Group__1_in_rule__Materia__Group__01727);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:876:1: rule__Materia__Group__0__Impl : ( 'materia' ) ;
    public final void rule__Materia__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:880:1: ( ( 'materia' ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:881:1: ( 'materia' )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:881:1: ( 'materia' )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:882:1: 'materia'
            {
             before(grammarAccess.getMateriaAccess().getMateriaKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Materia__Group__0__Impl1755); 
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:895:1: rule__Materia__Group__1 : rule__Materia__Group__1__Impl ;
    public final void rule__Materia__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:899:1: ( rule__Materia__Group__1__Impl )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:900:2: rule__Materia__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Materia__Group__1__Impl_in_rule__Materia__Group__11786);
            rule__Materia__Group__1__Impl();

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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:906:1: rule__Materia__Group__1__Impl : ( ( rule__Materia__NombreAssignment_1 ) ) ;
    public final void rule__Materia__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:910:1: ( ( ( rule__Materia__NombreAssignment_1 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:911:1: ( ( rule__Materia__NombreAssignment_1 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:911:1: ( ( rule__Materia__NombreAssignment_1 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:912:1: ( rule__Materia__NombreAssignment_1 )
            {
             before(grammarAccess.getMateriaAccess().getNombreAssignment_1()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:913:1: ( rule__Materia__NombreAssignment_1 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:913:2: rule__Materia__NombreAssignment_1
            {
            pushFollow(FOLLOW_rule__Materia__NombreAssignment_1_in_rule__Materia__Group__1__Impl1813);
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


    // $ANTLR start "rule__Aula__Group__0"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:927:1: rule__Aula__Group__0 : rule__Aula__Group__0__Impl rule__Aula__Group__1 ;
    public final void rule__Aula__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:931:1: ( rule__Aula__Group__0__Impl rule__Aula__Group__1 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:932:2: rule__Aula__Group__0__Impl rule__Aula__Group__1
            {
            pushFollow(FOLLOW_rule__Aula__Group__0__Impl_in_rule__Aula__Group__01847);
            rule__Aula__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Aula__Group__1_in_rule__Aula__Group__01850);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:939:1: rule__Aula__Group__0__Impl : ( 'aula' ) ;
    public final void rule__Aula__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:943:1: ( ( 'aula' ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:944:1: ( 'aula' )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:944:1: ( 'aula' )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:945:1: 'aula'
            {
             before(grammarAccess.getAulaAccess().getAulaKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Aula__Group__0__Impl1878); 
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:958:1: rule__Aula__Group__1 : rule__Aula__Group__1__Impl ;
    public final void rule__Aula__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:962:1: ( rule__Aula__Group__1__Impl )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:963:2: rule__Aula__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Aula__Group__1__Impl_in_rule__Aula__Group__11909);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:969:1: rule__Aula__Group__1__Impl : ( ( rule__Aula__NombreAssignment_1 ) ) ;
    public final void rule__Aula__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:973:1: ( ( ( rule__Aula__NombreAssignment_1 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:974:1: ( ( rule__Aula__NombreAssignment_1 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:974:1: ( ( rule__Aula__NombreAssignment_1 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:975:1: ( rule__Aula__NombreAssignment_1 )
            {
             before(grammarAccess.getAulaAccess().getNombreAssignment_1()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:976:1: ( rule__Aula__NombreAssignment_1 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:976:2: rule__Aula__NombreAssignment_1
            {
            pushFollow(FOLLOW_rule__Aula__NombreAssignment_1_in_rule__Aula__Group__1__Impl1936);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:990:1: rule__CargaHoraria__Group__0 : rule__CargaHoraria__Group__0__Impl rule__CargaHoraria__Group__1 ;
    public final void rule__CargaHoraria__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:994:1: ( rule__CargaHoraria__Group__0__Impl rule__CargaHoraria__Group__1 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:995:2: rule__CargaHoraria__Group__0__Impl rule__CargaHoraria__Group__1
            {
            pushFollow(FOLLOW_rule__CargaHoraria__Group__0__Impl_in_rule__CargaHoraria__Group__01970);
            rule__CargaHoraria__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CargaHoraria__Group__1_in_rule__CargaHoraria__Group__01973);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1002:1: rule__CargaHoraria__Group__0__Impl : ( 'cargaHoraria' ) ;
    public final void rule__CargaHoraria__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1006:1: ( ( 'cargaHoraria' ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1007:1: ( 'cargaHoraria' )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1007:1: ( 'cargaHoraria' )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1008:1: 'cargaHoraria'
            {
             before(grammarAccess.getCargaHorariaAccess().getCargaHorariaKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__CargaHoraria__Group__0__Impl2001); 
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1021:1: rule__CargaHoraria__Group__1 : rule__CargaHoraria__Group__1__Impl ;
    public final void rule__CargaHoraria__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1025:1: ( rule__CargaHoraria__Group__1__Impl )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1026:2: rule__CargaHoraria__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CargaHoraria__Group__1__Impl_in_rule__CargaHoraria__Group__12032);
            rule__CargaHoraria__Group__1__Impl();

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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1032:1: rule__CargaHoraria__Group__1__Impl : ( ( rule__CargaHoraria__TipoAssignment_1 ) ) ;
    public final void rule__CargaHoraria__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1036:1: ( ( ( rule__CargaHoraria__TipoAssignment_1 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1037:1: ( ( rule__CargaHoraria__TipoAssignment_1 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1037:1: ( ( rule__CargaHoraria__TipoAssignment_1 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1038:1: ( rule__CargaHoraria__TipoAssignment_1 )
            {
             before(grammarAccess.getCargaHorariaAccess().getTipoAssignment_1()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1039:1: ( rule__CargaHoraria__TipoAssignment_1 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1039:2: rule__CargaHoraria__TipoAssignment_1
            {
            pushFollow(FOLLOW_rule__CargaHoraria__TipoAssignment_1_in_rule__CargaHoraria__Group__1__Impl2059);
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


    // $ANTLR start "rule__CargaHorariaDocente__Group__0"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1053:1: rule__CargaHorariaDocente__Group__0 : rule__CargaHorariaDocente__Group__0__Impl rule__CargaHorariaDocente__Group__1 ;
    public final void rule__CargaHorariaDocente__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1057:1: ( rule__CargaHorariaDocente__Group__0__Impl rule__CargaHorariaDocente__Group__1 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1058:2: rule__CargaHorariaDocente__Group__0__Impl rule__CargaHorariaDocente__Group__1
            {
            pushFollow(FOLLOW_rule__CargaHorariaDocente__Group__0__Impl_in_rule__CargaHorariaDocente__Group__02093);
            rule__CargaHorariaDocente__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CargaHorariaDocente__Group__1_in_rule__CargaHorariaDocente__Group__02096);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1065:1: rule__CargaHorariaDocente__Group__0__Impl : ( ( rule__CargaHorariaDocente__NombreAssignment_0 ) ) ;
    public final void rule__CargaHorariaDocente__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1069:1: ( ( ( rule__CargaHorariaDocente__NombreAssignment_0 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1070:1: ( ( rule__CargaHorariaDocente__NombreAssignment_0 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1070:1: ( ( rule__CargaHorariaDocente__NombreAssignment_0 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1071:1: ( rule__CargaHorariaDocente__NombreAssignment_0 )
            {
             before(grammarAccess.getCargaHorariaDocenteAccess().getNombreAssignment_0()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1072:1: ( rule__CargaHorariaDocente__NombreAssignment_0 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1072:2: rule__CargaHorariaDocente__NombreAssignment_0
            {
            pushFollow(FOLLOW_rule__CargaHorariaDocente__NombreAssignment_0_in_rule__CargaHorariaDocente__Group__0__Impl2123);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1082:1: rule__CargaHorariaDocente__Group__1 : rule__CargaHorariaDocente__Group__1__Impl rule__CargaHorariaDocente__Group__2 ;
    public final void rule__CargaHorariaDocente__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1086:1: ( rule__CargaHorariaDocente__Group__1__Impl rule__CargaHorariaDocente__Group__2 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1087:2: rule__CargaHorariaDocente__Group__1__Impl rule__CargaHorariaDocente__Group__2
            {
            pushFollow(FOLLOW_rule__CargaHorariaDocente__Group__1__Impl_in_rule__CargaHorariaDocente__Group__12153);
            rule__CargaHorariaDocente__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CargaHorariaDocente__Group__2_in_rule__CargaHorariaDocente__Group__12156);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1094:1: rule__CargaHorariaDocente__Group__1__Impl : ( 'tiene' ) ;
    public final void rule__CargaHorariaDocente__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1098:1: ( ( 'tiene' ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1099:1: ( 'tiene' )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1099:1: ( 'tiene' )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1100:1: 'tiene'
            {
             before(grammarAccess.getCargaHorariaDocenteAccess().getTieneKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__CargaHorariaDocente__Group__1__Impl2184); 
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1113:1: rule__CargaHorariaDocente__Group__2 : rule__CargaHorariaDocente__Group__2__Impl ;
    public final void rule__CargaHorariaDocente__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1117:1: ( rule__CargaHorariaDocente__Group__2__Impl )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1118:2: rule__CargaHorariaDocente__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CargaHorariaDocente__Group__2__Impl_in_rule__CargaHorariaDocente__Group__22215);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1124:1: rule__CargaHorariaDocente__Group__2__Impl : ( ( rule__CargaHorariaDocente__TipoAssignment_2 ) ) ;
    public final void rule__CargaHorariaDocente__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1128:1: ( ( ( rule__CargaHorariaDocente__TipoAssignment_2 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1129:1: ( ( rule__CargaHorariaDocente__TipoAssignment_2 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1129:1: ( ( rule__CargaHorariaDocente__TipoAssignment_2 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1130:1: ( rule__CargaHorariaDocente__TipoAssignment_2 )
            {
             before(grammarAccess.getCargaHorariaDocenteAccess().getTipoAssignment_2()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1131:1: ( rule__CargaHorariaDocente__TipoAssignment_2 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1131:2: rule__CargaHorariaDocente__TipoAssignment_2
            {
            pushFollow(FOLLOW_rule__CargaHorariaDocente__TipoAssignment_2_in_rule__CargaHorariaDocente__Group__2__Impl2242);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1147:1: rule__Horario__Group__0 : rule__Horario__Group__0__Impl rule__Horario__Group__1 ;
    public final void rule__Horario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1151:1: ( rule__Horario__Group__0__Impl rule__Horario__Group__1 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1152:2: rule__Horario__Group__0__Impl rule__Horario__Group__1
            {
            pushFollow(FOLLOW_rule__Horario__Group__0__Impl_in_rule__Horario__Group__02278);
            rule__Horario__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Horario__Group__1_in_rule__Horario__Group__02281);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1159:1: rule__Horario__Group__0__Impl : ( ( rule__Horario__DiaAssignment_0 ) ) ;
    public final void rule__Horario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1163:1: ( ( ( rule__Horario__DiaAssignment_0 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1164:1: ( ( rule__Horario__DiaAssignment_0 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1164:1: ( ( rule__Horario__DiaAssignment_0 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1165:1: ( rule__Horario__DiaAssignment_0 )
            {
             before(grammarAccess.getHorarioAccess().getDiaAssignment_0()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1166:1: ( rule__Horario__DiaAssignment_0 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1166:2: rule__Horario__DiaAssignment_0
            {
            pushFollow(FOLLOW_rule__Horario__DiaAssignment_0_in_rule__Horario__Group__0__Impl2308);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1176:1: rule__Horario__Group__1 : rule__Horario__Group__1__Impl rule__Horario__Group__2 ;
    public final void rule__Horario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1180:1: ( rule__Horario__Group__1__Impl rule__Horario__Group__2 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1181:2: rule__Horario__Group__1__Impl rule__Horario__Group__2
            {
            pushFollow(FOLLOW_rule__Horario__Group__1__Impl_in_rule__Horario__Group__12338);
            rule__Horario__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Horario__Group__2_in_rule__Horario__Group__12341);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1188:1: rule__Horario__Group__1__Impl : ( ':' ) ;
    public final void rule__Horario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1192:1: ( ( ':' ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1193:1: ( ':' )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1193:1: ( ':' )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1194:1: ':'
            {
             before(grammarAccess.getHorarioAccess().getColonKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__Horario__Group__1__Impl2369); 
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1207:1: rule__Horario__Group__2 : rule__Horario__Group__2__Impl rule__Horario__Group__3 ;
    public final void rule__Horario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1211:1: ( rule__Horario__Group__2__Impl rule__Horario__Group__3 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1212:2: rule__Horario__Group__2__Impl rule__Horario__Group__3
            {
            pushFollow(FOLLOW_rule__Horario__Group__2__Impl_in_rule__Horario__Group__22400);
            rule__Horario__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Horario__Group__3_in_rule__Horario__Group__22403);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1219:1: rule__Horario__Group__2__Impl : ( ( rule__Horario__DesdeAssignment_2 ) ) ;
    public final void rule__Horario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1223:1: ( ( ( rule__Horario__DesdeAssignment_2 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1224:1: ( ( rule__Horario__DesdeAssignment_2 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1224:1: ( ( rule__Horario__DesdeAssignment_2 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1225:1: ( rule__Horario__DesdeAssignment_2 )
            {
             before(grammarAccess.getHorarioAccess().getDesdeAssignment_2()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1226:1: ( rule__Horario__DesdeAssignment_2 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1226:2: rule__Horario__DesdeAssignment_2
            {
            pushFollow(FOLLOW_rule__Horario__DesdeAssignment_2_in_rule__Horario__Group__2__Impl2430);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1236:1: rule__Horario__Group__3 : rule__Horario__Group__3__Impl rule__Horario__Group__4 ;
    public final void rule__Horario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1240:1: ( rule__Horario__Group__3__Impl rule__Horario__Group__4 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1241:2: rule__Horario__Group__3__Impl rule__Horario__Group__4
            {
            pushFollow(FOLLOW_rule__Horario__Group__3__Impl_in_rule__Horario__Group__32460);
            rule__Horario__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Horario__Group__4_in_rule__Horario__Group__32463);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1248:1: rule__Horario__Group__3__Impl : ( 'a' ) ;
    public final void rule__Horario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1252:1: ( ( 'a' ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1253:1: ( 'a' )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1253:1: ( 'a' )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1254:1: 'a'
            {
             before(grammarAccess.getHorarioAccess().getAKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__Horario__Group__3__Impl2491); 
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1267:1: rule__Horario__Group__4 : rule__Horario__Group__4__Impl rule__Horario__Group__5 ;
    public final void rule__Horario__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1271:1: ( rule__Horario__Group__4__Impl rule__Horario__Group__5 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1272:2: rule__Horario__Group__4__Impl rule__Horario__Group__5
            {
            pushFollow(FOLLOW_rule__Horario__Group__4__Impl_in_rule__Horario__Group__42522);
            rule__Horario__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Horario__Group__5_in_rule__Horario__Group__42525);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1279:1: rule__Horario__Group__4__Impl : ( ( rule__Horario__HastaAssignment_4 ) ) ;
    public final void rule__Horario__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1283:1: ( ( ( rule__Horario__HastaAssignment_4 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1284:1: ( ( rule__Horario__HastaAssignment_4 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1284:1: ( ( rule__Horario__HastaAssignment_4 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1285:1: ( rule__Horario__HastaAssignment_4 )
            {
             before(grammarAccess.getHorarioAccess().getHastaAssignment_4()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1286:1: ( rule__Horario__HastaAssignment_4 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1286:2: rule__Horario__HastaAssignment_4
            {
            pushFollow(FOLLOW_rule__Horario__HastaAssignment_4_in_rule__Horario__Group__4__Impl2552);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1296:1: rule__Horario__Group__5 : rule__Horario__Group__5__Impl rule__Horario__Group__6 ;
    public final void rule__Horario__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1300:1: ( rule__Horario__Group__5__Impl rule__Horario__Group__6 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1301:2: rule__Horario__Group__5__Impl rule__Horario__Group__6
            {
            pushFollow(FOLLOW_rule__Horario__Group__5__Impl_in_rule__Horario__Group__52582);
            rule__Horario__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Horario__Group__6_in_rule__Horario__Group__52585);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1308:1: rule__Horario__Group__5__Impl : ( 'hs se dicta' ) ;
    public final void rule__Horario__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1312:1: ( ( 'hs se dicta' ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1313:1: ( 'hs se dicta' )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1313:1: ( 'hs se dicta' )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1314:1: 'hs se dicta'
            {
             before(grammarAccess.getHorarioAccess().getHsSeDictaKeyword_5()); 
            match(input,19,FOLLOW_19_in_rule__Horario__Group__5__Impl2613); 
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1327:1: rule__Horario__Group__6 : rule__Horario__Group__6__Impl rule__Horario__Group__7 ;
    public final void rule__Horario__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1331:1: ( rule__Horario__Group__6__Impl rule__Horario__Group__7 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1332:2: rule__Horario__Group__6__Impl rule__Horario__Group__7
            {
            pushFollow(FOLLOW_rule__Horario__Group__6__Impl_in_rule__Horario__Group__62644);
            rule__Horario__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Horario__Group__7_in_rule__Horario__Group__62647);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1339:1: rule__Horario__Group__6__Impl : ( ( rule__Horario__MateriaAssignment_6 ) ) ;
    public final void rule__Horario__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1343:1: ( ( ( rule__Horario__MateriaAssignment_6 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1344:1: ( ( rule__Horario__MateriaAssignment_6 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1344:1: ( ( rule__Horario__MateriaAssignment_6 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1345:1: ( rule__Horario__MateriaAssignment_6 )
            {
             before(grammarAccess.getHorarioAccess().getMateriaAssignment_6()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1346:1: ( rule__Horario__MateriaAssignment_6 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1346:2: rule__Horario__MateriaAssignment_6
            {
            pushFollow(FOLLOW_rule__Horario__MateriaAssignment_6_in_rule__Horario__Group__6__Impl2674);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1356:1: rule__Horario__Group__7 : rule__Horario__Group__7__Impl rule__Horario__Group__8 ;
    public final void rule__Horario__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1360:1: ( rule__Horario__Group__7__Impl rule__Horario__Group__8 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1361:2: rule__Horario__Group__7__Impl rule__Horario__Group__8
            {
            pushFollow(FOLLOW_rule__Horario__Group__7__Impl_in_rule__Horario__Group__72704);
            rule__Horario__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Horario__Group__8_in_rule__Horario__Group__72707);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1368:1: rule__Horario__Group__7__Impl : ( 'en' ) ;
    public final void rule__Horario__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1372:1: ( ( 'en' ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1373:1: ( 'en' )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1373:1: ( 'en' )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1374:1: 'en'
            {
             before(grammarAccess.getHorarioAccess().getEnKeyword_7()); 
            match(input,20,FOLLOW_20_in_rule__Horario__Group__7__Impl2735); 
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1387:1: rule__Horario__Group__8 : rule__Horario__Group__8__Impl ;
    public final void rule__Horario__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1391:1: ( rule__Horario__Group__8__Impl )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1392:2: rule__Horario__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Horario__Group__8__Impl_in_rule__Horario__Group__82766);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1398:1: rule__Horario__Group__8__Impl : ( ( rule__Horario__AulaAssignment_8 ) ) ;
    public final void rule__Horario__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1402:1: ( ( ( rule__Horario__AulaAssignment_8 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1403:1: ( ( rule__Horario__AulaAssignment_8 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1403:1: ( ( rule__Horario__AulaAssignment_8 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1404:1: ( rule__Horario__AulaAssignment_8 )
            {
             before(grammarAccess.getHorarioAccess().getAulaAssignment_8()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1405:1: ( rule__Horario__AulaAssignment_8 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1405:2: rule__Horario__AulaAssignment_8
            {
            pushFollow(FOLLOW_rule__Horario__AulaAssignment_8_in_rule__Horario__Group__8__Impl2793);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1433:1: rule__Semestre__Group__0 : rule__Semestre__Group__0__Impl rule__Semestre__Group__1 ;
    public final void rule__Semestre__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1437:1: ( rule__Semestre__Group__0__Impl rule__Semestre__Group__1 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1438:2: rule__Semestre__Group__0__Impl rule__Semestre__Group__1
            {
            pushFollow(FOLLOW_rule__Semestre__Group__0__Impl_in_rule__Semestre__Group__02841);
            rule__Semestre__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Semestre__Group__1_in_rule__Semestre__Group__02844);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1445:1: rule__Semestre__Group__0__Impl : ( ( rule__Semestre__AnhoAssignment_0 ) ) ;
    public final void rule__Semestre__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1449:1: ( ( ( rule__Semestre__AnhoAssignment_0 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1450:1: ( ( rule__Semestre__AnhoAssignment_0 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1450:1: ( ( rule__Semestre__AnhoAssignment_0 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1451:1: ( rule__Semestre__AnhoAssignment_0 )
            {
             before(grammarAccess.getSemestreAccess().getAnhoAssignment_0()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1452:1: ( rule__Semestre__AnhoAssignment_0 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1452:2: rule__Semestre__AnhoAssignment_0
            {
            pushFollow(FOLLOW_rule__Semestre__AnhoAssignment_0_in_rule__Semestre__Group__0__Impl2871);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1462:1: rule__Semestre__Group__1 : rule__Semestre__Group__1__Impl rule__Semestre__Group__2 ;
    public final void rule__Semestre__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1466:1: ( rule__Semestre__Group__1__Impl rule__Semestre__Group__2 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1467:2: rule__Semestre__Group__1__Impl rule__Semestre__Group__2
            {
            pushFollow(FOLLOW_rule__Semestre__Group__1__Impl_in_rule__Semestre__Group__12901);
            rule__Semestre__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Semestre__Group__2_in_rule__Semestre__Group__12904);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1474:1: rule__Semestre__Group__1__Impl : ( 'semestre' ) ;
    public final void rule__Semestre__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1478:1: ( ( 'semestre' ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1479:1: ( 'semestre' )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1479:1: ( 'semestre' )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1480:1: 'semestre'
            {
             before(grammarAccess.getSemestreAccess().getSemestreKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__Semestre__Group__1__Impl2932); 
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1493:1: rule__Semestre__Group__2 : rule__Semestre__Group__2__Impl ;
    public final void rule__Semestre__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1497:1: ( rule__Semestre__Group__2__Impl )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1498:2: rule__Semestre__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Semestre__Group__2__Impl_in_rule__Semestre__Group__22963);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1504:1: rule__Semestre__Group__2__Impl : ( ( rule__Semestre__NumeroAssignment_2 ) ) ;
    public final void rule__Semestre__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1508:1: ( ( ( rule__Semestre__NumeroAssignment_2 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1509:1: ( ( rule__Semestre__NumeroAssignment_2 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1509:1: ( ( rule__Semestre__NumeroAssignment_2 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1510:1: ( rule__Semestre__NumeroAssignment_2 )
            {
             before(grammarAccess.getSemestreAccess().getNumeroAssignment_2()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1511:1: ( rule__Semestre__NumeroAssignment_2 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1511:2: rule__Semestre__NumeroAssignment_2
            {
            pushFollow(FOLLOW_rule__Semestre__NumeroAssignment_2_in_rule__Semestre__Group__2__Impl2990);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1527:1: rule__Dia__Group__0 : rule__Dia__Group__0__Impl rule__Dia__Group__1 ;
    public final void rule__Dia__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1531:1: ( rule__Dia__Group__0__Impl rule__Dia__Group__1 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1532:2: rule__Dia__Group__0__Impl rule__Dia__Group__1
            {
            pushFollow(FOLLOW_rule__Dia__Group__0__Impl_in_rule__Dia__Group__03026);
            rule__Dia__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Dia__Group__1_in_rule__Dia__Group__03029);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1539:1: rule__Dia__Group__0__Impl : ( 'dia' ) ;
    public final void rule__Dia__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1543:1: ( ( 'dia' ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1544:1: ( 'dia' )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1544:1: ( 'dia' )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1545:1: 'dia'
            {
             before(grammarAccess.getDiaAccess().getDiaKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Dia__Group__0__Impl3057); 
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1558:1: rule__Dia__Group__1 : rule__Dia__Group__1__Impl ;
    public final void rule__Dia__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1562:1: ( rule__Dia__Group__1__Impl )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1563:2: rule__Dia__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Dia__Group__1__Impl_in_rule__Dia__Group__13088);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1569:1: rule__Dia__Group__1__Impl : ( ( rule__Dia__DiaAssignment_1 ) ) ;
    public final void rule__Dia__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1573:1: ( ( ( rule__Dia__DiaAssignment_1 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1574:1: ( ( rule__Dia__DiaAssignment_1 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1574:1: ( ( rule__Dia__DiaAssignment_1 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1575:1: ( rule__Dia__DiaAssignment_1 )
            {
             before(grammarAccess.getDiaAccess().getDiaAssignment_1()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1576:1: ( rule__Dia__DiaAssignment_1 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1576:2: rule__Dia__DiaAssignment_1
            {
            pushFollow(FOLLOW_rule__Dia__DiaAssignment_1_in_rule__Dia__Group__1__Impl3115);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1590:1: rule__Horarios__Group__0 : rule__Horarios__Group__0__Impl rule__Horarios__Group__1 ;
    public final void rule__Horarios__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1594:1: ( rule__Horarios__Group__0__Impl rule__Horarios__Group__1 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1595:2: rule__Horarios__Group__0__Impl rule__Horarios__Group__1
            {
            pushFollow(FOLLOW_rule__Horarios__Group__0__Impl_in_rule__Horarios__Group__03149);
            rule__Horarios__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Horarios__Group__1_in_rule__Horarios__Group__03152);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1602:1: rule__Horarios__Group__0__Impl : ( 'horarios {' ) ;
    public final void rule__Horarios__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1606:1: ( ( 'horarios {' ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1607:1: ( 'horarios {' )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1607:1: ( 'horarios {' )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1608:1: 'horarios {'
            {
             before(grammarAccess.getHorariosAccess().getHorariosKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Horarios__Group__0__Impl3180); 
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1621:1: rule__Horarios__Group__1 : rule__Horarios__Group__1__Impl rule__Horarios__Group__2 ;
    public final void rule__Horarios__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1625:1: ( rule__Horarios__Group__1__Impl rule__Horarios__Group__2 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1626:2: rule__Horarios__Group__1__Impl rule__Horarios__Group__2
            {
            pushFollow(FOLLOW_rule__Horarios__Group__1__Impl_in_rule__Horarios__Group__13211);
            rule__Horarios__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Horarios__Group__2_in_rule__Horarios__Group__13214);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1633:1: rule__Horarios__Group__1__Impl : ( ( ( rule__Horarios__HorariosAssignment_1 ) ) ( ( rule__Horarios__HorariosAssignment_1 )* ) ) ;
    public final void rule__Horarios__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1637:1: ( ( ( ( rule__Horarios__HorariosAssignment_1 ) ) ( ( rule__Horarios__HorariosAssignment_1 )* ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1638:1: ( ( ( rule__Horarios__HorariosAssignment_1 ) ) ( ( rule__Horarios__HorariosAssignment_1 )* ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1638:1: ( ( ( rule__Horarios__HorariosAssignment_1 ) ) ( ( rule__Horarios__HorariosAssignment_1 )* ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1639:1: ( ( rule__Horarios__HorariosAssignment_1 ) ) ( ( rule__Horarios__HorariosAssignment_1 )* )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1639:1: ( ( rule__Horarios__HorariosAssignment_1 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1640:1: ( rule__Horarios__HorariosAssignment_1 )
            {
             before(grammarAccess.getHorariosAccess().getHorariosAssignment_1()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1641:1: ( rule__Horarios__HorariosAssignment_1 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1641:2: rule__Horarios__HorariosAssignment_1
            {
            pushFollow(FOLLOW_rule__Horarios__HorariosAssignment_1_in_rule__Horarios__Group__1__Impl3243);
            rule__Horarios__HorariosAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHorariosAccess().getHorariosAssignment_1()); 

            }

            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1644:1: ( ( rule__Horarios__HorariosAssignment_1 )* )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1645:1: ( rule__Horarios__HorariosAssignment_1 )*
            {
             before(grammarAccess.getHorariosAccess().getHorariosAssignment_1()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1646:1: ( rule__Horarios__HorariosAssignment_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==22) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1646:2: rule__Horarios__HorariosAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Horarios__HorariosAssignment_1_in_rule__Horarios__Group__1__Impl3255);
            	    rule__Horarios__HorariosAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1657:1: rule__Horarios__Group__2 : rule__Horarios__Group__2__Impl ;
    public final void rule__Horarios__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1661:1: ( rule__Horarios__Group__2__Impl )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1662:2: rule__Horarios__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Horarios__Group__2__Impl_in_rule__Horarios__Group__23288);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1668:1: rule__Horarios__Group__2__Impl : ( '}' ) ;
    public final void rule__Horarios__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1672:1: ( ( '}' ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1673:1: ( '}' )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1673:1: ( '}' )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1674:1: '}'
            {
             before(grammarAccess.getHorariosAccess().getRightCurlyBracketKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__Horarios__Group__2__Impl3316); 
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1693:1: rule__Planificacion__Group__0 : rule__Planificacion__Group__0__Impl rule__Planificacion__Group__1 ;
    public final void rule__Planificacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1697:1: ( rule__Planificacion__Group__0__Impl rule__Planificacion__Group__1 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1698:2: rule__Planificacion__Group__0__Impl rule__Planificacion__Group__1
            {
            pushFollow(FOLLOW_rule__Planificacion__Group__0__Impl_in_rule__Planificacion__Group__03353);
            rule__Planificacion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Planificacion__Group__1_in_rule__Planificacion__Group__03356);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1705:1: rule__Planificacion__Group__0__Impl : ( 'planificacion' ) ;
    public final void rule__Planificacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1709:1: ( ( 'planificacion' ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1710:1: ( 'planificacion' )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1710:1: ( 'planificacion' )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1711:1: 'planificacion'
            {
             before(grammarAccess.getPlanificacionAccess().getPlanificacionKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Planificacion__Group__0__Impl3384); 
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1724:1: rule__Planificacion__Group__1 : rule__Planificacion__Group__1__Impl rule__Planificacion__Group__2 ;
    public final void rule__Planificacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1728:1: ( rule__Planificacion__Group__1__Impl rule__Planificacion__Group__2 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1729:2: rule__Planificacion__Group__1__Impl rule__Planificacion__Group__2
            {
            pushFollow(FOLLOW_rule__Planificacion__Group__1__Impl_in_rule__Planificacion__Group__13415);
            rule__Planificacion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Planificacion__Group__2_in_rule__Planificacion__Group__13418);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1736:1: rule__Planificacion__Group__1__Impl : ( ( rule__Planificacion__SemestreAssignment_1 ) ) ;
    public final void rule__Planificacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1740:1: ( ( ( rule__Planificacion__SemestreAssignment_1 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1741:1: ( ( rule__Planificacion__SemestreAssignment_1 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1741:1: ( ( rule__Planificacion__SemestreAssignment_1 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1742:1: ( rule__Planificacion__SemestreAssignment_1 )
            {
             before(grammarAccess.getPlanificacionAccess().getSemestreAssignment_1()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1743:1: ( rule__Planificacion__SemestreAssignment_1 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1743:2: rule__Planificacion__SemestreAssignment_1
            {
            pushFollow(FOLLOW_rule__Planificacion__SemestreAssignment_1_in_rule__Planificacion__Group__1__Impl3445);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1753:1: rule__Planificacion__Group__2 : rule__Planificacion__Group__2__Impl rule__Planificacion__Group__3 ;
    public final void rule__Planificacion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1757:1: ( rule__Planificacion__Group__2__Impl rule__Planificacion__Group__3 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1758:2: rule__Planificacion__Group__2__Impl rule__Planificacion__Group__3
            {
            pushFollow(FOLLOW_rule__Planificacion__Group__2__Impl_in_rule__Planificacion__Group__23475);
            rule__Planificacion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Planificacion__Group__3_in_rule__Planificacion__Group__23478);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1765:1: rule__Planificacion__Group__2__Impl : ( '{' ) ;
    public final void rule__Planificacion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1769:1: ( ( '{' ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1770:1: ( '{' )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1770:1: ( '{' )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1771:1: '{'
            {
             before(grammarAccess.getPlanificacionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__Planificacion__Group__2__Impl3506); 
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1784:1: rule__Planificacion__Group__3 : rule__Planificacion__Group__3__Impl rule__Planificacion__Group__4 ;
    public final void rule__Planificacion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1788:1: ( rule__Planificacion__Group__3__Impl rule__Planificacion__Group__4 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1789:2: rule__Planificacion__Group__3__Impl rule__Planificacion__Group__4
            {
            pushFollow(FOLLOW_rule__Planificacion__Group__3__Impl_in_rule__Planificacion__Group__33537);
            rule__Planificacion__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Planificacion__Group__4_in_rule__Planificacion__Group__33540);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1796:1: rule__Planificacion__Group__3__Impl : ( 'a dictar:' ) ;
    public final void rule__Planificacion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1800:1: ( ( 'a dictar:' ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1801:1: ( 'a dictar:' )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1801:1: ( 'a dictar:' )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1802:1: 'a dictar:'
            {
             before(grammarAccess.getPlanificacionAccess().getADictarKeyword_3()); 
            match(input,27,FOLLOW_27_in_rule__Planificacion__Group__3__Impl3568); 
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1815:1: rule__Planificacion__Group__4 : rule__Planificacion__Group__4__Impl rule__Planificacion__Group__5 ;
    public final void rule__Planificacion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1819:1: ( rule__Planificacion__Group__4__Impl rule__Planificacion__Group__5 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1820:2: rule__Planificacion__Group__4__Impl rule__Planificacion__Group__5
            {
            pushFollow(FOLLOW_rule__Planificacion__Group__4__Impl_in_rule__Planificacion__Group__43599);
            rule__Planificacion__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Planificacion__Group__5_in_rule__Planificacion__Group__43602);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1827:1: rule__Planificacion__Group__4__Impl : ( ( ( rule__Planificacion__MateriasAssignment_4 ) ) ( ( rule__Planificacion__MateriasAssignment_4 )* ) ) ;
    public final void rule__Planificacion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1831:1: ( ( ( ( rule__Planificacion__MateriasAssignment_4 ) ) ( ( rule__Planificacion__MateriasAssignment_4 )* ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1832:1: ( ( ( rule__Planificacion__MateriasAssignment_4 ) ) ( ( rule__Planificacion__MateriasAssignment_4 )* ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1832:1: ( ( ( rule__Planificacion__MateriasAssignment_4 ) ) ( ( rule__Planificacion__MateriasAssignment_4 )* ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1833:1: ( ( rule__Planificacion__MateriasAssignment_4 ) ) ( ( rule__Planificacion__MateriasAssignment_4 )* )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1833:1: ( ( rule__Planificacion__MateriasAssignment_4 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1834:1: ( rule__Planificacion__MateriasAssignment_4 )
            {
             before(grammarAccess.getPlanificacionAccess().getMateriasAssignment_4()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1835:1: ( rule__Planificacion__MateriasAssignment_4 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1835:2: rule__Planificacion__MateriasAssignment_4
            {
            pushFollow(FOLLOW_rule__Planificacion__MateriasAssignment_4_in_rule__Planificacion__Group__4__Impl3631);
            rule__Planificacion__MateriasAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPlanificacionAccess().getMateriasAssignment_4()); 

            }

            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1838:1: ( ( rule__Planificacion__MateriasAssignment_4 )* )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1839:1: ( rule__Planificacion__MateriasAssignment_4 )*
            {
             before(grammarAccess.getPlanificacionAccess().getMateriasAssignment_4()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1840:1: ( rule__Planificacion__MateriasAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==13) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1840:2: rule__Planificacion__MateriasAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Planificacion__MateriasAssignment_4_in_rule__Planificacion__Group__4__Impl3643);
            	    rule__Planificacion__MateriasAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1851:1: rule__Planificacion__Group__5 : rule__Planificacion__Group__5__Impl rule__Planificacion__Group__6 ;
    public final void rule__Planificacion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1855:1: ( rule__Planificacion__Group__5__Impl rule__Planificacion__Group__6 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1856:2: rule__Planificacion__Group__5__Impl rule__Planificacion__Group__6
            {
            pushFollow(FOLLOW_rule__Planificacion__Group__5__Impl_in_rule__Planificacion__Group__53676);
            rule__Planificacion__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Planificacion__Group__6_in_rule__Planificacion__Group__53679);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1863:1: rule__Planificacion__Group__5__Impl : ( ( rule__Planificacion__HorariosAssignment_5 ) ) ;
    public final void rule__Planificacion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1867:1: ( ( ( rule__Planificacion__HorariosAssignment_5 ) ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1868:1: ( ( rule__Planificacion__HorariosAssignment_5 ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1868:1: ( ( rule__Planificacion__HorariosAssignment_5 ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1869:1: ( rule__Planificacion__HorariosAssignment_5 )
            {
             before(grammarAccess.getPlanificacionAccess().getHorariosAssignment_5()); 
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1870:1: ( rule__Planificacion__HorariosAssignment_5 )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1870:2: rule__Planificacion__HorariosAssignment_5
            {
            pushFollow(FOLLOW_rule__Planificacion__HorariosAssignment_5_in_rule__Planificacion__Group__5__Impl3706);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1880:1: rule__Planificacion__Group__6 : rule__Planificacion__Group__6__Impl ;
    public final void rule__Planificacion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1884:1: ( rule__Planificacion__Group__6__Impl )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1885:2: rule__Planificacion__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Planificacion__Group__6__Impl_in_rule__Planificacion__Group__63736);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1891:1: rule__Planificacion__Group__6__Impl : ( '}' ) ;
    public final void rule__Planificacion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1895:1: ( ( '}' ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1896:1: ( '}' )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1896:1: ( '}' )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1897:1: '}'
            {
             before(grammarAccess.getPlanificacionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,24,FOLLOW_24_in_rule__Planificacion__Group__6__Impl3764); 
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1925:1: rule__Model__ProfesorsAssignment_0 : ( ruleProfesor ) ;
    public final void rule__Model__ProfesorsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1929:1: ( ( ruleProfesor ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1930:1: ( ruleProfesor )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1930:1: ( ruleProfesor )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1931:1: ruleProfesor
            {
             before(grammarAccess.getModelAccess().getProfesorsProfesorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleProfesor_in_rule__Model__ProfesorsAssignment_03814);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1940:1: rule__Model__HorasAssignment_1 : ( ruleHora ) ;
    public final void rule__Model__HorasAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1944:1: ( ( ruleHora ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1945:1: ( ruleHora )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1945:1: ( ruleHora )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1946:1: ruleHora
            {
             before(grammarAccess.getModelAccess().getHorasHoraParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleHora_in_rule__Model__HorasAssignment_13845);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1955:1: rule__Model__MateriasAssignment_2 : ( ruleMateria ) ;
    public final void rule__Model__MateriasAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1959:1: ( ( ruleMateria ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1960:1: ( ruleMateria )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1960:1: ( ruleMateria )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1961:1: ruleMateria
            {
             before(grammarAccess.getModelAccess().getMateriasMateriaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleMateria_in_rule__Model__MateriasAssignment_23876);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1970:1: rule__Model__AulasAssignment_3 : ( ruleAula ) ;
    public final void rule__Model__AulasAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1974:1: ( ( ruleAula ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1975:1: ( ruleAula )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1975:1: ( ruleAula )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1976:1: ruleAula
            {
             before(grammarAccess.getModelAccess().getAulasAulaParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAula_in_rule__Model__AulasAssignment_33907);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1985:1: rule__Model__CargasHorariasAssignment_4 : ( ruleCargaHoraria ) ;
    public final void rule__Model__CargasHorariasAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1989:1: ( ( ruleCargaHoraria ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1990:1: ( ruleCargaHoraria )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1990:1: ( ruleCargaHoraria )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:1991:1: ruleCargaHoraria
            {
             before(grammarAccess.getModelAccess().getCargasHorariasCargaHorariaParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleCargaHoraria_in_rule__Model__CargasHorariasAssignment_43938);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2000:1: rule__Model__CargasHorariasDocentesAssignment_5 : ( ruleCargaHorariaDocente ) ;
    public final void rule__Model__CargasHorariasDocentesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2004:1: ( ( ruleCargaHorariaDocente ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2005:1: ( ruleCargaHorariaDocente )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2005:1: ( ruleCargaHorariaDocente )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2006:1: ruleCargaHorariaDocente
            {
             before(grammarAccess.getModelAccess().getCargasHorariasDocentesCargaHorariaDocenteParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleCargaHorariaDocente_in_rule__Model__CargasHorariasDocentesAssignment_53969);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2015:1: rule__Model__HorariosAssignment_6 : ( ruleHorarios ) ;
    public final void rule__Model__HorariosAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2019:1: ( ( ruleHorarios ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2020:1: ( ruleHorarios )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2020:1: ( ruleHorarios )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2021:1: ruleHorarios
            {
             before(grammarAccess.getModelAccess().getHorariosHorariosParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleHorarios_in_rule__Model__HorariosAssignment_64000);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2030:1: rule__Model__DiasAssignment_7 : ( ruleDia ) ;
    public final void rule__Model__DiasAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2034:1: ( ( ruleDia ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2035:1: ( ruleDia )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2035:1: ( ruleDia )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2036:1: ruleDia
            {
             before(grammarAccess.getModelAccess().getDiasDiaParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleDia_in_rule__Model__DiasAssignment_74031);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2045:1: rule__Model__SemestreAssignment_8 : ( ruleSemestre ) ;
    public final void rule__Model__SemestreAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2049:1: ( ( ruleSemestre ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2050:1: ( ruleSemestre )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2050:1: ( ruleSemestre )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2051:1: ruleSemestre
            {
             before(grammarAccess.getModelAccess().getSemestreSemestreParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleSemestre_in_rule__Model__SemestreAssignment_84062);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2060:1: rule__Model__PlanificacionesAssignment_9 : ( rulePlanificacion ) ;
    public final void rule__Model__PlanificacionesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2064:1: ( ( rulePlanificacion ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2065:1: ( rulePlanificacion )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2065:1: ( rulePlanificacion )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2066:1: rulePlanificacion
            {
             before(grammarAccess.getModelAccess().getPlanificacionesPlanificacionParserRuleCall_9_0()); 
            pushFollow(FOLLOW_rulePlanificacion_in_rule__Model__PlanificacionesAssignment_94093);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2075:1: rule__Model__HorariosAssignment_10 : ( ruleHorario ) ;
    public final void rule__Model__HorariosAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2079:1: ( ( ruleHorario ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2080:1: ( ruleHorario )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2080:1: ( ruleHorario )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2081:1: ruleHorario
            {
             before(grammarAccess.getModelAccess().getHorariosHorarioParserRuleCall_10_0()); 
            pushFollow(FOLLOW_ruleHorario_in_rule__Model__HorariosAssignment_104124);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2090:1: rule__Profesor__NombreAssignment_1 : ( RULE_ID ) ;
    public final void rule__Profesor__NombreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2094:1: ( ( RULE_ID ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2095:1: ( RULE_ID )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2095:1: ( RULE_ID )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2096:1: RULE_ID
            {
             before(grammarAccess.getProfesorAccess().getNombreIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Profesor__NombreAssignment_14155); 
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


    // $ANTLR start "rule__Hora__HoraAssignment_1"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2105:1: rule__Hora__HoraAssignment_1 : ( RULE_INT ) ;
    public final void rule__Hora__HoraAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2109:1: ( ( RULE_INT ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2110:1: ( RULE_INT )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2110:1: ( RULE_INT )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2111:1: RULE_INT
            {
             before(grammarAccess.getHoraAccess().getHoraINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Hora__HoraAssignment_14186); 
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2120:1: rule__Materia__NombreAssignment_1 : ( RULE_ID ) ;
    public final void rule__Materia__NombreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2124:1: ( ( RULE_ID ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2125:1: ( RULE_ID )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2125:1: ( RULE_ID )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2126:1: RULE_ID
            {
             before(grammarAccess.getMateriaAccess().getNombreIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Materia__NombreAssignment_14217); 
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


    // $ANTLR start "rule__Aula__NombreAssignment_1"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2135:1: rule__Aula__NombreAssignment_1 : ( RULE_ID ) ;
    public final void rule__Aula__NombreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2139:1: ( ( RULE_ID ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2140:1: ( RULE_ID )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2140:1: ( RULE_ID )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2141:1: RULE_ID
            {
             before(grammarAccess.getAulaAccess().getNombreIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Aula__NombreAssignment_14248); 
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2150:1: rule__CargaHoraria__TipoAssignment_1 : ( RULE_ID ) ;
    public final void rule__CargaHoraria__TipoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2154:1: ( ( RULE_ID ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2155:1: ( RULE_ID )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2155:1: ( RULE_ID )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2156:1: RULE_ID
            {
             before(grammarAccess.getCargaHorariaAccess().getTipoIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CargaHoraria__TipoAssignment_14279); 
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


    // $ANTLR start "rule__CargaHorariaDocente__NombreAssignment_0"
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2165:1: rule__CargaHorariaDocente__NombreAssignment_0 : ( ruleProfesor ) ;
    public final void rule__CargaHorariaDocente__NombreAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2169:1: ( ( ruleProfesor ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2170:1: ( ruleProfesor )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2170:1: ( ruleProfesor )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2171:1: ruleProfesor
            {
             before(grammarAccess.getCargaHorariaDocenteAccess().getNombreProfesorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleProfesor_in_rule__CargaHorariaDocente__NombreAssignment_04310);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2180:1: rule__CargaHorariaDocente__TipoAssignment_2 : ( ruleCargaHoraria ) ;
    public final void rule__CargaHorariaDocente__TipoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2184:1: ( ( ruleCargaHoraria ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2185:1: ( ruleCargaHoraria )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2185:1: ( ruleCargaHoraria )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2186:1: ruleCargaHoraria
            {
             before(grammarAccess.getCargaHorariaDocenteAccess().getTipoCargaHorariaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleCargaHoraria_in_rule__CargaHorariaDocente__TipoAssignment_24341);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2195:1: rule__Horario__DiaAssignment_0 : ( ruleDia ) ;
    public final void rule__Horario__DiaAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2199:1: ( ( ruleDia ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2200:1: ( ruleDia )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2200:1: ( ruleDia )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2201:1: ruleDia
            {
             before(grammarAccess.getHorarioAccess().getDiaDiaParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDia_in_rule__Horario__DiaAssignment_04372);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2210:1: rule__Horario__DesdeAssignment_2 : ( ruleHora ) ;
    public final void rule__Horario__DesdeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2214:1: ( ( ruleHora ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2215:1: ( ruleHora )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2215:1: ( ruleHora )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2216:1: ruleHora
            {
             before(grammarAccess.getHorarioAccess().getDesdeHoraParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleHora_in_rule__Horario__DesdeAssignment_24403);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2225:1: rule__Horario__HastaAssignment_4 : ( ruleHora ) ;
    public final void rule__Horario__HastaAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2229:1: ( ( ruleHora ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2230:1: ( ruleHora )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2230:1: ( ruleHora )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2231:1: ruleHora
            {
             before(grammarAccess.getHorarioAccess().getHastaHoraParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleHora_in_rule__Horario__HastaAssignment_44434);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2240:1: rule__Horario__MateriaAssignment_6 : ( ruleMateria ) ;
    public final void rule__Horario__MateriaAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2244:1: ( ( ruleMateria ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2245:1: ( ruleMateria )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2245:1: ( ruleMateria )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2246:1: ruleMateria
            {
             before(grammarAccess.getHorarioAccess().getMateriaMateriaParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleMateria_in_rule__Horario__MateriaAssignment_64465);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2255:1: rule__Horario__AulaAssignment_8 : ( ruleAula ) ;
    public final void rule__Horario__AulaAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2259:1: ( ( ruleAula ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2260:1: ( ruleAula )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2260:1: ( ruleAula )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2261:1: ruleAula
            {
             before(grammarAccess.getHorarioAccess().getAulaAulaParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleAula_in_rule__Horario__AulaAssignment_84496);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2270:1: rule__Semestre__AnhoAssignment_0 : ( RULE_INT ) ;
    public final void rule__Semestre__AnhoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2274:1: ( ( RULE_INT ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2275:1: ( RULE_INT )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2275:1: ( RULE_INT )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2276:1: RULE_INT
            {
             before(grammarAccess.getSemestreAccess().getAnhoINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Semestre__AnhoAssignment_04527); 
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2285:1: rule__Semestre__NumeroAssignment_2 : ( RULE_INT ) ;
    public final void rule__Semestre__NumeroAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2289:1: ( ( RULE_INT ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2290:1: ( RULE_INT )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2290:1: ( RULE_INT )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2291:1: RULE_INT
            {
             before(grammarAccess.getSemestreAccess().getNumeroINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Semestre__NumeroAssignment_24558); 
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2300:1: rule__Dia__DiaAssignment_1 : ( RULE_ID ) ;
    public final void rule__Dia__DiaAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2304:1: ( ( RULE_ID ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2305:1: ( RULE_ID )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2305:1: ( RULE_ID )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2306:1: RULE_ID
            {
             before(grammarAccess.getDiaAccess().getDiaIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Dia__DiaAssignment_14589); 
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2315:1: rule__Horarios__HorariosAssignment_1 : ( ruleHorario ) ;
    public final void rule__Horarios__HorariosAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2319:1: ( ( ruleHorario ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2320:1: ( ruleHorario )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2320:1: ( ruleHorario )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2321:1: ruleHorario
            {
             before(grammarAccess.getHorariosAccess().getHorariosHorarioParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleHorario_in_rule__Horarios__HorariosAssignment_14620);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2330:1: rule__Planificacion__SemestreAssignment_1 : ( ruleSemestre ) ;
    public final void rule__Planificacion__SemestreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2334:1: ( ( ruleSemestre ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2335:1: ( ruleSemestre )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2335:1: ( ruleSemestre )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2336:1: ruleSemestre
            {
             before(grammarAccess.getPlanificacionAccess().getSemestreSemestreParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSemestre_in_rule__Planificacion__SemestreAssignment_14651);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2345:1: rule__Planificacion__MateriasAssignment_4 : ( ruleMateria ) ;
    public final void rule__Planificacion__MateriasAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2349:1: ( ( ruleMateria ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2350:1: ( ruleMateria )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2350:1: ( ruleMateria )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2351:1: ruleMateria
            {
             before(grammarAccess.getPlanificacionAccess().getMateriasMateriaParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleMateria_in_rule__Planificacion__MateriasAssignment_44682);
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
    // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2360:1: rule__Planificacion__HorariosAssignment_5 : ( ruleHorarios ) ;
    public final void rule__Planificacion__HorariosAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2364:1: ( ( ruleHorarios ) )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2365:1: ( ruleHorarios )
            {
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2365:1: ( ruleHorarios )
            // ../org.xtext.unq.planificadorDeMaterias.ui/src-gen/org/xtext/unq/planificador/ui/contentassist/antlr/internal/InternalPdm.g:2366:1: ruleHorarios
            {
             before(grammarAccess.getPlanificacionAccess().getHorariosHorariosParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleHorarios_in_rule__Planificacion__HorariosAssignment_54713);
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
    public static final BitSet FOLLOW_ruleMateria_in_entryRuleMateria241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMateria248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Materia__Group__0_in_ruleMateria274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAula_in_entryRuleAula301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAula308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aula__Group__0_in_ruleAula334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCargaHoraria_in_entryRuleCargaHoraria361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCargaHoraria368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CargaHoraria__Group__0_in_ruleCargaHoraria394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCargaHorariaDocente_in_entryRuleCargaHorariaDocente421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCargaHorariaDocente428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CargaHorariaDocente__Group__0_in_ruleCargaHorariaDocente454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHorario_in_entryRuleHorario481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHorario488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Horario__Group__0_in_ruleHorario514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSemestre_in_entryRuleSemestre541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSemestre548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Semestre__Group__0_in_ruleSemestre574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDia_in_entryRuleDia601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDia608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dia__Group__0_in_ruleDia634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHorarios_in_entryRuleHorarios661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHorarios668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Horarios__Group__0_in_ruleHorarios694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlanificacion_in_entryRulePlanificacion721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlanificacion728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Planificacion__Group__0_in_rulePlanificacion754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0788 = new BitSet(new long[]{0x0000000002C0F820L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ProfesorsAssignment_0_in_rule__Model__Group__0__Impl818 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1849 = new BitSet(new long[]{0x0000000002C0F820L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__HorasAssignment_1_in_rule__Model__Group__1__Impl879 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2910 = new BitSet(new long[]{0x0000000002C0F820L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__MateriasAssignment_2_in_rule__Model__Group__2__Impl940 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3971 = new BitSet(new long[]{0x0000000002C0F820L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__3974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__AulasAssignment_3_in_rule__Model__Group__3__Impl1001 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41032 = new BitSet(new long[]{0x0000000002C0F820L});
    public static final BitSet FOLLOW_rule__Model__Group__5_in_rule__Model__Group__41035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__CargasHorariasAssignment_4_in_rule__Model__Group__4__Impl1062 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__51093 = new BitSet(new long[]{0x0000000002C0F820L});
    public static final BitSet FOLLOW_rule__Model__Group__6_in_rule__Model__Group__51096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__CargasHorariasDocentesAssignment_5_in_rule__Model__Group__5__Impl1123 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__61154 = new BitSet(new long[]{0x0000000002C0F820L});
    public static final BitSet FOLLOW_rule__Model__Group__7_in_rule__Model__Group__61157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__HorariosAssignment_6_in_rule__Model__Group__6__Impl1184 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Model__Group__7__Impl_in_rule__Model__Group__71215 = new BitSet(new long[]{0x0000000002C0F820L});
    public static final BitSet FOLLOW_rule__Model__Group__8_in_rule__Model__Group__71218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DiasAssignment_7_in_rule__Model__Group__7__Impl1245 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Model__Group__8__Impl_in_rule__Model__Group__81276 = new BitSet(new long[]{0x0000000002C0F820L});
    public static final BitSet FOLLOW_rule__Model__Group__9_in_rule__Model__Group__81279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__SemestreAssignment_8_in_rule__Model__Group__8__Impl1306 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Model__Group__9__Impl_in_rule__Model__Group__91337 = new BitSet(new long[]{0x0000000002C0F820L});
    public static final BitSet FOLLOW_rule__Model__Group__10_in_rule__Model__Group__91340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PlanificacionesAssignment_9_in_rule__Model__Group__9__Impl1367 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Model__Group__10__Impl_in_rule__Model__Group__101398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__HorariosAssignment_10_in_rule__Model__Group__10__Impl1425 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Profesor__Group__0__Impl_in_rule__Profesor__Group__01478 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Profesor__Group__1_in_rule__Profesor__Group__01481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Profesor__Group__0__Impl1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Profesor__Group__1__Impl_in_rule__Profesor__Group__11540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Profesor__NombreAssignment_1_in_rule__Profesor__Group__1__Impl1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hora__Group__0__Impl_in_rule__Hora__Group__01601 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Hora__Group__1_in_rule__Hora__Group__01604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Hora__Group__0__Impl1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hora__Group__1__Impl_in_rule__Hora__Group__11663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hora__HoraAssignment_1_in_rule__Hora__Group__1__Impl1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Materia__Group__0__Impl_in_rule__Materia__Group__01724 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Materia__Group__1_in_rule__Materia__Group__01727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Materia__Group__0__Impl1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Materia__Group__1__Impl_in_rule__Materia__Group__11786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Materia__NombreAssignment_1_in_rule__Materia__Group__1__Impl1813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aula__Group__0__Impl_in_rule__Aula__Group__01847 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Aula__Group__1_in_rule__Aula__Group__01850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Aula__Group__0__Impl1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aula__Group__1__Impl_in_rule__Aula__Group__11909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aula__NombreAssignment_1_in_rule__Aula__Group__1__Impl1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CargaHoraria__Group__0__Impl_in_rule__CargaHoraria__Group__01970 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CargaHoraria__Group__1_in_rule__CargaHoraria__Group__01973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__CargaHoraria__Group__0__Impl2001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CargaHoraria__Group__1__Impl_in_rule__CargaHoraria__Group__12032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CargaHoraria__TipoAssignment_1_in_rule__CargaHoraria__Group__1__Impl2059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CargaHorariaDocente__Group__0__Impl_in_rule__CargaHorariaDocente__Group__02093 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__CargaHorariaDocente__Group__1_in_rule__CargaHorariaDocente__Group__02096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CargaHorariaDocente__NombreAssignment_0_in_rule__CargaHorariaDocente__Group__0__Impl2123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CargaHorariaDocente__Group__1__Impl_in_rule__CargaHorariaDocente__Group__12153 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__CargaHorariaDocente__Group__2_in_rule__CargaHorariaDocente__Group__12156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__CargaHorariaDocente__Group__1__Impl2184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CargaHorariaDocente__Group__2__Impl_in_rule__CargaHorariaDocente__Group__22215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CargaHorariaDocente__TipoAssignment_2_in_rule__CargaHorariaDocente__Group__2__Impl2242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Horario__Group__0__Impl_in_rule__Horario__Group__02278 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Horario__Group__1_in_rule__Horario__Group__02281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Horario__DiaAssignment_0_in_rule__Horario__Group__0__Impl2308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Horario__Group__1__Impl_in_rule__Horario__Group__12338 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Horario__Group__2_in_rule__Horario__Group__12341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Horario__Group__1__Impl2369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Horario__Group__2__Impl_in_rule__Horario__Group__22400 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Horario__Group__3_in_rule__Horario__Group__22403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Horario__DesdeAssignment_2_in_rule__Horario__Group__2__Impl2430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Horario__Group__3__Impl_in_rule__Horario__Group__32460 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Horario__Group__4_in_rule__Horario__Group__32463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Horario__Group__3__Impl2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Horario__Group__4__Impl_in_rule__Horario__Group__42522 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Horario__Group__5_in_rule__Horario__Group__42525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Horario__HastaAssignment_4_in_rule__Horario__Group__4__Impl2552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Horario__Group__5__Impl_in_rule__Horario__Group__52582 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Horario__Group__6_in_rule__Horario__Group__52585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Horario__Group__5__Impl2613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Horario__Group__6__Impl_in_rule__Horario__Group__62644 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Horario__Group__7_in_rule__Horario__Group__62647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Horario__MateriaAssignment_6_in_rule__Horario__Group__6__Impl2674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Horario__Group__7__Impl_in_rule__Horario__Group__72704 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Horario__Group__8_in_rule__Horario__Group__72707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Horario__Group__7__Impl2735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Horario__Group__8__Impl_in_rule__Horario__Group__82766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Horario__AulaAssignment_8_in_rule__Horario__Group__8__Impl2793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Semestre__Group__0__Impl_in_rule__Semestre__Group__02841 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Semestre__Group__1_in_rule__Semestre__Group__02844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Semestre__AnhoAssignment_0_in_rule__Semestre__Group__0__Impl2871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Semestre__Group__1__Impl_in_rule__Semestre__Group__12901 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Semestre__Group__2_in_rule__Semestre__Group__12904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Semestre__Group__1__Impl2932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Semestre__Group__2__Impl_in_rule__Semestre__Group__22963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Semestre__NumeroAssignment_2_in_rule__Semestre__Group__2__Impl2990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dia__Group__0__Impl_in_rule__Dia__Group__03026 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Dia__Group__1_in_rule__Dia__Group__03029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Dia__Group__0__Impl3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dia__Group__1__Impl_in_rule__Dia__Group__13088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dia__DiaAssignment_1_in_rule__Dia__Group__1__Impl3115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Horarios__Group__0__Impl_in_rule__Horarios__Group__03149 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Horarios__Group__1_in_rule__Horarios__Group__03152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Horarios__Group__0__Impl3180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Horarios__Group__1__Impl_in_rule__Horarios__Group__13211 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Horarios__Group__2_in_rule__Horarios__Group__13214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Horarios__HorariosAssignment_1_in_rule__Horarios__Group__1__Impl3243 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Horarios__HorariosAssignment_1_in_rule__Horarios__Group__1__Impl3255 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Horarios__Group__2__Impl_in_rule__Horarios__Group__23288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Horarios__Group__2__Impl3316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Planificacion__Group__0__Impl_in_rule__Planificacion__Group__03353 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Planificacion__Group__1_in_rule__Planificacion__Group__03356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Planificacion__Group__0__Impl3384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Planificacion__Group__1__Impl_in_rule__Planificacion__Group__13415 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Planificacion__Group__2_in_rule__Planificacion__Group__13418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Planificacion__SemestreAssignment_1_in_rule__Planificacion__Group__1__Impl3445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Planificacion__Group__2__Impl_in_rule__Planificacion__Group__23475 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Planificacion__Group__3_in_rule__Planificacion__Group__23478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Planificacion__Group__2__Impl3506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Planificacion__Group__3__Impl_in_rule__Planificacion__Group__33537 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Planificacion__Group__4_in_rule__Planificacion__Group__33540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Planificacion__Group__3__Impl3568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Planificacion__Group__4__Impl_in_rule__Planificacion__Group__43599 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Planificacion__Group__5_in_rule__Planificacion__Group__43602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Planificacion__MateriasAssignment_4_in_rule__Planificacion__Group__4__Impl3631 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Planificacion__MateriasAssignment_4_in_rule__Planificacion__Group__4__Impl3643 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Planificacion__Group__5__Impl_in_rule__Planificacion__Group__53676 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Planificacion__Group__6_in_rule__Planificacion__Group__53679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Planificacion__HorariosAssignment_5_in_rule__Planificacion__Group__5__Impl3706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Planificacion__Group__6__Impl_in_rule__Planificacion__Group__63736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Planificacion__Group__6__Impl3764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProfesor_in_rule__Model__ProfesorsAssignment_03814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHora_in_rule__Model__HorasAssignment_13845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMateria_in_rule__Model__MateriasAssignment_23876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAula_in_rule__Model__AulasAssignment_33907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCargaHoraria_in_rule__Model__CargasHorariasAssignment_43938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCargaHorariaDocente_in_rule__Model__CargasHorariasDocentesAssignment_53969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHorarios_in_rule__Model__HorariosAssignment_64000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDia_in_rule__Model__DiasAssignment_74031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSemestre_in_rule__Model__SemestreAssignment_84062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlanificacion_in_rule__Model__PlanificacionesAssignment_94093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHorario_in_rule__Model__HorariosAssignment_104124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Profesor__NombreAssignment_14155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Hora__HoraAssignment_14186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Materia__NombreAssignment_14217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Aula__NombreAssignment_14248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CargaHoraria__TipoAssignment_14279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProfesor_in_rule__CargaHorariaDocente__NombreAssignment_04310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCargaHoraria_in_rule__CargaHorariaDocente__TipoAssignment_24341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDia_in_rule__Horario__DiaAssignment_04372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHora_in_rule__Horario__DesdeAssignment_24403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHora_in_rule__Horario__HastaAssignment_44434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMateria_in_rule__Horario__MateriaAssignment_64465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAula_in_rule__Horario__AulaAssignment_84496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Semestre__AnhoAssignment_04527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Semestre__NumeroAssignment_24558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Dia__DiaAssignment_14589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHorario_in_rule__Horarios__HorariosAssignment_14620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSemestre_in_rule__Planificacion__SemestreAssignment_14651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMateria_in_rule__Planificacion__MateriasAssignment_44682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHorarios_in_rule__Planificacion__HorariosAssignment_54713 = new BitSet(new long[]{0x0000000000000002L});

}