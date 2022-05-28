package DemoExercise17String2;
import java.util.Scanner;

/*
题目：
键盘输入一个字符串，并且统计其中各种字符出现的次数。
种类有：大写字母、小写字母、数字、其他

思路：
1. 既然用到键盘输入，肯定是Scanner
2. 键盘输入的是字符串，那么，String str = sc.next(); 拿到一个字符串
3. 定义四个变量分别代表四种字符各自的出现次数。
4. 需要对字符串一个字、一个字检查，String --> char[]，方法是toCharArray()
5. 遍历char[]字符数组，对于当前字符的种类进行判断。
6. 打印输出四个变量，分别代表四种字符出现次数。
 */
public class Demo07StringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String input = sc.next();
        //将一个完整的字符串切分装进一个char类型的数组当中
        char[] chars = input.toCharArray();
        int countUpper = 0;     //大写
        int countLower = 0;     //小写
        int countNumber = 0;    //数字
        int countOther = 0;     //其他
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if ('A' <= ch && 'Z' >= ch){        //字符在char中会换算成Ascll码来进行运算
                countUpper++;
            }else if ('a' <= ch && 'z' >= ch){
                countLower++;
            }else if ('0' <= ch && '9' >= ch){
                countNumber++;
            }else{
                countOther++;
            }
        }
        System.out.println("大写字符有：" + countUpper);
        System.out.println("小写字符有：" + countLower);
        System.out.println("数字字符有：" + countNumber);
        System.out.println("其他字符有：" + countOther);


    }
}
