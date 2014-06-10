package dominio;

@SuppressWarnings("all")
public class Hora {
  private int _hora;
  
  public int getHora() {
    return this._hora;
  }
  
  public void setHora(final int hora) {
    this._hora = hora;
  }
  
  private int _minutos;
  
  public int getMinutos() {
    return this._minutos;
  }
  
  public void setMinutos(final int minutos) {
    this._minutos = minutos;
  }
  
  public Hora(final int hora) {
    this.setHora(hora);
  }
  
  public Hora(final int hora, final int minutos) {
    this.setHora(hora);
    this.setMinutos(minutos);
  }
  
  public void aumentarUnaHora() {
    int _hora = this.getHora();
    int _plus = (_hora + 1);
    this.setHora(_plus);
  }
}
