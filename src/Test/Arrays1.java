package Test;


import java.util.Arrays;
import java.util.Random;

public class Arrays1 {
    public static void main(String[] args) {
        //把数组按照固定格式转换成字符串
        int[] array = {1,2,3,4,5,6,7,11,9,10,12};
        String str = Arrays.toString(array);
        System.out.println(str);        //转换成字符串输出

        Arrays.sort(array);     // 对array当中的元素进行排序
        String str1 = Arrays.toString(array);   //对经过排序的array转换成字符串输出
        System.out.println(str1);   // [1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 12]

        String[] array5 = {"aaa","ccc","bbb"};
        Arrays.sort(array5);
        String st3 = Arrays.toString(array5);
        System.out.println(st3);


    }

}
