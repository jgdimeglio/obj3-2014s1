package testDominio;

import dominio.Agenda;
import dominio.Evento;
import dominio.MockAgendaListener;
import dominio.Recordatorio;
import dominio.RecordatorioSMS;
import java.util.Calendar;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("all")
public class testAgenda {
  private Agenda agenda;
  
  private Evento evento;
  
  private Calendar fecha;
  
  private Recordatorio recordatorio;
  
  private MockAgendaListener mock;
  
  private String mensaje;
  
  @Before
  public void setUp() {
    this.mensaje = "Inicia OBJ3";
    Agenda _agenda = new Agenda();
    this.agenda = _agenda;
    Calendar _instance = Calendar.getInstance();
    this.fecha = _instance;
    Evento _evento = new Evento(this.fecha, this.mensaje);
    this.evento = _evento;
    RecordatorioSMS _recordatorioSMS = new RecordatorioSMS();
    this.recordatorio = _recordatorioSMS;
    this.evento.agregarRecordatorio(this.recordatorio);
    this.agenda.agregarEvento(this.evento);
    MockAgendaListener _mockAgendaListener = new MockAgendaListener();
    this.mock = _mockAgendaListener;
  }
  
  @Test
  public void testNotificarEvento() {
    this.agenda.tick(this.fecha, this.mock);
    Evento _evento = this.mock.getEvento();
    Assert.assertEquals(this.evento, _evento);
  }
  
  @Test
  public void testNotificarRecordatorioSMS() {
    Calendar nuevaFecha = Calendar.getInstance();
    long _timeInMillis = this.fecha.getTimeInMillis();
    nuevaFecha.setTimeInMillis(_timeInMillis);
    int _minus = (-1);
    nuevaFecha.add(Calendar.HOUR, _minus);
    this.agenda.tick(nuevaFecha, this.mock);
    String _recordatorioSMS = this.mock.getRecordatorioSMS();
    Assert.assertEquals(this.mensaje, _recordatorioSMS);
  }
}
