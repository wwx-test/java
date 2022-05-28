package Test;
//普通顾客100 打九折
//会员打八折 （满200 7.5折）
import java.util.Scanner;
/*
首先判断是普通还是会员 if嵌套
 */
public class Text晚自习04 {
    public static void main(String[] args) {
        System.out.println("请输入是否是会员：（0-是，1-否）");
        Scanner sc = new Scanner(System.in);
        int vip = sc.nextInt();
        if (vip == 0){
            System.out.println("请输入购物金额");
            int numberComsumer = sc.nextInt();
            double moneyConsumer = numberComsumer * 0.9;
            System.out.println("实际支付：" + moneyConsumer);
        }
        else if(vip == 1){
            System.out.println("请输入购物金额：");
            int numberVip = sc.nextInt();
            if (numberVip < 200) {
                double moneyVip = numberVip * 0.8;
                System.out.println("实际支付：" + moneyVip);
            }else if (numberVip > 200){
                double moneyVip = numberVip * 0.75;
                System.out.println("实际支付：" + moneyVip);
            }
        }


    }
}
