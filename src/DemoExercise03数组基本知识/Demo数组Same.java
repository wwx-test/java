package DemoExercise03数组基本知识;

public class Demo数组Same {
    public static void main(String[] args) {
        int[] arrayA = new int[3];
        System.out.println(arrayA);  //地址值
        System.out.println(arrayA[0]);   //0
        System.out.println(arrayA[1]);   //0
        System.out.println(arrayA[2]);   //0
        System.out.println("=====================");
        arrayA[1] = 10;
        arrayA[2] = 20;
        System.out.println(arrayA);     //地址值
        System.out.println(arrayA[0]);  //0
        System.out.println(arrayA[1]);  //10
        System.out.println(arrayA[2]);  //20
        System.out.println("=====================");

        int[] arrayB = arrayA;
        System.out.println(arrayA);  //地址值
        System.out.println(arrayA[0]);   //0
        System.out.println(arrayA[1]);   //通过同一地址找寻数据 发现已经被数组A赋值为10
        System.out.println(arrayA[2]);   //20同理
        System.out.println("=====================");
        arrayA[1] = 100;                //继续通过arrayB来进行赋值 将保存的数据改变成为 100
        arrayA[2] = 200;                //200
        System.out.println(arrayA);     //地址值
        System.out.println(arrayA[0]);  //0
        System.out.println(arrayA[1]);  //10
        System.out.println(arrayA[2]);  //20
        System.out.println("=====================");
    }
}
