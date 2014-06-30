package org.xtext.unq.planificadorDeMaterias.Interpreter;

import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.google.inject.Injector;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.unq.planificador.PdmStandaloneSetup;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Asignacion;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Aula;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.ElementosPrimarios;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.ElementosSecundarios;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Materia;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Model;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Profesor;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Recurso;

@SuppressWarnings("all")
public class PlanificadorDeMateriasInterpreter {
  /**
   * Extension methods ElementosPrimarios
   */
  public Iterable<Materia> materias(final List<ElementosPrimarios> elementos) {
    return Iterables.<Materia>filter(elementos, Materia.class);
  }
  
  public Iterable<Asignacion> asignaciones(final List<ElementosPrimarios> elementos) {
    return Iterables.<Asignacion>filter(elementos, Asignacion.class);
  }
  
  public Iterable<Profesor> profesores(final List<ElementosPrimarios> elementos) {
    return Iterables.<Profesor>filter(elementos, Profesor.class);
  }
  
  /**
   * Extension methods ElementosSecundarios
   */
  public Iterable<Aula> aulas(final List<ElementosSecundarios> elementos) {
    return Iterables.<Aula>filter(elementos, Aula.class);
  }
  
  public Iterable<Recurso> recursos(final List<ElementosSecundarios> elementos) {
    return Iterables.<Recurso>filter(elementos, Recurso.class);
  }
  
  public static void main(final String[] args) {
    boolean _isEmpty = ((List<String>)Conversions.doWrapArray(args)).isEmpty();
    if (_isEmpty) {
      throw new RuntimeException("La ruta no es valida");
    }
    final String fileName = args[0];
    final Model model = PlanificadorDeMateriasInterpreter.parse(fileName);
    PlanificadorDeMateriasInterpreter _planificadorDeMateriasInterpreter = new PlanificadorDeMateriasInterpreter();
    _planificadorDeMateriasInterpreter.interpret(model);
  }
  
  public static Model parse(final String fileName) {
    try {
      PdmStandaloneSetup _pdmStandaloneSetup = new PdmStandaloneSetup();
      final Injector injector = _pdmStandaloneSetup.createInjectorAndDoEMFRegistration();
      final XtextResourceSet resourceSet = injector.<XtextResourceSet>getInstance(XtextResourceSet.class);
      URI _createURI = URI.createURI(fileName);
      final Resource resource = resourceSet.createResource(_createURI);
      Map<Object, Object> _xsetliteral = null;
      Map<Object, Object> _tempMap = Maps.<Object, Object>newHashMap();
      _xsetliteral = Collections.<Object, Object>unmodifiableMap(_tempMap);
      resource.load(_xsetliteral);
      EList<EObject> _contents = resource.getContents();
      EObject _get = _contents.get(0);
      return ((Model) _get);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void interpret(final Model m) {
    this.aulaMasUtilizada(m);
    this.horariosLibres(m);
    this.porcentajeDeAsignacionesPorTurno(m);
    this.profesoresYMaterias(m);
  }
  
  public void profesoresYMaterias(final Model model) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  public void porcentajeDeAsignacionesPorTurno(final Model model) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  public void horariosLibres(final Model model) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  public void aulaMasUtilizada(final Model m) {
    final HashMap<Aula, Integer> aulas = new HashMap<Aula, Integer>();
    EList<ElementosSecundarios> _elementosSecundarios = m.getElementosSecundarios();
    Iterable<Aula> _aulas = this.aulas(_elementosSecundarios);
    final Procedure1<Aula> _function = new Procedure1<Aula>() {
      public void apply(final Aula e) {
        boolean _containsKey = aulas.containsKey(e);
        boolean _not = (!_containsKey);
        if (_not) {
          aulas.put(e, Integer.valueOf(1));
        } else {
          Integer _get = aulas.get(e);
          int _plus = ((_get).intValue() + 1);
          aulas.put(e, Integer.valueOf(_plus));
        }
      }
    };
    IterableExtensions.<Aula>forEach(_aulas, _function);
    final HashMap<Aula, Integer> max = aulas;
    final Object aula = null;
  }
  
  public Set<Map.Entry<Aula, Integer>> getMax(final Map<Aula, Integer> aulas) {
    throw new Error("Unresolved compilation problems:"
      + "\nmismatched input \':\' expecting \';\'"
      + "\nmismatched input \')\' expecting \'}\'"
      + "\nThe method or field Entry is undefined for the type PlanificadorDeMateriasInterpreter"
      + "\nThe method or field e is undefined for the type PlanificadorDeMateriasInterpreter"
      + "\n<> cannot be resolved");
  }
}
