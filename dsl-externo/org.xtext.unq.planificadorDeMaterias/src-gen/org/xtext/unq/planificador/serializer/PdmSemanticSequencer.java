package org.xtext.unq.planificador.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.unq.planificador.pdm.Aula;
import org.xtext.unq.planificador.pdm.CargaHoraria;
import org.xtext.unq.planificador.pdm.CargaHorariaDocente;
import org.xtext.unq.planificador.pdm.Dia;
import org.xtext.unq.planificador.pdm.Hora;
import org.xtext.unq.planificador.pdm.Horario;
import org.xtext.unq.planificador.pdm.Horarios;
import org.xtext.unq.planificador.pdm.Materia;
import org.xtext.unq.planificador.pdm.Model;
import org.xtext.unq.planificador.pdm.PdmPackage;
import org.xtext.unq.planificador.pdm.Planificacion;
import org.xtext.unq.planificador.pdm.Profesor;
import org.xtext.unq.planificador.pdm.Semestre;
import org.xtext.unq.planificador.services.PdmGrammarAccess;

@SuppressWarnings("all")
public class PdmSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PdmGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == PdmPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case PdmPackage.AULA:
				if(context == grammarAccess.getAulaRule()) {
					sequence_Aula(context, (Aula) semanticObject); 
					return; 
				}
				else break;
			case PdmPackage.CARGA_HORARIA:
				if(context == grammarAccess.getCargaHorariaRule()) {
					sequence_CargaHoraria(context, (CargaHoraria) semanticObject); 
					return; 
				}
				else break;
			case PdmPackage.CARGA_HORARIA_DOCENTE:
				if(context == grammarAccess.getCargaHorariaDocenteRule()) {
					sequence_CargaHorariaDocente(context, (CargaHorariaDocente) semanticObject); 
					return; 
				}
				else break;
			case PdmPackage.DIA:
				if(context == grammarAccess.getDiaRule()) {
					sequence_Dia(context, (Dia) semanticObject); 
					return; 
				}
				else break;
			case PdmPackage.HORA:
				if(context == grammarAccess.getHoraRule()) {
					sequence_Hora(context, (Hora) semanticObject); 
					return; 
				}
				else break;
			case PdmPackage.HORARIO:
				if(context == grammarAccess.getHorarioRule()) {
					sequence_Horario(context, (Horario) semanticObject); 
					return; 
				}
				else break;
			case PdmPackage.HORARIOS:
				if(context == grammarAccess.getHorariosRule()) {
					sequence_Horarios(context, (Horarios) semanticObject); 
					return; 
				}
				else break;
			case PdmPackage.MATERIA:
				if(context == grammarAccess.getMateriaRule()) {
					sequence_Materia(context, (Materia) semanticObject); 
					return; 
				}
				else break;
			case PdmPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case PdmPackage.PLANIFICACION:
				if(context == grammarAccess.getPlanificacionRule()) {
					sequence_Planificacion(context, (Planificacion) semanticObject); 
					return; 
				}
				else break;
			case PdmPackage.PROFESOR:
				if(context == grammarAccess.getProfesorRule()) {
					sequence_Profesor(context, (Profesor) semanticObject); 
					return; 
				}
				else break;
			case PdmPackage.SEMESTRE:
				if(context == grammarAccess.getSemestreRule()) {
					sequence_Semestre(context, (Semestre) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     nombre+=ID
	 */
	protected void sequence_Aula(EObject context, Aula semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (nombre=Profesor tipo=CargaHoraria)
	 */
	protected void sequence_CargaHorariaDocente(EObject context, CargaHorariaDocente semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PdmPackage.Literals.CARGA_HORARIA_DOCENTE__NOMBRE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdmPackage.Literals.CARGA_HORARIA_DOCENTE__NOMBRE));
			if(transientValues.isValueTransient(semanticObject, PdmPackage.Literals.CARGA_HORARIA_DOCENTE__TIPO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdmPackage.Literals.CARGA_HORARIA_DOCENTE__TIPO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCargaHorariaDocenteAccess().getNombreProfesorParserRuleCall_0_0(), semanticObject.getNombre());
		feeder.accept(grammarAccess.getCargaHorariaDocenteAccess().getTipoCargaHorariaParserRuleCall_2_0(), semanticObject.getTipo());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (tipo+=ID dias+=INT)
	 */
	protected void sequence_CargaHoraria(EObject context, CargaHoraria semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     dia+=ID
	 */
	protected void sequence_Dia(EObject context, Dia semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     hora+=INT
	 */
	protected void sequence_Hora(EObject context, Hora semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (dia=Dia desde=Hora hasta=Hora materia=Materia aula=Aula)
	 */
	protected void sequence_Horario(EObject context, Horario semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PdmPackage.Literals.HORARIO__DIA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdmPackage.Literals.HORARIO__DIA));
			if(transientValues.isValueTransient(semanticObject, PdmPackage.Literals.HORARIO__DESDE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdmPackage.Literals.HORARIO__DESDE));
			if(transientValues.isValueTransient(semanticObject, PdmPackage.Literals.HORARIO__HASTA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdmPackage.Literals.HORARIO__HASTA));
			if(transientValues.isValueTransient(semanticObject, PdmPackage.Literals.HORARIO__MATERIA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdmPackage.Literals.HORARIO__MATERIA));
			if(transientValues.isValueTransient(semanticObject, PdmPackage.Literals.HORARIO__AULA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdmPackage.Literals.HORARIO__AULA));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHorarioAccess().getDiaDiaParserRuleCall_0_0(), semanticObject.getDia());
		feeder.accept(grammarAccess.getHorarioAccess().getDesdeHoraParserRuleCall_2_0(), semanticObject.getDesde());
		feeder.accept(grammarAccess.getHorarioAccess().getHastaHoraParserRuleCall_4_0(), semanticObject.getHasta());
		feeder.accept(grammarAccess.getHorarioAccess().getMateriaMateriaParserRuleCall_6_0(), semanticObject.getMateria());
		feeder.accept(grammarAccess.getHorarioAccess().getAulaAulaParserRuleCall_8_0(), semanticObject.getAula());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     horarios+=Horario+
	 */
	protected void sequence_Horarios(EObject context, Horarios semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (nombre+=ID cargaHoraria+=CargaHoraria)
	 */
	protected void sequence_Materia(EObject context, Materia semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         profesors+=Profesor* 
	 *         horas+=Hora* 
	 *         materias+=Materia* 
	 *         aulas+=Aula* 
	 *         cargasHorarias+=CargaHoraria* 
	 *         cargasHorariasDocentes+=CargaHorariaDocente* 
	 *         horarios+=Horarios* 
	 *         dias+=Dia* 
	 *         semestre+=Semestre* 
	 *         planificaciones+=Planificacion* 
	 *         horarios+=Horario*
	 *     )
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (semestre=Semestre materias+=Materia+ horarios=Horarios)
	 */
	protected void sequence_Planificacion(EObject context, Planificacion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (nombre+=ID dedicacion+=Dedicacion)
	 */
	protected void sequence_Profesor(EObject context, Profesor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (anho=INT numero=INT)
	 */
	protected void sequence_Semestre(EObject context, Semestre semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PdmPackage.Literals.SEMESTRE__ANHO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdmPackage.Literals.SEMESTRE__ANHO));
			if(transientValues.isValueTransient(semanticObject, PdmPackage.Literals.SEMESTRE__NUMERO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdmPackage.Literals.SEMESTRE__NUMERO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSemestreAccess().getAnhoINTTerminalRuleCall_0_0(), semanticObject.getAnho());
		feeder.accept(grammarAccess.getSemestreAccess().getNumeroINTTerminalRuleCall_2_0(), semanticObject.getNumero());
		feeder.finish();
	}
}
