package DemoExercise05数组作为函数和返回值;
/*
一个方法可以有0,1,多个参数；但是只能有0或者1个返回值，不能有多个返回值。
如果希望一个方法当中产生了多个结果数据进行返回，怎么办？
解决方案：使用一个数组作为返回值即可.
 */
public class Demo03ArrayReturn {
    public static void main(String[] args) {
        int[] result = calculate(10,20,30);
        System.out.println("总和：" + result[0]);
        System.out.println("平均数：" + result[1]);     //打印调用
    }
    public static   int[]  calculate (int a , int b , int c){          //返回值类型为int的数组
        int sum = a + b + c;
        int avg = sum / 3;
        //两个结果都希望返回
        //需要一个数组，也就是一个塑料兜,数组可以保存多个结果
        

/*        int[] array = new int[2];    //动态初始化为三个
        array[0] = sum;
        array[1] = avg;*/

        int[] array = {sum,avg};

        return array;           //一个塑料兜将两个数据全部装起来了
    }
}
