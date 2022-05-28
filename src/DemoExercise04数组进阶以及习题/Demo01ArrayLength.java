package DemoExercise04数组进阶以及习题;
/*
如何获取数组的长度，格式：
数组名称.length

这将会得到一个int数字，代表数组的长度

数组一旦创建，程序运行期间，长度不可改变。
*/
public class Demo01ArrayLength {
    public static void main(String[] args) {
        int[] arrayA = new int[3];

        int[] arrayB = new int[] {5,5,4,4,8,4,4,4,2,2,455,4,54,857,87,54,5,748,78,4,854,87,8,6546,54,56,454,54,54,54,57,5,7,5,74};
        int len = arrayB.length;
        System.out.println("数组的长度是:"+len);

        int[] arrayC = new int[3];
        System.out.println(arrayC.length);  //3
        arrayC = new int[5];
        System.out.println(arrayC.length);  //5
        //总结：虽然程序运行的时候长度不能改变，但是再上列程序相当于创建了两个数组，地址不同，所以是互不干扰的。
    }

}
