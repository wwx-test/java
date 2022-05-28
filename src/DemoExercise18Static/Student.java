package DemoExercise18Static;

public class Student {
    private int id;  //学号
    private String name;//姓名
    private int age;//年龄
    static String room; // 所在教室
    private static int idCounter = 0;   //学号计数器，每当new了一个新对象的时候，计数器++

    public Student() {
        this.id = ++idCounter;  //意思就是把++的值给了id然后被调用 this的意义就是指这个id是成员变量
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCounter;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
