package DemoExercise19Arrays;

import java.util.Arrays;

public class Demo02ArraysPractise {

    public static void main(String[] args) {
        String str = "asdfasdfasdfasdfwqerashgasdfasdfab";

        // 如何进行升序排序：sort
        // 必须得是一个数组，才能用Arrays.sort方法
        // String --> 数组，用toCharArray
        char[] chars = str.toCharArray();
        Arrays.sort(chars);     // 对字符数组进行升序排列
        String str1 = Arrays.toString(chars);
        System.out.println(str1);       // 正序输出

        // 需要倒序遍历
        for (int i = chars.length - 1; i >= 0; i--) {       //chars.forr  r = reverse  表示逆序的意思
            System.out.print(chars[i]);
        }
    }
}
