package courts

import featuresCourts.Stands

object MainTest {

  def main(args: Array[String]) {
	  val fc=new FootbalCourt with Stands
	  
	  println(fc.getRent(10))
  }
}