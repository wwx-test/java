package DemoExercise10标准类;
/*
一个标准的类通常要拥有下面四个组成部分：

1.所有的成员变量都要使用private关键字修饰
2.为每一个成员变量编写一堆Getter/Setter方法
3.编写一个无参数的构造方法
4.编写一个有参数的构造方法

这样标准的类也叫做Java Bean
 */
public class Student {

    private String name;//姓名
    private int age;//年龄

    public Student() {          // alt + shift + insert 选择none自动生成了无参数的构造方法
    }

    public Student(String name, int age) {      //全参数的构造方法
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
