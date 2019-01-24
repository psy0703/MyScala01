package com.ng.chap17.viewbounds

/**
  * 说明: 使用视图界定的方式，比较两个Person对象的年龄大小
  */
object ViewBoundsDemo02 {
  def main(args: Array[String]): Unit = {
    //测试
    val p1 = new Person("tom", 10)
    val p2 = new Person("jack", 20)
    val compareComm2 = new CompareComm2(p1, p2)
    println(compareComm2.greater2) // 对象
    println(compareComm2.greater1) // 对象

    val m1 = new Monster("红孩儿", 10.3)
    val m2 = new Monster("牛魔王", 110.3)
    val compareComm3 = new CompareComm2(m1, m2)
    println(compareComm3.greater2) // 对象
  }
}

//说明：
//1、创建了一个Person类，有两个只读的属性name 和 age
//2、继承了Ordered[person]，Ordered实现了Compareable接口
class  Person(val name:String,val age:Int) extends Ordered[Person]{
  //重写了compare 方法，写成自己的比较规则
  //返回了Int ,如果>0 表示 this > that , 如果=0 相等，如果<0 this<that
  override def compare(that: Person): Int = {
    println("Person's compare invoke")
    this.age - that.age
  }
  //重写toString目的，显示信息
  override def toString: String = {
    this.name + " " + this.age
  }
}
//Monster 薪水 Float ,比较两个Monster薪水高低
class Monster(val name: String, val sal:Double) extends Ordered[Monster] {
  override def compare(that: Monster): Int = {
    println("Monster 的 compare被调用 ")
    if (this.sal - that.sal > 0.0) 1
    else if (this.sal - that.sal < 0.1) -1
    else 0
  }
  override def toString: String = this.name + "\t" + this.sal
}
//说明
//1. [T <% Ordered[T]] 视图界定
//2. T 是 Ordered[T] 子类型
//3. T 实现了Compareable接口，因此可以调用compareTo
class CompareComm2[T <% Ordered[T]](obj1:T,obj2:T){
  def greater1 = if (obj1 > obj2) obj1 else obj2

  //这里调用的是 Ordered 的 compareTo
  def greater2 = if (obj1.compareTo(obj2) > 0) obj1 else obj2
}