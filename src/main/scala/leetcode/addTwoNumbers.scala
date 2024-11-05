package leetcode

class ListNode(_x: Int = 0, _next: ListNode = null) {
  var next: ListNode = _next
  var x: Int = _x
}

object addTwoNumbers extends App {

  val l = new ListNode(2, new ListNode(4, new ListNode(3)))
  val r = new ListNode(5, new ListNode(6, new ListNode(4)))
  println(addTwoNumbers(l,r))

  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {

    def nodeToArray(node: ListNode): Array[Int] = {
      var current = node

      val result = scala.collection.mutable.ArrayBuffer[Int]()

      while (current != null) {
        result += current.x
        current = current.next
      }

      result.toArray
    }

    def arrayToNode(arr: Array[Int]): ListNode = {
      if (arr.isEmpty) return null

      val dummy = new ListNode()
      var current = dummy

      for (num <- arr) {
        current.next = new ListNode(num)
        current = current.next
      }

      dummy.next
    }

    val x: Array[Int] = nodeToArray(l1)
    val y: Array[Int] = nodeToArray(l2)

    val xs = BigInt(x.reverse.mkString(""))
    val ys = BigInt(y.reverse.mkString(""))

    val s = (xs + ys).toString.toArray.reverse.map(_.asDigit)

    arrayToNode(s)

  }
}
