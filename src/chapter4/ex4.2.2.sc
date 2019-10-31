//---------------------------------------------------------------------------
//4.2.2.1 &&& 4.2.2.2

//---------------------------------------------------------------------------
//4.2.2.3
sealed trait DivisionResult

final case class Finite(val num: Int) extends DivisionResult

final case class Infinite() extends DivisionResult

object divide {
  def apply(a: Int, b: Int): DivisionResult = {
    b match {
      case 0 => Infinite()
      case _ => Finite(a/b)
    }
  }
}

val result1 = divide(4, 2)
val result2 = divide(1, 0)

//---------------------------------------------------------------------------