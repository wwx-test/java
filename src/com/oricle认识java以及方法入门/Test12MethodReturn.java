package com.oricle认识java以及方法入门;
/*题目要求定义一个方法，用来[求出]两个数字之和 (你帮我算 算完之后告诉我)  代表有返回值的方法
题目变形：定义一个方法，用来[打印]两个数字之和(你来计算，结果直接打印)
*/


public class Test12MethodReturn {
    public static void main(String[] args) {
    //我是main方法，我来调用你
    //我调用你，你来帮我计算一下，算完之后，把结果告诉我的num变量
        int num = sum(10,20);                   //赋值调用
        System.out.println("结果是:" + num);
        /*System.out.println(sum(10,20));             //打印调用*/

        sum1(100,200);                          //没有返回值时的单独调用

    }
    //我是一个方法，我负责两个数字的相加。
    //我有返回值int，谁调用我，我就把结果告诉谁
    public static int sum(int a,int b){
       int result = a + b;
       return result;
    }

    //我是一个方法，我负责两个数字相加。
    //我没有返回值，不需要把结果告诉谁，我自己进行打印输出
    public  static  void sum1(int a,int b){
        int result1 = a + b;
        System.out.println("结果是：" + result1);
    }
}
