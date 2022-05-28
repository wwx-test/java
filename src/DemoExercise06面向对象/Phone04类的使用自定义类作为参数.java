package DemoExercise06面向对象;

public class Phone04类的使用自定义类作为参数 {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "Apple";
        one.price = 8388.0;     //double
        one.color = "土豪金";

        //为method这个方法里面传参，传的是 one“这部手机”。
        method(one);            //传递进去的其实就是地址值
    }
    //带有static的代表这是一个普通方法，不需要对象，直接就可以调用
    public static void method(Phone param){           //用自定义的一个类来作为参数
        System.out.println(param.brand);//苹果

        System.out.println(param.price);//8388.0
        System.out.println(param.color);//土豪金

    }
}
