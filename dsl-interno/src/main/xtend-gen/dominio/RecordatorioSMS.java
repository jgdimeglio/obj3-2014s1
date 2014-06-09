package dominio;

import dominio.AgendaListener;
import dominio.Recordatorio;

@SuppressWarnings("all")
public class RecordatorioSMS extends Recordatorio {
  public void notificar(final String mensaje, final AgendaListener listener) {
    listener.notificarPorSMS(mensaje);
  }
}
