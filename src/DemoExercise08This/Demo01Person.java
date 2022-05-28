package DemoExercise08This;

public class Demo01Person {
    public static void main(String[] args) {
        Person person = new Person();
        //设置我自己的名字
        person.name = "王健林";        //给成员变量name传参（我自己的名字）
        person.sayHello("王思聪");     //优先使用了参数（也就是局部变量）

    }
}
