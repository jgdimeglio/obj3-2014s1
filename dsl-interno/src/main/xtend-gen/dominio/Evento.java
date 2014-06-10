package dominio;

import dominio.AgendaListener;
import dominio.Hora;
import dominio.Recordatorio;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class Evento {
  private Hora _hora;
  
  public Hora getHora() {
    return this._hora;
  }
  
  public void setHora(final Hora hora) {
    this._hora = hora;
  }
  
  private String _mensaje;
  
  public String getMensaje() {
    return this._mensaje;
  }
  
  public void setMensaje(final String mensaje) {
    this._mensaje = mensaje;
  }
  
  private List<Recordatorio> _recordatorios;
  
  public List<Recordatorio> getRecordatorios() {
    return this._recordatorios;
  }
  
  public void setRecordatorios(final List<Recordatorio> recordatorios) {
    this._recordatorios = recordatorios;
  }
  
  public Evento(final Hora hora, final String mensaje) {
    this.setHora(hora);
    this.setMensaje(mensaje);
    ArrayList<Recordatorio> _arrayList = new ArrayList<Recordatorio>();
    this.setRecordatorios(_arrayList);
  }
  
  public boolean agregarRecordatorio(final Recordatorio r) {
    List<Recordatorio> _recordatorios = this.getRecordatorios();
    return _recordatorios.add(r);
  }
  
  public void notificarTick(final Hora hora, final AgendaListener listener) {
    boolean _notificarEvento = this.notificarEvento(hora, listener);
    boolean _not = (!_notificarEvento);
    if (_not) {
      this.notificarRecordatorio(hora, listener);
    }
  }
  
  public void notificarRecordatorio(final Hora hora, final AgendaListener listener) {
    boolean _and = false;
    int _hora = hora.getHora();
    Hora _hora_1 = this.getHora();
    int _hora_2 = _hora_1.getHora();
    int _minus = (_hora_2 - 1);
    boolean _equals = Integer.valueOf(_hora).equals(Integer.valueOf(_minus));
    if (!_equals) {
      _and = false;
    } else {
      int _minutos = hora.getMinutos();
      Hora _hora_3 = this.getHora();
      int _minutos_1 = _hora_3.getMinutos();
      boolean _equals_1 = Integer.valueOf(_minutos).equals(Integer.valueOf(_minutos_1));
      _and = _equals_1;
    }
    if (_and) {
      List<Recordatorio> _recordatorios = this.getRecordatorios();
      final Procedure1<Recordatorio> _function = new Procedure1<Recordatorio>() {
        public void apply(final Recordatorio r) {
          r.notificar(listener);
        }
      };
      IterableExtensions.<Recordatorio>forEach(_recordatorios, _function);
    }
  }
  
  public boolean notificarEvento(final Hora hora, final AgendaListener listener) {
    boolean _xblockexpression = false;
    {
      boolean ret = false;
      boolean _and = false;
      int _hora = hora.getHora();
      Hora _hora_1 = this.getHora();
      int _hora_2 = _hora_1.getHora();
      boolean _equals = Integer.valueOf(_hora).equals(Integer.valueOf(_hora_2));
      if (!_equals) {
        _and = false;
      } else {
        int _minutos = hora.getMinutos();
        Hora _hora_3 = this.getHora();
        int _minutos_1 = _hora_3.getMinutos();
        boolean _equals_1 = Integer.valueOf(_minutos).equals(Integer.valueOf(_minutos_1));
        _and = _equals_1;
      }
      if (_and) {
        listener.sucedio(this);
        ret = true;
      }
      _xblockexpression = ret;
    }
    return _xblockexpression;
  }
}
