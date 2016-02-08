val stringly = "i'm a string"

val verbose: String = "i'm a verbose string assignment": String

val stringBlock = {
  val one = "i'm a combination "
  val two = "of three strings "
  val three = "evaluated at assignment"
  one + two + three
}

def stringCaller = "my return type is inferred"

stringCaller

val sequenceOfString = Seq("this", "sequence's", "type", "is", "inferred")
sequenceOfString.mkString(" ")

// parametric polymorphism
val mixedBag = Seq(1, 2, "three", "banana", Math.PI)
// http://www.scala-lang.org/api/current/index.html#scala.Any

// type parameters aka generics
def sizeOf[A](mySeq: Seq[A]) = mySeq.size

sizeOf(mixedBag)
