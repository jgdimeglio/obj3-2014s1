package org.xtext.unq.planificador.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.unq.planificador.services.PdmGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPdmParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'profesor'", "'dedicacion'", "'hora'", "'simple'", "'semi'", "'exclusiva'", "'materia'", "'con'", "'aula'", "'cargaHoraria'", "'dias'", "'tiene'", "':'", "'a'", "'hs se dicta'", "'en'", "'semestre'", "'dia'", "'horarios {'", "'}'", "'planificacion'", "'{'", "'a dictar:'"
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
    public String getGrammarFileName() { return "../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g"; }



     	private PdmGrammarAccess grammarAccess;
     	
        public InternalPdmParser(TokenStream input, PdmGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected PdmGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_profesors_0_0= ruleProfesor ) )* ( (lv_horas_1_0= ruleHora ) )* ( (lv_materias_2_0= ruleMateria ) )* ( (lv_aulas_3_0= ruleAula ) )* ( (lv_cargasHorarias_4_0= ruleCargaHoraria ) )* ( (lv_cargasHorariasDocentes_5_0= ruleCargaHorariaDocente ) )* ( (lv_horarios_6_0= ruleHorarios ) )* ( (lv_dias_7_0= ruleDia ) )* ( (lv_semestre_8_0= ruleSemestre ) )* ( (lv_planificaciones_9_0= rulePlanificacion ) )* ( (lv_horarios_10_0= ruleHorario ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_profesors_0_0 = null;

        EObject lv_horas_1_0 = null;

        EObject lv_materias_2_0 = null;

        EObject lv_aulas_3_0 = null;

        EObject lv_cargasHorarias_4_0 = null;

        EObject lv_cargasHorariasDocentes_5_0 = null;

        EObject lv_horarios_6_0 = null;

        EObject lv_dias_7_0 = null;

        EObject lv_semestre_8_0 = null;

        EObject lv_planificaciones_9_0 = null;

        EObject lv_horarios_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:79:28: ( ( ( (lv_profesors_0_0= ruleProfesor ) )* ( (lv_horas_1_0= ruleHora ) )* ( (lv_materias_2_0= ruleMateria ) )* ( (lv_aulas_3_0= ruleAula ) )* ( (lv_cargasHorarias_4_0= ruleCargaHoraria ) )* ( (lv_cargasHorariasDocentes_5_0= ruleCargaHorariaDocente ) )* ( (lv_horarios_6_0= ruleHorarios ) )* ( (lv_dias_7_0= ruleDia ) )* ( (lv_semestre_8_0= ruleSemestre ) )* ( (lv_planificaciones_9_0= rulePlanificacion ) )* ( (lv_horarios_10_0= ruleHorario ) )* ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:80:1: ( ( (lv_profesors_0_0= ruleProfesor ) )* ( (lv_horas_1_0= ruleHora ) )* ( (lv_materias_2_0= ruleMateria ) )* ( (lv_aulas_3_0= ruleAula ) )* ( (lv_cargasHorarias_4_0= ruleCargaHoraria ) )* ( (lv_cargasHorariasDocentes_5_0= ruleCargaHorariaDocente ) )* ( (lv_horarios_6_0= ruleHorarios ) )* ( (lv_dias_7_0= ruleDia ) )* ( (lv_semestre_8_0= ruleSemestre ) )* ( (lv_planificaciones_9_0= rulePlanificacion ) )* ( (lv_horarios_10_0= ruleHorario ) )* )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:80:1: ( ( (lv_profesors_0_0= ruleProfesor ) )* ( (lv_horas_1_0= ruleHora ) )* ( (lv_materias_2_0= ruleMateria ) )* ( (lv_aulas_3_0= ruleAula ) )* ( (lv_cargasHorarias_4_0= ruleCargaHoraria ) )* ( (lv_cargasHorariasDocentes_5_0= ruleCargaHorariaDocente ) )* ( (lv_horarios_6_0= ruleHorarios ) )* ( (lv_dias_7_0= ruleDia ) )* ( (lv_semestre_8_0= ruleSemestre ) )* ( (lv_planificaciones_9_0= rulePlanificacion ) )* ( (lv_horarios_10_0= ruleHorario ) )* )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:80:2: ( (lv_profesors_0_0= ruleProfesor ) )* ( (lv_horas_1_0= ruleHora ) )* ( (lv_materias_2_0= ruleMateria ) )* ( (lv_aulas_3_0= ruleAula ) )* ( (lv_cargasHorarias_4_0= ruleCargaHoraria ) )* ( (lv_cargasHorariasDocentes_5_0= ruleCargaHorariaDocente ) )* ( (lv_horarios_6_0= ruleHorarios ) )* ( (lv_dias_7_0= ruleDia ) )* ( (lv_semestre_8_0= ruleSemestre ) )* ( (lv_planificaciones_9_0= rulePlanificacion ) )* ( (lv_horarios_10_0= ruleHorario ) )*
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:80:2: ( (lv_profesors_0_0= ruleProfesor ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    int LA1_2 = input.LA(2);

                    if ( (LA1_2==RULE_ID) ) {
                        int LA1_3 = input.LA(3);

                        if ( (LA1_3==12) ) {
                            switch ( input.LA(4) ) {
                            case 14:
                                {
                                int LA1_5 = input.LA(5);

                                if ( (LA1_5==EOF||LA1_5==RULE_INT||LA1_5==11||LA1_5==13||LA1_5==17||(LA1_5>=19 && LA1_5<=20)||(LA1_5>=28 && LA1_5<=29)||LA1_5==31) ) {
                                    alt1=1;
                                }


                                }
                                break;
                            case 15:
                                {
                                int LA1_6 = input.LA(5);

                                if ( (LA1_6==EOF||LA1_6==RULE_INT||LA1_6==11||LA1_6==13||LA1_6==17||(LA1_6>=19 && LA1_6<=20)||(LA1_6>=28 && LA1_6<=29)||LA1_6==31) ) {
                                    alt1=1;
                                }


                                }
                                break;
                            case 16:
                                {
                                int LA1_7 = input.LA(5);

                                if ( (LA1_7==EOF||LA1_7==RULE_INT||LA1_7==11||LA1_7==13||LA1_7==17||(LA1_7>=19 && LA1_7<=20)||(LA1_7>=28 && LA1_7<=29)||LA1_7==31) ) {
                                    alt1=1;
                                }


                                }
                                break;

                            }

                        }


                    }


                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:81:1: (lv_profesors_0_0= ruleProfesor )
            	    {
            	    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:81:1: (lv_profesors_0_0= ruleProfesor )
            	    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:82:3: lv_profesors_0_0= ruleProfesor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getProfesorsProfesorParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProfesor_in_ruleModel131);
            	    lv_profesors_0_0=ruleProfesor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"profesors",
            	            		lv_profesors_0_0, 
            	            		"Profesor");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:98:3: ( (lv_horas_1_0= ruleHora ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:99:1: (lv_horas_1_0= ruleHora )
            	    {
            	    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:99:1: (lv_horas_1_0= ruleHora )
            	    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:100:3: lv_horas_1_0= ruleHora
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getHorasHoraParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHora_in_ruleModel153);
            	    lv_horas_1_0=ruleHora();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"horas",
            	            		lv_horas_1_0, 
            	            		"Hora");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:116:3: ( (lv_materias_2_0= ruleMateria ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:117:1: (lv_materias_2_0= ruleMateria )
            	    {
            	    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:117:1: (lv_materias_2_0= ruleMateria )
            	    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:118:3: lv_materias_2_0= ruleMateria
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getMateriasMateriaParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMateria_in_ruleModel175);
            	    lv_materias_2_0=ruleMateria();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"materias",
            	            		lv_materias_2_0, 
            	            		"Materia");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:134:3: ( (lv_aulas_3_0= ruleAula ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:135:1: (lv_aulas_3_0= ruleAula )
            	    {
            	    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:135:1: (lv_aulas_3_0= ruleAula )
            	    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:136:3: lv_aulas_3_0= ruleAula
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getAulasAulaParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAula_in_ruleModel197);
            	    lv_aulas_3_0=ruleAula();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"aulas",
            	            		lv_aulas_3_0, 
            	            		"Aula");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:152:3: ( (lv_cargasHorarias_4_0= ruleCargaHoraria ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:153:1: (lv_cargasHorarias_4_0= ruleCargaHoraria )
            	    {
            	    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:153:1: (lv_cargasHorarias_4_0= ruleCargaHoraria )
            	    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:154:3: lv_cargasHorarias_4_0= ruleCargaHoraria
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getCargasHorariasCargaHorariaParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCargaHoraria_in_ruleModel219);
            	    lv_cargasHorarias_4_0=ruleCargaHoraria();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"cargasHorarias",
            	            		lv_cargasHorarias_4_0, 
            	            		"CargaHoraria");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:170:3: ( (lv_cargasHorariasDocentes_5_0= ruleCargaHorariaDocente ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==11) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:171:1: (lv_cargasHorariasDocentes_5_0= ruleCargaHorariaDocente )
            	    {
            	    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:171:1: (lv_cargasHorariasDocentes_5_0= ruleCargaHorariaDocente )
            	    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:172:3: lv_cargasHorariasDocentes_5_0= ruleCargaHorariaDocente
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getCargasHorariasDocentesCargaHorariaDocenteParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCargaHorariaDocente_in_ruleModel241);
            	    lv_cargasHorariasDocentes_5_0=ruleCargaHorariaDocente();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"cargasHorariasDocentes",
            	            		lv_cargasHorariasDocentes_5_0, 
            	            		"CargaHorariaDocente");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:188:3: ( (lv_horarios_6_0= ruleHorarios ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==29) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:189:1: (lv_horarios_6_0= ruleHorarios )
            	    {
            	    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:189:1: (lv_horarios_6_0= ruleHorarios )
            	    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:190:3: lv_horarios_6_0= ruleHorarios
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getHorariosHorariosParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHorarios_in_ruleModel263);
            	    lv_horarios_6_0=ruleHorarios();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"horarios",
            	            		lv_horarios_6_0, 
            	            		"Horarios");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:206:3: ( (lv_dias_7_0= ruleDia ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==28) ) {
                    int LA8_2 = input.LA(2);

                    if ( (LA8_2==RULE_ID) ) {
                        int LA8_3 = input.LA(3);

                        if ( (LA8_3==EOF||LA8_3==RULE_INT||LA8_3==28||LA8_3==31) ) {
                            alt8=1;
                        }


                    }


                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:207:1: (lv_dias_7_0= ruleDia )
            	    {
            	    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:207:1: (lv_dias_7_0= ruleDia )
            	    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:208:3: lv_dias_7_0= ruleDia
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getDiasDiaParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDia_in_ruleModel285);
            	    lv_dias_7_0=ruleDia();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dias",
            	            		lv_dias_7_0, 
            	            		"Dia");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:224:3: ( (lv_semestre_8_0= ruleSemestre ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_INT) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:225:1: (lv_semestre_8_0= ruleSemestre )
            	    {
            	    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:225:1: (lv_semestre_8_0= ruleSemestre )
            	    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:226:3: lv_semestre_8_0= ruleSemestre
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getSemestreSemestreParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSemestre_in_ruleModel307);
            	    lv_semestre_8_0=ruleSemestre();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"semestre",
            	            		lv_semestre_8_0, 
            	            		"Semestre");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:242:3: ( (lv_planificaciones_9_0= rulePlanificacion ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==31) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:243:1: (lv_planificaciones_9_0= rulePlanificacion )
            	    {
            	    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:243:1: (lv_planificaciones_9_0= rulePlanificacion )
            	    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:244:3: lv_planificaciones_9_0= rulePlanificacion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getPlanificacionesPlanificacionParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePlanificacion_in_ruleModel329);
            	    lv_planificaciones_9_0=rulePlanificacion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"planificaciones",
            	            		lv_planificaciones_9_0, 
            	            		"Planificacion");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:260:3: ( (lv_horarios_10_0= ruleHorario ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==28) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:261:1: (lv_horarios_10_0= ruleHorario )
            	    {
            	    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:261:1: (lv_horarios_10_0= ruleHorario )
            	    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:262:3: lv_horarios_10_0= ruleHorario
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getHorariosHorarioParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHorario_in_ruleModel351);
            	    lv_horarios_10_0=ruleHorario();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"horarios",
            	            		lv_horarios_10_0, 
            	            		"Horario");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleProfesor"
    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:286:1: entryRuleProfesor returns [EObject current=null] : iv_ruleProfesor= ruleProfesor EOF ;
    public final EObject entryRuleProfesor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProfesor = null;


        try {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:287:2: (iv_ruleProfesor= ruleProfesor EOF )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:288:2: iv_ruleProfesor= ruleProfesor EOF
            {
             newCompositeNode(grammarAccess.getProfesorRule()); 
            pushFollow(FOLLOW_ruleProfesor_in_entryRuleProfesor388);
            iv_ruleProfesor=ruleProfesor();

            state._fsp--;

             current =iv_ruleProfesor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProfesor398); 

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
    // $ANTLR end "entryRuleProfesor"


    // $ANTLR start "ruleProfesor"
    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:295:1: ruleProfesor returns [EObject current=null] : (otherlv_0= 'profesor' ( (lv_nombre_1_0= RULE_ID ) ) otherlv_2= 'dedicacion' ( (lv_dedicacion_3_0= ruleDedicacion ) ) ) ;
    public final EObject ruleProfesor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nombre_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_dedicacion_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:298:28: ( (otherlv_0= 'profesor' ( (lv_nombre_1_0= RULE_ID ) ) otherlv_2= 'dedicacion' ( (lv_dedicacion_3_0= ruleDedicacion ) ) ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:299:1: (otherlv_0= 'profesor' ( (lv_nombre_1_0= RULE_ID ) ) otherlv_2= 'dedicacion' ( (lv_dedicacion_3_0= ruleDedicacion ) ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:299:1: (otherlv_0= 'profesor' ( (lv_nombre_1_0= RULE_ID ) ) otherlv_2= 'dedicacion' ( (lv_dedicacion_3_0= ruleDedicacion ) ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:299:3: otherlv_0= 'profesor' ( (lv_nombre_1_0= RULE_ID ) ) otherlv_2= 'dedicacion' ( (lv_dedicacion_3_0= ruleDedicacion ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleProfesor435); 

                	newLeafNode(otherlv_0, grammarAccess.getProfesorAccess().getProfesorKeyword_0());
                
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:303:1: ( (lv_nombre_1_0= RULE_ID ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:304:1: (lv_nombre_1_0= RULE_ID )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:304:1: (lv_nombre_1_0= RULE_ID )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:305:3: lv_nombre_1_0= RULE_ID
            {
            lv_nombre_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProfesor452); 

            			newLeafNode(lv_nombre_1_0, grammarAccess.getProfesorAccess().getNombreIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProfesorRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"nombre",
                    		lv_nombre_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleProfesor469); 

                	newLeafNode(otherlv_2, grammarAccess.getProfesorAccess().getDedicacionKeyword_2());
                
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:325:1: ( (lv_dedicacion_3_0= ruleDedicacion ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:326:1: (lv_dedicacion_3_0= ruleDedicacion )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:326:1: (lv_dedicacion_3_0= ruleDedicacion )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:327:3: lv_dedicacion_3_0= ruleDedicacion
            {
             
            	        newCompositeNode(grammarAccess.getProfesorAccess().getDedicacionDedicacionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleDedicacion_in_ruleProfesor490);
            lv_dedicacion_3_0=ruleDedicacion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProfesorRule());
            	        }
                   		add(
                   			current, 
                   			"dedicacion",
                    		lv_dedicacion_3_0, 
                    		"Dedicacion");
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
    // $ANTLR end "ruleProfesor"


    // $ANTLR start "entryRuleHora"
    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:351:1: entryRuleHora returns [EObject current=null] : iv_ruleHora= ruleHora EOF ;
    public final EObject entryRuleHora() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHora = null;


        try {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:352:2: (iv_ruleHora= ruleHora EOF )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:353:2: iv_ruleHora= ruleHora EOF
            {
             newCompositeNode(grammarAccess.getHoraRule()); 
            pushFollow(FOLLOW_ruleHora_in_entryRuleHora526);
            iv_ruleHora=ruleHora();

            state._fsp--;

             current =iv_ruleHora; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHora536); 

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
    // $ANTLR end "entryRuleHora"


    // $ANTLR start "ruleHora"
    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:360:1: ruleHora returns [EObject current=null] : (otherlv_0= 'hora' ( (lv_hora_1_0= RULE_INT ) ) ) ;
    public final EObject ruleHora() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hora_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:363:28: ( (otherlv_0= 'hora' ( (lv_hora_1_0= RULE_INT ) ) ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:364:1: (otherlv_0= 'hora' ( (lv_hora_1_0= RULE_INT ) ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:364:1: (otherlv_0= 'hora' ( (lv_hora_1_0= RULE_INT ) ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:364:3: otherlv_0= 'hora' ( (lv_hora_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleHora573); 

                	newLeafNode(otherlv_0, grammarAccess.getHoraAccess().getHoraKeyword_0());
                
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:368:1: ( (lv_hora_1_0= RULE_INT ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:369:1: (lv_hora_1_0= RULE_INT )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:369:1: (lv_hora_1_0= RULE_INT )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:370:3: lv_hora_1_0= RULE_INT
            {
            lv_hora_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleHora590); 

            			newLeafNode(lv_hora_1_0, grammarAccess.getHoraAccess().getHoraINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHoraRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"hora",
                    		lv_hora_1_0, 
                    		"INT");
            	    

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
    // $ANTLR end "ruleHora"


    // $ANTLR start "entryRuleDedicacion"
    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:394:1: entryRuleDedicacion returns [String current=null] : iv_ruleDedicacion= ruleDedicacion EOF ;
    public final String entryRuleDedicacion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDedicacion = null;


        try {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:395:2: (iv_ruleDedicacion= ruleDedicacion EOF )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:396:2: iv_ruleDedicacion= ruleDedicacion EOF
            {
             newCompositeNode(grammarAccess.getDedicacionRule()); 
            pushFollow(FOLLOW_ruleDedicacion_in_entryRuleDedicacion632);
            iv_ruleDedicacion=ruleDedicacion();

            state._fsp--;

             current =iv_ruleDedicacion.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDedicacion643); 

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
    // $ANTLR end "entryRuleDedicacion"


    // $ANTLR start "ruleDedicacion"
    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:403:1: ruleDedicacion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SIMPLE_0= ruleSIMPLE | this_SEMI_1= ruleSEMI | this_EXCLUSIVA_2= ruleEXCLUSIVA ) ;
    public final AntlrDatatypeRuleToken ruleDedicacion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_SIMPLE_0 = null;

        AntlrDatatypeRuleToken this_SEMI_1 = null;

        AntlrDatatypeRuleToken this_EXCLUSIVA_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:406:28: ( (this_SIMPLE_0= ruleSIMPLE | this_SEMI_1= ruleSEMI | this_EXCLUSIVA_2= ruleEXCLUSIVA ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:407:1: (this_SIMPLE_0= ruleSIMPLE | this_SEMI_1= ruleSEMI | this_EXCLUSIVA_2= ruleEXCLUSIVA )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:407:1: (this_SIMPLE_0= ruleSIMPLE | this_SEMI_1= ruleSEMI | this_EXCLUSIVA_2= ruleEXCLUSIVA )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt12=1;
                }
                break;
            case 15:
                {
                alt12=2;
                }
                break;
            case 16:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:408:5: this_SIMPLE_0= ruleSIMPLE
                    {
                     
                            newCompositeNode(grammarAccess.getDedicacionAccess().getSIMPLEParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSIMPLE_in_ruleDedicacion690);
                    this_SIMPLE_0=ruleSIMPLE();

                    state._fsp--;


                    		current.merge(this_SIMPLE_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:420:5: this_SEMI_1= ruleSEMI
                    {
                     
                            newCompositeNode(grammarAccess.getDedicacionAccess().getSEMIParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSEMI_in_ruleDedicacion723);
                    this_SEMI_1=ruleSEMI();

                    state._fsp--;


                    		current.merge(this_SEMI_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:432:5: this_EXCLUSIVA_2= ruleEXCLUSIVA
                    {
                     
                            newCompositeNode(grammarAccess.getDedicacionAccess().getEXCLUSIVAParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleEXCLUSIVA_in_ruleDedicacion756);
                    this_EXCLUSIVA_2=ruleEXCLUSIVA();

                    state._fsp--;


                    		current.merge(this_EXCLUSIVA_2);
                        
                     
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
    // $ANTLR end "ruleDedicacion"


    // $ANTLR start "entryRuleSIMPLE"
    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:450:1: entryRuleSIMPLE returns [String current=null] : iv_ruleSIMPLE= ruleSIMPLE EOF ;
    public final String entryRuleSIMPLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSIMPLE = null;


        try {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:451:2: (iv_ruleSIMPLE= ruleSIMPLE EOF )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:452:2: iv_ruleSIMPLE= ruleSIMPLE EOF
            {
             newCompositeNode(grammarAccess.getSIMPLERule()); 
            pushFollow(FOLLOW_ruleSIMPLE_in_entryRuleSIMPLE802);
            iv_ruleSIMPLE=ruleSIMPLE();

            state._fsp--;

             current =iv_ruleSIMPLE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSIMPLE813); 

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
    // $ANTLR end "entryRuleSIMPLE"


    // $ANTLR start "ruleSIMPLE"
    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:459:1: ruleSIMPLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'simple' ;
    public final AntlrDatatypeRuleToken ruleSIMPLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:462:28: (kw= 'simple' )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:464:2: kw= 'simple'
            {
            kw=(Token)match(input,14,FOLLOW_14_in_ruleSIMPLE850); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSIMPLEAccess().getSimpleKeyword()); 
                

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
    // $ANTLR end "ruleSIMPLE"


    // $ANTLR start "entryRuleSEMI"
    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:477:1: entryRuleSEMI returns [String current=null] : iv_ruleSEMI= ruleSEMI EOF ;
    public final String entryRuleSEMI() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSEMI = null;


        try {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:478:2: (iv_ruleSEMI= ruleSEMI EOF )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:479:2: iv_ruleSEMI= ruleSEMI EOF
            {
             newCompositeNode(grammarAccess.getSEMIRule()); 
            pushFollow(FOLLOW_ruleSEMI_in_entryRuleSEMI890);
            iv_ruleSEMI=ruleSEMI();

            state._fsp--;

             current =iv_ruleSEMI.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSEMI901); 

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
    // $ANTLR end "entryRuleSEMI"


    // $ANTLR start "ruleSEMI"
    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:486:1: ruleSEMI returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'semi' ;
    public final AntlrDatatypeRuleToken ruleSEMI() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:489:28: (kw= 'semi' )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:491:2: kw= 'semi'
            {
            kw=(Token)match(input,15,FOLLOW_15_in_ruleSEMI938); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSEMIAccess().getSemiKeyword()); 
                

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
    // $ANTLR end "ruleSEMI"


    // $ANTLR start "entryRuleEXCLUSIVA"
    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:504:1: entryRuleEXCLUSIVA returns [String current=null] : iv_ruleEXCLUSIVA= ruleEXCLUSIVA EOF ;
    public final String entryRuleEXCLUSIVA() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEXCLUSIVA = null;


        try {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:505:2: (iv_ruleEXCLUSIVA= ruleEXCLUSIVA EOF )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:506:2: iv_ruleEXCLUSIVA= ruleEXCLUSIVA EOF
            {
             newCompositeNode(grammarAccess.getEXCLUSIVARule()); 
            pushFollow(FOLLOW_ruleEXCLUSIVA_in_entryRuleEXCLUSIVA978);
            iv_ruleEXCLUSIVA=ruleEXCLUSIVA();

            state._fsp--;

             current =iv_ruleEXCLUSIVA.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEXCLUSIVA989); 

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
    // $ANTLR end "entryRuleEXCLUSIVA"


    // $ANTLR start "ruleEXCLUSIVA"
    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:513:1: ruleEXCLUSIVA returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'exclusiva' ;
    public final AntlrDatatypeRuleToken ruleEXCLUSIVA() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:516:28: (kw= 'exclusiva' )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:518:2: kw= 'exclusiva'
            {
            kw=(Token)match(input,16,FOLLOW_16_in_ruleEXCLUSIVA1026); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEXCLUSIVAAccess().getExclusivaKeyword()); 
                

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
    // $ANTLR end "ruleEXCLUSIVA"


    // $ANTLR start "entryRuleMateria"
    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:531:1: entryRuleMateria returns [EObject current=null] : iv_ruleMateria= ruleMateria EOF ;
    public final EObject entryRuleMateria() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMateria = null;


        try {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:532:2: (iv_ruleMateria= ruleMateria EOF )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:533:2: iv_ruleMateria= ruleMateria EOF
            {
             newCompositeNode(grammarAccess.getMateriaRule()); 
            pushFollow(FOLLOW_ruleMateria_in_entryRuleMateria1065);
            iv_ruleMateria=ruleMateria();

            state._fsp--;

             current =iv_ruleMateria; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMateria1075); 

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
    // $ANTLR end "entryRuleMateria"


    // $ANTLR start "ruleMateria"
    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:540:1: ruleMateria returns [EObject current=null] : (otherlv_0= 'materia' ( (lv_nombre_1_0= RULE_ID ) ) otherlv_2= 'con' ( (lv_cargaHoraria_3_0= ruleCargaHoraria ) ) ) ;
    public final EObject ruleMateria() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nombre_1_0=null;
        Token otherlv_2=null;
        EObject lv_cargaHoraria_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:543:28: ( (otherlv_0= 'materia' ( (lv_nombre_1_0= RULE_ID ) ) otherlv_2= 'con' ( (lv_cargaHoraria_3_0= ruleCargaHoraria ) ) ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:544:1: (otherlv_0= 'materia' ( (lv_nombre_1_0= RULE_ID ) ) otherlv_2= 'con' ( (lv_cargaHoraria_3_0= ruleCargaHoraria ) ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:544:1: (otherlv_0= 'materia' ( (lv_nombre_1_0= RULE_ID ) ) otherlv_2= 'con' ( (lv_cargaHoraria_3_0= ruleCargaHoraria ) ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:544:3: otherlv_0= 'materia' ( (lv_nombre_1_0= RULE_ID ) ) otherlv_2= 'con' ( (lv_cargaHoraria_3_0= ruleCargaHoraria ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleMateria1112); 

                	newLeafNode(otherlv_0, grammarAccess.getMateriaAccess().getMateriaKeyword_0());
                
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:548:1: ( (lv_nombre_1_0= RULE_ID ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:549:1: (lv_nombre_1_0= RULE_ID )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:549:1: (lv_nombre_1_0= RULE_ID )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:550:3: lv_nombre_1_0= RULE_ID
            {
            lv_nombre_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMateria1129); 

            			newLeafNode(lv_nombre_1_0, grammarAccess.getMateriaAccess().getNombreIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMateriaRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"nombre",
                    		lv_nombre_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleMateria1146); 

                	newLeafNode(otherlv_2, grammarAccess.getMateriaAccess().getConKeyword_2());
                
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:570:1: ( (lv_cargaHoraria_3_0= ruleCargaHoraria ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:571:1: (lv_cargaHoraria_3_0= ruleCargaHoraria )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:571:1: (lv_cargaHoraria_3_0= ruleCargaHoraria )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:572:3: lv_cargaHoraria_3_0= ruleCargaHoraria
            {
             
            	        newCompositeNode(grammarAccess.getMateriaAccess().getCargaHorariaCargaHorariaParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleCargaHoraria_in_ruleMateria1167);
            lv_cargaHoraria_3_0=ruleCargaHoraria();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMateriaRule());
            	        }
                   		add(
                   			current, 
                   			"cargaHoraria",
                    		lv_cargaHoraria_3_0, 
                    		"CargaHoraria");
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
    // $ANTLR end "ruleMateria"


    // $ANTLR start "entryRuleAula"
    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:596:1: entryRuleAula returns [EObject current=null] : iv_ruleAula= ruleAula EOF ;
    public final EObject entryRuleAula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAula = null;


        try {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:597:2: (iv_ruleAula= ruleAula EOF )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:598:2: iv_ruleAula= ruleAula EOF
            {
             newCompositeNode(grammarAccess.getAulaRule()); 
            pushFollow(FOLLOW_ruleAula_in_entryRuleAula1203);
            iv_ruleAula=ruleAula();

            state._fsp--;

             current =iv_ruleAula; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAula1213); 

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
    // $ANTLR end "entryRuleAula"


    // $ANTLR start "ruleAula"
    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:605:1: ruleAula returns [EObject current=null] : (otherlv_0= 'aula' ( (lv_nombre_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAula() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nombre_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:608:28: ( (otherlv_0= 'aula' ( (lv_nombre_1_0= RULE_ID ) ) ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:609:1: (otherlv_0= 'aula' ( (lv_nombre_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:609:1: (otherlv_0= 'aula' ( (lv_nombre_1_0= RULE_ID ) ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:609:3: otherlv_0= 'aula' ( (lv_nombre_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleAula1250); 

                	newLeafNode(otherlv_0, grammarAccess.getAulaAccess().getAulaKeyword_0());
                
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:613:1: ( (lv_nombre_1_0= RULE_ID ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:614:1: (lv_nombre_1_0= RULE_ID )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:614:1: (lv_nombre_1_0= RULE_ID )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:615:3: lv_nombre_1_0= RULE_ID
            {
            lv_nombre_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAula1267); 

            			newLeafNode(lv_nombre_1_0, grammarAccess.getAulaAccess().getNombreIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAulaRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"nombre",
                    		lv_nombre_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleAula"


    // $ANTLR start "entryRuleCargaHoraria"
    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:639:1: entryRuleCargaHoraria returns [EObject current=null] : iv_ruleCargaHoraria= ruleCargaHoraria EOF ;
    public final EObject entryRuleCargaHoraria() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCargaHoraria = null;


        try {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:640:2: (iv_ruleCargaHoraria= ruleCargaHoraria EOF )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:641:2: iv_ruleCargaHoraria= ruleCargaHoraria EOF
            {
             newCompositeNode(grammarAccess.getCargaHorariaRule()); 
            pushFollow(FOLLOW_ruleCargaHoraria_in_entryRuleCargaHoraria1308);
            iv_ruleCargaHoraria=ruleCargaHoraria();

            state._fsp--;

             current =iv_ruleCargaHoraria; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCargaHoraria1318); 

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
    // $ANTLR end "entryRuleCargaHoraria"


    // $ANTLR start "ruleCargaHoraria"
    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:648:1: ruleCargaHoraria returns [EObject current=null] : (otherlv_0= 'cargaHoraria' ( (lv_tipo_1_0= RULE_ID ) ) otherlv_2= 'dias' ( (lv_dias_3_0= RULE_INT ) ) ) ;
    public final EObject ruleCargaHoraria() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_tipo_1_0=null;
        Token otherlv_2=null;
        Token lv_dias_3_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:651:28: ( (otherlv_0= 'cargaHoraria' ( (lv_tipo_1_0= RULE_ID ) ) otherlv_2= 'dias' ( (lv_dias_3_0= RULE_INT ) ) ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:652:1: (otherlv_0= 'cargaHoraria' ( (lv_tipo_1_0= RULE_ID ) ) otherlv_2= 'dias' ( (lv_dias_3_0= RULE_INT ) ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:652:1: (otherlv_0= 'cargaHoraria' ( (lv_tipo_1_0= RULE_ID ) ) otherlv_2= 'dias' ( (lv_dias_3_0= RULE_INT ) ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:652:3: otherlv_0= 'cargaHoraria' ( (lv_tipo_1_0= RULE_ID ) ) otherlv_2= 'dias' ( (lv_dias_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleCargaHoraria1355); 

                	newLeafNode(otherlv_0, grammarAccess.getCargaHorariaAccess().getCargaHorariaKeyword_0());
                
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:656:1: ( (lv_tipo_1_0= RULE_ID ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:657:1: (lv_tipo_1_0= RULE_ID )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:657:1: (lv_tipo_1_0= RULE_ID )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:658:3: lv_tipo_1_0= RULE_ID
            {
            lv_tipo_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCargaHoraria1372); 

            			newLeafNode(lv_tipo_1_0, grammarAccess.getCargaHorariaAccess().getTipoIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCargaHorariaRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"tipo",
                    		lv_tipo_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleCargaHoraria1389); 

                	newLeafNode(otherlv_2, grammarAccess.getCargaHorariaAccess().getDiasKeyword_2());
                
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:678:1: ( (lv_dias_3_0= RULE_INT ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:679:1: (lv_dias_3_0= RULE_INT )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:679:1: (lv_dias_3_0= RULE_INT )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:680:3: lv_dias_3_0= RULE_INT
            {
            lv_dias_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCargaHoraria1406); 

            			newLeafNode(lv_dias_3_0, grammarAccess.getCargaHorariaAccess().getDiasINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCargaHorariaRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"dias",
                    		lv_dias_3_0, 
                    		"INT");
            	    

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
    // $ANTLR end "ruleCargaHoraria"


    // $ANTLR start "entryRuleCargaHorariaDocente"
    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:704:1: entryRuleCargaHorariaDocente returns [EObject current=null] : iv_ruleCargaHorariaDocente= ruleCargaHorariaDocente EOF ;
    public final EObject entryRuleCargaHorariaDocente() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCargaHorariaDocente = null;


        try {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:705:2: (iv_ruleCargaHorariaDocente= ruleCargaHorariaDocente EOF )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:706:2: iv_ruleCargaHorariaDocente= ruleCargaHorariaDocente EOF
            {
             newCompositeNode(grammarAccess.getCargaHorariaDocenteRule()); 
            pushFollow(FOLLOW_ruleCargaHorariaDocente_in_entryRuleCargaHorariaDocente1447);
            iv_ruleCargaHorariaDocente=ruleCargaHorariaDocente();

            state._fsp--;

             current =iv_ruleCargaHorariaDocente; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCargaHorariaDocente1457); 

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
    // $ANTLR end "entryRuleCargaHorariaDocente"


    // $ANTLR start "ruleCargaHorariaDocente"
    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:713:1: ruleCargaHorariaDocente returns [EObject current=null] : ( ( (lv_nombre_0_0= ruleProfesor ) ) otherlv_1= 'tiene' ( (lv_tipo_2_0= ruleCargaHoraria ) ) ) ;
    public final EObject ruleCargaHorariaDocente() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_nombre_0_0 = null;

        EObject lv_tipo_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:716:28: ( ( ( (lv_nombre_0_0= ruleProfesor ) ) otherlv_1= 'tiene' ( (lv_tipo_2_0= ruleCargaHoraria ) ) ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:717:1: ( ( (lv_nombre_0_0= ruleProfesor ) ) otherlv_1= 'tiene' ( (lv_tipo_2_0= ruleCargaHoraria ) ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:717:1: ( ( (lv_nombre_0_0= ruleProfesor ) ) otherlv_1= 'tiene' ( (lv_tipo_2_0= ruleCargaHoraria ) ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:717:2: ( (lv_nombre_0_0= ruleProfesor ) ) otherlv_1= 'tiene' ( (lv_tipo_2_0= ruleCargaHoraria ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:717:2: ( (lv_nombre_0_0= ruleProfesor ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:718:1: (lv_nombre_0_0= ruleProfesor )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:718:1: (lv_nombre_0_0= ruleProfesor )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:719:3: lv_nombre_0_0= ruleProfesor
            {
             
            	        newCompositeNode(grammarAccess.getCargaHorariaDocenteAccess().getNombreProfesorParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleProfesor_in_ruleCargaHorariaDocente1503);
            lv_nombre_0_0=ruleProfesor();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCargaHorariaDocenteRule());
            	        }
                   		set(
                   			current, 
                   			"nombre",
                    		lv_nombre_0_0, 
                    		"Profesor");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleCargaHorariaDocente1515); 

                	newLeafNode(otherlv_1, grammarAccess.getCargaHorariaDocenteAccess().getTieneKeyword_1());
                
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:739:1: ( (lv_tipo_2_0= ruleCargaHoraria ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:740:1: (lv_tipo_2_0= ruleCargaHoraria )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:740:1: (lv_tipo_2_0= ruleCargaHoraria )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:741:3: lv_tipo_2_0= ruleCargaHoraria
            {
             
            	        newCompositeNode(grammarAccess.getCargaHorariaDocenteAccess().getTipoCargaHorariaParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleCargaHoraria_in_ruleCargaHorariaDocente1536);
            lv_tipo_2_0=ruleCargaHoraria();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCargaHorariaDocenteRule());
            	        }
                   		set(
                   			current, 
                   			"tipo",
                    		lv_tipo_2_0, 
                    		"CargaHoraria");
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
    // $ANTLR end "ruleCargaHorariaDocente"


    // $ANTLR start "entryRuleHorario"
    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:765:1: entryRuleHorario returns [EObject current=null] : iv_ruleHorario= ruleHorario EOF ;
    public final EObject entryRuleHorario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHorario = null;


        try {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:766:2: (iv_ruleHorario= ruleHorario EOF )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:767:2: iv_ruleHorario= ruleHorario EOF
            {
             newCompositeNode(grammarAccess.getHorarioRule()); 
            pushFollow(FOLLOW_ruleHorario_in_entryRuleHorario1572);
            iv_ruleHorario=ruleHorario();

            state._fsp--;

             current =iv_ruleHorario; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHorario1582); 

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
    // $ANTLR end "entryRuleHorario"


    // $ANTLR start "ruleHorario"
    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:774:1: ruleHorario returns [EObject current=null] : ( ( (lv_dia_0_0= ruleDia ) ) otherlv_1= ':' ( (lv_desde_2_0= ruleHora ) ) otherlv_3= 'a' ( (lv_hasta_4_0= ruleHora ) ) otherlv_5= 'hs se dicta' ( (lv_materia_6_0= ruleMateria ) ) otherlv_7= 'en' ( (lv_aula_8_0= ruleAula ) ) ) ;
    public final EObject ruleHorario() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_dia_0_0 = null;

        EObject lv_desde_2_0 = null;

        EObject lv_hasta_4_0 = null;

        EObject lv_materia_6_0 = null;

        EObject lv_aula_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:777:28: ( ( ( (lv_dia_0_0= ruleDia ) ) otherlv_1= ':' ( (lv_desde_2_0= ruleHora ) ) otherlv_3= 'a' ( (lv_hasta_4_0= ruleHora ) ) otherlv_5= 'hs se dicta' ( (lv_materia_6_0= ruleMateria ) ) otherlv_7= 'en' ( (lv_aula_8_0= ruleAula ) ) ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:778:1: ( ( (lv_dia_0_0= ruleDia ) ) otherlv_1= ':' ( (lv_desde_2_0= ruleHora ) ) otherlv_3= 'a' ( (lv_hasta_4_0= ruleHora ) ) otherlv_5= 'hs se dicta' ( (lv_materia_6_0= ruleMateria ) ) otherlv_7= 'en' ( (lv_aula_8_0= ruleAula ) ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:778:1: ( ( (lv_dia_0_0= ruleDia ) ) otherlv_1= ':' ( (lv_desde_2_0= ruleHora ) ) otherlv_3= 'a' ( (lv_hasta_4_0= ruleHora ) ) otherlv_5= 'hs se dicta' ( (lv_materia_6_0= ruleMateria ) ) otherlv_7= 'en' ( (lv_aula_8_0= ruleAula ) ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:778:2: ( (lv_dia_0_0= ruleDia ) ) otherlv_1= ':' ( (lv_desde_2_0= ruleHora ) ) otherlv_3= 'a' ( (lv_hasta_4_0= ruleHora ) ) otherlv_5= 'hs se dicta' ( (lv_materia_6_0= ruleMateria ) ) otherlv_7= 'en' ( (lv_aula_8_0= ruleAula ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:778:2: ( (lv_dia_0_0= ruleDia ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:779:1: (lv_dia_0_0= ruleDia )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:779:1: (lv_dia_0_0= ruleDia )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:780:3: lv_dia_0_0= ruleDia
            {
             
            	        newCompositeNode(grammarAccess.getHorarioAccess().getDiaDiaParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDia_in_ruleHorario1628);
            lv_dia_0_0=ruleDia();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getHorarioRule());
            	        }
                   		set(
                   			current, 
                   			"dia",
                    		lv_dia_0_0, 
                    		"Dia");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleHorario1640); 

                	newLeafNode(otherlv_1, grammarAccess.getHorarioAccess().getColonKeyword_1());
                
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:800:1: ( (lv_desde_2_0= ruleHora ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:801:1: (lv_desde_2_0= ruleHora )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:801:1: (lv_desde_2_0= ruleHora )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:802:3: lv_desde_2_0= ruleHora
            {
             
            	        newCompositeNode(grammarAccess.getHorarioAccess().getDesdeHoraParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleHora_in_ruleHorario1661);
            lv_desde_2_0=ruleHora();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getHorarioRule());
            	        }
                   		set(
                   			current, 
                   			"desde",
                    		lv_desde_2_0, 
                    		"Hora");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleHorario1673); 

                	newLeafNode(otherlv_3, grammarAccess.getHorarioAccess().getAKeyword_3());
                
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:822:1: ( (lv_hasta_4_0= ruleHora ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:823:1: (lv_hasta_4_0= ruleHora )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:823:1: (lv_hasta_4_0= ruleHora )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:824:3: lv_hasta_4_0= ruleHora
            {
             
            	        newCompositeNode(grammarAccess.getHorarioAccess().getHastaHoraParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleHora_in_ruleHorario1694);
            lv_hasta_4_0=ruleHora();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getHorarioRule());
            	        }
                   		set(
                   			current, 
                   			"hasta",
                    		lv_hasta_4_0, 
                    		"Hora");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleHorario1706); 

                	newLeafNode(otherlv_5, grammarAccess.getHorarioAccess().getHsSeDictaKeyword_5());
                
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:844:1: ( (lv_materia_6_0= ruleMateria ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:845:1: (lv_materia_6_0= ruleMateria )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:845:1: (lv_materia_6_0= ruleMateria )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:846:3: lv_materia_6_0= ruleMateria
            {
             
            	        newCompositeNode(grammarAccess.getHorarioAccess().getMateriaMateriaParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleMateria_in_ruleHorario1727);
            lv_materia_6_0=ruleMateria();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getHorarioRule());
            	        }
                   		set(
                   			current, 
                   			"materia",
                    		lv_materia_6_0, 
                    		"Materia");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleHorario1739); 

                	newLeafNode(otherlv_7, grammarAccess.getHorarioAccess().getEnKeyword_7());
                
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:866:1: ( (lv_aula_8_0= ruleAula ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:867:1: (lv_aula_8_0= ruleAula )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:867:1: (lv_aula_8_0= ruleAula )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:868:3: lv_aula_8_0= ruleAula
            {
             
            	        newCompositeNode(grammarAccess.getHorarioAccess().getAulaAulaParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleAula_in_ruleHorario1760);
            lv_aula_8_0=ruleAula();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getHorarioRule());
            	        }
                   		set(
                   			current, 
                   			"aula",
                    		lv_aula_8_0, 
                    		"Aula");
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
    // $ANTLR end "ruleHorario"


    // $ANTLR start "entryRuleSemestre"
    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:892:1: entryRuleSemestre returns [EObject current=null] : iv_ruleSemestre= ruleSemestre EOF ;
    public final EObject entryRuleSemestre() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSemestre = null;


        try {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:893:2: (iv_ruleSemestre= ruleSemestre EOF )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:894:2: iv_ruleSemestre= ruleSemestre EOF
            {
             newCompositeNode(grammarAccess.getSemestreRule()); 
            pushFollow(FOLLOW_ruleSemestre_in_entryRuleSemestre1796);
            iv_ruleSemestre=ruleSemestre();

            state._fsp--;

             current =iv_ruleSemestre; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSemestre1806); 

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
    // $ANTLR end "entryRuleSemestre"


    // $ANTLR start "ruleSemestre"
    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:901:1: ruleSemestre returns [EObject current=null] : ( ( (lv_anho_0_0= RULE_INT ) ) otherlv_1= 'semestre' ( (lv_numero_2_0= RULE_INT ) ) ) ;
    public final EObject ruleSemestre() throws RecognitionException {
        EObject current = null;

        Token lv_anho_0_0=null;
        Token otherlv_1=null;
        Token lv_numero_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:904:28: ( ( ( (lv_anho_0_0= RULE_INT ) ) otherlv_1= 'semestre' ( (lv_numero_2_0= RULE_INT ) ) ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:905:1: ( ( (lv_anho_0_0= RULE_INT ) ) otherlv_1= 'semestre' ( (lv_numero_2_0= RULE_INT ) ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:905:1: ( ( (lv_anho_0_0= RULE_INT ) ) otherlv_1= 'semestre' ( (lv_numero_2_0= RULE_INT ) ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:905:2: ( (lv_anho_0_0= RULE_INT ) ) otherlv_1= 'semestre' ( (lv_numero_2_0= RULE_INT ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:905:2: ( (lv_anho_0_0= RULE_INT ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:906:1: (lv_anho_0_0= RULE_INT )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:906:1: (lv_anho_0_0= RULE_INT )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:907:3: lv_anho_0_0= RULE_INT
            {
            lv_anho_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSemestre1848); 

            			newLeafNode(lv_anho_0_0, grammarAccess.getSemestreAccess().getAnhoINTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSemestreRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"anho",
                    		lv_anho_0_0, 
                    		"INT");
            	    

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleSemestre1865); 

                	newLeafNode(otherlv_1, grammarAccess.getSemestreAccess().getSemestreKeyword_1());
                
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:927:1: ( (lv_numero_2_0= RULE_INT ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:928:1: (lv_numero_2_0= RULE_INT )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:928:1: (lv_numero_2_0= RULE_INT )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:929:3: lv_numero_2_0= RULE_INT
            {
            lv_numero_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSemestre1882); 

            			newLeafNode(lv_numero_2_0, grammarAccess.getSemestreAccess().getNumeroINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSemestreRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"numero",
                    		lv_numero_2_0, 
                    		"INT");
            	    

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
    // $ANTLR end "ruleSemestre"


    // $ANTLR start "entryRuleDia"
    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:953:1: entryRuleDia returns [EObject current=null] : iv_ruleDia= ruleDia EOF ;
    public final EObject entryRuleDia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDia = null;


        try {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:954:2: (iv_ruleDia= ruleDia EOF )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:955:2: iv_ruleDia= ruleDia EOF
            {
             newCompositeNode(grammarAccess.getDiaRule()); 
            pushFollow(FOLLOW_ruleDia_in_entryRuleDia1923);
            iv_ruleDia=ruleDia();

            state._fsp--;

             current =iv_ruleDia; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDia1933); 

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
    // $ANTLR end "entryRuleDia"


    // $ANTLR start "ruleDia"
    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:962:1: ruleDia returns [EObject current=null] : (otherlv_0= 'dia' ( (lv_dia_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDia() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_dia_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:965:28: ( (otherlv_0= 'dia' ( (lv_dia_1_0= RULE_ID ) ) ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:966:1: (otherlv_0= 'dia' ( (lv_dia_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:966:1: (otherlv_0= 'dia' ( (lv_dia_1_0= RULE_ID ) ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:966:3: otherlv_0= 'dia' ( (lv_dia_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleDia1970); 

                	newLeafNode(otherlv_0, grammarAccess.getDiaAccess().getDiaKeyword_0());
                
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:970:1: ( (lv_dia_1_0= RULE_ID ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:971:1: (lv_dia_1_0= RULE_ID )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:971:1: (lv_dia_1_0= RULE_ID )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:972:3: lv_dia_1_0= RULE_ID
            {
            lv_dia_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDia1987); 

            			newLeafNode(lv_dia_1_0, grammarAccess.getDiaAccess().getDiaIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDiaRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"dia",
                    		lv_dia_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleDia"


    // $ANTLR start "entryRuleHorarios"
    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:996:1: entryRuleHorarios returns [EObject current=null] : iv_ruleHorarios= ruleHorarios EOF ;
    public final EObject entryRuleHorarios() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHorarios = null;


        try {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:997:2: (iv_ruleHorarios= ruleHorarios EOF )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:998:2: iv_ruleHorarios= ruleHorarios EOF
            {
             newCompositeNode(grammarAccess.getHorariosRule()); 
            pushFollow(FOLLOW_ruleHorarios_in_entryRuleHorarios2028);
            iv_ruleHorarios=ruleHorarios();

            state._fsp--;

             current =iv_ruleHorarios; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHorarios2038); 

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
    // $ANTLR end "entryRuleHorarios"


    // $ANTLR start "ruleHorarios"
    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:1005:1: ruleHorarios returns [EObject current=null] : (otherlv_0= 'horarios {' ( (lv_horarios_1_0= ruleHorario ) )+ otherlv_2= '}' ) ;
    public final EObject ruleHorarios() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_horarios_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:1008:28: ( (otherlv_0= 'horarios {' ( (lv_horarios_1_0= ruleHorario ) )+ otherlv_2= '}' ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:1009:1: (otherlv_0= 'horarios {' ( (lv_horarios_1_0= ruleHorario ) )+ otherlv_2= '}' )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:1009:1: (otherlv_0= 'horarios {' ( (lv_horarios_1_0= ruleHorario ) )+ otherlv_2= '}' )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:1009:3: otherlv_0= 'horarios {' ( (lv_horarios_1_0= ruleHorario ) )+ otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleHorarios2075); 

                	newLeafNode(otherlv_0, grammarAccess.getHorariosAccess().getHorariosKeyword_0());
                
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:1013:1: ( (lv_horarios_1_0= ruleHorario ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==28) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:1014:1: (lv_horarios_1_0= ruleHorario )
            	    {
            	    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:1014:1: (lv_horarios_1_0= ruleHorario )
            	    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:1015:3: lv_horarios_1_0= ruleHorario
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHorariosAccess().getHorariosHorarioParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHorario_in_ruleHorarios2096);
            	    lv_horarios_1_0=ruleHorario();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getHorariosRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"horarios",
            	            		lv_horarios_1_0, 
            	            		"Horario");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleHorarios2109); 

                	newLeafNode(otherlv_2, grammarAccess.getHorariosAccess().getRightCurlyBracketKeyword_2());
                

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
    // $ANTLR end "ruleHorarios"


    // $ANTLR start "entryRulePlanificacion"
    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:1043:1: entryRulePlanificacion returns [EObject current=null] : iv_rulePlanificacion= rulePlanificacion EOF ;
    public final EObject entryRulePlanificacion() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlanificacion = null;


        try {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:1044:2: (iv_rulePlanificacion= rulePlanificacion EOF )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:1045:2: iv_rulePlanificacion= rulePlanificacion EOF
            {
             newCompositeNode(grammarAccess.getPlanificacionRule()); 
            pushFollow(FOLLOW_rulePlanificacion_in_entryRulePlanificacion2145);
            iv_rulePlanificacion=rulePlanificacion();

            state._fsp--;

             current =iv_rulePlanificacion; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlanificacion2155); 

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
    // $ANTLR end "entryRulePlanificacion"


    // $ANTLR start "rulePlanificacion"
    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:1052:1: rulePlanificacion returns [EObject current=null] : (otherlv_0= 'planificacion' ( (lv_semestre_1_0= ruleSemestre ) ) otherlv_2= '{' otherlv_3= 'a dictar:' ( (lv_materias_4_0= ruleMateria ) )+ ( (lv_horarios_5_0= ruleHorarios ) ) otherlv_6= '}' ) ;
    public final EObject rulePlanificacion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_semestre_1_0 = null;

        EObject lv_materias_4_0 = null;

        EObject lv_horarios_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:1055:28: ( (otherlv_0= 'planificacion' ( (lv_semestre_1_0= ruleSemestre ) ) otherlv_2= '{' otherlv_3= 'a dictar:' ( (lv_materias_4_0= ruleMateria ) )+ ( (lv_horarios_5_0= ruleHorarios ) ) otherlv_6= '}' ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:1056:1: (otherlv_0= 'planificacion' ( (lv_semestre_1_0= ruleSemestre ) ) otherlv_2= '{' otherlv_3= 'a dictar:' ( (lv_materias_4_0= ruleMateria ) )+ ( (lv_horarios_5_0= ruleHorarios ) ) otherlv_6= '}' )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:1056:1: (otherlv_0= 'planificacion' ( (lv_semestre_1_0= ruleSemestre ) ) otherlv_2= '{' otherlv_3= 'a dictar:' ( (lv_materias_4_0= ruleMateria ) )+ ( (lv_horarios_5_0= ruleHorarios ) ) otherlv_6= '}' )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:1056:3: otherlv_0= 'planificacion' ( (lv_semestre_1_0= ruleSemestre ) ) otherlv_2= '{' otherlv_3= 'a dictar:' ( (lv_materias_4_0= ruleMateria ) )+ ( (lv_horarios_5_0= ruleHorarios ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_rulePlanificacion2192); 

                	newLeafNode(otherlv_0, grammarAccess.getPlanificacionAccess().getPlanificacionKeyword_0());
                
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:1060:1: ( (lv_semestre_1_0= ruleSemestre ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:1061:1: (lv_semestre_1_0= ruleSemestre )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:1061:1: (lv_semestre_1_0= ruleSemestre )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:1062:3: lv_semestre_1_0= ruleSemestre
            {
             
            	        newCompositeNode(grammarAccess.getPlanificacionAccess().getSemestreSemestreParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSemestre_in_rulePlanificacion2213);
            lv_semestre_1_0=ruleSemestre();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPlanificacionRule());
            	        }
                   		set(
                   			current, 
                   			"semestre",
                    		lv_semestre_1_0, 
                    		"Semestre");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_32_in_rulePlanificacion2225); 

                	newLeafNode(otherlv_2, grammarAccess.getPlanificacionAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,33,FOLLOW_33_in_rulePlanificacion2237); 

                	newLeafNode(otherlv_3, grammarAccess.getPlanificacionAccess().getADictarKeyword_3());
                
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:1086:1: ( (lv_materias_4_0= ruleMateria ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==17) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:1087:1: (lv_materias_4_0= ruleMateria )
            	    {
            	    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:1087:1: (lv_materias_4_0= ruleMateria )
            	    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:1088:3: lv_materias_4_0= ruleMateria
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPlanificacionAccess().getMateriasMateriaParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMateria_in_rulePlanificacion2258);
            	    lv_materias_4_0=ruleMateria();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPlanificacionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"materias",
            	            		lv_materias_4_0, 
            	            		"Materia");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:1104:3: ( (lv_horarios_5_0= ruleHorarios ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:1105:1: (lv_horarios_5_0= ruleHorarios )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:1105:1: (lv_horarios_5_0= ruleHorarios )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:1106:3: lv_horarios_5_0= ruleHorarios
            {
             
            	        newCompositeNode(grammarAccess.getPlanificacionAccess().getHorariosHorariosParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleHorarios_in_rulePlanificacion2280);
            lv_horarios_5_0=ruleHorarios();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPlanificacionRule());
            	        }
                   		set(
                   			current, 
                   			"horarios",
                    		lv_horarios_5_0, 
                    		"Horarios");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,30,FOLLOW_30_in_rulePlanificacion2292); 

                	newLeafNode(otherlv_6, grammarAccess.getPlanificacionAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "rulePlanificacion"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProfesor_in_ruleModel131 = new BitSet(new long[]{0x00000000B01A2822L});
    public static final BitSet FOLLOW_ruleHora_in_ruleModel153 = new BitSet(new long[]{0x00000000B01A2822L});
    public static final BitSet FOLLOW_ruleMateria_in_ruleModel175 = new BitSet(new long[]{0x00000000B01A0822L});
    public static final BitSet FOLLOW_ruleAula_in_ruleModel197 = new BitSet(new long[]{0x00000000B0180822L});
    public static final BitSet FOLLOW_ruleCargaHoraria_in_ruleModel219 = new BitSet(new long[]{0x00000000B0100822L});
    public static final BitSet FOLLOW_ruleCargaHorariaDocente_in_ruleModel241 = new BitSet(new long[]{0x00000000B0000822L});
    public static final BitSet FOLLOW_ruleHorarios_in_ruleModel263 = new BitSet(new long[]{0x00000000B0000022L});
    public static final BitSet FOLLOW_ruleDia_in_ruleModel285 = new BitSet(new long[]{0x0000000090000022L});
    public static final BitSet FOLLOW_ruleSemestre_in_ruleModel307 = new BitSet(new long[]{0x0000000090000022L});
    public static final BitSet FOLLOW_rulePlanificacion_in_ruleModel329 = new BitSet(new long[]{0x0000000090000002L});
    public static final BitSet FOLLOW_ruleHorario_in_ruleModel351 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleProfesor_in_entryRuleProfesor388 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProfesor398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleProfesor435 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProfesor452 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProfesor469 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_ruleDedicacion_in_ruleProfesor490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHora_in_entryRuleHora526 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHora536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleHora573 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleHora590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDedicacion_in_entryRuleDedicacion632 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDedicacion643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSIMPLE_in_ruleDedicacion690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSEMI_in_ruleDedicacion723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXCLUSIVA_in_ruleDedicacion756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSIMPLE_in_entryRuleSIMPLE802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSIMPLE813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSIMPLE850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSEMI_in_entryRuleSEMI890 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSEMI901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSEMI938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXCLUSIVA_in_entryRuleEXCLUSIVA978 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEXCLUSIVA989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleEXCLUSIVA1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMateria_in_entryRuleMateria1065 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMateria1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleMateria1112 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMateria1129 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMateria1146 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleCargaHoraria_in_ruleMateria1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAula_in_entryRuleAula1203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAula1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleAula1250 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAula1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCargaHoraria_in_entryRuleCargaHoraria1308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCargaHoraria1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleCargaHoraria1355 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCargaHoraria1372 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleCargaHoraria1389 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCargaHoraria1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCargaHorariaDocente_in_entryRuleCargaHorariaDocente1447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCargaHorariaDocente1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProfesor_in_ruleCargaHorariaDocente1503 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleCargaHorariaDocente1515 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleCargaHoraria_in_ruleCargaHorariaDocente1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHorario_in_entryRuleHorario1572 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHorario1582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDia_in_ruleHorario1628 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleHorario1640 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleHora_in_ruleHorario1661 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleHorario1673 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleHora_in_ruleHorario1694 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleHorario1706 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleMateria_in_ruleHorario1727 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleHorario1739 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleAula_in_ruleHorario1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSemestre_in_entryRuleSemestre1796 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSemestre1806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSemestre1848 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleSemestre1865 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSemestre1882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDia_in_entryRuleDia1923 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDia1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleDia1970 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDia1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHorarios_in_entryRuleHorarios2028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHorarios2038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleHorarios2075 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleHorario_in_ruleHorarios2096 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_30_in_ruleHorarios2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlanificacion_in_entryRulePlanificacion2145 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlanificacion2155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rulePlanificacion2192 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleSemestre_in_rulePlanificacion2213 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_rulePlanificacion2225 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_rulePlanificacion2237 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleMateria_in_rulePlanificacion2258 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_ruleHorarios_in_rulePlanificacion2280 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulePlanificacion2292 = new BitSet(new long[]{0x0000000000000002L});

}