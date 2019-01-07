package Exercises.d03

object Exer09 {
  /*
  编写函数计算 ,其中n是整数，使用如下的递归定义:
  •	  x^n= x*x^(n-1) ,如果n是正数的话
  •	  x^0= 1
  •	  x^n= 1/x^(-n) ,如果n是负数的话
  •	不得使用return语句
   */
  def main(args: Array[String]): Unit = {
    println(f1(2,-2))
  }
  def f1(x:Double,n:Int):Double={
    if (n == 0){
      1
    } else if(n > 0){
      x*f1(x,n-1)
    } else{
     1 / f1(x,-n)
    }
  }
}
