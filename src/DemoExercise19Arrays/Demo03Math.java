package DemoExercise19Arrays;

import java.util.Date;

/*
java.util.Math类是数学相关的工具类，里面提供了大量的静态方法，完成与数学相关的操作

public static double abs(double num){}：获取绝对值。有多种重载。
public static double ceil(double num){}: 向上取整。
public static double floor(double num){}：向下取整。
public static long round(double num){}：四舍五入。

Math.PI代表近似的圆周率常量 (double)。
 */
public class Demo03Math {
    public static void main(String[] args) {
        // 获取绝对值
        System.out.println(Math.abs(3.14)); // 3.14 含有多种重载形式，输入多少就是多少
        System.out.println(Math.abs(0));    // 0
        System.out.println(Math.abs(-2.5)); // 2.5
        System.out.println("==================");

        // 向上取整
        System.out.println(Math.ceil(79.1));  //80.0
        System.out.println(Math.ceil(79.9));  //80.0
        System.out.println(Math.ceil(79));  //小数位没有任何东西向上取整，所以为：79.0
        System.out.println("==================");

        // 向下取整，抹零
        System.out.println(Math.floor(30.1));   // 30.0
        System.out.println(Math.floor(30.9));   // 30.0
        System.out.println(Math.floor(31));     // 31.0
        System.out.println("==================");

        // 四舍五入，不带小数点的
        System.out.println(Math.round(20.1)); // 20
        System.out.println(Math.round(20.5)); // 21

        System.out.println(Math.pow(10,20));


    }
}
