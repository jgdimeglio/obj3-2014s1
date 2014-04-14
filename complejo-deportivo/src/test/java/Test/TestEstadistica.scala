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
import Excepciones.HorarioInvalido
import Excepciones.UsadaParaTorneo
import Clases.Estadistica
import Clases.CanchaDeTenis

class TestEstadistica extends FunSpec with ShouldMatchers with GivenWhenThen {

  def fixture = new {
    var estadistica = new Estadistica

    var canchaFutbol = new CanchaDeFutbol(5)
    var canchaTenis = new CanchaDeTenis

    estadistica.agregarNuevaCancha(canchaFutbol)
    estadistica.agregarNuevaCancha(canchaTenis)

    canchaFutbol.reservar(new DateTime, 1, 2)
    canchaFutbol.reservar(new DateTime, 3, 4)
    canchaTenis.reservar(new DateTime, 3, 4)

  }

  it("deberia ser 2 la cantidad de reservas que tenga la cancha con mas reservas") {
    (fixture.estadistica.obtenerCanchaConMasReservas.cantidadDeReservas) should equal(2)
  }

  it("deberia ser 2 la cantidad de canchas libres para hoy de 16 a 17") {
    fixture.estadistica.obtenerCanchasLibres(new DateTime, 16, 17).length should equal(2)
  }

  it("deberia ser 1 la cantidad de canchas libres para hoy de 1 a 2") {
    fixture.estadistica.obtenerCanchasLibres(new DateTime, 1, 2).length should equal(1)
  }

  it("deberia ser 0 la cantidad de canchas libres para hoy de 3 a 4") {
    fixture.estadistica.obtenerCanchasLibres(new DateTime, 3, 4).length should equal(0)
  }

  it("deberia ser 2 la cantidad de canchas que tengan una reserva hoy") {
    var canchas = fixture.estadistica.obtenerCanchasQueTengaReserva(new DateTime)
    canchas.length should be(2)
  }

  it("deberia ser 3 la cantidad de reservas que hay hoy") {
    var reservas = fixture.estadistica.obtenerReservasPara(new DateTime)
    reservas.length should be(3)

  }

}
