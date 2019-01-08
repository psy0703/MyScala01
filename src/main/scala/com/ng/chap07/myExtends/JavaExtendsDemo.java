package com.ng.chap07.myExtends;

/**
 * @author cloud9831
 * @2019-01-09 0:22
 */
public class JavaExtendsDemo {
    public static void main(String[] args) {

        //1. 当我们对象调用方法时，会和对象的内存地址进行绑定-》动态绑定机制
        //2. 当我们对象调用属性时， 没有动态绑定机制，即在哪里调用就返回哪个属性值
        AA a = new BB();
        System.out.println(a.sum());  //40 -> 30 //如果没有注销BB的sum,结果是40,注销30
        //getI 调用的是BB类的
        System.out.println(a.sum1()); //30 -> 20 //如果没有注销BB的sum1,结果是30,注销20
    }
}

class AA {
    public int i = 10;

    public int sum() {
        return getI() + 10;
    }

    public int sum1() {
        return i + 10;
    }

    public int getI() {
        return i;
    }
}

class BB extends AA {
    public int i = 20;

    //    public int sum() {
//        return i + 20;
//    }
    public int getI() {
        return i;
    }
//    public int sum1() {
//        return i + 10;
//    }
}

