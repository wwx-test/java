package DemoExercise04数组进阶以及习题;

public class Demo04ArrayMin {
    public static void main(String[] args) {
        int[] array = new int[] {10,20,30,50,60,70,1};

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println("最小值：" + min);
    }
}
