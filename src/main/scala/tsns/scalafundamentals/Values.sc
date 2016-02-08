val immutable = "i'm invulnerable"

immutable = "you can't change me"

var mutable = "i can be compromised"

mutable = "and there's nothing you can do about it"

// How do you program without mutation?

// recursion
// i.e.) accumulate values

val lines = Seq("To be, ", "or not to be, ", "that is the question")

def lineAccumulator(lines: Seq[String]): String = lines match {
  case Nil => ""
  case line :: tail => line + lineAccumulator(tail)
}

lineAccumulator(lines)
