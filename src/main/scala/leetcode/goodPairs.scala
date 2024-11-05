package leetcode

object goodPairs extends App {

  val nums: Array[Int] = Array(1,1,2,3,1,2,3)

  val count = nums.indices.foldLeft(0) { (acc, i) =>
    acc + nums.slice(i + 1, nums.length).count(_ == nums(i))
  }

  println(count)
}
