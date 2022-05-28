package DemoExercise06面向对象;

public class Phone05类的使用Return {
    public static void main(String[] args) {
        Phone two = getPhone();         //类名 + 对象名
        System.out.println(two.brand);  //苹果
        System.out.println(two.price);  //8399.0
        System.out.println(two.color);  //土豪金
    }

    //这是一个有返回值类型 但是返回值类型是一个类： Phone
    public static Phone getPhone(){
        Phone one = new Phone();
        one.brand = "苹果";
        one.price = 8399.0;
        one.color = "土豪金";
        return one;         //将one的地址值返回给了调用它的地方
    }
}
