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

                        if ( (LA1_3==EOF||LA1_3==RULE_INT||(LA1_3>=11 && LA1_3<=15)||(LA1_3>=22 && LA1_3<=23)||LA1_3==25) ) {
                            alt1=1;
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

                if ( (LA2_0==12) ) {
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

                if ( (LA3_0==13) ) {
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

                if ( (LA4_0==14) ) {
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

                if ( (LA5_0==15) ) {
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

                if ( (LA7_0==23) ) {
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

                if ( (LA10_0==25) ) {
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

                if ( (LA11_0==22) ) {
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
    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:295:1: ruleProfesor returns [EObject current=null] : (otherlv_0= 'profesor' ( (lv_nombre_1_0= RULE_ID ) ) ) ;
    public final EObject ruleProfesor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nombre_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:298:28: ( (otherlv_0= 'profesor' ( (lv_nombre_1_0= RULE_ID ) ) ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:299:1: (otherlv_0= 'profesor' ( (lv_nombre_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:299:1: (otherlv_0= 'profesor' ( (lv_nombre_1_0= RULE_ID ) ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:299:3: otherlv_0= 'profesor' ( (lv_nombre_1_0= RULE_ID ) )
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
    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:329:1: entryRuleHora returns [EObject current=null] : iv_ruleHora= ruleHora EOF ;
    public final EObject entryRuleHora() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHora = null;


        try {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:330:2: (iv_ruleHora= ruleHora EOF )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:331:2: iv_ruleHora= ruleHora EOF
            {
             newCompositeNode(grammarAccess.getHoraRule()); 
            pushFollow(FOLLOW_ruleHora_in_entryRuleHora493);
            iv_ruleHora=ruleHora();

            state._fsp--;

             current =iv_ruleHora; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHora503); 

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
    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:338:1: ruleHora returns [EObject current=null] : (otherlv_0= 'hora' ( (lv_hora_1_0= RULE_INT ) ) ) ;
    public final EObject ruleHora() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hora_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:341:28: ( (otherlv_0= 'hora' ( (lv_hora_1_0= RULE_INT ) ) ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:342:1: (otherlv_0= 'hora' ( (lv_hora_1_0= RULE_INT ) ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:342:1: (otherlv_0= 'hora' ( (lv_hora_1_0= RULE_INT ) ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:342:3: otherlv_0= 'hora' ( (lv_hora_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleHora540); 

                	newLeafNode(otherlv_0, grammarAccess.getHoraAccess().getHoraKeyword_0());
                
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:346:1: ( (lv_hora_1_0= RULE_INT ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:347:1: (lv_hora_1_0= RULE_INT )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:347:1: (lv_hora_1_0= RULE_INT )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:348:3: lv_hora_1_0= RULE_INT
            {
            lv_hora_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleHora557); 

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


    // $ANTLR start "entryRuleMateria"
    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:372:1: entryRuleMateria returns [EObject current=null] : iv_ruleMateria= ruleMateria EOF ;
    public final EObject entryRuleMateria() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMateria = null;


        try {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:373:2: (iv_ruleMateria= ruleMateria EOF )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:374:2: iv_ruleMateria= ruleMateria EOF
            {
             newCompositeNode(grammarAccess.getMateriaRule()); 
            pushFollow(FOLLOW_ruleMateria_in_entryRuleMateria598);
            iv_ruleMateria=ruleMateria();

            state._fsp--;

             current =iv_ruleMateria; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMateria608); 

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
    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:381:1: ruleMateria returns [EObject current=null] : (otherlv_0= 'materia' ( (lv_nombre_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMateria() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nombre_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:384:28: ( (otherlv_0= 'materia' ( (lv_nombre_1_0= RULE_ID ) ) ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:385:1: (otherlv_0= 'materia' ( (lv_nombre_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:385:1: (otherlv_0= 'materia' ( (lv_nombre_1_0= RULE_ID ) ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:385:3: otherlv_0= 'materia' ( (lv_nombre_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleMateria645); 

                	newLeafNode(otherlv_0, grammarAccess.getMateriaAccess().getMateriaKeyword_0());
                
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:389:1: ( (lv_nombre_1_0= RULE_ID ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:390:1: (lv_nombre_1_0= RULE_ID )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:390:1: (lv_nombre_1_0= RULE_ID )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:391:3: lv_nombre_1_0= RULE_ID
            {
            lv_nombre_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMateria662); 

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
    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:415:1: entryRuleAula returns [EObject current=null] : iv_ruleAula= ruleAula EOF ;
    public final EObject entryRuleAula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAula = null;


        try {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:416:2: (iv_ruleAula= ruleAula EOF )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:417:2: iv_ruleAula= ruleAula EOF
            {
             newCompositeNode(grammarAccess.getAulaRule()); 
            pushFollow(FOLLOW_ruleAula_in_entryRuleAula703);
            iv_ruleAula=ruleAula();

            state._fsp--;

             current =iv_ruleAula; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAula713); 

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
    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:424:1: ruleAula returns [EObject current=null] : (otherlv_0= 'aula' ( (lv_nombre_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAula() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nombre_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:427:28: ( (otherlv_0= 'aula' ( (lv_nombre_1_0= RULE_ID ) ) ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:428:1: (otherlv_0= 'aula' ( (lv_nombre_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:428:1: (otherlv_0= 'aula' ( (lv_nombre_1_0= RULE_ID ) ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:428:3: otherlv_0= 'aula' ( (lv_nombre_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleAula750); 

                	newLeafNode(otherlv_0, grammarAccess.getAulaAccess().getAulaKeyword_0());
                
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:432:1: ( (lv_nombre_1_0= RULE_ID ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:433:1: (lv_nombre_1_0= RULE_ID )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:433:1: (lv_nombre_1_0= RULE_ID )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:434:3: lv_nombre_1_0= RULE_ID
            {
            lv_nombre_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAula767); 

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
    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:458:1: entryRuleCargaHoraria returns [EObject current=null] : iv_ruleCargaHoraria= ruleCargaHoraria EOF ;
    public final EObject entryRuleCargaHoraria() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCargaHoraria = null;


        try {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:459:2: (iv_ruleCargaHoraria= ruleCargaHoraria EOF )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:460:2: iv_ruleCargaHoraria= ruleCargaHoraria EOF
            {
             newCompositeNode(grammarAccess.getCargaHorariaRule()); 
            pushFollow(FOLLOW_ruleCargaHoraria_in_entryRuleCargaHoraria808);
            iv_ruleCargaHoraria=ruleCargaHoraria();

            state._fsp--;

             current =iv_ruleCargaHoraria; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCargaHoraria818); 

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
    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:467:1: ruleCargaHoraria returns [EObject current=null] : (otherlv_0= 'cargaHoraria' ( (lv_tipo_1_0= RULE_ID ) ) ) ;
    public final EObject ruleCargaHoraria() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_tipo_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:470:28: ( (otherlv_0= 'cargaHoraria' ( (lv_tipo_1_0= RULE_ID ) ) ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:471:1: (otherlv_0= 'cargaHoraria' ( (lv_tipo_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:471:1: (otherlv_0= 'cargaHoraria' ( (lv_tipo_1_0= RULE_ID ) ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:471:3: otherlv_0= 'cargaHoraria' ( (lv_tipo_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleCargaHoraria855); 

                	newLeafNode(otherlv_0, grammarAccess.getCargaHorariaAccess().getCargaHorariaKeyword_0());
                
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:475:1: ( (lv_tipo_1_0= RULE_ID ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:476:1: (lv_tipo_1_0= RULE_ID )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:476:1: (lv_tipo_1_0= RULE_ID )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:477:3: lv_tipo_1_0= RULE_ID
            {
            lv_tipo_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCargaHoraria872); 

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
    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:501:1: entryRuleCargaHorariaDocente returns [EObject current=null] : iv_ruleCargaHorariaDocente= ruleCargaHorariaDocente EOF ;
    public final EObject entryRuleCargaHorariaDocente() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCargaHorariaDocente = null;


        try {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:502:2: (iv_ruleCargaHorariaDocente= ruleCargaHorariaDocente EOF )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:503:2: iv_ruleCargaHorariaDocente= ruleCargaHorariaDocente EOF
            {
             newCompositeNode(grammarAccess.getCargaHorariaDocenteRule()); 
            pushFollow(FOLLOW_ruleCargaHorariaDocente_in_entryRuleCargaHorariaDocente913);
            iv_ruleCargaHorariaDocente=ruleCargaHorariaDocente();

            state._fsp--;

             current =iv_ruleCargaHorariaDocente; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCargaHorariaDocente923); 

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
    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:510:1: ruleCargaHorariaDocente returns [EObject current=null] : ( ( (lv_nombre_0_0= ruleProfesor ) ) otherlv_1= 'tiene' ( (lv_tipo_2_0= ruleCargaHoraria ) ) ) ;
    public final EObject ruleCargaHorariaDocente() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_nombre_0_0 = null;

        EObject lv_tipo_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:513:28: ( ( ( (lv_nombre_0_0= ruleProfesor ) ) otherlv_1= 'tiene' ( (lv_tipo_2_0= ruleCargaHoraria ) ) ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:514:1: ( ( (lv_nombre_0_0= ruleProfesor ) ) otherlv_1= 'tiene' ( (lv_tipo_2_0= ruleCargaHoraria ) ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:514:1: ( ( (lv_nombre_0_0= ruleProfesor ) ) otherlv_1= 'tiene' ( (lv_tipo_2_0= ruleCargaHoraria ) ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:514:2: ( (lv_nombre_0_0= ruleProfesor ) ) otherlv_1= 'tiene' ( (lv_tipo_2_0= ruleCargaHoraria ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:514:2: ( (lv_nombre_0_0= ruleProfesor ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:515:1: (lv_nombre_0_0= ruleProfesor )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:515:1: (lv_nombre_0_0= ruleProfesor )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:516:3: lv_nombre_0_0= ruleProfesor
            {
             
            	        newCompositeNode(grammarAccess.getCargaHorariaDocenteAccess().getNombreProfesorParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleProfesor_in_ruleCargaHorariaDocente969);
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

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleCargaHorariaDocente981); 

                	newLeafNode(otherlv_1, grammarAccess.getCargaHorariaDocenteAccess().getTieneKeyword_1());
                
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:536:1: ( (lv_tipo_2_0= ruleCargaHoraria ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:537:1: (lv_tipo_2_0= ruleCargaHoraria )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:537:1: (lv_tipo_2_0= ruleCargaHoraria )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:538:3: lv_tipo_2_0= ruleCargaHoraria
            {
             
            	        newCompositeNode(grammarAccess.getCargaHorariaDocenteAccess().getTipoCargaHorariaParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleCargaHoraria_in_ruleCargaHorariaDocente1002);
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
    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:562:1: entryRuleHorario returns [EObject current=null] : iv_ruleHorario= ruleHorario EOF ;
    public final EObject entryRuleHorario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHorario = null;


        try {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:563:2: (iv_ruleHorario= ruleHorario EOF )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:564:2: iv_ruleHorario= ruleHorario EOF
            {
             newCompositeNode(grammarAccess.getHorarioRule()); 
            pushFollow(FOLLOW_ruleHorario_in_entryRuleHorario1038);
            iv_ruleHorario=ruleHorario();

            state._fsp--;

             current =iv_ruleHorario; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHorario1048); 

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
    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:571:1: ruleHorario returns [EObject current=null] : ( ( (lv_dia_0_0= ruleDia ) ) otherlv_1= ':' ( (lv_desde_2_0= ruleHora ) ) otherlv_3= 'a' ( (lv_hasta_4_0= ruleHora ) ) otherlv_5= 'hs se dicta' ( (lv_materia_6_0= ruleMateria ) ) otherlv_7= 'en' ( (lv_aula_8_0= ruleAula ) ) ) ;
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
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:574:28: ( ( ( (lv_dia_0_0= ruleDia ) ) otherlv_1= ':' ( (lv_desde_2_0= ruleHora ) ) otherlv_3= 'a' ( (lv_hasta_4_0= ruleHora ) ) otherlv_5= 'hs se dicta' ( (lv_materia_6_0= ruleMateria ) ) otherlv_7= 'en' ( (lv_aula_8_0= ruleAula ) ) ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:575:1: ( ( (lv_dia_0_0= ruleDia ) ) otherlv_1= ':' ( (lv_desde_2_0= ruleHora ) ) otherlv_3= 'a' ( (lv_hasta_4_0= ruleHora ) ) otherlv_5= 'hs se dicta' ( (lv_materia_6_0= ruleMateria ) ) otherlv_7= 'en' ( (lv_aula_8_0= ruleAula ) ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:575:1: ( ( (lv_dia_0_0= ruleDia ) ) otherlv_1= ':' ( (lv_desde_2_0= ruleHora ) ) otherlv_3= 'a' ( (lv_hasta_4_0= ruleHora ) ) otherlv_5= 'hs se dicta' ( (lv_materia_6_0= ruleMateria ) ) otherlv_7= 'en' ( (lv_aula_8_0= ruleAula ) ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:575:2: ( (lv_dia_0_0= ruleDia ) ) otherlv_1= ':' ( (lv_desde_2_0= ruleHora ) ) otherlv_3= 'a' ( (lv_hasta_4_0= ruleHora ) ) otherlv_5= 'hs se dicta' ( (lv_materia_6_0= ruleMateria ) ) otherlv_7= 'en' ( (lv_aula_8_0= ruleAula ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:575:2: ( (lv_dia_0_0= ruleDia ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:576:1: (lv_dia_0_0= ruleDia )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:576:1: (lv_dia_0_0= ruleDia )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:577:3: lv_dia_0_0= ruleDia
            {
             
            	        newCompositeNode(grammarAccess.getHorarioAccess().getDiaDiaParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDia_in_ruleHorario1094);
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

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleHorario1106); 

                	newLeafNode(otherlv_1, grammarAccess.getHorarioAccess().getColonKeyword_1());
                
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:597:1: ( (lv_desde_2_0= ruleHora ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:598:1: (lv_desde_2_0= ruleHora )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:598:1: (lv_desde_2_0= ruleHora )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:599:3: lv_desde_2_0= ruleHora
            {
             
            	        newCompositeNode(grammarAccess.getHorarioAccess().getDesdeHoraParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleHora_in_ruleHorario1127);
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

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleHorario1139); 

                	newLeafNode(otherlv_3, grammarAccess.getHorarioAccess().getAKeyword_3());
                
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:619:1: ( (lv_hasta_4_0= ruleHora ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:620:1: (lv_hasta_4_0= ruleHora )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:620:1: (lv_hasta_4_0= ruleHora )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:621:3: lv_hasta_4_0= ruleHora
            {
             
            	        newCompositeNode(grammarAccess.getHorarioAccess().getHastaHoraParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleHora_in_ruleHorario1160);
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

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleHorario1172); 

                	newLeafNode(otherlv_5, grammarAccess.getHorarioAccess().getHsSeDictaKeyword_5());
                
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:641:1: ( (lv_materia_6_0= ruleMateria ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:642:1: (lv_materia_6_0= ruleMateria )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:642:1: (lv_materia_6_0= ruleMateria )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:643:3: lv_materia_6_0= ruleMateria
            {
             
            	        newCompositeNode(grammarAccess.getHorarioAccess().getMateriaMateriaParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleMateria_in_ruleHorario1193);
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

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleHorario1205); 

                	newLeafNode(otherlv_7, grammarAccess.getHorarioAccess().getEnKeyword_7());
                
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:663:1: ( (lv_aula_8_0= ruleAula ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:664:1: (lv_aula_8_0= ruleAula )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:664:1: (lv_aula_8_0= ruleAula )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:665:3: lv_aula_8_0= ruleAula
            {
             
            	        newCompositeNode(grammarAccess.getHorarioAccess().getAulaAulaParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleAula_in_ruleHorario1226);
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
    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:689:1: entryRuleSemestre returns [EObject current=null] : iv_ruleSemestre= ruleSemestre EOF ;
    public final EObject entryRuleSemestre() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSemestre = null;


        try {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:690:2: (iv_ruleSemestre= ruleSemestre EOF )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:691:2: iv_ruleSemestre= ruleSemestre EOF
            {
             newCompositeNode(grammarAccess.getSemestreRule()); 
            pushFollow(FOLLOW_ruleSemestre_in_entryRuleSemestre1262);
            iv_ruleSemestre=ruleSemestre();

            state._fsp--;

             current =iv_ruleSemestre; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSemestre1272); 

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
    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:698:1: ruleSemestre returns [EObject current=null] : ( ( (lv_anho_0_0= RULE_INT ) ) otherlv_1= 'semestre' ( (lv_numero_2_0= RULE_INT ) ) ) ;
    public final EObject ruleSemestre() throws RecognitionException {
        EObject current = null;

        Token lv_anho_0_0=null;
        Token otherlv_1=null;
        Token lv_numero_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:701:28: ( ( ( (lv_anho_0_0= RULE_INT ) ) otherlv_1= 'semestre' ( (lv_numero_2_0= RULE_INT ) ) ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:702:1: ( ( (lv_anho_0_0= RULE_INT ) ) otherlv_1= 'semestre' ( (lv_numero_2_0= RULE_INT ) ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:702:1: ( ( (lv_anho_0_0= RULE_INT ) ) otherlv_1= 'semestre' ( (lv_numero_2_0= RULE_INT ) ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:702:2: ( (lv_anho_0_0= RULE_INT ) ) otherlv_1= 'semestre' ( (lv_numero_2_0= RULE_INT ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:702:2: ( (lv_anho_0_0= RULE_INT ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:703:1: (lv_anho_0_0= RULE_INT )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:703:1: (lv_anho_0_0= RULE_INT )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:704:3: lv_anho_0_0= RULE_INT
            {
            lv_anho_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSemestre1314); 

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

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleSemestre1331); 

                	newLeafNode(otherlv_1, grammarAccess.getSemestreAccess().getSemestreKeyword_1());
                
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:724:1: ( (lv_numero_2_0= RULE_INT ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:725:1: (lv_numero_2_0= RULE_INT )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:725:1: (lv_numero_2_0= RULE_INT )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:726:3: lv_numero_2_0= RULE_INT
            {
            lv_numero_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSemestre1348); 

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
    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:750:1: entryRuleDia returns [EObject current=null] : iv_ruleDia= ruleDia EOF ;
    public final EObject entryRuleDia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDia = null;


        try {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:751:2: (iv_ruleDia= ruleDia EOF )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:752:2: iv_ruleDia= ruleDia EOF
            {
             newCompositeNode(grammarAccess.getDiaRule()); 
            pushFollow(FOLLOW_ruleDia_in_entryRuleDia1389);
            iv_ruleDia=ruleDia();

            state._fsp--;

             current =iv_ruleDia; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDia1399); 

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
    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:759:1: ruleDia returns [EObject current=null] : (otherlv_0= 'dia' ( (lv_dia_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDia() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_dia_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:762:28: ( (otherlv_0= 'dia' ( (lv_dia_1_0= RULE_ID ) ) ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:763:1: (otherlv_0= 'dia' ( (lv_dia_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:763:1: (otherlv_0= 'dia' ( (lv_dia_1_0= RULE_ID ) ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:763:3: otherlv_0= 'dia' ( (lv_dia_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleDia1436); 

                	newLeafNode(otherlv_0, grammarAccess.getDiaAccess().getDiaKeyword_0());
                
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:767:1: ( (lv_dia_1_0= RULE_ID ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:768:1: (lv_dia_1_0= RULE_ID )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:768:1: (lv_dia_1_0= RULE_ID )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:769:3: lv_dia_1_0= RULE_ID
            {
            lv_dia_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDia1453); 

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
    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:793:1: entryRuleHorarios returns [EObject current=null] : iv_ruleHorarios= ruleHorarios EOF ;
    public final EObject entryRuleHorarios() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHorarios = null;


        try {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:794:2: (iv_ruleHorarios= ruleHorarios EOF )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:795:2: iv_ruleHorarios= ruleHorarios EOF
            {
             newCompositeNode(grammarAccess.getHorariosRule()); 
            pushFollow(FOLLOW_ruleHorarios_in_entryRuleHorarios1494);
            iv_ruleHorarios=ruleHorarios();

            state._fsp--;

             current =iv_ruleHorarios; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHorarios1504); 

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
    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:802:1: ruleHorarios returns [EObject current=null] : (otherlv_0= 'horarios {' ( (lv_horarios_1_0= ruleHorario ) )+ otherlv_2= '}' ) ;
    public final EObject ruleHorarios() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_horarios_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:805:28: ( (otherlv_0= 'horarios {' ( (lv_horarios_1_0= ruleHorario ) )+ otherlv_2= '}' ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:806:1: (otherlv_0= 'horarios {' ( (lv_horarios_1_0= ruleHorario ) )+ otherlv_2= '}' )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:806:1: (otherlv_0= 'horarios {' ( (lv_horarios_1_0= ruleHorario ) )+ otherlv_2= '}' )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:806:3: otherlv_0= 'horarios {' ( (lv_horarios_1_0= ruleHorario ) )+ otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleHorarios1541); 

                	newLeafNode(otherlv_0, grammarAccess.getHorariosAccess().getHorariosKeyword_0());
                
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:810:1: ( (lv_horarios_1_0= ruleHorario ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==22) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:811:1: (lv_horarios_1_0= ruleHorario )
            	    {
            	    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:811:1: (lv_horarios_1_0= ruleHorario )
            	    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:812:3: lv_horarios_1_0= ruleHorario
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHorariosAccess().getHorariosHorarioParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHorario_in_ruleHorarios1562);
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
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleHorarios1575); 

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
    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:840:1: entryRulePlanificacion returns [EObject current=null] : iv_rulePlanificacion= rulePlanificacion EOF ;
    public final EObject entryRulePlanificacion() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlanificacion = null;


        try {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:841:2: (iv_rulePlanificacion= rulePlanificacion EOF )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:842:2: iv_rulePlanificacion= rulePlanificacion EOF
            {
             newCompositeNode(grammarAccess.getPlanificacionRule()); 
            pushFollow(FOLLOW_rulePlanificacion_in_entryRulePlanificacion1611);
            iv_rulePlanificacion=rulePlanificacion();

            state._fsp--;

             current =iv_rulePlanificacion; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlanificacion1621); 

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
    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:849:1: rulePlanificacion returns [EObject current=null] : (otherlv_0= 'planificacion' ( (lv_semestre_1_0= ruleSemestre ) ) otherlv_2= '{' otherlv_3= 'a dictar:' ( (lv_materias_4_0= ruleMateria ) )+ ( (lv_horarios_5_0= ruleHorarios ) ) otherlv_6= '}' ) ;
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
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:852:28: ( (otherlv_0= 'planificacion' ( (lv_semestre_1_0= ruleSemestre ) ) otherlv_2= '{' otherlv_3= 'a dictar:' ( (lv_materias_4_0= ruleMateria ) )+ ( (lv_horarios_5_0= ruleHorarios ) ) otherlv_6= '}' ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:853:1: (otherlv_0= 'planificacion' ( (lv_semestre_1_0= ruleSemestre ) ) otherlv_2= '{' otherlv_3= 'a dictar:' ( (lv_materias_4_0= ruleMateria ) )+ ( (lv_horarios_5_0= ruleHorarios ) ) otherlv_6= '}' )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:853:1: (otherlv_0= 'planificacion' ( (lv_semestre_1_0= ruleSemestre ) ) otherlv_2= '{' otherlv_3= 'a dictar:' ( (lv_materias_4_0= ruleMateria ) )+ ( (lv_horarios_5_0= ruleHorarios ) ) otherlv_6= '}' )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:853:3: otherlv_0= 'planificacion' ( (lv_semestre_1_0= ruleSemestre ) ) otherlv_2= '{' otherlv_3= 'a dictar:' ( (lv_materias_4_0= ruleMateria ) )+ ( (lv_horarios_5_0= ruleHorarios ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_rulePlanificacion1658); 

                	newLeafNode(otherlv_0, grammarAccess.getPlanificacionAccess().getPlanificacionKeyword_0());
                
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:857:1: ( (lv_semestre_1_0= ruleSemestre ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:858:1: (lv_semestre_1_0= ruleSemestre )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:858:1: (lv_semestre_1_0= ruleSemestre )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:859:3: lv_semestre_1_0= ruleSemestre
            {
             
            	        newCompositeNode(grammarAccess.getPlanificacionAccess().getSemestreSemestreParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSemestre_in_rulePlanificacion1679);
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

            otherlv_2=(Token)match(input,26,FOLLOW_26_in_rulePlanificacion1691); 

                	newLeafNode(otherlv_2, grammarAccess.getPlanificacionAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,27,FOLLOW_27_in_rulePlanificacion1703); 

                	newLeafNode(otherlv_3, grammarAccess.getPlanificacionAccess().getADictarKeyword_3());
                
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:883:1: ( (lv_materias_4_0= ruleMateria ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==13) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:884:1: (lv_materias_4_0= ruleMateria )
            	    {
            	    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:884:1: (lv_materias_4_0= ruleMateria )
            	    // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:885:3: lv_materias_4_0= ruleMateria
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPlanificacionAccess().getMateriasMateriaParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMateria_in_rulePlanificacion1724);
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:901:3: ( (lv_horarios_5_0= ruleHorarios ) )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:902:1: (lv_horarios_5_0= ruleHorarios )
            {
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:902:1: (lv_horarios_5_0= ruleHorarios )
            // ../org.xtext.unq.planificadorDeMaterias/src-gen/org/xtext/unq/planificador/parser/antlr/internal/InternalPdm.g:903:3: lv_horarios_5_0= ruleHorarios
            {
             
            	        newCompositeNode(grammarAccess.getPlanificacionAccess().getHorariosHorariosParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleHorarios_in_rulePlanificacion1746);
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

            otherlv_6=(Token)match(input,24,FOLLOW_24_in_rulePlanificacion1758); 

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
    public static final BitSet FOLLOW_ruleProfesor_in_ruleModel131 = new BitSet(new long[]{0x0000000002C0F822L});
    public static final BitSet FOLLOW_ruleHora_in_ruleModel153 = new BitSet(new long[]{0x0000000002C0F822L});
    public static final BitSet FOLLOW_ruleMateria_in_ruleModel175 = new BitSet(new long[]{0x0000000002C0E822L});
    public static final BitSet FOLLOW_ruleAula_in_ruleModel197 = new BitSet(new long[]{0x0000000002C0C822L});
    public static final BitSet FOLLOW_ruleCargaHoraria_in_ruleModel219 = new BitSet(new long[]{0x0000000002C08822L});
    public static final BitSet FOLLOW_ruleCargaHorariaDocente_in_ruleModel241 = new BitSet(new long[]{0x0000000002C00822L});
    public static final BitSet FOLLOW_ruleHorarios_in_ruleModel263 = new BitSet(new long[]{0x0000000002C00022L});
    public static final BitSet FOLLOW_ruleDia_in_ruleModel285 = new BitSet(new long[]{0x0000000002400022L});
    public static final BitSet FOLLOW_ruleSemestre_in_ruleModel307 = new BitSet(new long[]{0x0000000002400022L});
    public static final BitSet FOLLOW_rulePlanificacion_in_ruleModel329 = new BitSet(new long[]{0x0000000002400002L});
    public static final BitSet FOLLOW_ruleHorario_in_ruleModel351 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleProfesor_in_entryRuleProfesor388 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProfesor398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleProfesor435 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProfesor452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHora_in_entryRuleHora493 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHora503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleHora540 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleHora557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMateria_in_entryRuleMateria598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMateria608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleMateria645 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMateria662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAula_in_entryRuleAula703 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAula713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleAula750 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAula767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCargaHoraria_in_entryRuleCargaHoraria808 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCargaHoraria818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleCargaHoraria855 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCargaHoraria872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCargaHorariaDocente_in_entryRuleCargaHorariaDocente913 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCargaHorariaDocente923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProfesor_in_ruleCargaHorariaDocente969 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCargaHorariaDocente981 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleCargaHoraria_in_ruleCargaHorariaDocente1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHorario_in_entryRuleHorario1038 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHorario1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDia_in_ruleHorario1094 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleHorario1106 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleHora_in_ruleHorario1127 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleHorario1139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleHora_in_ruleHorario1160 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleHorario1172 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleMateria_in_ruleHorario1193 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleHorario1205 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleAula_in_ruleHorario1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSemestre_in_entryRuleSemestre1262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSemestre1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSemestre1314 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSemestre1331 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSemestre1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDia_in_entryRuleDia1389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDia1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleDia1436 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDia1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHorarios_in_entryRuleHorarios1494 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHorarios1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleHorarios1541 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleHorario_in_ruleHorarios1562 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_24_in_ruleHorarios1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlanificacion_in_entryRulePlanificacion1611 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlanificacion1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulePlanificacion1658 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleSemestre_in_rulePlanificacion1679 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rulePlanificacion1691 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_rulePlanificacion1703 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleMateria_in_rulePlanificacion1724 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_ruleHorarios_in_rulePlanificacion1746 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePlanificacion1758 = new BitSet(new long[]{0x0000000000000002L});

}