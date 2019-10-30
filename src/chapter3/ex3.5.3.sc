//---------------------------------------------------------------------------
//3.5.3.1
case class Cat1(colour: String, food: String)

val oswald = Cat1("Black", "Milk")
val henderson = Cat1("Ginger", "Chips")

object ChipShop {
  def willServe(cat: Cat1) = {
    cat match {
      case Cat1(_, "Chips") => true
      case Cat1(_, _) => false
    }
  }
}

ChipShop.willServe(henderson)
ChipShop.willServe(oswald)

//---------------------------------------------------------------------------
//3.5.3.2
case class Director1(firstName: String, lastName: String, yearOfBirth: Int) {
  def name: String = firstName + " " + lastName
}

case class Film1(
   name: String,
   yearOfRelease: Int,
   imdbRating: Double,
   director: Director1) {

    def directorsAge: Int = yearOfRelease - director.yearOfBirth

    def isDirectedBy(dir: Director1): Boolean = if(dir == director) true else false
}

object Dad {
  def rate(film: Film1): Double = {
    film match {
      case Film1(_, _, _, director) => {
        director match {
          case Director1("John", "McTiernan", _) => 7.0
          case Director1("Clint", "Eastwood", _) => 10.0
          case Director1(_, _, _) => 3.0
        }
      }
    }
  }
}

Dad.rate(Film1("x", 1, 2.0, Director1("Clint", "Eastwood", 2)))
Dad.rate(Film1("x", 1, 2.0, Director1("John", "McTiernan", 2)))
Dad.rate(Film1("x", 1, 2.0, Director1("Donald", "Duck", 2)))

//---------------------------------------------------------------------------