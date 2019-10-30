//---------------------------------------------------------------------------
//3.3.2.1
class Person(val firstName: String, val lastName: String) {

}

object Person {
  def apply(fullName: String): Person = {
    val names = fullName.split(" ")
    new Person(names(0), names(1))
  }
}

Person("La Lala").firstName

//---------------------------------------------------------------------------
//3.3.2.2
class Director(
  val firstName: String,
  val lastName: String,
  val yearOfBirth: Int) {
    def name: String = firstName + " " + lastName
}

object Director {
  def apply(firstName: String, lastName: String, yearOfBirth: Int): Director = new Director(firstName, lastName, yearOfBirth)

  def older(dir1: Director, dir2: Director) = {
    if(dir1.yearOfBirth > dir2.yearOfBirth) dir1 else dir2
  }
}

class Film(
  val name: String,
  val yearOfRelease: Int,
  val imdbRating: Double,
  val director: Director) {
    def directorsAge: Int = yearOfRelease - director.yearOfBirth

    def isDirectedBy(dir: Director): Boolean = if(dir == director) true else false

    def copy(name: String = name, yearOfRelease: Int = yearOfRelease, imdbRating: Double = imdbRating, director: Director = director) = {
      new Film(name, yearOfRelease, imdbRating, director)
    }
}

object Film {
  def apply(name: String, yearOfRelease: Int, imdbRating: Double, director: Director): Film = new Film(name, yearOfRelease, imdbRating, director)

  def highestRating(film1: Film, film2: Film) = {
    if(film1.imdbRating > film2.imdbRating) film1 else film2
  }

  def oldestDirectorAtTheTime(film1: Film, film2: Film) = {
    Director.older(film1.director, film2.director)
  }
}

//---------------------------------------------------------------------------
//3.3.2.3
  //Type
  //Type
  //Value
  //Value
  //Type/Value

//---------------------------------------------------------------------------

