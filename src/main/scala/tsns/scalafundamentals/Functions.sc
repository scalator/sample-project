def mean(nums: Seq[Int]) = nums.sum / nums.size

// mean with a guard statement to prevent div by zero, Options
def mean2(nums: Seq[Int]) =
  if (nums.size == 0) None
  else Option(nums.sum / nums.size)

val seq = Seq(1,2,3)
mean(seq)

// no enclosing braces because there's only one expression
def mean3(nums: Seq[Int]): Option[Double] =
  if (nums.size == 0) None
  else Option(nums.sum / nums.size)


// enclosed in braces, but is redundant
def mean4(nums: Seq[Int]): Option[Double] = {
  if (nums.size == 0) None
  else Option(nums.sum / nums.size)
}

// a function that returns Unit
def printMean(nums: Seq[Int]) {
  if (nums.size == 0) println("Mean of empty string")
  else println(s"Mean is ${nums.sum / nums.size}")
}

// doesn't print in worksheet, try evaluating REPL in IntelliJ terminal `sbt console`
printMean(seq)

// explicit return type of Unit
def printMean2(nums: Seq[Int]): Unit = {
  if (nums.size == 0) print("Mean of empty string")
  else println(s"Mean is ${nums.sum / nums.size}")
}

printMean2(seq)
