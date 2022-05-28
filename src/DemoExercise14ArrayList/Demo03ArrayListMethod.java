package DemoExercise14ArrayList;

import java.util.ArrayList;

/*
ArrayList当中常用的方法有:

public boolean add(E e):向集合当中添加元素，参数类型和泛型一致。返回值代表添加是否成功
备注：对于ArrayList集合来说，add添加的动作一定是成功的，所以返回值可用可不用。
但是对于其他集合（今后学习）来说，add添加动作不一定成功

public E get(int index):从集合当中获取元素，参数是索引编号，返回值就是对应位置的元素。

public E remove(int index):从集合当中删除元素，参数是索引编号，返回值就是被删除掉的元素。

public int size():获取集合的尺寸长度，返回值是集合当中包含的元素个数。
 */
public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(); //左边大写E，右边小写e,表示类型相同
        System.out.println(list);

        //向集合中添加元素：add
        boolean success = list.add("柳岩");
        System.out.println(list);
        System.out.println("添加的动作是否成功：" + success); //true

        list.add("高圆圆");
        list.add("赵又廷");
        list.add("李小璐");
        list.add("贾乃亮");
        System.out.println(list);// [柳岩, 高圆圆, 赵又廷, 李小璐, 贾乃亮]

        //从集合中获取元素：get。索引值从0开始
        String name = list.get(2);        //赵又廷
        System.out.println("第2号索引位置：" + name);

//        从集合中删除元素：remove。索引值从0开始。
        String whoRemoved = list.remove(3);//第二种方式，通过数组下标索引来删除
        System.out.println("被删除的人是：" + whoRemoved);  //被删除的人是：李小璐
        System.out.println(list);           // [柳岩, 高圆圆, 赵又廷, 贾乃亮]

        //获取集合的长度尺寸。也就是其中元素的个数
        int size = list.size();
        System.out.println("集合的长度是：" + size);   //集合的长度是：4
    }
}
