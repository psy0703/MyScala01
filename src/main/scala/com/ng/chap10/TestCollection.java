package com.ng.chap10;

import java.util.ArrayList;

public class TestCollection {
    public static void main(String[] args) {
        //不可变集合类似java的数组
        int[] nums = new int[3];
        nums[2] = 11; //?
        //nums[3] = 90; //越界

        String[] names = {"bj", "sh"};
        System.out.println(nums + " " + names);

        //可变集合举例
        ArrayList<String> al = new ArrayList<>();
        System.out.println("al1.hashCode = " + al.hashCode());

        al.add("zs"); //ArrayList 增加一次，底层地址变化
        System.out.println(al + " " + al.hashCode()); //地址
        al.add("zs2");
        System.out.println(al + " " + al.hashCode()); //地址
        al.add("zs3");
        System.out.println(al + " " + al.hashCode()); //地址
/*
[I@29453f44 [Ljava.lang.String;@5cad8086
al1.hashCode = 1
[zs] 3928
[zs, zs2] 242625
[zs, zs2, zs3] 7642233
 */
    }
}

