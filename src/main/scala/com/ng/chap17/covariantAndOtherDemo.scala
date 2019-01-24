package com.ng.chap17
/*
斜变、逆变、不变
对于一个带类型参数的类型，比如 C[T]，如果对A及其子类型B，满足C[B]也符合 C[A]的子类型，那么就称为covariance(协变) ，
如果 C[A]是 C[B]的子类型，即与原来的父子关系正相反，则称为contravariance(逆变)。
如果一个类型支持协变或逆变，则称这个类型为variance(翻译为可变的或变型)，否则称为invariance(不可变的)

在声明Scala的泛型类型时，“+”表示协变，而“-”表示逆变
C[+T]：如果A是B的子类，那么C[A]是C[B]的子类，称为协变
C[-T]：如果A是B的子类，那么C[B]是C[A]的子类，称为逆变
C[T]：无论A和B是什么关系，C[A]和C[B]没有从属关系。称为不变.
 */
object covariantAndOtherDemo {
  def main(args: Array[String]): Unit = {
  val t:Temp[Sub] = new Temp[Super]("hello") //逆变
//    val t2:Temp[Super] = new Temp[Sub]("hi")   //协变
  }
}
//Temp[A] 不变
// Temp[+A] 协变，基本含义是指 Super 是 Sub的父类那么 Temp[Super] 就是Temp[Sub]父类
// Temp[-A] 逆变，基本含义是指 Super 是 Sub的父类那么 Temp[Super] 就是Temp[Sub]子类
class Temp[-A] (title:String){ //逆变
  override def toString: String = title
}

class Super //父类
class Sub extends Super //Sub 是Super的子类