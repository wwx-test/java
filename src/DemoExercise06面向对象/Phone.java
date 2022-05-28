package DemoExercise06面向对象;
/*
定义一个类：用来模拟“手机事物”。

属性：品牌，价格，颜色
行为：打电话，发短信

对应到类当中：
成员变量（属性） ：
    String brand； //品牌
    double price； //价格
    String color； //颜色
成员方法（行为） ：
    public void call(String who){};     //打电话
    public void sendMessage(){};        //群发短信
 */
public class Phone {
    //成员变量
    String brand;
    double price;
    String color;

    public void call(String who){
        System.out.println("给" + who + "打电话");
    }

    public void senMessage(){
        System.out.println("群发短信");
    }
}
