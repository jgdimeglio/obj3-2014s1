package Test

import org.scalatest.GivenWhenThen
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FunSpec
import org.joda.time.DateTime
import org.scalatest.Matchers
import org.scalatest.words.BehaveWord
import Excepciones.YaEstaReservada
import Mixins.Iluminacion
import Mixins.Techo
import Mixins.Gradas
import Excepciones.NoTieneIluminacion
import Clases.CanchaDeFutbol


class TestCanchaDeFutbol extends FunSpec with ShouldMatchers with GivenWhenThen {

	def fixture = new {
		var canchaFutbol = new CanchaDeFutbol(10)
		var canchaFutbol2 = new CanchaDeFutbol(10)
		var canchaFutbolConLuz = new CanchaDeFutbol(10) with Iluminacion
		var canchaFutbolConGradas = new CanchaDeFutbol(10) with Gradas
		var canchaFutbolConLuzYGradas = new CanchaDeFutbol(10) with Iluminacion with Gradas
		var dia = new DateTime("2014-06-11")
	}
	
	it("Cancha de tenis") {
        given("Una cancha")
        	var f = fixture
        when("Obtenes la cancha")
           f.canchaFutbol.reservar(f.dia, 10, 11)
           
        then("La reserva tendria que estar realizada")
        	f.canchaFutbol.reservas.exists{r => r.dia.equals(f.dia)} should be (true)
     }
	
	it ("Cancha de tenis reservada con mismo horario"){
	  var f = fixture
	  f.canchaFutbol.reservar(f.dia, 10, 11)
	  a [YaEstaReservada] should be thrownBy {
		  f.canchaFutbol.reservar(f.dia, 10, 11)
	  } 
	}
	
	it ("Cancha de tenis reservada con horario solapado"){
	  var f = fixture
	  f.canchaFutbol.reservar(f.dia, 10, 11)
	  a [YaEstaReservada] should be thrownBy {
		  f.canchaFutbol.reservar(f.dia, 10.30, 11.30)
	  } 
	}
	
	it ("Cancha de tenis reservada de noche sin luz"){
	  var f = fixture
	  a [NoTieneIluminacion] should be thrownBy {
		  f.canchaFutbol.reservar(f.dia, 19, 20)
	  } 
	}
	
	it("Cancha de tenis no se superpone") {
        given("Dos canchas")
        	var f = fixture
        when("Obtenes las canchas")
           f.canchaFutbol.reservar(f.dia, 10, 11)
           f.canchaFutbol2.reservar(f.dia, 11, 12)
        then("Las reservas tendrian que estar realizadas")
        	f.canchaFutbol.reservas.exists{r => r.dia.equals(f.dia)} should be (true)
        	f.canchaFutbol2.reservas.exists{r => r.dia.equals(f.dia)} should be (true)
     }
	
	it("Calculo precio canchas de tenis con las distintas combinaciones") {
        given("Varias canchas")
        	var f = fixture 
        when("Obtenes los precios")
		
           var precio = f.canchaFutbol.precioFinal(f.dia, 10, 11)
           var precioConLuz = f.canchaFutbolConLuz.precioFinal(f.dia, 19, 20)
           var precioConGradas = f.canchaFutbolConGradas.precioFinal(f.dia,10,11)
           var precioConLuzYGradas = f.canchaFutbolConLuzYGradas.precioFinal(f.dia, 19, 20)
           
        then("Los precios serian:")
        	precio shouldEqual (400.0)
			precioConLuz shouldEqual (480.0)
			precioConGradas shouldEqual (800.0)
        	precioConLuzYGradas shouldEqual (880.0)
     }
	
}