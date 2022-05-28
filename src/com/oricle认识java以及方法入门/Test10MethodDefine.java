package com.oricle认识java以及方法入门;

/*
/*方法其实就是若干语句的功能集合.

参数（原料）：就是进入方法的数据。
返回值（产出物）：就是从方法中出来的数据。

定义方法的完整格式：
修饰符 返回值类型 方法名称(参数类型 参数名称,....){
    方法体
    return 返回值;
}

修饰符：现阶段的固定写法,public static
返回值类型：也就是方法最终产生的数据结果是什么类型
方法名称：方法的名字，规则和变量一样，小驼峰
参数类型：进入方法的数据是什么类型
ps:参数如果有多个，使用都好进行分隔
方法体:方法需要做的事情，若干行代码
renturn:两个作用，1. 停止当前方法
                 2.将后面的结果数据返回值还给调用处
返回值：也就是方法执行后最终产生的数据结果

注意：return后面的“返回值”，必须和方法名称前面的“返回值类型”，保持对应。
*/

/*定义一个两个int数字相加的方法。三要素：
返回值类型：int
方法名称：sum
参数列表：int a , int b

方法的三种调用格式.
1.单独调用：方法名（参数）;
2.打印调用：System.out.println(参数名());
3.赋值调用:数据类型 变量名称 = 方法名称(参数);

注意： 以前学习的方法，返回值类型固定写为void，这种方法只能够单独调用，不能进行打印调用或者赋值调用
*/


public class Test10MethodDefine {
    public static void main(String[] args) {
        //单独调用
        sum0(20,40);
        System.out.println("===============");  //错误调用

        //打印调用
        System.out.println(sum1(10,20));
        System.out.println("===============");

        //赋值调用
        int number = sum2(20,50);
        number += 100;
        System.out.println("变量的值" + number);
        System.out.println("===============");
    }

    public static int sum0(int x,int y){
        int result0 = x + y;
        return result0;
    }

    public static int sum1(int a ,int b){
        int result1 = a + b;
        return result1;
    }

    public static int sum2(int c,int d){
        int result2 = c + d;
        return result2;
    }
}
