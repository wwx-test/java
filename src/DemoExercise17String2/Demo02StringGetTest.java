package DemoExercise17String2;

public class Demo02StringGetTest {
    public static void main(String[] args) {
        //获取字符串的长度
        int num = "asdfasdfasfdasfdasfdasfd".length();
        System.out.println("字符串长度是：" + num);

        //拼接字符串
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println("===================");

        //获取指定索引位置的单个字符
        char ch = str3.charAt(1);
        System.out.println("获取的指定索引位置字符为：" + ch);
        System.out.println("===================");

        //查找参数字符串在查询的字符串当中出现的第一次索引位置
        int n = "hello".indexOf("llo");
        System.out.println("参数字符串出现的第一次索引位置是：" + n); //有返回字符串开始的索引位置
        int b = "hello".indexOf("abc");
        System.out.println("参数字符串出现的第一次索引位置是：" + b); //没有返回-1

    }
}
