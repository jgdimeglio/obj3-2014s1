package Dominio;

import Annotations.Monitored;

public class Persona {
    private String nombre ;
    private String apellido = "Skalic";
    
    @Monitored
    public String getNombre() {
        return this.nombre ;
    }
    
    @Monitored
    public String nombreYApellido(){
    	return this.nombre+this.apellido;
    }
    
    @Monitored
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}