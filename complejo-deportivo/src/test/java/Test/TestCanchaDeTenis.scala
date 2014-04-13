package Test

import org.scalatest.GivenWhenThen
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FunSpec
import Clases.CanchaDeTenis
import org.joda.time.DateTime
import org.scalatest.Matchers
import org.scalatest.words.BehaveWord
import Excepciones.YaEstaReservada
import Mixins.Iluminacion
import Mixins.Techo
import Mixins.Gradas
import Excepciones.NoTieneIluminacion
import org.scalatest.mock.MockitoSugar


class TestCanchaDeTenis extends FunSpec with ShouldMatchers with GivenWhenThen {

	def fixture = new {
		var canchaTenis = new CanchaDeTenis
		var canchaTenis2 = new CanchaDeTenis
		var canchaTenisConLuz = new CanchaDeTenis with Iluminacion
		var canchaTenisConGradas = new CanchaDeTenis with Gradas
		var canchaTenisConLuzYGradas = new CanchaDeTenis with Iluminacion with Gradas
		var dia = new DateTime("2014-06-11")
	}
	
	it("Cancha de tenis") {
        given("Una cancha")
        	var f = fixture
        when("Obtenes la cancha")
           f.canchaTenis.reservar(f.dia, 10, 11)
           
        then("La reserva tendria que estar realizada")
        	f.canchaTenis.reservas.exists{r => r.dia.equals(f.dia)} should be (true)
     }
	
	it ("Cancha de tenis reservada con mismo horario"){
	  var f = fixture
	  f.canchaTenis.reservar(f.dia, 10, 11)
	  a [YaEstaReservada] should be thrownBy {
		  f.canchaTenis.reservar(f.dia, 10, 11)
	  } 
	}
	
	it ("Cancha de tenis reservada con horario solapado"){
	  var f = fixture
	  f.canchaTenis.reservar(f.dia, 10, 11)
	  a [YaEstaReservada] should be thrownBy {
		  f.canchaTenis.reservar(f.dia, 10.30, 11.30)
	  } 
	}
	
	it ("Cancha de tenis reservada de noche sin luz"){
	  var f = fixture
	  a [NoTieneIluminacion] should be thrownBy {
		  f.canchaTenis.reservar(f.dia, 19, 20)
	  } 
	}
	
	it("Cancha de tenis no se superpone") {
        given("Dos canchas")
        	var f = fixture
        when("Obtenes las canchas")
           f.canchaTenis.reservar(f.dia, 10, 11)
           f.canchaTenis2.reservar(f.dia, 11, 12)
        then("Las reservas tendrian que estar realizadas")
        	f.canchaTenis.reservas.exists{r => r.dia.equals(f.dia)} should be (true)
        	f.canchaTenis2.reservas.exists{r => r.dia.equals(f.dia)} should be (true)
     }
	
	it("Calculo precio canchas de tenis con las distintas combinaciones") {
        given("Varias canchas")
        	var f = fixture 
        when("Obtenes los precios")
		
           var precio = f.canchaTenis.precioFinal(f.dia, 10, 11)
           var precioConLuz = f.canchaTenisConLuz.precioFinal(f.dia, 19, 20)
           var precioConGradas = f.canchaTenisConGradas.precioFinal(f.dia,10,11)
           var precioConLuzYGradas = f.canchaTenisConLuzYGradas.precioFinal(f.dia, 19, 20)
           
        then("Los precios serian:")
        	precio shouldEqual (150.0)
			precioConLuz shouldEqual (180.0)
			precioConGradas shouldEqual (300.0)
        	precioConLuzYGradas shouldEqual (330.0)
     }
	
}