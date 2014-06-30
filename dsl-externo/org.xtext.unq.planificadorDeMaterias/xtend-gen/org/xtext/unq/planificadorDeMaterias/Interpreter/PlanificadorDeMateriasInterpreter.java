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
import org.eclipse.xtext.xbase.lib.Functions.Function2;
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
  public Iterable<Materia> materias(final Model m) {
    EList<ElementosPrimarios> _elementosPrimarios = m.getElementosPrimarios();
    return Iterables.<Materia>filter(_elementosPrimarios, Materia.class);
  }
  
  public Iterable<Asignacion> asignaciones(final Model m) {
    EList<ElementosPrimarios> _elementosPrimarios = m.getElementosPrimarios();
    return Iterables.<Asignacion>filter(_elementosPrimarios, Asignacion.class);
  }
  
  public Iterable<Profesor> profesores(final Model m) {
    EList<ElementosPrimarios> _elementosPrimarios = m.getElementosPrimarios();
    return Iterables.<Profesor>filter(_elementosPrimarios, Profesor.class);
  }
  
  /**
   * Extension methods ElementosSecundarios
   */
  public Iterable<Aula> aulas(final Model m) {
    EList<ElementosSecundarios> _elementosSecundarios = m.getElementosSecundarios();
    return Iterables.<Aula>filter(_elementosSecundarios, Aula.class);
  }
  
  public Iterable<Recurso> recursos(final Model m) {
    EList<ElementosSecundarios> _elementosSecundarios = m.getElementosSecundarios();
    return Iterables.<Recurso>filter(_elementosSecundarios, Recurso.class);
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
  
  public Object interpret(final Model m) {
    Object _xblockexpression = null;
    {
      this.aulaMasUtilizada(m);
      this.horariosLibres(m);
      this.porcentajeDeAsignacionesPorTurno(m);
      _xblockexpression = this.profesoresYMaterias(m);
    }
    return _xblockexpression;
  }
  
  public Aula aulaMasUtilizada(final Model m) {
    HashMap<Aula, Integer> _generarMapDeOcurrenciasDeAulas = this.generarMapDeOcurrenciasDeAulas(m);
    return this.getMax(_generarMapDeOcurrenciasDeAulas);
  }
  
  public Object horariosLibres(final Model m) {
    return null;
  }
  
  public Object porcentajeDeAsignacionesPorTurno(final Model m) {
    return null;
  }
  
  public Object profesoresYMaterias(final Model m) {
    return null;
  }
  
  private Aula getMax(final Map<Aula, Integer> aulas) {
    Set<Map.Entry<Aula, Integer>> _entrySet = aulas.entrySet();
    final Function2<Map.Entry<Aula, Integer>, Map.Entry<Aula, Integer>, Map.Entry<Aula, Integer>> _function = new Function2<Map.Entry<Aula, Integer>, Map.Entry<Aula, Integer>, Map.Entry<Aula, Integer>>() {
      public Map.Entry<Aula, Integer> apply(final Map.Entry<Aula, Integer> x, final Map.Entry<Aula, Integer> y) {
        Integer _value = x.getValue();
        Integer _value_1 = y.getValue();
        boolean _greaterThan = (_value.compareTo(_value_1) > 0);
        if (_greaterThan) {
          return x;
        } else {
          return y;
        }
      }
    };
    final Map.Entry<Aula, Integer> l = IterableExtensions.<Map.Entry<Aula, Integer>, Map.Entry<Aula, Integer>>fold(_entrySet, null, _function);
    return l.getKey();
  }
  
  private HashMap<Aula, Integer> generarMapDeOcurrenciasDeAulas(final Model m) {
    final HashMap<Aula, Integer> aulas = new HashMap<Aula, Integer>();
    Iterable<Aula> _aulas = this.aulas(m);
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
    return aulas;
  }
}
