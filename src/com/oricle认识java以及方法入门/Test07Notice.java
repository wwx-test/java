/*对于byte/short/char三种类型来说，如果右侧赋值的数值没有超过范围，
那么javac编译器会自动隐含地为我们补上一个byte()short()char()

1.如果没有超过左侧的范围，编译器补上强制转换。
2.如果右侧超过左侧，那么编译器直接报错*/
package com.oricle认识java以及方法入门;

public class Test07Notice {
    public static void main(String[] args) {
        //右侧确实是一个int数字，但是没有超过左侧范围，就是正确的。
        //int-->byte，不是自动类型转换
        byte num1 =/* (byte) */ 30;    //右侧没有超过左侧的范围
        System.out.println(num1);
        /*byte num2 = 128;             byte取值范围为 -128~127  故报错*/

        char zifu1 =/*(char)*/ 65;      //右侧赋值没有超过左侧范围，编译器自动转换
        System.out.println(zifu1);
    }
}
