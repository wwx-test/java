package DemoExercise01方法进阶;
/*题目要求：
定义一个方法，用来判断两个数字是否相同           这个相同代表布尔值 返回值*/


public class Test01MethodSame {


    public static void main(String[] args) {
        //调用布尔函数
        System.out.println(isSame1(30,30));
        System.out.println(isSame1(20,30));
        //调用简洁布尔函数
        System.out.println(isSame2(30,30));
        System.out.println(isSame2(20,30));
        //调用简洁布尔函数
        System.out.println(isSame3(30,30));
        System.out.println(isSame3(30,20));
        //调用简洁布尔函数
        System.out.println(isSame4(30,30));
        System.out.println(isSame4(30,20));
    }

    /*
    三要素：
    返回值类型：boolean
    方法名称：isSame  小驼峰
    参数列表：int a,int b
    */
    public static boolean isSame1(int a,int b) {
        boolean same;
        //第一种写法
        if (a == b) {
            same = true;
        } else {
            same = false;
        }
        return same;
    }

    //第二种写法 三元运算符 简洁写法
    public static boolean isSame2(int a,int b){
            boolean same;
            same = a == b ? true : false;
            return same;
        }

        //第三种写法
    public static boolean isSame3(int a,int b){
            boolean same;
            same = a == b;
            return same;
    }

        //第四种写法 //这些利用了上面赋值 然后下来给a和b，如果a和b相等 就赋值给same，如果没有 same获取不到值 为假，输出false
    public static boolean isSame4(int a,int b){
            return a ==b;           //注意 这个没有使用boolean定义same 直接把返回值还给了上方输出调用语句
    }
}
