//---------------------------------------------------------------------------
//4.5.6.1
sealed trait TrafficLight {
//Below not working, though suggested solution
//  def next: TrafficLight =
//    this match {
//      case Red => Green
//      case Green => Yellow
//      case Yellow => Red
//    }
}
case object Red extends TrafficLight
case object Green extends TrafficLight
case object Yellow extends TrafficLight

//object Lights {
//  def next(light: TrafficLight): Unit = {
//    light match {
//      case Red => Green
//      case Green => Yellow
//      case Yellow => Red
//    }
//  }
//}

//---------------------------------------------------------------------------
//4.5.6.2
sealed trait Calculation1
case class Success(result: Int) extends Calculation1
case class Failure(error: String) extends Calculation1

object Compute {
  def +(cal: Calculation1, num: Int): Calculation1 = {
    cal match {
      case Success(result) => Success(result + num)
      case Failure(error) => Failure(error)
    }
  }
  def -(cal: Calculation1, num: Int): Calculation1 = {
    cal match {
      case Success(result) => Success(result - num)
      case Failure(error) => Failure(error)
    }
  }
  def /(cal: Calculation1, num: Int): Calculation1 = {
    cal match {
      case Success(result) => if(num == 0) Failure("Divisor is Zero") else Success(result/num)
      case Failure(error) => Failure(error)
    }
  }

//  def /(cal: Calculation1, num: Int): Calculation1 = {
//    cal match {
//      case Success(result) => {
//        num match {
//          case 0 => Failure("Division by Zero")
//          case _ => Success(result/num)
//        }
//      }
//      case Failure(error) => Failure(error)
//    }
//  }
}

Compute.+(Success(5), 5)
Compute.-(Success(5), 5)
Compute./(Success(10), 5)
Compute./(Success(10), 0)

//---------------------------------------------------------------------------

