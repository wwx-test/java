package com.oricle认识java以及方法入门;

public class Test02变量 {
    public static void main(String[] args) {
        char zifu =  '1';
        System.out.println(zifu);

        zifu = '中';                 //改变zifu中的存储的字符，但是注意 java允许在char中存储一个中文
        System.out.println(zifu);

        boolean var1 = true;
        System.out.println(var1);

        boolean var2 = false;
        System.out.println(var2);

        var1 = var2;                 //var1中已经存储了var中的false值，var2向左交给var1存储
        System.out.println(var1);   //false
    }
}
