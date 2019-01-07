package com.ng.chap06;

public class JavaConstruactor {
    public static void main(String[] args) {
        Person2 person2 = new Person2();
        Person2 jack = new Person2("jack", 10);
        System.out.println(person2.getInfo());
        System.out.println(jack.getInfo());

    }
}

class Person2 {
    public String name;
    public int age;

    public String getInfo() {
        return name + "\t" + age;
    }

    public Person2() { //无参构造器
        age = 18;
    }

    public Person2(String name, int age) {  //两个形参的构造器
        this.name = name;//名字
        this.age = age;//年龄
    }
}


