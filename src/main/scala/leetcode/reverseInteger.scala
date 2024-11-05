package leetcode

object reverseInteger extends App{

  def reverse(x: Int): Int = {

    if (x == 0) {
      return 0
    }

    val arrayCase = if (x.toString.toArray.last.toString == "0") x.toString.toArray.dropRight(1).reverse else x.toString.toArray.reverse

    var finalString = if (x < 0) "-" else ""

    for (elem <- arrayCase) {
      try {
      elem.toString.toInt
      finalString = finalString.concat(elem.toString)
      } catch {
        case _:java.lang.NumberFormatException =>
      }
   }
    val intToReturn: Option[Int] = finalString.toIntOption
    if (intToReturn.isEmpty) 0 else intToReturn.get
  }

  val case1 = 123
  val case2 = -123
  val case3 = 120
  val case4 = 0
  val case5 = 1534236469

  println(reverse(case1))
  println(reverse(case2))
  println(reverse(case3))
  println(reverse(case4))
  println(reverse(case5))
}
