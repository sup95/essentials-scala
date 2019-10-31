//---------------------------------------------------------------------------
//4.1.4.1
trait Feline {
  def colour: String
  def sound: String = "Grr"   //sshh. just experimenting.
}

case class Catt(colour: String = "Black", override val sound: String = "Meow", food: String = "CatFood") extends Feline
case class Lion(colour: String = "Brown", maneSize: Int = 20) extends Feline
case class Tiger(colour: String = "Black") extends Feline

Catt()
Lion()
Tiger()

//---------------------------------------------------------------------------
//4.1.4.2 && 4.1.4.3
trait Shape {
  def sides: Int
  def perimeter: Double
  def area: Double
}

trait Rectangular extends Shape {
  def sides: Int = 4
  def length: Double
  def breadth: Double
  def perimeter = 2 * length + 2 * breadth
  def area: Double = length * breadth
}

case class Rectangle(length: Double, breadth: Double) extends Rectangular

case class Square(side: Double) extends Rectangular {
  val length = side
  val breadth = side
}

case class Circle(radius: Double) extends Shape {
  val sides = 0;
  def perimeter: Double = 2 * math.Pi * radius
  def area: Double = math.Pi * radius * radius
}

val r = Rectangle(2,3)
r.perimeter
r.area

val s = Square(4)
s.perimeter
s.area

val c = Circle(1)
c.perimeter
c.area

//---------------------------------------------------------------------------


