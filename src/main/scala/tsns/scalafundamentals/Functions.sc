def mean(nums: Seq[Int]) =
  if (nums.size == 0) None
  else Option(nums.sum / nums.size)


mean(Seq(1,2,3))

def mean2(nums: Seq[Int]): Option[Double] =
  if (nums.size == 0) None
  else Option(nums.sum / nums.size)


def mean3(nums: Seq[Int]): Option[Double] = {
  if (nums.size == 0) None
  else Option(nums.sum / nums.size)
}