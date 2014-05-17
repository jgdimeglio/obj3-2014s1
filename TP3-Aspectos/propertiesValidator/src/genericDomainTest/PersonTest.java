package genericDomainTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import exceptions.InvalidValueException;
import genericDomain.Person;
import genericDomain.ValidateStringNotEmptyException;

import org.junit.Test;


public class PersonTest {
	
	
	
	@Test
    public void noDebePermitirNombresVacios () {
	Person p1 = new Person();
        p1.addValidator( "name", new ValidateStringNotEmptyException());
        p1.setName("Nico");
        assertEquals("Nico", p1.getName()); // Se asigna el nombre correctamente
        try {
            p1.setName("");
            fail("Debera haber tirado excepcion al asignarle un nombre vacio");
        }
        catch (InvalidValueException e) {
            assertEquals("Nico", p1.getName()); // El nombre no cambio
        }
    }
}
