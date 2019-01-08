package com.ng.chap07.myExtends;

/**
 * @author cloud9831
 * @2019-01-09 0:25
 */
public class JavaSuper {
    public static void main(String[] args) {
        // B b = new B();

        //A(String name) venessa
        //B(String name) venessa
        B venessa = new B("venessa");
    }
}

class A {
    public A() {
        //super();
        System.out.println("A()");
    }

    public A(String name) {
        super();
        System.out.println("A(String name)" + name);
    }
}

class B extends A {
    public B() {
        //这里会隐式调用super(); 就是无参的父类构造器A()
        //super();
        System.out.println("B()");
    }

    public B(String name) {
        super(name);
        System.out.println("B(String name)" + name);
    }
}


