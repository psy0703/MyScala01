package com.ng.chap07;

public class JavaNoNameClass {
    public static void main(String[] args) {
        A22 a22 = new A22() {
            @Override
            public void cry() {
                System.out.println("cry...");
            }
        };

    }
}
abstract class A22{
    abstract public void cry();
}
