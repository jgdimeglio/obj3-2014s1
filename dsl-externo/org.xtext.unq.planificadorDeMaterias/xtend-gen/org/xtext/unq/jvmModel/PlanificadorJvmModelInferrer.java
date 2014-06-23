package org.xtext.unq.jvmModel;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Materia;

@SuppressWarnings("all")
public class PlanificadorJvmModelInferrer extends AbstractModelInferrer {
  @Inject
  @Extension
  private JvmTypesBuilder _jvmTypesBuilder;
  
  protected void _infer(final Materia materia, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPrelinkingPhase) {
    JvmGenericType _class = this._jvmTypesBuilder.toClass(materia, "Materia");
    IJvmDeclaredTypeAcceptor.IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(_class);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
      public void apply(final JvmGenericType it) {
        EList<JvmMember> _members = it.getMembers();
        final Procedure1<JvmConstructor> _function = new Procedure1<JvmConstructor>() {
          public void apply(final JvmConstructor it) {
            final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
              public void apply(final ITreeAppendable it) {
                StringConcatenation _builder = new StringConcatenation();
                _builder.append("setNombre(\"");
                String _nombre = materia.getNombre();
                _builder.append(_nombre, "");
                _builder.append("\");");
                _builder.newLineIfNotEmpty();
                it.append(_builder);
              }
            };
            PlanificadorJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
          }
        };
        JvmConstructor _constructor = PlanificadorJvmModelInferrer.this._jvmTypesBuilder.toConstructor(materia, _function);
        PlanificadorJvmModelInferrer.this._jvmTypesBuilder.<JvmConstructor>operator_add(_members, _constructor);
      }
    };
    _accept.initializeLater(_function);
  }
  
  public void infer(final EObject materia, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPrelinkingPhase) {
    if (materia instanceof Materia) {
      _infer((Materia)materia, acceptor, isPrelinkingPhase);
      return;
    } else if (materia != null) {
      _infer(materia, acceptor, isPrelinkingPhase);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(materia, acceptor, isPrelinkingPhase).toString());
    }
  }
}
