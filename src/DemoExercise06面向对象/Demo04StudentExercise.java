package DemoExercise06面向对象;

public class Demo04StudentExercise {
    public static void main(String[] args) {
        //1.导包:import 包名.类名;
        //因为要导入的类和现在的类在一个文件夹中，所以不需要导包

        //2.创建
        Demo03StudentTest stu = new Demo03StudentTest();

        //3.使用
        //成员属性，格式：      //必须写在main当中
        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println("==========");
        stu.name = "猪猪侠";
        stu.age = 3;
        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println("==========");

        stu.eat();
        stu.drink();
        stu.sleep();
        stu.study();
    }
}
