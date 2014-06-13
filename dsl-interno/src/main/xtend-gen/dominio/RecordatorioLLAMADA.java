package dominio;

import dominio.AgendaListener;
import dominio.Recordatorio;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class RecordatorioLLAMADA extends Recordatorio {
  private String _numero;
  
  public String getNumero() {
    return this._numero;
  }
  
  public void setNumero(final String numero) {
    this._numero = numero;
  }
  
  public RecordatorioLLAMADA(final String mensaje) {
    super(mensaje);
    this.setNumero(null);
  }
  
  public void notificar(final AgendaListener listener) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Mensaje enviado: ");
    String _mensaje = this.getMensaje();
    _builder.append(_mensaje, "");
    System.out.println(_builder);
    String _mensaje_1 = this.getMensaje();
    String _numero = this.getNumero();
    listener.notificarPorLlamada(_mensaje_1, _numero);
  }
}
