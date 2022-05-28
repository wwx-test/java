package DemoExercise14ArrayList;

public class Person {
    private String name;
    private int age;

    public Person() {       //无参构造
    }

    public Person(String name, int age) {
        this.name = name;  //全参构造
        this.age = age;
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
