package DemoExercise16String;
/*
字符串常量池：程序当中直接写上的双引号字符串，就在字符串常量池种。

对于基本类型来说， ==是进行数值的比较。
对于引用类型来说， ==是进行【地址值】的比较。

1.对于引用类型来说，==进行的是地址的比较。
2.双引号直接写的字符串在常量池当中，new的不在池当中。
*/
public class Demo02Pool {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        char[] charArray = {'a','b','c'};
        String str3 = new String(charArray);

        System.out.println(str1 == str2);//true  地址是一样的
        System.out.println(str1 == str3);//false 地址是不一样的
        System.out.println(str2 == str3);//false

    }
}
