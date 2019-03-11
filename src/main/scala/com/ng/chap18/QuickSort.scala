package com.ng.chap18
import scala.util.control.Breaks._
/**
  * 基本思想是：通过一趟排序将要排序的数据分割成独立的两部分，其中一部分的所有数据都比另外一部分的所有数据都要小，然后再按此方法对这两部分数据分别进行快速排序，整个排序过程可以递归进行，以此达到整个数据变成有序序列
  */
object QuickSort {
  //快速排序 时间平均 O(NlogN) 最坏O( N^2 ) 空间平均O(logN)和 最坏O(N)
  //不稳定
  def main(args: Array[String]): Unit = {
    val arr = Array(-9,78,0,23,-567,70)
    quickSort(0, arr.length -1, arr) // 调用快排
    println(arr.mkString(" "))

    /*val random = new util.Random()
    val arr = new Array[Int](800000)
    for (i <- 0 until 800000) { //循环的生成随机数
      arr(i) = random.nextInt(800000)
    }
    println("排序前")
    val now: Date = new Date()
    val dateFormat: SimpleDateFormat =
      new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    val date = dateFormat.format(now)
    println("排序前时间=" + date) //输出时间

    quickSort(0, arr.length -1, arr) // 调用快排
    println("排序后")

    val now2: Date = new Date()
    val date2 = dateFormat.format(now2)
    println("排序后时间=" + date2) //输出时间*/

  }

  /**
    *
    * @param left 指定从数组的左边的下标 0
    * @param right 指定从数组的右边的下标 length -1
    * @param arr 进行排序的数组
    */
  def quickSort(left:Int,right:Int,arr:Array[Int]):Unit={
    var l = left //左下标
    var r = right //右下标
    var pivot = arr((left+right) / 2)  //以中间值为基准进行分割
    var temp = 0

    breakable{
      // while 语句的作用就是把比 pivot 小的数放到左边, 比pivot大的数放到右边
      while( l < r){
        while(arr(l) < pivot){ //从左边找一个比pivot大的值对应下标
          l += 1
        }
        while(arr(r) > pivot){ //从右边找一个比pivot大的值对应下标
          r -= 1
        }
        if (l >= r){ //说明本次交换结束，退出本次while
          break()
        }
        temp = arr(l)
        arr(l) = arr(r)
        arr(r) = temp
        //处理后，如果发现arr(l)=pivot，就r -=1，提高效率
        if (arr(l)==pivot){
          r -= 1
        }
        if (arr(r)==pivot){
          l += 1
        }
      }
    }
    if(l == r){
      l += 1
      r -= 1
    }
    if(left < r){ //向左递归排序
      quickSort(left,r,arr)
    }
    if(right > l){
      quickSort(l,right,arr)
    }
  }
}
