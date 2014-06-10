package dsl;

import ExtensionMethods.ExtensionMethods;
import dominio.Agenda;
import dominio.Evento;
import dominio.MockAgendaListener;
import dominio.RecordatorioEMAIL;
import dominio.RecordatorioSMS;
import java.util.ArrayList;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class AgendaDSL {
  @Extension
  private ExtensionMethods _extensionMethods = new ExtensionMethods();
  
  public static void main(final String[] args) {
    AgendaDSL _agendaDSL = new AgendaDSL();
    _agendaDSL.run();
  }
  
  public void run() {
    Integer _hs = this._extensionMethods.hs(14);
    Evento _mappedTo = this._extensionMethods.operator_mappedTo((_hs).intValue(), "Inicia objectos 3");
    Integer _hs_1 = this._extensionMethods.hs(18);
    Evento _mappedTo_1 = this._extensionMethods.operator_mappedTo((_hs_1).intValue(), "Termina objectos 3");
    final Procedure1<Evento> _function = new Procedure1<Evento>() {
      public void apply(final Evento remainMe) {
        String _via = AgendaDSL.this._extensionMethods.via("Escribir bitacora");
        RecordatorioSMS _SMS = AgendaDSL.this._extensionMethods.SMS(_via);
        AgendaDSL.this._extensionMethods.operator_greaterThan(remainMe, _SMS);
        String _via_1 = AgendaDSL.this._extensionMethods.via("Escribir ejemplos de la clase");
        RecordatorioEMAIL _EMAIL = AgendaDSL.this._extensionMethods.EMAIL(_via_1);
        AgendaDSL.this._extensionMethods.operator_greaterThan(remainMe, _EMAIL);
      }
    };
    Evento _doubleArrow = ObjectExtensions.<Evento>operator_doubleArrow(_mappedTo_1, _function);
    final Agenda agenda = this._extensionMethods.agenda(_mappedTo, _doubleArrow);
    final MockAgendaListener listener = this._extensionMethods.crearListener();
    Integer _hs_2 = this._extensionMethods.hs(13);
    Integer _hs_3 = this._extensionMethods.hs(20);
    ArrayList<Integer> _doubleGreaterThan = this._extensionMethods.operator_doubleGreaterThan((_hs_2).intValue(), (_hs_3).intValue());
    final Procedure1<Integer> _function_1 = new Procedure1<Integer>() {
      public void apply(final Integer hora) {
        agenda.tick((hora).intValue(), listener);
      }
    };
    IterableExtensions.<Integer>forEach(_doubleGreaterThan, _function_1);
  }
}
