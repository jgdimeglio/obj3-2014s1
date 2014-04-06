package courts

import featuresCourts.Stands
import featuresCourts.Stands
import featuresCourts.Stands

class FootbalCourt extends Court{
  
  this.basePrice=40

  override def getRent(nPlayers:Int)=basePrice*nPlayers
  
}









