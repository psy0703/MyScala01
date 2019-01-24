package com.ng.chap17.viewbounds
object MyImplicit{
  //隐式转化
  //1.作用是将Person2类型，隐式转化为Ordered[Person2]
  implicit def person22OrderedPerson2(person2:Person2)=
    new Ordered[Person2]{
      override def compare(that: Person2): Int = person2.age - that.age
    }
}
object ViewBoundsDemo03 {
  def main(args: Array[String]): Unit = {
    val p1 = new Person2("tom", 110)
    val p2 = new Person2("jack", 20)
    import MyImplicit._
    val comm = new CompareComm3[Person2](p1,p2)
    println(comm.greater)
  }
}
//普通的Person2对象
class Person2(val name: String, val age: Int)  { //ocp
  override def toString = this.name + "\t" + this.age
}

class CompareComm3[T <% Ordered[T]](o1:T,o2:T){
  def greater = if (o1 > o2 ) o1 else o2
}

