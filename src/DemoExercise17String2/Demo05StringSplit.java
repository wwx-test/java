package DemoExercise17String2;
/*
分割字符串的方法：
public Static[] split(String regex)：按照参数的规则，将字符串切分成为若干部分。

注意事项：
split方法的参数其实是一个“正则表达式”，今后学习。
今天要注意，如果按照英文句点“.”进行切分，必须写"\\."（两个反斜杠）。
 */
public class Demo05StringSplit {
    public static void main(String[] args) {
        String list = "aaa,bbb,ccc";
        String[] array1 = list.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("================");

        String str2 = "aaa bbb ccc";
        String[] array2 = str2.split(" ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        System.out.println("================");

        //分割失败，所以循环一次都没有执行
        String str3 = "XXX.YYY.ZZZ";            //因为 "." 单独出现在正则表达式的时候有特殊含义
        String[] array3 = str3.split(".");
        System.out.println(array3.length);      //数组长度为 0
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }

        //写成 "\\." 就可以分割成功了，转义字符
        String str4 = "XXX.YYY.AAA";
        String[] array4 = str4.split("\\.");
        System.out.println(array4.length);
        for (int i = 0; i < array4.length; i++) {
            System.out.println(array4[i]);
        }
    }
}
