package DemoExercise07面向对象的三大特性以及Private的使用;
/*
面向对象三大特征：封装，继承，多态

封装性在java当中的体现：
1.方法就是一种封装
2.关键字private也是一种封装

封装就是将一些细节隐藏起来，对于外界不可见，达到省心的目的。
 */
public class Demo02Method {
    public static void main(String[] args) {
        int[] array = {5,10,15,20,100};
        //main并不关心计算，它只需要调用method这个方法就行了
        int max = getMax(array);          //赋值调用
        System.out.println("最大值是：" + max);
    }
    public static int getMax(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
}
