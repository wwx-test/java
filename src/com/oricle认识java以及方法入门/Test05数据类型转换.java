package com.oricle认识java以及方法入门;

public class Test05数据类型转换 {
    public static void main(String[] args) {
        System.out.println(1024); //这是一个整数，默认为int类型。
        System.out.println(3.14);//这是一个浮点数，默认为double类型。

        //程序左边是long类型，右边却默认为int类型，左右不一样。
        long num1 = 100;        //100后加大写L
        System.out.println(num1);       //100
    }
}
