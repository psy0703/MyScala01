package com.ng.chap06

object ScalaConstructorDemo {
  def main(args: Array[String]): Unit = {
    val person = new Person3("jack", 10)
    person.showInfo()
    println("---------------------------")
    val aa = new AA
    val aa2 = new AA()
//    hello, person3
//    age=11
//    信息如下: jack  age 11
  }
}


//主构造器在底层生成的代码
/*
  public Person3(String pName, int pAge)
  {
    this.name = pName;
    this.age = pAge;
  }
 */

class Person3(pName:String,pAge:Int) { //主构造器

  //如果在Person3 类中，直接写语句，scala编译器，就会将这些代码统一的放到主构造器，并执行
  var name:String = pName
  var age :Int = pAge
  println("hello, person3")
  age += 1

  def showInfo(): Unit = {
    printf(s"信息如下: ${this.name}  age ${this.age}\n")
  }

  printf("\nage=" + age + "\n")//11

}

class AA {

}