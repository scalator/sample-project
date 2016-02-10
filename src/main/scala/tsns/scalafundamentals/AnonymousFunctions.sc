val mean = (nums: Seq[Int]) => nums.sum / nums.size

mean(Seq(1,2,3))

val mean2 = new Function1[Seq[Int], Int] {
  def apply(nums: Seq[Int]): Int = nums.sum / nums.size
}

mean2(Seq(1,2,3))


val patientZero = () => {
  "takes no prisoners.. or parameters"
}

patientZero()