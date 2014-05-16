package Aspects;

import org.aspectj.lang.NoAspectBoundException;

import Dominio.Persona;

public class CountAspectExample {

	public static void main(String[] args) {
		new CountAspectExample().init();
	}

	public void init(){
		Persona p = new Persona();
		Persona p2 = new Persona();
		
		p.setNombre("Julian");
		log(p);
		
		p.setNombre("Gaston");
		log(p);
		
		p.nombreYApellido();
		log(p);
		
		p2.setNombre("Jose");
		log(p2);
	}
	
	

	private void log(Object o) {
		System.out.println("counter " + CountAspect.aspectOf(o).getCounterOf("setNombre"));
		System.out.println();
	}

}
