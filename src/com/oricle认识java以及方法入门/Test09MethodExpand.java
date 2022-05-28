package com.oricle认识java以及方法入门;

public class Test09MethodExpand {

    public static void main(String[] args) {
        xunhuan();
    }
    public static void xunhuan(){               //基础入门的定义格式
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 20; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
