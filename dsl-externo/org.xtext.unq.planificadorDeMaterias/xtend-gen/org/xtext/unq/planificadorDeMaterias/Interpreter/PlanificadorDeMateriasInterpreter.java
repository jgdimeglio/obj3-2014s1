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
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.unq.planificador.PdmStandaloneSetup;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Asignacion;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Aula;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.AulaHorario;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.ElementosPrimarios;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.ElementosSecundarios;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Materia;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Model;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Planificacion;
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
  
  public EList<Planificacion> planificaciones(final Model m) {
    return m.getPlanificacion();
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
  
  public void aulaMasUtilizada(final Model m) {
    HashMap<String, Integer> _generarMapDeOcurrenciasDeAulas = this.generarMapDeOcurrenciasDeAulas(m);
    HashMap<String, Integer> _max = this.getMax(_generarMapDeOcurrenciasDeAulas);
    Set<Map.Entry<String, Integer>> aulaConOcurrencias = _max.entrySet();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Aula mas utilizada: ");
    final Set<Map.Entry<String, Integer>> _converted_aulaConOcurrencias = (Set<Map.Entry<String, Integer>>)aulaConOcurrencias;
    Map.Entry<String, Integer> _get = ((Map.Entry<String, Integer>[])Conversions.unwrapArray(_converted_aulaConOcurrencias, Map.Entry.class))[0];
    String _key = _get.getKey();
    _builder.append(_key, "");
    _builder.append(", con ");
    final Set<Map.Entry<String, Integer>> _converted_aulaConOcurrencias_1 = (Set<Map.Entry<String, Integer>>)aulaConOcurrencias;
    Map.Entry<String, Integer> _get_1 = ((Map.Entry<String, Integer>[])Conversions.unwrapArray(_converted_aulaConOcurrencias_1, Map.Entry.class))[0];
    Integer _value = _get_1.getValue();
    _builder.append(_value, "");
    _builder.append(" ocurrencias");
    System.out.println(_builder);
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
  
  private HashMap<String, Integer> getMax(final Map<String, Integer> aulas) {
    final Set<Map.Entry<String, Integer>> aulasSet = aulas.entrySet();
    String aulaIndex = "";
    int max = 0;
    int _size = aulasSet.size();
    boolean _greaterThan = (_size > 1);
    if (_greaterThan) {
      Map.Entry<String, Integer> _get = ((Map.Entry<String, Integer>[])Conversions.unwrapArray(aulasSet, Map.Entry.class))[0];
      Integer _value = _get.getValue();
      max = (_value).intValue();
      Map.Entry<String, Integer> _get_1 = ((Map.Entry<String, Integer>[])Conversions.unwrapArray(aulasSet, Map.Entry.class))[0];
      String _key = _get_1.getKey();
      aulaIndex = _key;
      for (final Map.Entry<String, Integer> entry : aulasSet) {
        Integer _value_1 = entry.getValue();
        boolean _greaterThan_1 = ((_value_1).intValue() > max);
        if (_greaterThan_1) {
          Integer _value_2 = entry.getValue();
          max = (_value_2).intValue();
          String _key_1 = entry.getKey();
          aulaIndex = _key_1;
        }
      }
    } else {
      int _size_1 = aulasSet.size();
      boolean _equals = (_size_1 == 1);
      if (_equals) {
        Map.Entry<String, Integer> _get_2 = ((Map.Entry<String, Integer>[])Conversions.unwrapArray(aulasSet, Map.Entry.class))[0];
        String _key_2 = _get_2.getKey();
        aulaIndex = _key_2;
        Map.Entry<String, Integer> _get_3 = ((Map.Entry<String, Integer>[])Conversions.unwrapArray(aulasSet, Map.Entry.class))[0];
        Integer _value_3 = _get_3.getValue();
        max = (_value_3).intValue();
      }
    }
    HashMap<String, Integer> ret = new HashMap<String, Integer>();
    ret.put(aulaIndex, Integer.valueOf(max));
    return ret;
  }
  
  private HashMap<String, Integer> generarMapDeOcurrenciasDeAulas(final Model m) {
    final HashMap<String, Integer> aulas = new HashMap<String, Integer>();
    EList<Planificacion> _planificacion = m.getPlanificacion();
    final Procedure1<Planificacion> _function = new Procedure1<Planificacion>() {
      public void apply(final Planificacion planificacion) {
        EList<Asignacion> _asignaciones = planificacion.getAsignaciones();
        final Procedure1<Asignacion> _function = new Procedure1<Asignacion>() {
          public void apply(final Asignacion asignacion) {
            EList<AulaHorario> _aulaHorarios = asignacion.getAulaHorarios();
            final Procedure1<AulaHorario> _function = new Procedure1<AulaHorario>() {
              public void apply(final AulaHorario aulaHorario) {
                Aula _aula = aulaHorario.getAula();
                String _name = _aula.getName();
                boolean _containsKey = aulas.containsKey(_name);
                boolean _not = (!_containsKey);
                if (_not) {
                  Aula _aula_1 = aulaHorario.getAula();
                  String _name_1 = _aula_1.getName();
                  aulas.put(_name_1, Integer.valueOf(1));
                } else {
                  Aula _aula_2 = aulaHorario.getAula();
                  String _name_2 = _aula_2.getName();
                  Aula _aula_3 = aulaHorario.getAula();
                  String _name_3 = _aula_3.getName();
                  Integer _get = aulas.get(_name_3);
                  int _plus = ((_get).intValue() + 1);
                  aulas.put(_name_2, Integer.valueOf(_plus));
                }
              }
            };
            IterableExtensions.<AulaHorario>forEach(_aulaHorarios, _function);
          }
        };
        IterableExtensions.<Asignacion>forEach(_asignaciones, _function);
      }
    };
    IterableExtensions.<Planificacion>forEach(_planificacion, _function);
    return aulas;
  }
}
