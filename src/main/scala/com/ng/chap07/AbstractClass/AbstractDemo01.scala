package com.ng.chap07.AbstractClass

/**
  * 抽象类的案例
  */
object AbstractDemo01 {
  def main(args: Array[String]): Unit = {
    println("抽象类的案例")
  }
}
//抽象类
//1.抽象类中可以有普通的属性
//2.抽象类中可以有抽象的属性
//3.抽象类中可以有抽象的方法，并且不能使用abstract关键字修饰
//4.抽象类中可以有普通的方法，即实现的方法
abstract class Aniaml {
  var name:String //抽象属性
  var age : Int //抽象属性
  var color: String = "white" // 普通属性

  def cry() //抽象方法

  def sayHi(): Unit ={  //实现的方法s
    println("sayHi")
  }
}

//如果一个类继承了抽象类，
// 则它必须实现抽象类的所有抽象方法和抽象属性，除非它自己也声明为abstract类
class Tiger extends  Aniaml{
  override var name: String = _
  override var age: Int = _

  override def cry(): Unit = {
    println("Tiger is  crying")
  }
}

abstract class Mouse  extends Aniaml

abstract class CC{
  //抽象方法和抽象属性不能使用private、final 来修饰，因为这些关键字都是和重写/实现相违背的
  //private var name : String

  def sum(n1:Int,n2:Int) : Int
}

/*
//抽象方法Animal的底层代码
public abstract class Aniaml
{
  public String color()
  {
    return this.color;
  }

  public void color_$eq(String x$1)
  {
    this.color = x$1;
  }

  private String color = "white";

  public void sayHi()
  {
    Predef$.MODULE$.println("sayHi");
  }

  public abstract String name();

  public abstract void name_$eq(String paramString);

  public abstract int age();

  public abstract void age_$eq(int paramInt);

  public abstract void cry();
 */