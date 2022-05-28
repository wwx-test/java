package Test;

public class Test晚自习02 {
    public static void main(String[] args) {
        int num = 5;
        num = num++ + ++num + --num + num--;
        System.out.println(num);
    }
}
