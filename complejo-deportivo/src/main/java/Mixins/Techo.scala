package Mixins

import Clases.Cancha
import Clases.CentroMetereologico
import org.joda.time.DateTime

trait Techo extends Cancha {

	override def calcularExtra(dia : DateTime, inicio : Int, fin : Int, pb : Double) : Double ={
		if(CentroMetereologico.ahoraLlueve){
			return (this.extraPorTecho(pb) + super.calcularExtra(dia, inicio, fin, pb))
		}
		else{
		  return(this.calcularExtra(dia, inicio, fin, pb))
		}
	}
	
	private def extraPorTecho(pb : Double) = (0.1 * pb)
}