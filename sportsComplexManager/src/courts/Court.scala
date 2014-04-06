package courts

abstract class Court {

  var basePrice:Int=_;
  
  def getExtras()=basePrice;
  
  def getRent(nPlayers:Int):Int
}