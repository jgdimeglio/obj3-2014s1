package org.xtext.unq.planificador.jvmmodel;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.CargaHoraria;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Materia;

/**
 * <p>Infers a JVM model from the source model.</p>
 * 
 * <p>The JVM model should contain all elements that would appear in the Java code
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>
 */
@SuppressWarnings("all")
public class PdmJvmModelInferrer extends AbstractModelInferrer {
  /**
   * convenience API to build and initialize JVM types and their members.
   */
  @Inject
  @Extension
  private JvmTypesBuilder _jvmTypesBuilder;
  
  /**
   * The dispatch method {@code infer} is called for each instance of the
   * given element's type that is contained in a resource.
   * 
   * @param element
   *            the model to create one or more
   *            {@link org.eclipse.xtext.common.types.JvmDeclaredType declared
   *            types} from.
   * @param acceptor
   *            each created
   *            {@link org.eclipse.xtext.common.types.JvmDeclaredType type}
   *            without a container should be passed to the acceptor in order
   *            get attached to the current resource. The acceptor's
   *            {@link IJvmDeclaredTypeAcceptor#accept(org.eclipse.xtext.common.types.JvmDeclaredType)
   *            accept(..)} method takes the constructed empty type for the
   *            pre-indexing phase. This one is further initialized in the
   *            indexing phase using the closure you pass to the returned
   *            {@link org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing#initializeLater(org.eclipse.xtext.xbase.lib.Procedures.Procedure1)
   *            initializeLater(..)}.
   * @param isPreIndexingPhase
   *            whether the method is called in a pre-indexing phase, i.e.
   *            when the global index is not yet fully updated. You must not
   *            rely on linking using the index if isPreIndexingPhase is
   *            <code>true</code>.
   */
  protected void _infer(final Materia materia, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    JvmGenericType _class = this._jvmTypesBuilder.toClass(materia, "Materia");
    IJvmDeclaredTypeAcceptor.IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(_class);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
      public void apply(final JvmGenericType it) {
        String _documentation = PdmJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(materia);
        PdmJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
        EList<JvmMember> _members = it.getMembers();
        JvmTypeReference _newTypeRef = PdmJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(materia, String.class);
        JvmField _field = PdmJvmModelInferrer.this._jvmTypesBuilder.toField(materia, "horas", _newTypeRef);
        PdmJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members, _field);
        EList<JvmMember> _members_1 = it.getMembers();
        final Procedure1<JvmConstructor> _function = new Procedure1<JvmConstructor>() {
          public void apply(final JvmConstructor it) {
            final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
              public void apply(final ITreeAppendable it) {
                StringConcatenation _builder = new StringConcatenation();
                _builder.append("this.nombre ;");
                _builder.newLine();
                _builder.append("this.horas = ");
                CargaHoraria _cargaHoraria = materia.getCargaHoraria();
                int _cantHoras = _cargaHoraria.getCantHoras();
                _builder.append(_cantHoras, "");
                _builder.append(";");
                _builder.newLineIfNotEmpty();
                _builder.append("this.dias = ");
                CargaHoraria _cargaHoraria_1 = materia.getCargaHoraria();
                int _dias = _cargaHoraria_1.getDias();
                _builder.append(_dias, "");
                _builder.append(";");
                _builder.newLineIfNotEmpty();
                it.append(_builder);
              }
            };
            PdmJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
          }
        };
        JvmConstructor _constructor = PdmJvmModelInferrer.this._jvmTypesBuilder.toConstructor(materia, _function);
        PdmJvmModelInferrer.this._jvmTypesBuilder.<JvmConstructor>operator_add(_members_1, _constructor);
      }
    };
    _accept.initializeLater(_function);
  }
  
  public void infer(final EObject materia, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    if (materia instanceof Materia) {
      _infer((Materia)materia, acceptor, isPreIndexingPhase);
      return;
    } else if (materia != null) {
      _infer(materia, acceptor, isPreIndexingPhase);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(materia, acceptor, isPreIndexingPhase).toString());
    }
  }
}
