package com.ng.chap17

/**
  * 要求：使用上下文界定+隐式参数的方式，比较两个Person对象的年龄大小
  * 要求：使用Ordering实现比较
  */
object ContextBoundsDemo01 {
  //这里我们使用隐式值
  // personComparetor 就是一个隐式值
  implicit val personComparetor = new Ordering[Person]{
    override def compare(x: Person, y: Person): Int = {
      x.age - y.age
    }
  }

  implicit val personComparetor2 = new Ordering[Person2]{
    override def compare(x: Person2, y: Person2): Int = {
      println("personComparetor2 被调用")
      x.age - y.age
    }
  }

  def main(args: Array[String]): Unit = {
    //打印出 personComparetor地址
    println("1 = " + personComparetor.hashCode())

    //对于上下文界定，我们使用的方法较多，至少三种
    val p1 = new Person("mary", 30)
    val p2 = new Person("smith", 35)

    val comm1 = new CompareComm4(p1,p2)
    println(comm1.greater)

    val comm2 = new ComparaComm5(p1,p2)
    println(comm2.greater)

    val p3 = new Person2("mary2", 32)
    val p4 = new Person2("smith2", 10)
    val com3 = new CompareComm6(p3,p4)
    println(com3.greater)
    /*
    1 = 1537358694
    2 = 1537358694
    smith	35
    smith	35
    personComparetor2 被调用
    mary2	32
     */
  }
}

//一个普通的Person类
class Person(val name: String, val age: Int) {
  override def toString = this.name + "\t" + this.age
}
class Person2(val name: String, val age: Int) {
  override def toString = this.name + "\t" + this.age
}
//方式一：
//1、T是Ordering类型
//2、implicit comparetor：Ordering[T] 是隐式参数
class CompareComm4[T:Ordering](o1:T,o2:T)(implicit  comparetor:Ordering[T]){
  def greater = {
    println("2 = " + comparetor.hashCode())
    if (comparetor.compare(o1,o2) > 0) o1 else o2
  }
}

//方式二：可以将隐式参数写到方法内
class ComparaComm5[T:Ordering](o1:T,o2:T){
  def greater = {
    //方法内，写了方法
    def f1(implicit  cmptor:Ordering[T]) = cmptor.compare(o1,o2)
    if(f1 > 0) o1 else o2
  }

}
//方式三（推荐）：隐式语法糖，本质就是通过上下文，去找到隐式值
class CompareComm6[T:Ordering](o1:T,o2: T){
  def greater = {
    //这句话就是会发生隐式转换，获取到隐式值 personComparetor
    //将 隐式值 类型为 Ordering[T]， 赋给 comparetor，编译器
    //隐式语法糖，本质就是通过上下文，去找到隐式值.
    val comparetor = implicitly[Ordering[T]]
    if (comparetor.compare(o1 ,o2)>0) o1 else o2
  }
}
