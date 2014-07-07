package ExtensionMethods;

import com.google.common.collect.Iterables;
import java.util.HashSet;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Asignacion;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Aula;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.ElementosPrimarios;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.ElementosSecundarios;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Materia;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Model;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Planificacion;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Profesor;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Recurso;

@SuppressWarnings("all")
public class ExtensionMethodsInterpreter {
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
  
  public List<Profesor> profesores(final Planificacion p) {
    final HashSet<Profesor> profesores = new HashSet<Profesor>();
    EList<Asignacion> _asignaciones = p.getAsignaciones();
    final Procedure1<Asignacion> _function = new Procedure1<Asignacion>() {
      public void apply(final Asignacion a) {
        EList<Profesor> _profesores = a.getProfesores();
        profesores.addAll(_profesores);
      }
    };
    IterableExtensions.<Asignacion>forEach(_asignaciones, _function);
    return IterableExtensions.<Profesor>toList(profesores);
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
}
