package leetcode

object twoSum extends App {

  val numsToExample: Array[Int] = Array(2, 7, 11, 15)
  val target: Int = 9

  val result = twoSum(numsToExample, target)
  result.foreach(println)

  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val arrayToReturn = scala.collection.mutable.ArrayBuffer.empty[Int]
    for {
      i <- nums.indices
      j <- i + 1 until nums.length
      if nums(i) + nums(j) == target
    } {
      arrayToReturn += (i, j)
    }
    arrayToReturn.toArray
  }
}
