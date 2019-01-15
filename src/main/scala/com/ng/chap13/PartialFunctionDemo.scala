package com.ng.chap13

/**
  * 偏函数快速入门
  * 1)	给一个集合val list = List(1, 2, 3, 4, "abc") ，请完成如下要求:
  * 2)	将集合list中的所有数字+1，并返回一个新的集合
  * 3)	要求忽略掉 非数字 的元素，即返回的 新的集合 形式为 (2, 3, 4, 5)
  */
object PartialFunctionDemo {
  def main(args: Array[String]): Unit = {
//使用偏函数解决
    val list = List(1,2,3,4,"Hello",1.2, 89.1, 1l)
    //创建偏函数 =>函数
    //1.偏函数是通过PartialFunction（Trait）创建
    //2.[Any,INt]中Any是传入的元素类型，Int是返回的类型
    val f1 = new PartialFunction[Any,Int] {
      //实现 PartialFunction 的方法 isDefinedAt
      //1. 如果该方法返回true,就处理该元素
      override def isDefinedAt(x: Any): Boolean = {
        if(x.isInstanceOf[Int]) true else false
      }
      //2. 如果 isDefinedAt 返回true,则系统调用 apply, 返回一个结果
      override def apply(v1: Any): Int = {
        v1.asInstanceOf[Int] + 1
      }
    }
    //说明：如果传入一个偏函数，不能使用map，应该使用collect
    val res = list.collect(f1)
    println("res = " + res) //res = List(2, 3, 4, 5)
  }

  //简化模式1
  def f2:PartialFunction[Any,Int]={
    case i:Int => i + 1
  }

  //简化模式2
  val list3 = List(1,2,3,4,"abc").collect{case i:Int => i + 1}
  println(list3)
}
/*
偏函数小结
1.使用构建特质的实现类(使用的方式是PartialFunction的匿名子类)
2.PartialFunction 是个特质(看源码)
3.构建偏函数时，参数形式   [Any, Int]是泛型，第一个表示参数类型，第二个表示返回参数
4.当使用偏函数时，会遍历集合的所有元素，编译器执行流程时先执行isDefinedAt()如果为true ,就会执行 apply, 构建一个新的Int 对象返回
5.执行isDefinedAt() 为false 就过滤掉这个元素，即不构建新的Int对象.
6.map函数不支持偏函数，因为map底层的机制就是所有循环遍历，无法过滤处理原来集合的元素
7.collect函数支持偏函数

 */