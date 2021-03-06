package testDominio;

import dominio.Agenda;
import dominio.Evento;
import dominio.Hora;
import dominio.MockAgendaListener;
import dominio.Recordatorio;
import dominio.RecordatorioSMS;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("all")
public class testAgenda {
  private Agenda agenda;
  
  private Evento evento;
  
  private Hora hora;
  
  private Recordatorio recordatorio;
  
  private MockAgendaListener mock;
  
  private String mensaje;
  
  @Before
  public void setUp() {
    this.mensaje = "Inicia OBJ3";
    Agenda _agenda = new Agenda();
    this.agenda = _agenda;
    Hora _hora = new Hora(14);
    this.hora = _hora;
    Evento _evento = new Evento(this.hora, this.mensaje);
    this.evento = _evento;
    RecordatorioSMS _recordatorioSMS = new RecordatorioSMS("Escribir bitacora");
    this.recordatorio = _recordatorioSMS;
    this.evento.agregarRecordatorio(this.recordatorio);
    this.agenda.agregarEvento(this.evento);
    MockAgendaListener _mockAgendaListener = new MockAgendaListener();
    this.mock = _mockAgendaListener;
  }
  
  @Test
  public void testNotificarEvento() {
    this.agenda.tick(this.hora, this.mock);
    Evento _evento = this.mock.getEvento();
    Assert.assertEquals(this.evento, _evento);
  }
  
  @Test
  public void testNotificarRecordatorioSMS() {
    Hora _hora = new Hora(13);
    this.agenda.tick(_hora, this.mock);
    String _recordatorioSMS = this.mock.getRecordatorioSMS();
    Assert.assertEquals("Escribir bitacora", _recordatorioSMS);
  }
}
