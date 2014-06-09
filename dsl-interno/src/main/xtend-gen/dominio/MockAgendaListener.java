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
  
  public void sucedio(final Evento evento) {
    this.setEvento(evento);
  }
  
  public void notificarPorMail(final String mensaje) {
    this.setRecordatorioEMAIL(mensaje);
  }
  
  public void notificarPorSMS(final String mensaje) {
    this.setRecordatorioSMS(mensaje);
  }
  
  public void notificarPorLlamada(final String mensaje) {
    this.setRecordatorioLLAMADA(mensaje);
  }
}
