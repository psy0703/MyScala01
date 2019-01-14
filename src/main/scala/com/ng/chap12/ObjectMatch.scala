package com.ng.chap12

/**
  * 对象匹配
  * 1) case中对象的unapply方法(对象提取器)返回Some集合则为匹配成功
  * 2) 返回None集合则为匹配失败
  */
object ObjectMatch {
  def main(args: Array[String]): Unit = {
    // 模式匹配使用：
    //有时，我们需要去得到构建对象时的传入实参
    val num:Double = Square1(6.0)  //构建了36.0
    num match{
      // 说明  case Square(n) 执行的过程
      //  1. 当执行到匹配  Square(n)
      //  2.  将 number 传递给  Square 的 def unapply(z: Double), number 会传入给z
      //  3. 如果 unapply 返回了Some 就表示匹配成功
      // 4.  如果unapply 返回了None 就表示匹配失败
      // 5. 将Some(?)的结果 返回给 case Square(n) 的 n值
      case Square1(n) => println("n = " + n)
      //默认匹配
      case _ => println("nothing macthed")
    }
  }
}

object Square1 {
  //这里的unapply就是对象提取器
  def unapply(z :Double): Option[Double] ={
    println("unapply 被调用")
    println("z = " + z)
    Some(math.sqrt(z)) // Some(6.0)
  }
//创建对象的方法
  def apply(z:Double): Double = z * z
}
/*
unapply 被调用
z = 36.0
n = 6.0

1)	构建对象时apply会被调用 ，比如 val n1 = Square(5)
2)	当将 Square(n) 写在 case 后时[case Square(n) => xxx]，会默认调用unapply 方法(对象提取器)
3)	number 会被 传递给def unapply(z: Double) 的 z 形参
4)	如果返回的是Some集合，则unapply提取器返回的结果会返回给 n 这个形参
5)	case中对象的unapply方法(提取器)返回some集合则为匹配成功
6)	返回none集合则为匹配失败
 */