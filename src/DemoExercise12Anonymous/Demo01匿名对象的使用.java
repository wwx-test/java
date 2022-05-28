package DemoExercise12Anonymous;
/*
创建对象的标准名：
类名称 对象名 = new 类名称();

匿名对象就是只有右边的对象，没有左边的名字和赋值运算符。
new 类名称;

注意事项：匿名对象只能使用唯一的一次，下次再用不得不再创建一个新的对象。
使用建议：如果确定有一个对象只需要使用唯一的一次，那么就可以用匿名对象。
 */
public class Demo01匿名对象的使用 {
    public static void main(String[] args) {
        //左边的one就是对象的名字
        Person one = new Person();
         one.name = "高圆圆";
         one.showName(); //我叫高圆圆
        System.out.println("=============");

        //匿名对象
        new Person().name = "赵又廷";      //这个算是一个匿名对象
        new Person().showName(); //？      我叫：null   这算是第二个匿名对象

    }
}
