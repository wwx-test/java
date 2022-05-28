package DemoExercise19Arrays;

import java.util.Arrays;

/*
java.util.Arrays是一个与数组相关的工具类，里面提供了大量静态方法，用来实现数组常见的操作。

public static String toString(数组)：将参数数组变成字符串 （按照默认格式：[元素1，元素2，元素3...]）

public static void sort(数组)：按照默认升序（从小到大）对数组元素进行排序。

备注：
1. 如果是数值，sort默认按照升序从小到大。
2. 如果是字符串，sort默认按照字母升序。
3. 如果式自定义的类型，那么这个自定义的类需要有Comparable或者Comparator接口支持。（今后学习）
 */
public class Demo01Arrays {
    public static void main(String[] args) {
        int[] intArray = {10,20,30,40,50,60};
        // 将int[]数组按照默认格式变成字符串
        String intStr = Arrays.toString(intArray);
        System.out.println(intStr);

        int[] array1 = {1,5,4,2,5,10,7,8,9};
        Arrays.sort(array1);            // 升序对数组元素进行排序
        for (int i = 0; i < array1.length; i++) {       //遍历输出数组内容太麻烦
            System.out.println(array1[i]);
        }
        //通过将数组转换成字符串的形式，输出字符串
        String st = Arrays.toString(array1);
        System.out.println(st);         // [1, 2, 4, 5, 5, 7, 8, 9, 10]

        //甚至连字符串都可以按照升序排序
        String[] array2 = {"bbb","aaa","ccc"};
        Arrays.sort(array2);
        String str1 = Arrays.toString(array2);
        System.out.println(str1);       // [aaa, bbb, ccc]
    }


}
