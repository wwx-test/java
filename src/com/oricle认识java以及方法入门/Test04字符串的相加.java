package com.oricle认识java以及方法入门;
/*
1:对于字符char来说，在计算之前char会成为int类型，然后再计算
char字符和int类型数字对应的是Ascll表
2.对于字符String来说，加号代表字符串互相连接操作。任何数据类型和字符串进行连接的时候，结果都是字符串
 */
public class Test04字符串的相加 {
    public static void main(String[] args) {
        String str1 = "Hello";
        System.out.println(str1 + "world");   //这个world为字符串所以必须得用双引号括起来 str1为变量 所以不需要双引号
        String str2 = "java";
        System.out.println(str2+20);          //这个20为常量，在String中，任何数据类型与字符串进行连接时候，都是字符串，所以20为字符串类型

    }
}
