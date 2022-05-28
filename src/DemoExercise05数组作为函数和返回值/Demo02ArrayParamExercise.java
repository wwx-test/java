package DemoExercise05数组作为函数和返回值;

public class Demo02ArrayParamExercise {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50,60};
        //调用
        printArray(array);          //将以上定义的数组的地址值 传参过去
        System.out.println("====================");
        printArray(array);
        System.out.println("====================");
        printArray(array);          //这样既可实现多次调用，而for循环只需要写一次
        System.out.println("====================");
    }
    public static  void printArray(int[] array){           //任何数据类型都可以作为方法的参数 定义一个名为array的int类型数组接收参数
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
