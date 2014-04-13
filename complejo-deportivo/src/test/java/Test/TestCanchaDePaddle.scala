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
import Excepciones.HorarioInvalido
import Clases.CanchaDePaddle
import Excepciones.UsadaParaTorneo

class TestCanchaDePaddle extends FunSpec with ShouldMatchers with GivenWhenThen{

	def fixture = new {
		var canchaPaddle = new CanchaDePaddle
		var canchaPaddle2 = new CanchaDePaddle
		var canchaPaddleConLuz = new CanchaDePaddle with Iluminacion
		var canchaPaddleConGradas = new CanchaDePaddle with Gradas
		var canchaPaddleConLuzYGradas = new CanchaDePaddle with Iluminacion with Gradas
		var dia = new DateTime("2014-06-11")
		var finDeSemana = new DateTime("2014-04-13")
	}
	
	it("Cancha de paddle") {
        given("Una cancha")
        	var f = fixture
        when("Obtenes la cancha")
           f.canchaPaddle.reservar(f.dia, 10, 11)
           
        then("La reserva tendria que estar realizada")
        	f.canchaPaddle.reservas.exists{r => r.dia.equals(f.dia)} should be (true)
     }
	
	it ("Cancha de paddle reservada con mismo horario"){
	  var f = fixture
	  f.canchaPaddle.reservar(f.dia, 10, 11)
	  a [YaEstaReservada] should be thrownBy {
		  f.canchaPaddle.reservar(f.dia, 10, 11)
	  } 
	}
	
	it ("Cancha de paddle reservada con horario solapado"){
	  var f = fixture
	  f.canchaPaddle.reservar(f.dia, 10, 11)
	  a [YaEstaReservada] should be thrownBy {
		  f.canchaPaddle.reservar(f.dia, 10.30, 11.30)
	  } 
	}
	
	it ("Cancha de paddle reservada con horario invalido"){
	  var f = fixture
	  a [HorarioInvalido] should be thrownBy {
		  f.canchaPaddle.reservar(f.dia, 0, 1)
	  } 
	}
	
	it ("Cancha de paddle reservada con gradas el fin de semana"){
	  var f = fixture
	  a [UsadaParaTorneo] should be thrownBy {
		  f.canchaPaddleConGradas.reservar(f.finDeSemana, 10, 11)
	  } 
	}
	
	it ("Cancha de paddle reservada de noche sin luz"){
	  var f = fixture
	  a [NoTieneIluminacion] should be thrownBy {
		  f.canchaPaddle.reservar(f.dia, 19, 20)
	  } 
	}
	
	it("Cancha de paddle no se superpone") {
        given("Dos canchas")
        	var f = fixture
        when("Obtenes las canchas")
           f.canchaPaddle.reservar(f.dia, 10, 11)
           f.canchaPaddle2.reservar(f.dia, 11, 12)
        then("Las reservas tendrian que estar realizadas")
        	f.canchaPaddle.reservas.exists{r => r.dia.equals(f.dia)} should be (true)
        	f.canchaPaddle2.reservas.exists{r => r.dia.equals(f.dia)} should be (true)
     }
	
	it("Calculo precio canchas de paddle con las distintas combinaciones") {
        given("Varias canchas")
        	var f = fixture 
        when("Obtenes los precios")
		
           var precio = f.canchaPaddle.precioFinal(f.dia, 10, 11)
           var precioConLuz = f.canchaPaddleConLuz.precioFinal(f.dia, 19, 20)
           var precioConGradas = f.canchaPaddleConGradas.precioFinal(f.dia,10,11)
           var precioConLuzYGradas = f.canchaPaddleConLuzYGradas.precioFinal(f.dia, 19, 20)
           
        then("Los precios serian:")
        	precio shouldEqual (100.0)
			precioConLuz shouldEqual (120.0)
			precioConGradas shouldEqual (200.0)
        	precioConLuzYGradas shouldEqual (220.0)
     }
}