package DemoExercise15ArrayListTest;

import java.util.ArrayList;

/*
题目：自定义4个学生对象，添加到集合，并遍历。

思路：
1. 自定义Student学生类，四个部分。
2. 创建一个集合，用来创建学生对象。泛型： <student>
3. 根据类，创建四个学生对象。
4. 将4个学生对象添加到集合当中：add
5. 遍历集合：for，size，get
 */
public class Demo02ArrayListStudent泛型 {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student one = new Student("洪七公",50);
        Student two = new Student("黄药师",62);
        Student three = new Student("欧阳锋",60);
        Student four = new Student("小龙女",20);

        list.add(one);      //0
        list.add(two);      //1
        list.add(three);    //2
        list.add(four);     //3

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);      //0,1,2,3依次修改stu对象中的地址
            System.out.println("姓名：" + stu.getName() + "，年龄：" + stu.getAge());

        }
    }
}
