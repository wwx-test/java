package DemoExercise06面向对象;
/*
定义一个类，用来模拟“学生”事物，其中就有两个组成部分：

属性（是什么）：
        姓名
        年龄
行为（能做什么）：
        吃饭
        睡觉
        学习

对应到java的类当中：
成员变量（属性）：
    数据类型 变量名称（姓名）   -->    string name     //姓名
    数据类型 变量名称（年龄）   -->    int age         //年龄

成员方法（行为）：
//    public static void eat()  普通方法是带有static的 但是成员方法是没有static的。
      public void eat(){}     //才是正确的写法的 吃 方法
      public void sleep(){}   //睡觉
      public void study(){}   //学习

注意事项：
1.成员变量是直接定义在类当中的，在方法外边 ，此前的那些都是在方法里面写的（方法外，类当中）。
2.成员方法不要写static关键字。
 */
public class Demo01Student {
    //成员变量
    String name;    //姓名            之前的变量都是局部变量 是直接写在方法里的，这个变量是成员变量，是直接写在类当中的
    int age;        //年龄

    //成员方法
    public void eat(){
        System.out.println("吃饭！");
    }

    public void sleep(){
        System.out.println("睡觉!");
    }

    public void study(){
        System.out.println("学习！");
    }
}
