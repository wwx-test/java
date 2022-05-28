package DemoExercise13Random;

import java.util.Random;

/*
Random类用来生成随机数字。使用起来也是三个步骤：

1.导包
import java.util.Random;

2.创建
Random r = Random();    //小括号当中留空即可,如果留空就是整个int范围，正负21亿

3.使用
获取一个随机的int数字（范围是int所有范围，有正负的两种）：int num = r.nextInt();
获取一个随机的int数字（参数代表了范围，左闭右开取键）：int num = r.nextInt(3);
实际上代表的含义是：[0,3)，也就是0~2  左包含又不包含。
 */
public class Demo01Random {

    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt();
        System.out.println("随机数字是：" + num);
    }
}
