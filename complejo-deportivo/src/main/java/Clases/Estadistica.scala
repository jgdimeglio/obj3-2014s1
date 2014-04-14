package Clases

import scala.collection.mutable.ArrayBuffer
import org.joda.time.DateTime
import com.sun.org.apache.xalan.internal.xsltc.compiler.ForEach

class Estadistica {

  val canchasDisponibles = new ArrayBuffer[Cancha]

  def agregarNuevaCancha(cancha: Cancha) = {
    this.canchasDisponibles.append(cancha)
  }

  def obtenerCanchasQueTengaReserva(dia: DateTime) = {
    this.canchasDisponibles.filter { c => c.tieneReserva(dia) }
  }

  def obtenerReservasPara(dia: DateTime) = {
    val reservas = new ArrayBuffer[Reserva]
    this.canchasDisponibles.foreach(c => reservas.appendAll(c.obtenerReservasPara(dia)))
    reservas
  }

  def obtenerCanchasLibres(dia: DateTime, inicio: Double, fin: Double) = {
    this.canchasDisponibles.filter { c => !c.hayReserva(dia, inicio, fin) }
  }

  def obtenerCanchaConMasReservas() = {
    this.canchasDisponibles.maxBy({ c => c.cantidadDeReservas() })
  }

  def obtenerfacturacionTotal() = {
    var total: Double = 0
    this.canchasDisponibles.foreach { c => total += c.facturacionTotal() }
    total
  }
}
