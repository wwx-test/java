package DemoExercise21Extends;

public class Fu {

    int numfu = 10;

    int num = 100;

    public void methodFu(){
        // 使用的本类当中的，不会向下找子类的
        System.out.println(num);
    }
}
