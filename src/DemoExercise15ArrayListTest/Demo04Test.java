package DemoExercise15ArrayListTest;

import java.util.ArrayList;
import java.util.Random;

/*
用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合当中
要求使用自定义的方法来实现筛选
 */
public class Demo04Test {
    public static void main(String[] args) {
        ArrayList<Integer> bigList = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100) + 1;
            bigList.add(num);
        }

        ArrayList<Integer> smallList = getSmallList(bigList);   //方法名加参数名接受的返回值给smallList
        //遍历smallList
        System.out.println("偶数有多少个：" + smallList.size());
        for (int i1 = 0; i1 < smallList.size(); i1++) {
                System.out.println(smallList.get(i1));
            }

    }
    public static ArrayList<Integer> getSmallList(ArrayList<Integer>bigList){
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            int num = bigList.get(i);
            if(num % 2 == 0){
                smallList.add(num);
            }
        }
        return smallList;
    }
}
