package ExtensionMethods;

import dominio.Agenda;
import dominio.Evento;
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
  
  public Evento operator_mappedTo(final int a, final String b) {
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
  
  public ArrayList<Integer> operator_doubleGreaterThan(final int a, final int b) {
    ArrayList<Integer> _xblockexpression = null;
    {
      int inicio = a;
      int fin = b;
      ArrayList<Integer> ret = new ArrayList<Integer>();
      boolean _notEquals = (inicio != fin);
      boolean _while = _notEquals;
      while (_while) {
        {
          ret.add(Integer.valueOf(inicio));
          int _plus = (inicio + 1);
          inicio = _plus;
        }
        boolean _notEquals_1 = (inicio != fin);
        _while = _notEquals_1;
      }
      _xblockexpression = ret;
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
  
  public Integer hs(final int n) {
    return new Integer(n);
  }
  
  public MockAgendaListener crearListener() {
    return new MockAgendaListener();
  }
}
