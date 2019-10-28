//--------------------------------------------
//2.4.5.1
object Cat {
  val name: String = "Oswald"
  val color: String  = "Black"
  val food: String = "Milk"
}

//--------------------------------------------
//2.4.5.2
object calc {
  def square(num: Double) : Double = num * num
  def cube(num: Double) : Double = square(num) * num
}
calc.square(2.0)
calc.cube(2.0)

//--------------------------------------------
//2.4.5.3
object calc2 {
  def square(num: Double) : Double = num * num
  def cube(num: Double) : Double = square(num) * num

  def square(num: Int) : Int = num * num
  def cube(num: Int) : Int = square(num) * num
}
calc.square(2)
calc2.square(2)

//--------------------------------------------
//2.4.5.4
object argh {
  def a = {
    println("a")
    1
  }

  val b = {
    println("b")
    a + 2
  }

  def c = {
    println("c")
    a
    b + "c"
  }
}
argh.c + argh.b + argh.a

//--------------------------------------------
//2.4.5.5
object person {
  val firstName = "Donald"
  val lastName = "Duck"
}

object alien {
  def greet(p: person.type) = "Hello, " + p.firstName + p.lastName
}

alien.greet(person)

//--------------------------------------------
//Try Out Stuff
println("a" + 1)

