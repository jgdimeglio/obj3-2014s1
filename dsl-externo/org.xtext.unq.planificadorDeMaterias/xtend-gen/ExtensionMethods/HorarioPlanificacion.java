package ExtensionMethods;

@SuppressWarnings("all")
public class HorarioPlanificacion {
  private int _inicio;
  
  public int getInicio() {
    return this._inicio;
  }
  
  public void setInicio(final int inicio) {
    this._inicio = inicio;
  }
  
  private int _fin;
  
  public int getFin() {
    return this._fin;
  }
  
  public void setFin(final int fin) {
    this._fin = fin;
  }
  
  public HorarioPlanificacion() {
  }
  
  public HorarioPlanificacion(final int inicio, final int fin) {
    this.setInicio(inicio);
    this.setFin(fin);
  }
}
