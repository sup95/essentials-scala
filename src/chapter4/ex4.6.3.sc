//---------------------------------------------------------------------------
//Try Out Stuff
sealed trait IntList
case object End extends IntList
final case class Pair(head: Int, tail: IntList) extends IntList

def sum(list: IntList): Int = {
  list match {
    case End => 0
    case Pair(head, tail) => head + sum(tail)
  }
}

val example = Pair(1, Pair(2, Pair(3, End)))
sum(example)
sum(example.tail)
sum(End)

//---------------------------------------------------------------------------
//4.6.3.1
def length(list: IntList): Int = {
  list match {
    case End => 0
    case Pair(_, tail) => 1 + length(tail)
  }
}
length(example)

def product(list: IntList): Int = {
  list match {
    case End => 1
    case Pair(head, tail) => head * product(tail)
  }
}
product(example)

def double(list: IntList): IntList = {
  list match {
    case End => End
    case Pair(head, tail) => Pair(2*head, double(tail))
  }
}
assert(double(example) == Pair(2, Pair(4, Pair(6, End))))
double(example)

//---------------------------------------------------------------------------
//4.6.3.2
sealed trait Tree
final case class Node(left: Tree, right: Tree) extends Tree
final case class Leaf(value: Int) extends Tree

def treeSum(tree: Tree): Int = {
  tree match {
    case Leaf(value) => value
    case Node(left, right) => treeSum(left) + treeSum(right)
  }
}

def treeDouble(tree: Tree): Tree = {
  tree match {
    case Leaf(value) => Leaf(value * 2)
    case Node(left, right) => Node(treeDouble(left), treeDouble(right))
  }
}

//---------------------------------------------------------------------------


