package dominio;

import dominio.Evento;

@SuppressWarnings("all")
public interface AgendaListener {
  public abstract void sucedio(final Evento evento);
  
  public abstract void notificarPorMail(final String mensaje, final String target, final String subject);
  
  public abstract void notificarPorSMS(final String mensaje, final String numero);
  
  public abstract void notificarPorLlamada(final String mensaje, final String numero);
}
