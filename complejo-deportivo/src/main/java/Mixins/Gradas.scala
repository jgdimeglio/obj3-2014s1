package Mixins

import Clases.Cancha
import org.joda.time.DateTime
import Excepciones.UsadaParaTorneo

trait Gradas extends Cancha {

  def extraPorGradas(pb: Double) = pb

  override def calcularExtra(dia: DateTime, inicio: Double, fin: Double, pb: Double): Double = {
    (this.extraPorGradas(pb) + super.calcularExtra(dia, inicio, fin, pb))
  }

  override def chequearSiPuedeReservar(dia: DateTime, inicio: Double, fin: Double) {
    super.chequearSiPuedeReservar(dia, inicio, fin)
    if (this.esFinDeSemana(dia)) {
      throw new UsadaParaTorneo
    }
  }

}
