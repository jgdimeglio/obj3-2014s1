package org.xtext.unq.planificador.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericArrayTypeReference;
import org.eclipse.xtext.common.types.JvmLowerBound;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmUpperBound;
import org.eclipse.xtext.common.types.JvmWildcardTypeReference;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XBasicForLoopExpression;
import org.eclipse.xtext.xbase.XBinaryOperation;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XBooleanLiteral;
import org.eclipse.xtext.xbase.XCasePart;
import org.eclipse.xtext.xbase.XCastedExpression;
import org.eclipse.xtext.xbase.XCatchClause;
import org.eclipse.xtext.xbase.XClosure;
import org.eclipse.xtext.xbase.XConstructorCall;
import org.eclipse.xtext.xbase.XDoWhileExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XForLoopExpression;
import org.eclipse.xtext.xbase.XIfExpression;
import org.eclipse.xtext.xbase.XInstanceOfExpression;
import org.eclipse.xtext.xbase.XListLiteral;
import org.eclipse.xtext.xbase.XMemberFeatureCall;
import org.eclipse.xtext.xbase.XNullLiteral;
import org.eclipse.xtext.xbase.XNumberLiteral;
import org.eclipse.xtext.xbase.XPostfixOperation;
import org.eclipse.xtext.xbase.XReturnExpression;
import org.eclipse.xtext.xbase.XSetLiteral;
import org.eclipse.xtext.xbase.XStringLiteral;
import org.eclipse.xtext.xbase.XSwitchExpression;
import org.eclipse.xtext.xbase.XSynchronizedExpression;
import org.eclipse.xtext.xbase.XThrowExpression;
import org.eclipse.xtext.xbase.XTryCatchFinallyExpression;
import org.eclipse.xtext.xbase.XTypeLiteral;
import org.eclipse.xtext.xbase.XUnaryOperation;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.XWhileExpression;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.serializer.XbaseSemanticSequencer;
import org.eclipse.xtext.xtype.XFunctionTypeRef;
import org.eclipse.xtext.xtype.XImportDeclaration;
import org.eclipse.xtext.xtype.XImportSection;
import org.eclipse.xtext.xtype.XtypePackage;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Asignacion;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Aula;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.AulaHorario;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.CargaHoraria;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Disponibilidad;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.EXCLUSIVA;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Horario;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Jueves;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Lunes;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Martes;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Materia;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Miercoles;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Model;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Planificacion;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Profesor;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Recurso;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.SEMI;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.SIMPLE;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Sabado;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Semestre;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Viernes;
import org.xtext.unq.planificador.services.PdmGrammarAccess;

@SuppressWarnings("all")
public class PdmSemanticSequencer extends XbaseSemanticSequencer {

