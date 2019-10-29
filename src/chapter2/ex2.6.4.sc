//---------------------------------------
//2.6.4.1
if(1 > 2) "alien" else "predator"

//2.6.4.2
if(1 > 2) "alien" else 2001

//2.6.4.3
if(false) "hello"

//---------------------------------------
//Try Out Stuff

//def ??? : Nothing = throw new NotImplementedError //scala feature
def square(in: Double): Double =
  in * in

assert(square(2.0) == 4.0)
assert(square(-2.0) == 4.0)

val x = println("hi") //Value assigned to x as side effect

def name: String = {
  val fname = "Donald"
  val lname = "Duck"
  fname + lname
}
name
