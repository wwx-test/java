package DemoExercise06面向对象;

public class Phone02类的使用Two {
    public static void main(String[] args) {
        Phone one = new Phone();        //1.创建 因为都在一个文件夹下 所以并不需要导包

        one.brand = "Apple";
        one.price = 9899.0;
        one.color = "远峰蓝";
        System.out.println(one.brand);  //Apple
        System.out.println(one.price);  //9899.0
        System.out.println(one.color);  //远峰蓝

        System.out.println("===========这是一条分割线==========");

        one.call("乔布斯");            //在原Phone中定义的who，在这里想给谁打电话就写谁的名字
        one.senMessage();


        System.out.println("===========这是一条分割线==========");
        Phone two = new Phone();

        two.brand = "三星";
        two.price = 5899.0;
        two.color = "黑色";
        System.out.println(two.brand);  //三星
        System.out.println(two.price);  //5899.0
        System.out.println(two.color);  //黑色

        System.out.println("===========这是一条分割线==========");

        two.call("欧巴");            //在原Phone中定义的who，在这里想给谁打电话就写谁的名字
        two.senMessage();
    }
}
