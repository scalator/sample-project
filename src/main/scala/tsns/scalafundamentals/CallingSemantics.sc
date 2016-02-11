// Arity 0

// bad form
def quack = println("quack")
// produces side-effect
// should use empty parens at definition and call

quack
// only omit parens when calling an arity 0 function with no side effects

// better
def quack2() = println("quack")

quack2()

// real world example

val bigList = 1 to 10e6.toInt

bigList.size

// no side effects
def duckSound = "quack"

duckSound

// Arity 1

// infix notation

class Duck {
  def makeSound(sound: String) = s"duck's $sound"
}

new Duck() makeSound "quack"

// real world example

val piSeq = Seq("the", "value", "of", "pi", "is", Math.PI)
piSeq mkString " "

// also acceptable when passing a function

val square = (x: Int) => Math.pow(x, 2)
Seq(1,2,3) map square

// Values and Expressions

//val foo = class FooClass // not an expression

// Passing Expressions

// max() impl.
Seq(1,2,3,2,1).foldLeft(0) { (last: Int, num:Int) =>
  if (last >= num) last
  else num
}


