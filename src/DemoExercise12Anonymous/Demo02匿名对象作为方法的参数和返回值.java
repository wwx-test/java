package DemoExercise12Anonymous;
import java.util.Scanner;

public class Demo02匿名对象作为方法的参数和返回值 {
    public static void main(String[] args) {
        //普通使用方式
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        System.out.println("输入的是：" + num);

        //匿名对象的方式
//        int num = new Scanner(System.in).nextInt(); //这种方式得确保这个匿名对象只使用一次
//         System.out.println("输入的是：" + num);
//    }

        //使用一般写法传入参数
//        Scanner sc = new Scanner(System.in);
//        methodParam(sc);

        //使用匿名对象来作为方法的参数，进行传参
//        methodParam(new Scanner(System.in));       //传递的参数是一个从键盘上键入的值

        //调用了一个methodReturn方法就能把方法内部new出来的Scanner作为返回值交给sc，然后赋值给num进行打印
        Scanner sc = methodReturn();
        int num = sc.nextInt();     //获取键盘输入的数字
        System.out.println("输入的数字是：" + num);
    }
    public static void methodParam(Scanner sc){
        int num = sc.nextInt();
        System.out.println("输入的是：" + num);
    }

    public static Scanner methodReturn(){
//        Scanner sc = new Scanner(System.in);
//        return sc;
        return new Scanner(System.in);      //键盘输入数字
    }
}


//总结：用匿名对象作为方法的参数和返回值都是可以的