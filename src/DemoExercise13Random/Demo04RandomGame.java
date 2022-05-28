package DemoExercise13Random;

import java.util.Random;
import java.util.Scanner;

/*
题目:
用代码模拟猜数字小游戏。

思路：
1.首先需要产生一个数字，并且一旦产生不再变化,用Random的nextInt方法
2.需要键盘输入，所以用到了Scanner
3.获取键盘输入的数字，用Scanner当中的nextInt方法
4.已经得到了两个数字，判断一下（if）一下：
    如果太大了，提示太大，并且重试；
    如果太小了，提示太小，并且重试；
    如果猜中了，游戏结束。
5.重试就是再来一次，循环，while(true) break;
 */
public class Demo04RandomGame {
    public static void main(String[] args) {
        Random r = new Random();
        //num为系统生成的正确答案 范围为1~100
        int num = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("==============游戏开始==============");
        while(true) {
            System.out.print("请输入一个数字：");
            int temp = sc.nextInt();
            if (temp == 520) {
                System.out.println("作弊码生效，你赢了");    //作弊码
                break;      //如果生效，跳出
            }else if (temp < num){
                System.out.println("你输入的数字太小了");
            }else if(temp > num){
                System.out.println("你输入的数字太大了");
            } else {
                System.out.println("输入正确！！你猜中了");
                break;      //如果猜中，不再重试
            }
        }
        System.out.println("==============游戏结束==============");
//        拓展：
//        如果只给你十次机会，如果猜不中就没有了，那么就要使用for循环语句
    }
}
