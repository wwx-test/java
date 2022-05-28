package DemoExercise07面向对象的三大特性以及Private的使用;

public class Demo练习 {
    public static void main(String[] args) {
        //创建
        练习 lx = new 练习();
        lx.setName("方鑫");
        lx.setAge(21);
        lx.setMale(false);

        System.out.println("我的室友名字是：" + lx.getName());
        System.out.println("我的室友年龄是：" + lx.getAge());
        System.out.println("我的室友是不是男的：" + lx.isMale());
    }


}
