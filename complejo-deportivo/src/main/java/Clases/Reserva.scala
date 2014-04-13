package Clases

import org.joda.time.DateTime
import Excepciones.HorarioInvalido



class Reserva(c : Cancha, d : DateTime, i : Int, f : Int ) {
	var cancha = c
	var dia = d
	var inicio = i
	var fin = f
	
	//Validando inicio y fin
        chequearHorarioInvalido(i)
        chequearHorarioInvalido(f)

        private def chequearHorarioInvalido(horario: Int) = {
         if (horario < 1 | horario > 24) {
           throw new HorarioInvalido
         }
        }
	
}
