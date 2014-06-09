package dominio;

import dominio.Evento;

@SuppressWarnings("all")
public interface AgendaListener {
  public abstract void sucedio(final Evento evento);
  
  public abstract void notificarPorMail(final String mensaje);
  
  public abstract void notificarPorSMS(final String mensaje);
  
  public abstract void notificarPorLlamada(final String mensaje);
}
