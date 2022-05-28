package DemoExercise02方法重载;
//方法重载
/*
对于功能类似的方法来说，因为参数不一样，却需要记住那么多不同的方法名称，太麻烦。
方法的重载（overload）：多个方法的名称一样，但是参数不一样。
好处：只需要记住唯一一个方法名称，就可以实现类似的功能。

方法重载与下列因素相关：
1.参数个数不同（2个参数，3个参数，4个参数）
2.参数类型不同
3.参数的多类型顺序不同

方法重载与下列因素无关：
1.与参数的名称无关
2.与方法的返回值类型无关
*/
public class Demo01Overload {
    public static void main(String[] args) {
        /*System.out.println(sumTwo(10,20));//30
        System.out.println(sumThree(10,20,30));//60
        System.out.println(sumFour(10,20,30 ,40));//100*/
        System.out.println(sum(10,20));//两个参数的方法
        System.out.println(sum(20.0,10.0));//两个参数double方法
        System.out.println(sum(10,20,30));//三个参数的方法
        System.out.println(sum(10,20,30,40));//四个参数的方法
//        System.out.println(sum(10,20,30,40,50));//找不到任何方法来匹配，所以错误！
    }
    public static int sum(int a,double b){  //参数是先int 后double
        return (int) (a + b);               //3.正确表达
    }

    public static int sum(double a,int b){  //参数是先int 后double
        return (int) (a + b);               //3.正确表达
    }

    public static int sum(int a,int b){
        System.out.println("有2个参数的方法执行！");
        return a + b;
    }

    /*public static double sum (int a,int b){
        return a + b + 0.0;                         //与返回值类型无关
    }*/

    public static int sum(double a,double b){           //double + double = double 所以返回值为double，但是定义为int
        return (int) (a + b);                   //进行强制类型转换，为int            这是一种有效的重载
    }

    public static int sum(int a,int b,int c ){
        System.out.println("有3个参数的方法执行！");
        return a + b + c;
    }
    public static int sum(int a,int b,int c,int d){
        System.out.println("有4个参数的方法执行！");
        return a + b + c + d;
    }
}
