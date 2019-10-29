//---------------------------------------------------------------------------
//3.1.6.1
class Cat(val name: String, val colour: String, val food: String) {
  println(name + "-" + colour + "-" + food)
}
val oswald = new Cat("Oswald", "Black", "Milk")
val henderson = new Cat("Henderson", "Ginger", "Chips")

//---------------------------------------------------------------------------
//3.1.6.2
object ChipShop {
  def willServe(cat: Cat) = {
    if(cat.food == "Chips") true else false
  }
}
ChipShop.willServe(oswald)
ChipShop.willServe(henderson)

//---------------------------------------------------------------------------
//3.1.6.3
class Director(val firstName: String, val lastName: String, val yearOfBirth: Int) {
  def name: String = firstName + " " + lastName
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

//Demo data
val eastwood = new Director("Clint", "Eastwood", 1930)
val mcTiernan = new Director("John", "McTiernan", 1951)
val nolan = new Director("Christopher", "Nolan", 1970)
val someBody = new Director("Just", "Some Body", 1990)
val memento = new Film("Memento", 2000, 8.5, nolan)
val darkKnight = new Film("Dark Knight", 2008, 9.0, nolan)
val inception = new Film("Inception", 2010, 8.8, nolan)
val highPlainsDrifter = new Film("High Plains Drifter", 1973, 7.7, eastwood)
val outlawJoseyWales = new Film("The Outlaw Josey Wales", 1976, 7.9, eastwood)
val unforgiven = new Film("Unforgiven", 1992, 8.3, eastwood)
val granTorino = new Film("Gran Torino", 2008, 8.2, eastwood)
val invictus = new Film("Invictus", 2009, 7.4, eastwood)
val predator = new Film("Predator", 1987, 7.9, mcTiernan)
val dieHard = new Film("Die Hard", 1988, 8.3, mcTiernan)
val huntForRedOctober = new Film("The Hunt for Red October", 1990, 7.6, mcTiernan)
val thomasCrownAffair = new Film("The Thomas Crown Affair", 1999, 6.8, mcTiernan)

eastwood.yearOfBirth
dieHard.director.name
invictus.isDirectedBy(nolan)

highPlainsDrifter.copy(name = "L'homme des hautes plaines")
thomasCrownAffair.copy(yearOfRelease = 1968, director = new Director("Norman", "Jewison", 1926))
inception.copy().copy().copy()

//Director should also have a copy method for deep copying

//---------------------------------------------------------------------------
//3.1.6.4
class Counter(val num: Int) {
  def inc = new Counter(num + 1)
  def dec = new Counter(num - 1)
}
new Counter(10).inc.dec.inc.inc.num

//---------------------------------------------------------------------------
//3.1.6.5
class Counter1(val num: Int) {
  def inc(value: Int = 1) = new Counter1(num + value)
  def dec(value: Int = 1) = new Counter1(num - value)
}
new Counter1(10).inc().dec().inc().inc(2).num

//---------------------------------------------------------------------------
//3.1.6.6
class Adder(amount: Int) {
  def add(in: Int) = in + amount
}

class Counter2(val num: Int) {
  def inc(value: Int = 1) = new Counter2(num + value)
  def dec(value: Int = 1) = new Counter2(num - value)

  def adjust(adder: Adder) = new Counter(adder.add(num))
}

new Counter2(10).adjust(new Adder(5)).num