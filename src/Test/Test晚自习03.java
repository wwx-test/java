package Test;

import java.util.Scanner;

public class Test晚自习03 {
    public static void main(String[] args) {
        int Max1 = max(10,20);
        System.out.println("两个数的最大值是：" + Max1);
        int Max2 = max(10,20,30);      //传参给三个参数的重载方法
        System.out.println("三个数的最大值是：" + Max2);
    }
    public static int max(int a,int b){
        if (a > b){
            return a;
        }else{
            return b;
        }
    }

    public static  int max(int a,int b,int c){  //方法重载
        int[] array = {a,b,c};                  //定义一个数组，通过遍历数组的方式比较第一个赋值给max的值，如果比max大就传给max
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;     //返回max
    }
}
