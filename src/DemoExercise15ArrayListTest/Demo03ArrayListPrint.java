package DemoExercise15ArrayListTest;
/*
题目：
定义以指定格式打印集合的方法(ArrayList类型作为参数)，使用{}扩起集合，使用@分隔每个元素：
格式参照 {元素@元素@元素}。
 */
import java.util.ArrayList;

public class Demo03ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("苏大强");
        list.add("艾伦野鸽");
        list.add("三笠");
//        System.out.println(list);       //[张无忌, 苏大强, 艾伦野鸽, 三笠]
        printArray(list);
        }
    public static void printArray (ArrayList<String> list) {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            //当i遍历到最后一个的时候，就输出一个反斜杠 }
            if (i == list.size() - 1) {         //因为size长度如果为4，但是i从0开始，那么就要让i == 4时候停下来输出 }
                System.out.print("}");
            } else {
                System.out.print("@");
            }
        }
    }
}

