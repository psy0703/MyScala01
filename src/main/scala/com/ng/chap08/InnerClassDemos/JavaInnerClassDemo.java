package com.ng.chap08.InnerClassDemos;

public class JavaInnerClassDemo {
    public static void main(String[] args) {
        //创建2个外部类对象
        OuterClass outer1 = new OuterClass();
        OuterClass outer2 = new OuterClass();

        //创建Java成员内部类
        OuterClass.InnerClass inner1 = outer1.new InnerClass();
        OuterClass.InnerClass inner2 = outer2.new InnerClass();
        // 说明在Java中，将成员内部类当做一个属性，因此使用下面的方式来创建 outer1.new InnerClass().

        //下面的方法调用说明在Java中，内部类之和类型相关，也就是说，只要是
        //OuterClass.InnerClass类型的对象就可以 传给形参InnerClass ic
        inner1.test(inner1);
        inner1.test(inner2);
        inner2.test(inner1);
        inner2.test(inner2);

        // 创建Java静态内部类
        // 因为在java中静态内部类是和类相关的，使用 new OuterClass.StaticInnerClass()
        OuterClass.StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass();
        System.out.println(staticInnerClass);
        /*
        com.ng.chap08.InnerClassDemos.OuterClass$InnerClass@29453f44
        com.ng.chap08.InnerClassDemos.OuterClass$InnerClass@5cad8086
        com.ng.chap08.InnerClassDemos.OuterClass$InnerClass@29453f44
        com.ng.chap08.InnerClassDemos.OuterClass$InnerClass@5cad8086
        com.ng.chap08.InnerClassDemos.OuterClass$StaticInnerClass@6e0be858
         */
    }
}
class OuterClass{//外部类
    class InnerClass{ //成员内部类
        //定义了一个方法,在成员内部类中定义
        //接收一个InnerClass实例，并输出
        public void test(InnerClass ic){
            System.out.println(ic);
        }
    }
    static class StaticInnerClass{} //静态内部类
}