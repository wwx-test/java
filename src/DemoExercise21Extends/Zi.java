package DemoExercise21Extends;

public class Zi extends Fu{
    int numzi = 20;

    int num = 200;

    public void methodZi(){
        // 因为本类当中有num，所以这里用的是本类的num
        System.out.println(num);
    }
}
