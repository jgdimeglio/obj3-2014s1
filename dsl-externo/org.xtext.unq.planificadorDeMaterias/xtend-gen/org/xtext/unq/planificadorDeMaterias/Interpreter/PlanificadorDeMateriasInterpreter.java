package org.xtext.unq.planificadorDeMaterias.Interpreter;

import ExtensionMethods.ExtensionMethodsInterpreter;
import ExtensionMethods.HorarioPlanificacion;
import com.google.common.collect.Maps;
import com.google.inject.Injector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.unq.planificador.PdmStandaloneSetup;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Asignacion;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Aula;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.AulaHorario;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Dia;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Horario;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Materia;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Model;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Planificacion;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Profesor;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Semestre;

@SuppressWarnings("all")
public class PlanificadorDeMateriasInterpreter {
  @Extension
  private ExtensionMethodsInterpreter _extensionMethodsInterpreter = new ExtensionMethodsInterpreter();
  
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
  
  /**
   * Metodos del Interprete
   */
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
  
  /**
   * Metodos de comportamiento del Interprete
   */
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
    InputOutput.<String>println(_builder.toString());
    InputOutput.println();
  }
  
  public void porcentajeDeAsignacionesPorTurno(final Model m) {
    EList<Planificacion> _planificacion = m.getPlanificacion();
    final Procedure1<Planificacion> _function = new Procedure1<Planificacion>() {
      public void apply(final Planificacion p) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Porcentajes de turnos sobre la planificacion del ");
        Semestre _semestre = p.getSemestre();
        int _anho = _semestre.getAnho();
        _builder.append(_anho, "");
        _builder.append(" semestre ");
        Semestre _semestre_1 = p.getSemestre();
        int _numero = _semestre_1.getNumero();
        _builder.append(_numero, "");
        _builder.append(":");
        InputOutput.<String>println(_builder.toString());
        final int mañana = PlanificadorDeMateriasInterpreter.this.porcentajeDeMateriasEn(p, 8, 13);
        final int tarde = PlanificadorDeMateriasInterpreter.this.porcentajeDeMateriasEn(p, 13, 18);
        final int noche = PlanificadorDeMateriasInterpreter.this.porcentajeDeMateriasEn(p, 18, 22);
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("Turno Mañana: ");
        _builder_1.append(mañana, "");
        _builder_1.append(" %");
        InputOutput.<String>println(_builder_1.toString());
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("Turno Tarde : ");
        _builder_2.append(tarde, "");
        _builder_2.append(" %");
        InputOutput.<String>println(_builder_2.toString());
        StringConcatenation _builder_3 = new StringConcatenation();
        _builder_3.append("Turno Noche : ");
        _builder_3.append(noche, "");
        _builder_3.append(" %");
        InputOutput.<String>println(_builder_3.toString());
        InputOutput.println();
      }
    };
    IterableExtensions.<Planificacion>forEach(_planificacion, _function);
  }
  
  public void horariosLibres(final Model m) {
    EList<Planificacion> planificaciones = m.getPlanificacion();
    final Procedure1<Planificacion> _function = new Procedure1<Planificacion>() {
      public void apply(final Planificacion planificacion) {
        HashMap<String, ArrayList<HorarioPlanificacion>> _horariosDisponible = PlanificadorDeMateriasInterpreter.this.horariosDisponible(planificacion);
        PlanificadorDeMateriasInterpreter.this.printMap(_horariosDisponible);
      }
    };
    IterableExtensions.<Planificacion>forEach(planificaciones, _function);
  }
  
  public void printMap(final Map<String, ArrayList<HorarioPlanificacion>> map) {
    ArrayList<String> _dias = this.dias();
    for (final String dia : _dias) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(dia, "");
      _builder.append(" : ");
      String _stringHorarios = this.stringHorarios(map, dia);
      _builder.append(_stringHorarios, "");
      InputOutput.<String>println(_builder.toString());
    }
    InputOutput.println();
  }
  
  public String stringHorarios(final Map<String, ArrayList<HorarioPlanificacion>> map, final String dia) {
    String _xblockexpression = null;
    {
      String string = "[ ]";
      ArrayList<HorarioPlanificacion> list = map.get(dia);
      boolean _isEmpty = list.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        string = "[";
        for (final HorarioPlanificacion h : list) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append(" ");
          _builder.append("(");
          int _inicio = h.getInicio();
          _builder.append(_inicio, " ");
          _builder.append(",");
          int _fin = h.getFin();
          _builder.append(_fin, " ");
          _builder.append(") ");
          String _plus = (string + _builder);
          string = _plus;
        }
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("]");
        String _plus_1 = (string + _builder_1);
        string = _plus_1;
      }
      _xblockexpression = string;
    }
    return _xblockexpression;
  }
  
  public ArrayList<String> dias() {
    ArrayList<String> _xblockexpression = null;
    {
      ArrayList<String> dias = new ArrayList<String>();
      dias.add("Lunes");
      dias.add("Martes");
      dias.add("Miercoles");
      dias.add("Jueves");
      dias.add("Viernes");
      dias.add("Sabado");
      _xblockexpression = dias;
    }
    return _xblockexpression;
  }
  
  public HashMap<String, ArrayList<HorarioPlanificacion>> horarios(final Planificacion p) {
    HashMap<String, ArrayList<HorarioPlanificacion>> _xblockexpression = null;
    {
      ArrayList<HorarioPlanificacion> list = new ArrayList<HorarioPlanificacion>();
      HashMap<String, ArrayList<HorarioPlanificacion>> map = this.init();
      ArrayList<String> dias = this.dias();
      for (final String dia : dias) {
        {
          EList<Asignacion> _asignaciones = p.getAsignaciones();
          for (final Asignacion a : _asignaciones) {
            EList<AulaHorario> _aulaHorarios = a.getAulaHorarios();
            for (final AulaHorario ah : _aulaHorarios) {
              Dia _dia = ah.getDia();
              EClass _eClass = _dia.eClass();
              String _name = _eClass.getName();
              boolean _equals = _name.equals(dia);
              if (_equals) {
                boolean _containsKey = map.containsKey(dia);
                boolean _not = (!_containsKey);
                if (_not) {
                  Horario _horario = ah.getHorario();
                  int _desde = _horario.getDesde();
                  Horario _horario_1 = ah.getHorario();
                  int _hasta = _horario_1.getHasta();
                  HorarioPlanificacion _horarioPlanificacion = new HorarioPlanificacion(_desde, _hasta);
                  list.add(_horarioPlanificacion);
                  map.put(dia, list);
                } else {
                  ArrayList<HorarioPlanificacion> listMap = map.get(dia);
                  Horario _horario_2 = ah.getHorario();
                  int _desde_1 = _horario_2.getDesde();
                  Horario _horario_3 = ah.getHorario();
                  int _hasta_1 = _horario_3.getHasta();
                  HorarioPlanificacion _horarioPlanificacion_1 = new HorarioPlanificacion(_desde_1, _hasta_1);
                  listMap.add(_horarioPlanificacion_1);
                  map.put(dia, listMap);
                }
              }
            }
          }
          ArrayList<HorarioPlanificacion> _arrayList = new ArrayList<HorarioPlanificacion>();
          list = _arrayList;
        }
      }
      _xblockexpression = map;
    }
    return _xblockexpression;
  }
  
  public HashMap<String, ArrayList<HorarioPlanificacion>> init() {
    HashMap<String, ArrayList<HorarioPlanificacion>> _xblockexpression = null;
    {
      HashMap<String, ArrayList<HorarioPlanificacion>> map = new HashMap<String, ArrayList<HorarioPlanificacion>>();
      ArrayList<String> _dias = this.dias();
      for (final String dia : _dias) {
        ArrayList<HorarioPlanificacion> _arrayList = new ArrayList<HorarioPlanificacion>();
        map.put(dia, _arrayList);
      }
      _xblockexpression = map;
    }
    return _xblockexpression;
  }
  
  public HashMap<String, ArrayList<HorarioPlanificacion>> horariosDisponible(final Planificacion p) {
    HashMap<String, ArrayList<HorarioPlanificacion>> _xblockexpression = null;
    {
      HashMap<String, ArrayList<HorarioPlanificacion>> horariosNoDisponiblesMap = new HashMap<String, ArrayList<HorarioPlanificacion>>();
      HashMap<String, ArrayList<HorarioPlanificacion>> _horarios = this.horarios(p);
      horariosNoDisponiblesMap = _horarios;
      boolean modificar = false;
      HorarioPlanificacion horaABorrar = new HorarioPlanificacion();
      HorarioPlanificacion horaNueva1 = new HorarioPlanificacion();
      HorarioPlanificacion horaNueva2 = new HorarioPlanificacion();
      ArrayList<String> _dias = this.dias();
      for (final String dia : _dias) {
        {
          ArrayList<HorarioPlanificacion> list = new ArrayList<HorarioPlanificacion>();
          ArrayList<HorarioPlanificacion> listaRet = new ArrayList<HorarioPlanificacion>();
          ArrayList<HorarioPlanificacion> _get = horariosNoDisponiblesMap.get(dia);
          list = _get;
          HorarioPlanificacion hora = new HorarioPlanificacion(8, 22);
          listaRet.add(hora);
          for (final HorarioPlanificacion h : list) {
            {
              for (final HorarioPlanificacion hp : listaRet) {
                int _inicio = h.getInicio();
                int _inicio_1 = hp.getInicio();
                boolean _equals = (_inicio == _inicio_1);
                if (_equals) {
                  int _fin = h.getFin();
                  int _fin_1 = hp.getFin();
                  HorarioPlanificacion x = new HorarioPlanificacion(_fin, _fin_1);
                  int _inicio_2 = x.getInicio();
                  hp.setInicio(_inicio_2);
                  int _fin_2 = x.getFin();
                  hp.setFin(_fin_2);
                } else {
                  int _fin_3 = h.getFin();
                  int _fin_4 = hp.getFin();
                  boolean _equals_1 = (_fin_3 == _fin_4);
                  if (_equals_1) {
                    int _inicio_3 = hp.getInicio();
                    int _inicio_4 = h.getInicio();
                    HorarioPlanificacion x_1 = new HorarioPlanificacion(_inicio_3, _inicio_4);
                    int _inicio_5 = x_1.getInicio();
                    hp.setInicio(_inicio_5);
                    int _fin_5 = x_1.getFin();
                    hp.setFin(_fin_5);
                  } else {
                    boolean _estaEnElRango = this.estaEnElRango(h, hp);
                    if (_estaEnElRango) {
                      horaABorrar = hp;
                      int _inicio_6 = hp.getInicio();
                      int _inicio_7 = h.getInicio();
                      HorarioPlanificacion _horarioPlanificacion = new HorarioPlanificacion(_inicio_6, _inicio_7);
                      horaNueva1 = _horarioPlanificacion;
                      int _fin_6 = h.getFin();
                      int _fin_7 = hp.getFin();
                      HorarioPlanificacion _horarioPlanificacion_1 = new HorarioPlanificacion(_fin_6, _fin_7);
                      horaNueva2 = _horarioPlanificacion_1;
                      modificar = true;
                    }
                  }
                }
              }
              if (modificar) {
                ArrayList<HorarioPlanificacion> _remover = this.remover(listaRet, horaABorrar);
                listaRet = _remover;
                listaRet.add(horaNueva1);
                listaRet.add(horaNueva2);
                modificar = false;
              }
            }
          }
          horariosNoDisponiblesMap.put(dia, listaRet);
        }
      }
      _xblockexpression = horariosNoDisponiblesMap;
    }
    return _xblockexpression;
  }
  
  public ArrayList<HorarioPlanificacion> remover(final ArrayList<HorarioPlanificacion> h, final HorarioPlanificacion hp) {
    ArrayList<HorarioPlanificacion> _xblockexpression = null;
    {
      ArrayList<HorarioPlanificacion> ret = new ArrayList<HorarioPlanificacion>();
      for (final HorarioPlanificacion horario : h) {
        boolean _or = false;
        int _inicio = horario.getInicio();
        int _inicio_1 = hp.getInicio();
        boolean _notEquals = (_inicio != _inicio_1);
        if (_notEquals) {
          _or = true;
        } else {
          int _fin = horario.getFin();
          int _fin_1 = hp.getFin();
          boolean _notEquals_1 = (_fin != _fin_1);
          _or = _notEquals_1;
        }
        if (_or) {
          ret.add(horario);
        }
      }
      _xblockexpression = ret;
    }
    return _xblockexpression;
  }
  
  public boolean estaEnElRango(final HorarioPlanificacion h, final HorarioPlanificacion hp) {
    boolean _and = false;
    int _inicio = hp.getInicio();
    int _inicio_1 = h.getInicio();
    boolean _lessThan = (_inicio < _inicio_1);
    if (!_lessThan) {
      _and = false;
    } else {
      int _fin = hp.getFin();
      int _fin_1 = h.getFin();
      boolean _greaterThan = (_fin > _fin_1);
      _and = _greaterThan;
    }
    return _and;
  }
  
  public void profesoresYMaterias(final Model m) {
    EList<Planificacion> _planificacion = m.getPlanificacion();
    final Procedure1<Planificacion> _function = new Procedure1<Planificacion>() {
      public void apply(final Planificacion p) {
        PlanificadorDeMateriasInterpreter.this.mostrarTablaDeProfesoresYMaterias(p);
      }
    };
    IterableExtensions.<Planificacion>forEach(_planificacion, _function);
  }
  
  /**
   * Metodos Privados
   */
  private ArrayList<String> materiasQueDicta(final Profesor profesor, final List<Asignacion> asignaciones) {
    final ArrayList<String> materias = new ArrayList<String>();
    Iterable<Asignacion> _asignacionesDelProfesor = this.asignacionesDelProfesor(profesor, asignaciones);
    final Procedure1<Asignacion> _function = new Procedure1<Asignacion>() {
      public void apply(final Asignacion a) {
        Materia _materia = a.getMateria();
        String _name = _materia.getName();
        materias.add(_name);
      }
    };
    IterableExtensions.<Asignacion>forEach(_asignacionesDelProfesor, _function);
    return materias;
  }
  
  public void mostrarTablaDeProfesoresYMaterias(final Planificacion planificacion) {
    List<Profesor> _profesores = this._extensionMethodsInterpreter.profesores(planificacion);
    final Procedure1<Profesor> _function = new Procedure1<Profesor>() {
      public void apply(final Profesor p) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("El Profesor: ");
        String _name = p.getName();
        _builder.append(_name, "");
        _builder.append(", dicta: ");
        EList<Asignacion> _asignaciones = planificacion.getAsignaciones();
        ArrayList<String> _materiasQueDicta = PlanificadorDeMateriasInterpreter.this.materiasQueDicta(p, _asignaciones);
        _builder.append(_materiasQueDicta, "");
        InputOutput.<String>println(_builder.toString());
      }
    };
    IterableExtensions.<Profesor>forEach(_profesores, _function);
  }
  
  private boolean laDicta(final Asignacion asignacion, final Profesor profesor) {
    EList<Profesor> _profesores = asignacion.getProfesores();
    return _profesores.contains(profesor);
  }
  
  private Iterable<Asignacion> asignacionesDelProfesor(final Profesor profesor, final List<Asignacion> asignaciones) {
    final Function1<Asignacion, Boolean> _function = new Function1<Asignacion, Boolean>() {
      public Boolean apply(final Asignacion a) {
        return Boolean.valueOf(PlanificadorDeMateriasInterpreter.this.laDicta(a, profesor));
      }
    };
    return IterableExtensions.<Asignacion>filter(asignaciones, _function);
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
  
  private int cantidadDeMateriasAsignadasEn(final Planificacion p, final int inicio, final int fin) {
    EList<Asignacion> _asignaciones = p.getAsignaciones();
    final Function1<Asignacion, Boolean> _function = new Function1<Asignacion, Boolean>() {
      public Boolean apply(final Asignacion a) {
        EList<AulaHorario> _aulaHorarios = a.getAulaHorarios();
        return Boolean.valueOf(PlanificadorDeMateriasInterpreter.this.hayAlMenosUnaMateriaAsignadaEn(_aulaHorarios, inicio, fin));
      }
    };
    final Iterable<Asignacion> materiasAsignadas = IterableExtensions.<Asignacion>filter(_asignaciones, _function);
    return IterableExtensions.size(materiasAsignadas);
  }
  
  private boolean hayAlMenosUnaMateriaAsignadaEn(final List<AulaHorario> ah, final int inicio, final int fin) {
    final Function1<AulaHorario, Boolean> _function = new Function1<AulaHorario, Boolean>() {
      public Boolean apply(final AulaHorario x) {
        boolean _and = false;
        Horario _horario = x.getHorario();
        int _desde = _horario.getDesde();
        boolean _greaterEqualsThan = (_desde >= inicio);
        if (!_greaterEqualsThan) {
          _and = false;
        } else {
          Horario _horario_1 = x.getHorario();
          int _hasta = _horario_1.getHasta();
          boolean _lessEqualsThan = (_hasta <= fin);
          _and = _lessEqualsThan;
        }
        return Boolean.valueOf(_and);
      }
    };
    final Iterable<AulaHorario> x = IterableExtensions.<AulaHorario>filter(ah, _function);
    int _size = IterableExtensions.size(x);
    return (_size > 0);
  }
  
  private int cantidadDeHorariosPorAsignaciones(final Planificacion p) {
    ArrayList<AulaHorario> todosLosHorarios = new ArrayList<AulaHorario>();
    EList<Asignacion> _asignaciones = p.getAsignaciones();
    for (final Asignacion a : _asignaciones) {
      EList<AulaHorario> _aulaHorarios = a.getAulaHorarios();
      todosLosHorarios.addAll(_aulaHorarios);
    }
    return todosLosHorarios.size();
  }
  
  private int porcentajeDeMateriasEn(final Planificacion p, final int inicio, final int fin) {
    int _cantidadDeMateriasAsignadasEn = this.cantidadDeMateriasAsignadasEn(p, inicio, fin);
    int _multiply = (_cantidadDeMateriasAsignadasEn * 100);
    int _cantidadDeHorariosPorAsignaciones = this.cantidadDeHorariosPorAsignaciones(p);
    return (_multiply / _cantidadDeHorariosPorAsignaciones);
  }
}
