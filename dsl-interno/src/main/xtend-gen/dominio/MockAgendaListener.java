package dominio;

import dominio.AgendaListener;
import dominio.Evento;

@SuppressWarnings("all")
public class MockAgendaListener implements AgendaListener {
  private Evento _evento;
  
  public Evento getEvento() {
    return this._evento;
  }
  
  public void setEvento(final Evento evento) {
    this._evento = evento;
  }
  
  private String _recordatorioSMS;
  
  public String getRecordatorioSMS() {
    return this._recordatorioSMS;
  }
  
  public void setRecordatorioSMS(final String recordatorioSMS) {
    this._recordatorioSMS = recordatorioSMS;
  }
  
  private String _recordatorioEMAIL;
  
  public String getRecordatorioEMAIL() {
    return this._recordatorioEMAIL;
  }
  
  public void setRecordatorioEMAIL(final String recordatorioEMAIL) {
    this._recordatorioEMAIL = recordatorioEMAIL;
  }
  
  private String _recordatorioLLAMADA;
  
  public String getRecordatorioLLAMADA() {
    return this._recordatorioLLAMADA;
  }
  
  public void setRecordatorioLLAMADA(final String recordatorioLLAMADA) {
    this._recordatorioLLAMADA = recordatorioLLAMADA;
  }
  
  private String _targetOfEMAIL;
  
  public String getTargetOfEMAIL() {
    return this._targetOfEMAIL;
  }
  
  public void setTargetOfEMAIL(final String targetOfEMAIL) {
    this._targetOfEMAIL = targetOfEMAIL;
  }
  
  private String _subjectOfEMAIL;
  
  public String getSubjectOfEMAIL() {
    return this._subjectOfEMAIL;
  }
  
  public void setSubjectOfEMAIL(final String subjectOfEMAIL) {
    this._subjectOfEMAIL = subjectOfEMAIL;
  }
  
  private String _numeroSMS;
  
  public String getNumeroSMS() {
    return this._numeroSMS;
  }
  
  public void setNumeroSMS(final String numeroSMS) {
    this._numeroSMS = numeroSMS;
  }
  
  private String _numeroLLAMADA;
  
  public String getNumeroLLAMADA() {
    return this._numeroLLAMADA;
  }
  
  public void setNumeroLLAMADA(final String numeroLLAMADA) {
    this._numeroLLAMADA = numeroLLAMADA;
  }
  
  public void sucedio(final Evento evento) {
    this.setEvento(evento);
  }
  
  public void notificarPorMail(final String mensaje, final String target, final String subject) {
    this.setRecordatorioEMAIL(mensaje);
    this.setTargetOfEMAIL(target);
    this.setSubjectOfEMAIL(subject);
  }
  
  public void notificarPorSMS(final String mensaje, final String numero) {
    this.setRecordatorioSMS(mensaje);
    this.setNumeroSMS(numero);
  }
  
  public void notificarPorLlamada(final String mensaje, final String numero) {
    this.setRecordatorioLLAMADA(mensaje);
    this.setNumeroLLAMADA(numero);
  }
}
