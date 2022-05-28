package DemoExercise07面向对象的三大特性以及Private的使用;

public class Demo04Student {
    public static void main(String[] args) {
        Student stu = new Student();

        stu.setName("鹿晗");
        stu.setAge(20);
        stu.setMale(true);

        System.out.println("姓名: " + stu.getName());
        System.out.println("年龄: " + stu.getAge());
        System.out.println("性别: " + stu.isMale());      //布尔类型特例，必须是isMale类型
    }
}
