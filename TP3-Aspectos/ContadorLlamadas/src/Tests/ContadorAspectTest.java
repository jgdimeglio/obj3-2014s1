package Aspects;

import static org.junit.Assert.*;

import org.aspectj.lang.NoAspectBoundException;
import org.junit.Before;
import org.junit.Test;

import Dominio.Persona;
import Dominio.Soldado;

public class ContadorAspectTest {

	Persona persona;
	Soldado soldado;
	
	@Before
	public void setUp(){
		persona = new Persona();
		soldado = new Soldado();
	}
	
	@Test
	public void contadorDeMetodoTest(){
		
		persona.setNombre("Julian");
		persona.setNombre("Fede");
		
		soldado.setNombre("Julian");
		
		log(persona);
		log(soldado);
		
		assertEquals(CountAspect.aspectOf(persona).getCounterOf("setNombre"), 2);
		assertEquals(CountAspect.aspectOf(soldado).getCounterOf("setNombre"), 1);
	}
	
	@Test
	public void contadorDeMetodoAspectExceptionTest(){
		try{
			soldado.nombreYApellido();
			assertEquals(CountAspect.aspectOf(soldado).getCounterOf("nombreYApellido"), 1);
			assertTrue(false);
		}catch (NoAspectBoundException ex){
			System.out.println(ex);
			assertTrue(true);
		}
	}
	

	private void log(Object o) {
		System.out.println("Counter: " + CountAspect.aspectOf(o).getCounterOf("setNombre"));
		System.out.println();
	}

}
