package DemoExercise07面向对象的三大特性以及Private的使用;
/*
问题描述：我们定义Person的年龄的时候，我们无法阻止不合理的数值被设置进来
解决方式：用private关键字将需要保护的成员变量进行修饰

一旦使用private进行修饰，那么本类当中仍然可以随意访问。
但是！超出本类范围之外就不能再直接访问了。

间接访问private成员变量，就是定义一堆Getter/Setter方法

必须交setXxx或者是getXxx命名规则：
对于Getter来说，不能有参数，返回值类型和成员变量对应。
对于Setter来说，不能有返回值，参数类型和成员变量对应。
 */
public class Person {
    String name;
    private int age;

    public void show(){
        System.out.println("我的名字叫做:"+name +",我的年龄"+age);
    }

    //这个成员方法，专门用于向age设置数据
    public void setAge(int num){
        if (num < 100 && num >= 0) {         //如果是合理情况
            age = num;
        }else{
            System.out.println("数据不合理！");
        }
    }

    //这个成员方法，专门用于获取age的数据
    public int getAge(){
        return age;
    }
}
