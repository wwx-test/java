//byte short char 在运算时都会被暂时提升成为int
package com.oricle认识java以及方法入门;

public class Test08三种类型向上提升 {
    public static void main(String[] args) {
        short num1 = 10;            //正确写法，右侧没有超过左侧的值

        short a = 5;
        short b = 10;
        //short + short --> int + int --> int 那么左侧一定得是一个int才行
        /*short result = a + b;*/    //报错

        //第二种方式
        short result = 5 + 10;
        System.out.println(result);  //15


    }

}
