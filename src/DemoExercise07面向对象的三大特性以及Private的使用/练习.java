package DemoExercise07面向对象的三大特性以及Private的使用;

public class 练习 {
    String name;
    int age;
    boolean male;

    public void setName(String str){
        name = str;
}

    public String getName(){
        return name;
    }

    public void setAge(int num){
        age = num;
    }

    public int getAge(){
        return age;
    }

    public void setMale(boolean b){
        male = b;
    }

    public boolean isMale(){
        return male;
    }
}
