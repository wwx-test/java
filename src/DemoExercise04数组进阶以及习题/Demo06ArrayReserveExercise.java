package DemoExercise04数组进阶以及习题;
//打印一个数组，将其最后一个数和最前一个数进行交换

public class Demo06ArrayReserveExercise {
    public static void main(String[] args) {
        int[] array = new int[] {1,2,1,54,51,21,54,5,4,54,54,5,47,8,78,7,87,87,87,8};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("=============");
        for (int min = 0,max = array.length - 1 ; min < max ; min++,max--){
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }
        //再次输出数组
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("=============");
    }
}
