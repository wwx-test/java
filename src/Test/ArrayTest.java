package Test;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        String str = "asdfasdfajsdf";
        char[] chars = str.toCharArray();
        Arrays.sort(chars); //正序排列

        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print (chars[i]);
        }
    }
}
