package DemoExercise02方法重载;

public class Demo02Overload {
    public static void main(String[] args) {
        byte a= 10;
        byte b= 20;
        System.out.println(isSame(a, b));                   //byte类型使用
        System.out.println(isSame((short)10,(short)20));    //short类型强转
        System.out.println(isSame(10,20));             //int类型
        System.out.println(isSame((double)20,(double)10));    //double类型
        System.out.println(isSame((long)10,(long)20));      //long类型强转

    }
    public static boolean isSame (byte a,byte b){
        System.out.println("两个byte");
        boolean same;
        if (a == b){                            //if类型判断
             same = true;
         }else {
            same  = false;
        }
        return same;
    }

    public static boolean isSame (short a,short b){
            return a == b ? true : false;       //三元运算符判断
        }

    public static boolean isSame (int a,int b){
        return a == b;
    }
    public static boolean isSame (double a,double b){
        return a == b;
    }
    public static boolean isSame (long a,long b){
        return a == b;
    }

}
