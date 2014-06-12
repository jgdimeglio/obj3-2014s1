package testDominio;

import ExtensionMethods.ExtensionMethods;
import dominio.Agenda;
import dominio.Evento;
import dominio.Hora;
import dominio.MockAgendaListener;
import dominio.RecordatorioEMAIL;
import dominio.RecordatorioLLAMADA;
import dominio.RecordatorioSMS;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("all")
public class testAgendaDSL {
  @Extension
  private ExtensionMethods _extensionMethods = new ExtensionMethods();
  
  private Agenda _agenda;
  
  public Agenda getAgenda() {
    return this._agenda;
  }
  
  public void setAgenda(final Agenda agenda) {
    this._agenda = agenda;
  }
  
  private MockAgendaListener _listener;
  
  public MockAgendaListener getListener() {
    return this._listener;
  }
  
  public void setListener(final MockAgendaListener listener) {
    this._listener = listener;
  }
  
  @Before
  public void setUp() {
    Hora _hs = this._extensionMethods.hs(14);
    Evento _mappedTo = this._extensionMethods.operator_mappedTo(_hs, "Inicio obj3");
    Hora _hs_1 = this._extensionMethods.hs(18);
    Evento _mappedTo_1 = this._extensionMethods.operator_mappedTo(_hs_1, "Fin obj3");
    final Procedure1<Evento> _function = new Procedure1<Evento>() {
      public void apply(final Evento it) {
        Evento _remainMe = testAgendaDSL.this._extensionMethods.remainMe(it);
        String _via = testAgendaDSL.this._extensionMethods.via("Hacer la tarea");
        RecordatorioEMAIL _EMAIL = testAgendaDSL.this._extensionMethods.EMAIL(_via);
        testAgendaDSL.this._extensionMethods.operator_greaterThan(_remainMe, _EMAIL);
        Evento _remainMe_1 = testAgendaDSL.this._extensionMethods.remainMe(it);
        String _via_1 = testAgendaDSL.this._extensionMethods.via("Hacer los ejercicios");
        RecordatorioLLAMADA _LLAMADA = testAgendaDSL.this._extensionMethods.LLAMADA(_via_1);
        testAgendaDSL.this._extensionMethods.operator_greaterThan(_remainMe_1, _LLAMADA);
        Evento _remainMe_2 = testAgendaDSL.this._extensionMethods.remainMe(it);
        String _via_2 = testAgendaDSL.this._extensionMethods.via("Pasar todo a los compañeros");
        RecordatorioSMS _SMS = testAgendaDSL.this._extensionMethods.SMS(_via_2);
        testAgendaDSL.this._extensionMethods.operator_greaterThan(_remainMe_2, _SMS);
      }
    };
    Evento _doubleArrow = ObjectExtensions.<Evento>operator_doubleArrow(_mappedTo_1, _function);
    Agenda _agenda = this._extensionMethods.agenda(_mappedTo, _doubleArrow);
    this.setAgenda(_agenda);
    MockAgendaListener _crearListener = this._extensionMethods.crearListener();
    this.setListener(_crearListener);
  }
  
  @Test
  public void testNotificarEvento() {
    Agenda _agenda = this.getAgenda();
    Hora _hs = this._extensionMethods.hs(14);
    MockAgendaListener _listener = this.getListener();
    _agenda.tick(_hs, _listener);
    MockAgendaListener _listener_1 = this.getListener();
    Evento _evento = _listener_1.getEvento();
    String _mensaje = _evento.getMensaje();
    Assert.assertEquals("Inicio obj3", _mensaje);
  }
  
  @Test
  public void testNotificarRecordatorioEMAIL() {
    Agenda _agenda = this.getAgenda();
    Hora _hs = this._extensionMethods.hs(17);
    MockAgendaListener _listener = this.getListener();
    _agenda.tick(_hs, _listener);
    MockAgendaListener _listener_1 = this.getListener();
    String _recordatorioEMAIL = _listener_1.getRecordatorioEMAIL();
    Assert.assertEquals("Hacer la tarea", _recordatorioEMAIL);
  }
  
  @Test
  public void testNotificarRecordatorioLLAMADA() {
    Agenda _agenda = this.getAgenda();
    Hora _hs = this._extensionMethods.hs(17);
    MockAgendaListener _listener = this.getListener();
    _agenda.tick(_hs, _listener);
    MockAgendaListener _listener_1 = this.getListener();
    String _recordatorioLLAMADA = _listener_1.getRecordatorioLLAMADA();
    Assert.assertEquals("Hacer los ejercicios", _recordatorioLLAMADA);
  }
  
  @Test
  public void testNotificarRecordatorioSMS() {
    Agenda _agenda = this.getAgenda();
    Hora _hs = this._extensionMethods.hs(17);
    MockAgendaListener _listener = this.getListener();
    _agenda.tick(_hs, _listener);
    MockAgendaListener _listener_1 = this.getListener();
    String _recordatorioSMS = _listener_1.getRecordatorioSMS();
    Assert.assertEquals("Pasar todo a los compañeros", _recordatorioSMS);
  }
}
