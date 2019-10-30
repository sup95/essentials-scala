//---------------------------------------------------------------------------
//3.4.5.1
case class Cat(colour: String, food: String) {

}

//---------------------------------------------------------------------------
//3.4.5.2
case class Director(firstName: String, lastName: String, yearOfBirth: Int) {
  def name: String = firstName + " " + lastName
}

object Director {
  def older(dir1: Director, dir2: Director) = {
    if(dir1.yearOfBirth > dir2.yearOfBirth) dir1 else dir2
  }
}

case class Film(
  name: String,
  yearOfRelease: Int,
  imdbRating: Double,
  director: Director) {

    def directorsAge: Int = yearOfRelease - director.yearOfBirth

    def isDirectedBy(dir: Director): Boolean = if(dir == director) true else false
}

object Film {
  def highestRating(film1: Film, film2: Film) = {
    if(film1.imdbRating > film2.imdbRating) film1 else film2
  }

  def oldestDirectorAtTheTime(film1: Film, film2: Film) = {
    Director.older(film1.director, film2.director)
  }
}

//---------------------------------------------------------------------------
//3.4.5.3
case class Counter3(num: Int = 0) {
  def inc(value: Int = 1) = copy(num + value)
  def dec(value: Int = 1) = copy(num - value)
}

Counter3(10).inc().dec().inc().inc()
Counter3().inc().dec() == Counter3().dec().inc()

//---------------------------------------------------------------------------
//3.4.5.4
case class Person(firstName: String, lastName: String) {

}

object Person {
  def apply(fullName: String): Person = {
    val names = fullName.split(" ")
    new Person(names(0), names(1))
  }
}

Person("La Lala").firstName