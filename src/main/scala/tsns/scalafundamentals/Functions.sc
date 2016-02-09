def mean(nums: Seq[Int]) = nums.sum / nums.size

def mean2(nums: Seq[Int]) =
  if (nums.size == 0) None
  else Option(nums.sum / nums.size)

val seq = Seq(1,2,3)
mean(seq)

def mean3(nums: Seq[Int]): Option[Double] =
  if (nums.size == 0) None
  else Option(nums.sum / nums.size)


def mean4(nums: Seq[Int]): Option[Double] = {
  if (nums.size == 0) None
  else Option(nums.sum / nums.size)
}

def printMean(nums: Seq[Int]) {
  if (nums.size == 0) println("Mean of empty string")
  else println(s"Mean is ${nums.sum / nums.size}")
}

// doesn't print well in worksheet, try REPL in IntelliJ terminal `sbt console`
printMean(seq)

def printMean2(nums: Seq[Int]): Unit = {
  if (nums.size == 0) print("Mean of empty string")
  else print(s"Mean is ${nums.sum / nums.size}")
}

printMean2(seq)
