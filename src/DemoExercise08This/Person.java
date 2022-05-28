package DemoExercise08This;
/*
当方法的局部变量和类的成员变量重名的时候，根据“就近原则”，优先使用局部变量
如果需要访问本类当中的成员变量，需要使用格式：
this.成员变量名

//通过谁调用方法，this就指向谁。
 */
public class Person {
    String name; //我自己的名字       成员变量

    //参数who是对方的名字
    //成员变量name是自己的名字
    public void sayHello(String who){
        //this.name可以理解为Person.name，Person其中的成员变量为name所以this指向了Person
        System.out.println(who + "，你好。我是 " +this.name); //this是指向成员变量的。

    }
}
