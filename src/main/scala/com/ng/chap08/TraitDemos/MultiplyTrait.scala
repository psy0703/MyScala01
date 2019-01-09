package com.ng.chap08.TraitDemos

/**
  * scala特质的叠加(重难点）
  * 分析叠加特质时，对象的构建顺序，和执行方法的顺序
  * 1) 构建对象时从左到右
  * 2) Scala在叠加特质的时候，执行方法时，会首先从后面的特质开始执行方法
  * 3) Scala中特质中如果调用super，并不是表示调用父特质的方法，
  * 而是向前面（左边）继续查找特质，如果找不到，才会去父特质查找
  */
object MultiplyTrait {
  def main(args: Array[String]): Unit = {
    //动态混入时，先继承，然后混入了两个特殊
    //mysql 对象的构建顺序如何？答: 从左到右
    //Operate3...
    //Data3
    //DB3
    //如果发现某个父特质，已经被构建了，则不会重复构建
    //File3

    // OPerate3... --> Data3... --> DB3... --> File3...
    //向文件  向数据库 插入数据 = 666
    val mysql = new MySQL3 with DB3 with File3
    //1.Scala在叠加特质的时候，会首先从后面的特质的方法开始执行
    //2.Scala中特质中如果调用super，并不是表示调用父特质的方法，而是向前面（左边）继续查找特质，如果找不到，才会去父特质查找
    //3. 如何理解? => 因为动态混入去创建对象时，其实本质是一个匿名子类，动态混入创建的对象时
    //动态的对象，那么它的继承关系，就不一定是静态的关系，而是一个动态
    //向文件..
    //向数据库
    //插入数据 = 666
    mysql.insert(666)

    println("======================")
    //请写出构建mysql2的顺序
    //operate3... --> Date3... --> File3... -->DB3...
    val mysql2 = new MySQL3 with File3 with DB3
    //向数据库  向文件   插入数据 = 200
    mysql2.insert(200)

    //如果 trait File3 中，修改了 代码 super.insert(id) 改成 super[Data3].insert(id)
    val mysql3 = new MySQL3 with DB3 with File3
    //向文件 插入数据 = 300
    mysql3.insert(300)
  }
}
trait Operate3{
  println("Operate3 ...")
  def insert(id:Int)
}

trait Data3 extends Operate3{
  println("Data3...")

  override def insert(id: Int): Unit = {
    println("插入数据 = " + id)
  }
}

trait DB3 extends Data3{
  println("DB3...")

  override def insert(id: Int): Unit = {
    println("向数据库")
    super.insert(id)
  }
}

trait File3 extends Data3{
  println("File3...")

  override def insert(id: Int): Unit = {
    println("向文件")
    super[Data3].insert(id)
//    super.insert(id)
  }
}

class MySQL3{}