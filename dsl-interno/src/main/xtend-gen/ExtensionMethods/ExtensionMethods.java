package ExtensionMethods;

import dominio.Agenda;
import dominio.Evento;
import dominio.Hora;
import dominio.MockAgendaListener;
import dominio.Recordatorio;
import dominio.RecordatorioEMAIL;
import dominio.RecordatorioLLAMADA;
import dominio.RecordatorioSMS;
import java.util.ArrayList;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class ExtensionMethods {
  public Evento operator_mappedTo(final Hora a, final String b) {
    return new Evento(a, b);
  }
  
  public Object operator_doubleArrow(final Evento evento, final Function1 block) {
    return block.apply(evento);
  }
  
  public Evento operator_greaterThan(final Evento a, final Recordatorio b) {
    Evento _xblockexpression = null;
    {
      a.agregarRecordatorio(b);
      _xblockexpression = a;
    }
    return _xblockexpression;
  }
  
  public ArrayList<Hora> operator_doubleGreaterThan(final Hora a, final Hora b) {
    ArrayList<Hora> _xblockexpression = null;
    {
      Hora inicio = a;
      Hora fin = b;
      ArrayList<Hora> ret = new ArrayList<Hora>();
      int _hora = inicio.getHora();
      int _hora_1 = fin.getHora();
      boolean _notEquals = (_hora != _hora_1);
      boolean _while = _notEquals;
      while (_while) {
        {
          ret.add(inicio);
          inicio.aumentarUnaHora();
        }
        int _hora_2 = inicio.getHora();
        int _hora_3 = fin.getHora();
        boolean _notEquals_1 = (_hora_2 != _hora_3);
        _while = _notEquals_1;
      }
      _xblockexpression = ret;
    }
    return _xblockexpression;
  }
  
  public Hora operator_divide(final int a, final int b) {
    return new Hora(a, b);
  }
  
  public Evento remainMe(final Evento e) {
    return e;
  }
  
  public Agenda agenda(final Evento... eventos) {
    Agenda _xblockexpression = null;
    {
      final Agenda a = new Agenda();
      final Procedure1<Evento> _function = new Procedure1<Evento>() {
        public void apply(final Evento evento) {
          a.agregarEvento(evento);
        }
      };
      IterableExtensions.<Evento>forEach(((Iterable<Evento>)Conversions.doWrapArray(eventos)), _function);
      _xblockexpression = a;
    }
    return _xblockexpression;
  }
  
  public String via(final String s) {
    return s;
  }
  
  public RecordatorioSMS SMS(final String s) {
    return new RecordatorioSMS(s);
  }
  
  public RecordatorioEMAIL EMAIL(final String s) {
    return new RecordatorioEMAIL(s);
  }
  
  public RecordatorioLLAMADA LLAMADA(final String s) {
    return new RecordatorioLLAMADA(s);
  }
  
  public Object apply() {
    return null;
  }
  
  public Hora hs(final int n) {
    return new Hora(n);
  }
  
  public Hora hs(final Hora n) {
    return n;
  }
  
  public MockAgendaListener crearListener() {
    return new MockAgendaListener();
  }
}
