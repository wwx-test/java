package DemoExercise06面向对象;

public class Phone01类的使用One {
    public static void main(String[] args) {
        //1.根据phone类创建一个名为one的对象
        //格式：类名 对象名 = new 类名称();
        Phone one = new Phone();

        //2.使用
        //格式：对象名.成员属性
        one.brand = "Apple";
        one.price = 9899.0;
        one.color = "远峰蓝";
        System.out.println(one.brand);  //Apple
        System.out.println(one.price);  //9899.0
        System.out.println(one.color);  //远峰蓝

        System.out.println("===========这是一条分割线==========");
        //格式：对象名.成员方法
        one.call("乔布斯");            //在原Phone中定义的who，在这里想给谁打电话就写谁的名字
        one.senMessage();
    }
}
