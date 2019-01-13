package com.ng.chap11

/**
  * 在Scala中可以通过map映射操作来解决：
  * 将集合中的每一个元素通过指定功能（函数）映射（转换）成新的结果集合。
  * 这里其实就是所谓的将函数作为参数传递给另外一个函数,这是函数式编程的特点
  * @author cloud9831 
  *         @2019-01-13 21:41 
  */
object MapOperateDemo {

  def main(args: Array[String]): Unit = {
    def f1(n:Int):Int={
      println("被调用")
      n * 2
    }

    val list1 = List(2,4,6)
    //需求是把list的所有元素 * 2 ，并返回新的集合List
    val list2 = list1.map(f1)
    //对list.map(f1)的使用的过程分析
    //1. 会遍历list的所有元素（Int)
    //2. 将遍历出的元素传递给f1(n:Int)
    //3. f1计算得到结果， 得到结果放入到新的集合，原来的集合并不变化

    println("List2 = " + list2)//List2 = List(4, 8, 12)

    println("+===================+")
    val myList = MyList()
    val myList2 = myList.map(f1)
    println("MyLlist2 = " + myList2)
  }
}
//使用scala模拟map的机制
class MyList{
  var list1 = List(2,4,6)
  var list2 = List[Int]() //返回的List[Int]
  //自己的map方法
  def map(f:(Int) => Int):List[Int]={
    //遍历list1 -> 调用f函数 -> 封装到list2 -> 返回
    for(item <- this.list1){
      list2 = list2 :+ f(item)
    }
    list2
  }
}
object MyList{
  def apply(): MyList = new MyList()
}