package Exercises.d07

import scala.collection.mutable.ArrayBuffer

/**
  * 3. 给定一个整数数组，产出一个新的数组，包含原数组中的所有正值，
  * 以原有顺序排列，之后的元素是所有零或负值，以原有顺序排列。
  * **将遍历过程中处理的结果返回到一个新Vector集合中，使用yield关键字
  *
  * @author cloud9831 
  *         @2019-01-13 17:21 
  */
object Exer03 {
  def main(args: Array[String]): Unit = {
    val arr1 = Array(1,-2,3,-4,5,-6,0,7,8)
    val arr2 = subArray(arr1)
    arr2.foreach(println(_))
  }
  def subArray(arr:Array[Int]):Array[Int] = {
    val buf =new ArrayBuffer[Int]()
    buf ++= (for(i <- arr if i > 0) yield i) //先遍历出 >0 数，并加入到buf
    buf ++= (for(i <- arr if i == 0) yield i)
    buf ++= (for(i <- arr if i < 0) yield i)
    buf.toArray //使用 ArrayBuffer -> Array的方法
}

}
