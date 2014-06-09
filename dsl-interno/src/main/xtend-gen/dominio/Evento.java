package dominio;

import dominio.AgendaListener;
import dominio.Recordatorio;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class Evento {
  private int _hora;
  
  public int getHora() {
    return this._hora;
  }
  
  public void setHora(final int hora) {
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
  
  public Evento(final int hora, final String mensaje) {
    this.setHora(hora);
    this.setMensaje(mensaje);
    ArrayList<Recordatorio> _arrayList = new ArrayList<Recordatorio>();
    this.setRecordatorios(_arrayList);
  }
  
  public boolean agregarRecordatorio(final Recordatorio r) {
    List<Recordatorio> _recordatorios = this.getRecordatorios();
    return _recordatorios.add(r);
  }
  
  public void notificarTick(final int hora, final AgendaListener listener) {
    boolean _notificarEvento = this.notificarEvento(hora, listener);
    boolean _not = (!_notificarEvento);
    if (_not) {
      this.notificarRecordatorio(hora, listener);
    }
  }
  
  public void notificarRecordatorio(final int hora, final AgendaListener listener) {
    int _hora = this.getHora();
    int _minus = (_hora - 1);
    boolean _equals = Integer.valueOf(hora).equals(Integer.valueOf(_minus));
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
  
  public boolean notificarEvento(final int hora, final AgendaListener listener) {
    boolean _xblockexpression = false;
    {
      boolean ret = false;
      int _hora = this.getHora();
      boolean _equals = Integer.valueOf(hora).equals(Integer.valueOf(_hora));
      if (_equals) {
        listener.sucedio(this);
        ret = true;
      }
      _xblockexpression = ret;
    }
    return _xblockexpression;
  }
}
