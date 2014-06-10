package dominio;

import dominio.AgendaListener;
import dominio.Recordatorio;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class RecordatorioLLAMADA extends Recordatorio {
  public RecordatorioLLAMADA(final String mensaje) {
    super(mensaje);
  }
  
  public void notificar(final AgendaListener listener) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Mensaje enviado: ");
    String _mensaje = this.getMensaje();
    _builder.append(_mensaje, "");
    System.out.println(_builder);
    String _mensaje_1 = this.getMensaje();
    listener.notificarPorLlamada(_mensaje_1);
  }
}
