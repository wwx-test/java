package DemoExercise05数组作为函数和返回值;
/*
一个方法可以有多个参数，但是返回值只能是没有或者一个，那么有没有一个方法可以获得多个返回值呢

解决方式：使用一个数组类型作为返回值,再用一个result数组来接受calculate的结果。打印输出result里存储的数据
 */
public class Demo04ArrayReturnExercise {
    public static void main(String[] args) {
        int[] result = calculate(10,20,30);   //用一个int类型名为result的数组接收
        System.out.println(result[0]);
        System.out.println(result[1]);                  //分别打印调用
    }
    public static int[] calculate(int a,int b,int c){
        int sum = a + b + c;
        int avg = sum / 3;
        int array2[] = {sum,avg};            //定义一个静态初始化的数组来存储sum和avg这两个变量，
        return array2;                            //返回这个数组。
    }
}
