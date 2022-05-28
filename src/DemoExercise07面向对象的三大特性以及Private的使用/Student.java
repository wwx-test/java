package DemoExercise07面向对象的三大特性以及Private的使用;
/*
对于基本类型当中的Boolean值，Getter方式一定要写成isXxx的形式，而setXxx规则不变
 */
public class Student {
    private String name;//姓名
    private int age;//年龄
    private boolean male;//是不是爷们儿

    public void setMale(boolean b ){
        male = b;
    }

    public boolean isMale(){
        return male;
    }

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
}
