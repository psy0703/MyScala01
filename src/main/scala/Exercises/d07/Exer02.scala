package Exercises.d07

/**
  * 2. 编写一个循环，将整数数组中相邻的元素置换。
  * 比如Array(1, 2, 3, 4, 5)置换后为Array(2, 1, 4, 3, 5)
  * @author cloud9831
  * @2019-01-13 14:51
  */
object Exer02 {
  def main(args: Array[String]): Unit = {
    val array = Array(1,2,3,4,5)
    trans(array)
    array.foreach(println(_))
  }

  def trans(arr: Array[Int]): Unit ={
    for(i <- 0 until(arr.length - 1,2)){ //until(a,b) //a为结束位置，b为步长
      var temp = arr(i)
      arr(i) = arr(i + 1)
      arr(i + 1) = temp
    }
  }
}
