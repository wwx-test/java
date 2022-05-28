package DemoExercise04数组进阶以及习题;

public class Demo03ArrayMax {
    public static void main(String[] args) {
        int[] array = new int[] {10,20,23,30,21,500000000};

        int max = array[0];  //比武擂台
        for (int i = 1; i < array.length; i++) {
            //如果当前元素，比max更大，那么就换人
            if (array[i] > max) {
                max = array[i];
            }
        }
        //谁最后最厉害 就能在max当中留下来
        System.out.println("最大值:" + max);
    }
}
