package Clases

import org.joda.time.DateTime
import Excepciones.HorarioInvalido



class Reserva(c : Cancha, d : DateTime, i : Double, f : Double) {
	var cancha = c
	var dia = d
	var inicio = i
	var fin = f
	
	//Validando inicio y fin
        chequearHorarioInvalido(i)
        chequearHorarioInvalido(f)

        private def chequearHorarioInvalido(horario: Double) = {
         if (horario < 1 | horario > 24) {
           throw new HorarioInvalido
         }
        }
	
}
