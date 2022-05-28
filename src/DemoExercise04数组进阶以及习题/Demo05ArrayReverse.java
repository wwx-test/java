package DemoExercise04数组进阶以及习题;
/*
数组元素的反转：
本来的样子：[1,2,3,4,5]
之后的样子:[5,4,3,2,1]

1.通常遍历数组用的是一个索引：
int i = 0;
现在表示对称位置需要两个索引：
int min = 0;
int max = array.length - 1 ;

2.如何交换两个变量中的数值
  通过第三个变量进行倒手
  两个杯子都是满的，那么就需要第三个杯子来进行交换操作

3.什么时候应该交换     (1).min < max
  什么时候不应该交换   (1).min > max
                   (2).min == max
 */
public class Demo05ArrayReverse {
    public static void main(String[] args) {
        int[] array = new int[] {10,202,30,54,1,21,54,54,654,};
        //遍历数组本来的样子
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("====================");
        /*
        初始化语句：int min = 0,max = array.length - 1;
        条件判断：min < max
        步进表达式： min++ , max--
        循环体：用第三个变量倒手
         */
        for (int min = 0,max = array.length -1 ; min < max ; min++,max--){
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }

        //再次打印输出数组后来的样子
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("====================");
    }
}
