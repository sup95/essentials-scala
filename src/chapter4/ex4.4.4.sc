//---------------------------------------------------------------------------
//4.4.4.1
sealed trait TrafficLight
case object Red extends TrafficLight
case object Green extends TrafficLight
case object Yellow extends TrafficLight

//---------------------------------------------------------------------------
//4.4.4.2
sealed trait Calculation
case class Success(result: Int) extends Calculation
case class Failure(error: String) extends Calculation

//---------------------------------------------------------------------------
//4.4.4.3
sealed trait Source
case object Well extends Source
case object Spring extends Source
case object Tap extends Source

case class BottledWater(source: Source, size: Int, carbonated: Boolean)

//---------------------------------------------------------------------------
