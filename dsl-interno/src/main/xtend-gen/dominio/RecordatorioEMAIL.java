package dominio;

import dominio.AgendaListener;
import dominio.Recordatorio;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class RecordatorioEMAIL extends Recordatorio {
  private String _target;
  
  public String getTarget() {
    return this._target;
  }
  
  public void setTarget(final String target) {
    this._target = target;
  }
  
  private String _subject;
  
  public String getSubject() {
    return this._subject;
  }
  
  public void setSubject(final String subject) {
    this._subject = subject;
  }
  
  public RecordatorioEMAIL(final String mensaje) {
    super(mensaje);
    this.setTarget(null);
    this.setSubject(null);
  }
  
  public void notificar(final AgendaListener listener) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Mensaje enviado: ");
    String _mensaje = this.getMensaje();
    _builder.append(_mensaje, "");
    System.out.println(_builder);
    String _mensaje_1 = this.getMensaje();
    String _target = this.getTarget();
    String _subject = this.getSubject();
    listener.notificarPorMail(_mensaje_1, _target, _subject);
  }
}