	@Inject
	private PdmGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == PlanificadorDeMateriasDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case PlanificadorDeMateriasDslPackage.ASIGNACION:
				if(context == grammarAccess.getAsignacionRule() ||
				   context == grammarAccess.getElementosPrimariosRule()) {
					sequence_Asignacion(context, (Asignacion) semanticObject); 
					return; 
				}
				else break;
			case PlanificadorDeMateriasDslPackage.AULA:
				if(context == grammarAccess.getAulaRule() ||
				   context == grammarAccess.getElementosSecundariosRule()) {
					sequence_Aula(context, (Aula) semanticObject); 
					return; 
				}
				else break;
			case PlanificadorDeMateriasDslPackage.AULA_HORARIO:
				if(context == grammarAccess.getAulaHorarioRule()) {
					sequence_AulaHorario(context, (AulaHorario) semanticObject); 
					return; 
				}
				else break;
			case PlanificadorDeMateriasDslPackage.CARGA_HORARIA:
				if(context == grammarAccess.getCargaHorariaRule()) {
					sequence_CargaHoraria(context, (CargaHoraria) semanticObject); 
					return; 
				}
				else break;
			case PlanificadorDeMateriasDslPackage.DISPONIBILIDAD:
				if(context == grammarAccess.getDisponibilidadRule()) {
					sequence_Disponibilidad(context, (Disponibilidad) semanticObject); 
					return; 
				}
				else break;
			case PlanificadorDeMateriasDslPackage.EXCLUSIVA:
				if(context == grammarAccess.getDedicacionRule()) {
					sequence_Dedicacion(context, (EXCLUSIVA) semanticObject); 
					return; 
				}
				else break;
			case PlanificadorDeMateriasDslPackage.HORARIO:
				if(context == grammarAccess.getHorarioRule()) {
					sequence_Horario(context, (Horario) semanticObject); 
					return; 
				}
				else break;
			case PlanificadorDeMateriasDslPackage.JUEVES:
				if(context == grammarAccess.getDiaRule()) {
					sequence_Dia(context, (Jueves) semanticObject); 
					return; 
				}
				else break;
			case PlanificadorDeMateriasDslPackage.LUNES:
				if(context == grammarAccess.getDiaRule()) {
					sequence_Dia(context, (Lunes) semanticObject); 
					return; 
				}
				else break;
			case PlanificadorDeMateriasDslPackage.MARTES:
				if(context == grammarAccess.getDiaRule()) {
					sequence_Dia(context, (Martes) semanticObject); 
					return; 
				}
				else break;
			case PlanificadorDeMateriasDslPackage.MATERIA:
				if(context == grammarAccess.getElementosPrimariosRule() ||
				   context == grammarAccess.getMateriaRule()) {
					sequence_Materia(context, (Materia) semanticObject); 
					return; 
				}
				else break;
			case PlanificadorDeMateriasDslPackage.MIERCOLES:
				if(context == grammarAccess.getDiaRule()) {
					sequence_Dia(context, (Miercoles) semanticObject); 
					return; 
				}
				else break;
			case PlanificadorDeMateriasDslPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case PlanificadorDeMateriasDslPackage.PLANIFICACION:
				if(context == grammarAccess.getPlanificacionRule()) {
					sequence_Planificacion(context, (Planificacion) semanticObject); 
					return; 
				}
				else break;
			case PlanificadorDeMateriasDslPackage.PROFESOR:
				if(context == grammarAccess.getElementosPrimariosRule() ||
				   context == grammarAccess.getProfesorRule()) {
					sequence_Profesor(context, (Profesor) semanticObject); 
					return; 
				}
				else break;
			case PlanificadorDeMateriasDslPackage.RECURSO:
				if(context == grammarAccess.getElementosSecundariosRule() ||
				   context == grammarAccess.getRecursoRule()) {
					sequence_Recurso(context, (Recurso) semanticObject); 
					return; 
				}
				else break;
			case PlanificadorDeMateriasDslPackage.SEMI:
				if(context == grammarAccess.getDedicacionRule()) {
					sequence_Dedicacion(context, (SEMI) semanticObject); 
					return; 
				}
				else break;
			case PlanificadorDeMateriasDslPackage.SIMPLE:
				if(context == grammarAccess.getDedicacionRule()) {
					sequence_Dedicacion(context, (SIMPLE) semanticObject); 
					return; 
				}
				else break;
			case PlanificadorDeMateriasDslPackage.SABADO:
				if(context == grammarAccess.getDiaRule()) {
					sequence_Dia(context, (Sabado) semanticObject); 
					return; 
				}
				else break;
			case PlanificadorDeMateriasDslPackage.SEMESTRE:
				if(context == grammarAccess.getSemestreRule()) {
					sequence_Semestre(context, (Semestre) semanticObject); 
					return; 
				}
				else break;
			case PlanificadorDeMateriasDslPackage.VIERNES:
				if(context == grammarAccess.getDiaRule()) {
					sequence_Dia(context, (Viernes) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == TypesPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case TypesPackage.JVM_FORMAL_PARAMETER:
				if(context == grammarAccess.getFullJvmFormalParameterRule()) {
					sequence_FullJvmFormalParameter(context, (JvmFormalParameter) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getJvmFormalParameterRule()) {
					sequence_JvmFormalParameter(context, (JvmFormalParameter) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_GENERIC_ARRAY_TYPE_REFERENCE:
				if(context == grammarAccess.getJvmArgumentTypeReferenceRule() ||
				   context == grammarAccess.getJvmTypeReferenceRule() ||
				   context == grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0()) {
					sequence_JvmTypeReference(context, (JvmGenericArrayTypeReference) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_LOWER_BOUND:
				if(context == grammarAccess.getJvmLowerBoundRule()) {
					sequence_JvmLowerBound(context, (JvmLowerBound) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_PARAMETERIZED_TYPE_REFERENCE:
				if(context == grammarAccess.getJvmArgumentTypeReferenceRule() ||
				   context == grammarAccess.getJvmParameterizedTypeReferenceRule() ||
				   context == grammarAccess.getJvmTypeReferenceRule() ||
				   context == grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0()) {
					sequence_JvmParameterizedTypeReference(context, (JvmParameterizedTypeReference) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_TYPE_PARAMETER:
				if(context == grammarAccess.getJvmTypeParameterRule()) {
					sequence_JvmTypeParameter(context, (JvmTypeParameter) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_UPPER_BOUND:
				if(context == grammarAccess.getJvmUpperBoundAndedRule()) {
					sequence_JvmUpperBoundAnded(context, (JvmUpperBound) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getJvmUpperBoundRule()) {
					sequence_JvmUpperBound(context, (JvmUpperBound) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_WILDCARD_TYPE_REFERENCE:
				if(context == grammarAccess.getJvmArgumentTypeReferenceRule() ||
				   context == grammarAccess.getJvmWildcardTypeReferenceRule()) {
					sequence_JvmWildcardTypeReference(context, (JvmWildcardTypeReference) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == XbasePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case XbasePackage.XASSIGNMENT:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XAssignment_XMemberFeatureCall(context, (XAssignment) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XBASIC_FOR_LOOP_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXBasicForLoopExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XBasicForLoopExpression(context, (XBasicForLoopExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XBINARY_OPERATION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XAdditiveExpression_XAndExpression_XAssignment_XEqualityExpression_XMultiplicativeExpression_XOrExpression_XOtherOperatorExpression_XRelationalExpression(context, (XBinaryOperation) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XBLOCK_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXBlockExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XBlockExpression(context, (XBlockExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getXExpressionInClosureRule()) {
					sequence_XExpressionInClosure(context, (XBlockExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XBOOLEAN_LITERAL:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXBooleanLiteralRule() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXLiteralRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XBooleanLiteral(context, (XBooleanLiteral) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XCASE_PART:
				if(context == grammarAccess.getXCasePartRule()) {
					sequence_XCasePart(context, (XCasePart) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XCASTED_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XCastedExpression(context, (XCastedExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XCATCH_CLAUSE:
				if(context == grammarAccess.getXCatchClauseRule()) {
					sequence_XCatchClause(context, (XCatchClause) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XCLOSURE:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXClosureRule() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXLiteralRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XClosure(context, (XClosure) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getXShortClosureRule()) {
					sequence_XShortClosure(context, (XClosure) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XCONSTRUCTOR_CALL:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXConstructorCallRule() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XConstructorCall(context, (XConstructorCall) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XDO_WHILE_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXDoWhileExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XDoWhileExpression(context, (XDoWhileExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XFEATURE_CALL:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XFeatureCall(context, (XFeatureCall) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XFOR_LOOP_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXForLoopExpressionRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XForLoopExpression(context, (XForLoopExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XIF_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXIfExpressionRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XIfExpression(context, (XIfExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XINSTANCE_OF_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XRelationalExpression(context, (XInstanceOfExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XLIST_LITERAL:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXCollectionLiteralRule() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXListLiteralRule() ||
				   context == grammarAccess.getXLiteralRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XListLiteral(context, (XListLiteral) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XMEMBER_FEATURE_CALL:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XMemberFeatureCall(context, (XMemberFeatureCall) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XNULL_LITERAL:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXLiteralRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXNullLiteralRule() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XNullLiteral(context, (XNullLiteral) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XNUMBER_LITERAL:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXLiteralRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXNumberLiteralRule() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XNumberLiteral(context, (XNumberLiteral) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XPOSTFIX_OPERATION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XPostfixOperation(context, (XPostfixOperation) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XRETURN_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXReturnExpressionRule() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XReturnExpression(context, (XReturnExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XSET_LITERAL:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXCollectionLiteralRule() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXLiteralRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXSetLiteralRule() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XSetLiteral(context, (XSetLiteral) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XSTRING_LITERAL:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXLiteralRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXStringLiteralRule() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XStringLiteral(context, (XStringLiteral) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XSWITCH_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXSwitchExpressionRule() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XSwitchExpression(context, (XSwitchExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XSYNCHRONIZED_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXSynchronizedExpressionRule() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XSynchronizedExpression(context, (XSynchronizedExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XTHROW_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXThrowExpressionRule() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XThrowExpression(context, (XThrowExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XTRY_CATCH_FINALLY_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXTryCatchFinallyExpressionRule() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XTryCatchFinallyExpression(context, (XTryCatchFinallyExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XTYPE_LITERAL:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXLiteralRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXTypeLiteralRule() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XTypeLiteral(context, (XTypeLiteral) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XUNARY_OPERATION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XUnaryOperation(context, (XUnaryOperation) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XVARIABLE_DECLARATION:
				if(context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXVariableDeclarationRule()) {
					sequence_XVariableDeclaration(context, (XVariableDeclaration) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XWHILE_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule() ||
				   context == grammarAccess.getXWhileExpressionRule()) {
					sequence_XWhileExpression(context, (XWhileExpression) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == XtypePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case XtypePackage.XFUNCTION_TYPE_REF:
				if(context == grammarAccess.getJvmArgumentTypeReferenceRule() ||
				   context == grammarAccess.getJvmTypeReferenceRule() ||
				   context == grammarAccess.getXFunctionTypeRefRule()) {
					sequence_XFunctionTypeRef(context, (XFunctionTypeRef) semanticObject); 
					return; 
				}
				else break;
			case XtypePackage.XIMPORT_DECLARATION:
				if(context == grammarAccess.getXImportDeclarationRule()) {
					sequence_XImportDeclaration(context, (XImportDeclaration) semanticObject); 
					return; 
				}
				else break;
			case XtypePackage.XIMPORT_SECTION:
				if(context == grammarAccess.getXImportSectionRule()) {
					sequence_XImportSection(context, (XImportSection) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (materia=[Materia|ID] inscriptos=INT profesores+=[Profesor|ID]+ aulaHorarios+=AulaHorario+)
	 */
	protected void sequence_Asignacion(EObject context, Asignacion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (dia=Dia horario=Horario aula=[Aula|ID])
	 */
	protected void sequence_AulaHorario(EObject context, AulaHorario semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PlanificadorDeMateriasDslPackage.Literals.AULA_HORARIO__DIA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PlanificadorDeMateriasDslPackage.Literals.AULA_HORARIO__DIA));
			if(transientValues.isValueTransient(semanticObject, PlanificadorDeMateriasDslPackage.Literals.AULA_HORARIO__HORARIO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PlanificadorDeMateriasDslPackage.Literals.AULA_HORARIO__HORARIO));
			if(transientValues.isValueTransient(semanticObject, PlanificadorDeMateriasDslPackage.Literals.AULA_HORARIO__AULA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PlanificadorDeMateriasDslPackage.Literals.AULA_HORARIO__AULA));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAulaHorarioAccess().getDiaDiaParserRuleCall_1_0(), semanticObject.getDia());
		feeder.accept(grammarAccess.getAulaHorarioAccess().getHorarioHorarioParserRuleCall_3_0(), semanticObject.getHorario());
		feeder.accept(grammarAccess.getAulaHorarioAccess().getAulaAulaIDTerminalRuleCall_5_0_1(), semanticObject.getAula());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID recursos+=Recurso? capacidad=INT)
	 */
	protected void sequence_Aula(EObject context, Aula semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (cantHoras=INT diasSemanales=INT)
	 */
	protected void sequence_CargaHoraria(EObject context, CargaHoraria semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PlanificadorDeMateriasDslPackage.Literals.CARGA_HORARIA__CANT_HORAS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PlanificadorDeMateriasDslPackage.Literals.CARGA_HORARIA__CANT_HORAS));
			if(transientValues.isValueTransient(semanticObject, PlanificadorDeMateriasDslPackage.Literals.CARGA_HORARIA__DIAS_SEMANALES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PlanificadorDeMateriasDslPackage.Literals.CARGA_HORARIA__DIAS_SEMANALES));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCargaHorariaAccess().getCantHorasINTTerminalRuleCall_1_0(), semanticObject.getCantHoras());
		feeder.accept(grammarAccess.getCargaHorariaAccess().getDiasSemanalesINTTerminalRuleCall_3_0(), semanticObject.getDiasSemanales());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {EXCLUSIVA}
	 */
	protected void sequence_Dedicacion(EObject context, EXCLUSIVA semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {SEMI}
	 */
	protected void sequence_Dedicacion(EObject context, SEMI semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {SIMPLE}
	 */
	protected void sequence_Dedicacion(EObject context, SIMPLE semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Jueves}
	 */
	protected void sequence_Dia(EObject context, Jueves semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Lunes}
	 */
	protected void sequence_Dia(EObject context, Lunes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Martes}
	 */
	protected void sequence_Dia(EObject context, Martes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Miercoles}
	 */
	protected void sequence_Dia(EObject context, Miercoles semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Sabado}
	 */
	protected void sequence_Dia(EObject context, Sabado semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Viernes}
	 */
	protected void sequence_Dia(EObject context, Viernes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (dias+=Dia* dias+=Dia* inicio=INT fin=INT)
	 */
	protected void sequence_Disponibilidad(EObject context, Disponibilidad semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (desde=INT hasta=INT)
	 */
	protected void sequence_Horario(EObject context, Horario semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PlanificadorDeMateriasDslPackage.Literals.HORARIO__DESDE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PlanificadorDeMateriasDslPackage.Literals.HORARIO__DESDE));
			if(transientValues.isValueTransient(semanticObject, PlanificadorDeMateriasDslPackage.Literals.HORARIO__HASTA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PlanificadorDeMateriasDslPackage.Literals.HORARIO__HASTA));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHorarioAccess().getDesdeINTTerminalRuleCall_0_0(), semanticObject.getDesde());
		feeder.accept(grammarAccess.getHorarioAccess().getHastaINTTerminalRuleCall_2_0(), semanticObject.getHasta());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID cargaHoraria=CargaHoraria recursos+=Recurso*)
	 */
	protected void sequence_Materia(EObject context, Materia semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (elementosPrimarios+=ElementosPrimarios* elementosSecundarios+=ElementosSecundarios* planificacion+=Planificacion*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (semestre=Semestre asignaciones+=Asignacion*)
	 */
	protected void sequence_Planificacion(EObject context, Planificacion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID dedicacion=Dedicacion disponibilidad=Disponibilidad?)
	 */
	protected void sequence_Profesor(EObject context, Profesor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Recurso(EObject context, Recurso semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PlanificadorDeMateriasDslPackage.Literals.ELEMENTOS_SECUNDARIOS__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PlanificadorDeMateriasDslPackage.Literals.ELEMENTOS_SECUNDARIOS__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRecursoAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (anho=INT numero=INT)
	 */
	protected void sequence_Semestre(EObject context, Semestre semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PlanificadorDeMateriasDslPackage.Literals.SEMESTRE__ANHO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PlanificadorDeMateriasDslPackage.Literals.SEMESTRE__ANHO));
			if(transientValues.isValueTransient(semanticObject, PlanificadorDeMateriasDslPackage.Literals.SEMESTRE__NUMERO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PlanificadorDeMateriasDslPackage.Literals.SEMESTRE__NUMERO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSemestreAccess().getAnhoINTTerminalRuleCall_0_0(), semanticObject.getAnho());
		feeder.accept(grammarAccess.getSemestreAccess().getNumeroINTTerminalRuleCall_2_0(), semanticObject.getNumero());
		feeder.finish();
	}
}
