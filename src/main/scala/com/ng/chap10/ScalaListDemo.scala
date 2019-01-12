package com.ng.chap10

/**
  * Scala List
  * 1)	List默认为不可变的集合
  * 2)	List 在 scala包对象声明的,因此不需要引入其它包也可以使用
  * 3)	val List = scala.collection.immutable.List
  * 4)	List 中可以放任何数据类型，比如 arr1的类型为 List[Any]
  * 5)	如果希望得到一个空列表，可以使用Nil对象, 在 scala包对象声明的,因此不需要引入其它包也可以使用
  * 向列表中增加元素, 会返回新的列表/集合对象。
  * 1)	符号::表示向集合中  新建集合添加元素。
  * 2)	运算时，集合对象一定要放置在最右边，
  * 3)	运算规则，从右向左。
  * 4)	::: 运算符是将集合中的每一个元素加入到空集合中去
  */
object ScalaListDemo {
  def main(args: Array[String]): Unit = {
    //在package object scala
    // val List = scala.collection.immutable.List
    // val Nil = scala.collection.immutable.Nil
    val list01 = List(1,2,3) // apply方法，List 是Object
    println(list01)
    val list02 = Nil //List()
    println(list02)

    //给List追加元素
    var list1 = List(1,2,3,"abc")
    val list2 = list1 :+ 4
    println("list1 = " + list1)
    println("list2 = " + list2) //list2 = List(1, 2, 3, abc, 4)

    val list3 = List(1,2,3,"abc")
    val list4 = 4 +: list3
    println("list3 = " + list3)
    println("list4 = " + list4) //list4 = List(4, 1, 2, 3, abc)

    //给List追加集合
    val list5 = list3
    //执行的过程
    //1. 执行时，从右向左
    //2. List(4,5,6,List(1, 2, 3, "abc"))
    val list6 = 4 :: 5 :: 6 :: list5 :: Nil
    println("list6 = " + list6)
    //List(4, 5, 6, List(1, 2, 3, abc))

    //下面等价 4 :: 5 :: 6 :: list1
    //1.执行过程, 从右向左
    //2. List(4,5,6, 1, 2, 3, "abc")
    val list7 = 4 :: 5 :: 6 ::list1 ::: Nil
    println("list 7 = " + list7)
    //list 7 = List(4, 5, 6, 1, 2, 3, abc)

  }
}
