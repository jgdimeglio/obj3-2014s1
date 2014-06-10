package dominio;

import dominio.AgendaListener;

@SuppressWarnings("all")
public abstract class Recordatorio {
  private String _mensaje;
  
  public String getMensaje() {
    return this._mensaje;
  }
  
  public void setMensaje(final String mensaje) {
    this._mensaje = mensaje;
  }
  
  public Recordatorio(final String mensaje) {
    this.setMensaje(mensaje);
  }
  
  public abstract void notificar(final AgendaListener listener);
}
