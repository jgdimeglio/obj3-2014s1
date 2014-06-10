package dominio;

import dominio.AgendaListener;
import dominio.Evento;
import dominio.Hora;
import java.util.ArrayList;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class Agenda {
  private ArrayList<Evento> _eventos;
  
  public ArrayList<Evento> getEventos() {
    return this._eventos;
  }
  
  public void setEventos(final ArrayList<Evento> eventos) {
    this._eventos = eventos;
  }
  
  public Agenda() {
    ArrayList<Evento> _arrayList = new ArrayList<Evento>();
    this.setEventos(_arrayList);
  }
  
  public boolean agregarEvento(final Evento evento) {
    ArrayList<Evento> _eventos = this.getEventos();
    return _eventos.add(evento);
  }
  
  public void tick(final Hora hora, final AgendaListener listener) {
    ArrayList<Evento> _eventos = this.getEventos();
    final Procedure1<Evento> _function = new Procedure1<Evento>() {
      public void apply(final Evento e) {
        e.notificarTick(hora, listener);
      }
    };
    IterableExtensions.<Evento>forEach(_eventos, _function);
  }
}
