package com.oricle认识java以及方法入门;

public class Test03注意事项 {
    public static void main(String[] args) {
        int num1 = 20;
        System.out.println(num1);

        {
            int num2 = 30;
            System.out.println(num2);
        }
        int num2 = 50;
        System.out.println(num2);
    }
}
