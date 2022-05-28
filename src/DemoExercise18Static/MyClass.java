package DemoExercise18Static;

public class MyClass {

    int num;// 成员变量
    static int numStatic;// 静态变量

    // 成员方法
    public void method(){
        System.out.println("这是一个成员方法");
        // 成员方法可以访问成员变量
        System.out.println(num);

        // 成员方法可以访问静态变量
        System.out.println(numStatic);
    }

    // 静态方法
    public static void methodStatic(){
        System.out.println("这是一个静态方法");
        // 静态方法可以访问静态变量
        System.out.println(numStatic);
        // 静态不能直接访问非静态【重点】
//        System.out.println(num); //错误写法！

//        静态变量直接通过类名来调用，没有对象，this是指向当前对象的，所以错误
//        System.out.println(this); //错误写法！
    }
}


