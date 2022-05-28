package DemoExercise19Arrays;
/*
题目：
计算在 -10.8到5.9之间，绝对值大于6或者小于2.1 的整数有多少个？

分析：
1. 既然已经确认了范围，for循环
2. 起点位置-10.8应该转换成为-10，两种方法：
    2.1 可以使用Math.ceil方法，向上（向方向）取整
    2.2 强制类型转换为int，自动舍弃所有小数位
3. 每一个数字都是整数，所以步进表达式应该是num++，这样每次都是+1的
4. 如何拿到绝对值: Math.abs方法
5. 一旦返现了一个数字，需要让计数器++进行统计

备注：
 */
public class Demo04MathPractise {
    public static void main(String[] args) {
        int count = 0;
        double min = -10.8;
        double max = 5.9;
        //这样处理，变量i就是区间之内所有的整数
        for (double i = Math.ceil(min); i < max; i++){       //在这个区间当中大于min和小于max的数字
            double abs = Math.abs(i);  //绝对值
            if (abs > 6 || abs < 2.1){          //使用短路方法来获取指定的负数位或者正数位
                System.out.println(i);
                count++;
            }
        }
        System.out.println("数字一共有："+count + "个");
    }
}
