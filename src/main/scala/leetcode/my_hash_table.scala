package leetcode


class MyHashMap {
  private var myMap = scala.collection.mutable.ListBuffer.empty[Array[Int]]

  def put(key: Int, value:Int): Unit = {
    val keysInMap = myMap.map(sets => sets(0))
    if (keysInMap.contains(key)) {
      for (item <- myMap) {
        if (item(0) == key) {
          item(1) = value
        }
      }
    } else {
      myMap += Array(key, value)
    }
  }

  def get(key:Int): Int = {
    for (item <- myMap) {
      if (item(0) == key) {
        return item(1)
      }
    }
    -1
  }

  def remove(key: Int): Int = {
    for (item <- myMap) {
      if (item(0) == key) {
        myMap -= item
        return key
      }
    }
   -1
  }
}

object main extends App {
  val myhash = new MyHashMap

  myhash.put(1,3)
  myhash.put(2,5)
  myhash.put(2,7)
  myhash.put(6,8)
  println(myhash.get(2))
  println(myhash.get(6))
  myhash.remove(6)
  println(myhash.get(6))
}
