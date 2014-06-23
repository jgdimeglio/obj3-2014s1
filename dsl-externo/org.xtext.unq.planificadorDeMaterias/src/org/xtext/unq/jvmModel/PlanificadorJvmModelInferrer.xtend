package org.xtext.unq.jvmModel

import com.google.inject.Inject
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmType
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.xtext.unq.planificador.pdm.Materia

class PlanificadorJvmModelInferrer extends AbstractModelInferrer{
	@Inject extension JvmTypesBuilder
	
	def dispatch void infer(Materia materia, IJvmDeclaredTypeAcceptor acceptor, boolean isPrelinkingPhase) {
		acceptor.accept(
			materia.toClass("Materia")
		).initializeLater [
			
		]
	}
}