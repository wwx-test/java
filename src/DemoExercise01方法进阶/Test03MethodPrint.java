package DemoExercise01方法进阶;
/*
题目要求：
定义一个方法，用来打印指定次数的helloworld
*/
public class Test03MethodPrint {
    public static void main(String[] args) {
        printCount(100);
    }
    /*三要素
        因为是指定次数的输出，所以没有任何结果返回 void
        printCount
        因为指定次数，所以我不知道多少次 ，定义一个int number 来接受这个值
        涉及到多次 所以用for循环 次数小于number
    */
    public static void printCount(int number){
        for (int i = 0; i < number; i++) {
            System.out.println("Hello,World" + (i + 1));
        }
    }

}
