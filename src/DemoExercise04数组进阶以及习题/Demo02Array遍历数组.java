package DemoExercise04数组进阶以及习题;
/*
遍历数组：说的就是对数组当中每一个元素进行逐一，挨个处理。默认处理方式就是打印输出
 */
public class Demo02Array遍历数组 {
    public static void main(String[] args) {
        //首先使用原始方法
        int[] array = {10,20,30,40,50};
        System.out.println(array[0]);//10
        System.out.println(array[1]);//20
        System.out.println(array[2]);//30
        System.out.println(array[3]);//40
        System.out.println(array[4]);//50
        System.out.println("=============");

        //使用循环，次数其实就是数组的长度。
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);

        }
        System.out.println("=============");
//        int len = array.length;  长度
        for (int i = 0; i < array.length; i++) {        //array.fori
            System.out.println(array[i]);
        }
    }
}
