package DemoExercise09构造方法;

import DemoExercise07面向对象的三大特性以及Private的使用.Student;

public class Demo02Student对象 {
    public static void main(String[] args) {
        //不需要 对象名.XXX 来调用方法，new对象就是在调用构造方法
        Demo01Student stu1 = new Demo01Student();   // 无参构造
        System.out.println("=============");

        Demo01Student stu2 = new Demo01Student("赵丽颖",20);// 全参构造
        System.out.println("姓名：" + stu2.getName() + "，年龄：" + stu2.getAge());
        //如果需要改变对象当中的成员变量内容，仍然还需要使用setXxx方法
        stu2.setAge(21);//改变年龄
        System.out.println("姓名：" + stu2.getName() + "，年龄：" + stu2.getAge());

    }
}
