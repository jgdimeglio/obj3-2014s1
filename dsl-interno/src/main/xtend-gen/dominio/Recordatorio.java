package dominio;

import dominio.AgendaListener;

@SuppressWarnings("all")
public abstract class Recordatorio {
  public abstract void notificar(final String mensaje, final AgendaListener listener);
}
