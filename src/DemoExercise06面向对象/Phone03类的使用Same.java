package DemoExercise06面向对象;
//总结：两个对象的（名称）引用名指向了同一个对象空间。
public class Phone03类的使用Same {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "Apple";
        one.price = 9899.0;
        one.color = "远峰蓝";
        System.out.println(one.brand);  //Apple
        System.out.println(one.price);  //9899.0
        System.out.println(one.color);  //远峰蓝

        System.out.println("===========这是一条分割线==========");

        one.call("乔布斯");      //在原Phone中定义的who，在这里想给谁打电话就写谁的名字
        one.senMessage();

        System.out.println("===========这是一条分割线==========");

        //将one当中保存的地址值赋值给two
        Phone two = one;          //two当中不再是新的值了，是one使用过后剩下来的。
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
