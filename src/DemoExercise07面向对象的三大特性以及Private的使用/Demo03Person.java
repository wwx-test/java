package DemoExercise07面向对象的三大特性以及Private的使用;



public class Demo03Person {
    //1.导包 因为在一个文件夹中，两个文件之间不需要导包， import 包名.类名

    public static void main(String[] args) {
        //2.创建 类名 对象名 = new 类名();
        //3.使用 用谁点谁
        Person person = new Person();
        person.show();

        person.name = "放心";
//        person.age = -20;    //直接访问private内容，错误写法
        person.setAge(18);
        person.show();
    }
}

