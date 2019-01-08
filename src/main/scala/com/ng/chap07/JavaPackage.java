package com.ng.chap07;

public class JavaPackage {
    public static void main(String[] args) {
        //使用一下Dog
        //小明的Dog
        com.ng.chap07.xm.Dog dog1 = new com.ng.chap07.xm.Dog();
        com.ng.chap07.xq.Dog dog2 = new com.ng.chap07.xq.Dog();

        System.out.println(dog1); //
        System.out.println(dog2); //

//        String str = "abc";
//        String str2 = "abc";
//        System.out.println(str == str2);
//        System.out.println(str.hashCode() + " " + str2.hashCode());

    }
}
