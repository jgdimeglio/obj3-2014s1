package dominio;

import dominio.AgendaListener;
import dominio.Recordatorio;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class Evento {
  private Calendar _fecha;
  
  public Calendar getFecha() {
    return this._fecha;
  }
  
  public void setFecha(final Calendar fecha) {
    this._fecha = fecha;
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
  
  public Evento(final Calendar fecha, final String mensaje) {
    this.setFecha(fecha);
    this.setMensaje(mensaje);
    ArrayList<Recordatorio> _arrayList = new ArrayList<Recordatorio>();
    this.setRecordatorios(_arrayList);
  }
  
  public boolean agregarRecordatorio(final Recordatorio r) {
    List<Recordatorio> _recordatorios = this.getRecordatorios();
    return _recordatorios.add(r);
  }
  
  public void notificarTick(final Calendar fecha, final AgendaListener listener) {
    boolean _notificarEvento = this.notificarEvento(fecha, listener);
    boolean _not = (!_notificarEvento);
    if (_not) {
      this.notificarRecordatorio(fecha, listener);
    }
  }
  
  public void notificarRecordatorio(final Calendar fecha, final AgendaListener listener) {
    int _get = fecha.get(Calendar.HOUR);
    Calendar _fecha = this.getFecha();
    int _get_1 = _fecha.get(Calendar.HOUR);
    int _minus = (_get_1 - 1);
    boolean _equals = Integer.valueOf(_get).equals(Integer.valueOf(_minus));
    if (_equals) {
      List<Recordatorio> _recordatorios = this.getRecordatorios();
      final Procedure1<Recordatorio> _function = new Procedure1<Recordatorio>() {
        public void apply(final Recordatorio r) {
          String _mensaje = Evento.this.getMensaje();
          r.notificar(_mensaje, listener);
        }
      };
      IterableExtensions.<Recordatorio>forEach(_recordatorios, _function);
    }
  }
  
  public boolean notificarEvento(final Calendar fecha, final AgendaListener listener) {
    boolean _xblockexpression = false;
    {
      boolean ret = false;
      int _get = fecha.get(Calendar.HOUR);
      Calendar _fecha = this.getFecha();
      int _get_1 = _fecha.get(Calendar.HOUR);
      boolean _equals = Integer.valueOf(_get).equals(Integer.valueOf(_get_1));
      if (_equals) {
        listener.sucedio(this);
        ret = true;
      }
      _xblockexpression = ret;
    }
    return _xblockexpression;
  }
}
