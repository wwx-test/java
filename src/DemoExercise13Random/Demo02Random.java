package DemoExercise13Random;

import java.util.Random;

public class Demo02Random {
    public static void main(String[] args) {
        Random r = new Random();

        for (int i = 0; i < 100; i++) {
            //范围限制为十以内实际为0~9
            int num = r.nextInt(10);
            System.out.println(num);
        }
    }

}
