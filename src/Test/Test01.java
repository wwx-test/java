package Test;

public class Test01 {
    //打印1-100之间所有是九的倍数的整数，统计个数以及综合
    public static void main(String[] args) {
        System.out.println("1-100所有九的倍数之和为:"+Sum(100));
        System.out.println("i-100所有九的倍数的个数为:"+Count(100));
    }
    public static int Sum(int sum){
        int total = 0;
        for (int i = 1; i <= sum; i++) {
            if (i % 9 == 0) {
                total = total + i;
            }
        }
        return total;
    }
    public static int Count(int count){
        int geshu = 0;
        for (int i = 1; i <= 100; i++) {
            if(i % 9 == 0){
                geshu++;
            }
        }
        return geshu;
    }
}
