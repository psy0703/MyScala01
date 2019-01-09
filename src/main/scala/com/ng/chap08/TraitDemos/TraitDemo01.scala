package com.ng.chap08.TraitDemos

/**
  * Scala特质快速入门案例一
  */
object TraitDemo01 {
  def main(args: Array[String]): Unit = {
    val c = new C
    val e = new E
    c.getConnect("root","root")
    e.getConnect("administrator", "123")
  }
}

//定义,声明了一个trait
trait trait1{
  //声明方法，抽象的
  def getConnect(user:String,pwd:String): Unit ={}
  //实现方法
  def test(n1:Int): Unit ={
    println("n1 = " + n1)
  }
}

trait trait2{
  //反编译后的.class 文件 interface trait2 ,
  //abstract class trait2$class
  def sayHi(): Unit ={
    println("say Hi~")
  }
}

class A{}

class B extends A{}

class C extends A with trait1 with  trait2{
  //先使用传统的方式, 一会使用动态混入
  override def getConnect(user: String, pwd: String): Unit = {
    println("C 连接了Mysql")
  }
}

class D{}

class E extends D with trait1{
  override def getConnect(user: String, pwd: String): Unit = {
    println("E 连接oracle")
  }
}
class F extends D {}

/*
在底层trait1对应的代码
//接口中存放了trait中，所有方法声明
public abstract interface trait1
{
  public abstract void getConnect(String paramString1, String paramString2);
  public abstract void test(int paramInt);
}
//将实现的方法，放入到抽象类
public abstract class trait1$class
{
  public static void test(trait1 $this, int n1)
  {
    Predef..MODULE$.println(new StringBuilder().append("n1=").append(BoxesRunTime.boxToInteger(n1)).toString());
  }

  public static void $init$(trait1 $this)
  {
  }
}
*/