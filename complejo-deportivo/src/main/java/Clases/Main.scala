package Clases

import org.joda.time.DateTime

object Main {

	def main(args: Array[String]) {
		var date = new DateTime("2014-04-13")
		println(date.dayOfWeek().getAsText())
    }
}