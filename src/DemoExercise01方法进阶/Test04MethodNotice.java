package DemoExercise01方法进阶;
/*
使用方法的时候，注意事项：

1.方法应该定义在类中，但是不能在方法当中再定义方法，不能嵌套。
2.方法定义的前后顺序无所谓。
3.方法地能够以之后不会执行，如果希望执行，一定要调用：单独调用，打印调用，赋值调用。
4.如果方法有返回值，那么必须写上“return 返回值；”，不能没有.
5.return后面的返回值数据，必须和方法的返回值类型，对应起来。
6.对于一个void没有返回值的方法，不能写return后面的返回值，只能写return自己。（相当于返回空值）
7.对于方法单中最后一行的return可以省略不写
8.一个方法当中可以有多个return语句，但是必须保证同时只有一个会被执行到，两个return不能连写
 */
public class Test04MethodNotice {
    public static void main(String[] args) {
        System.out.println(getMax(10,20));
    }

    public static int method01(){
        return 10;              //(对应5)
    }

    public static void method02(){
//        return 10;          //错误写法！方法没有返回值，return后面就不能写返回值。
        return;               //没有返回值，只是结束方法的执行而已。  (对应6)
    }

    public static void method03(){
        System.out.println("AAA");
        System.out.println("BBB");
//        return;           //最后一行的return可以省略不写，如果有返回值 必须写上(对应7)
    }

//例子8.求两个数最大的那个
    public static int getMax(int a,int b){
        //第一种写法
        /*int max;
        if (a > b){
            max = a;
        }else {
            max = b;
        }
        return max;*/

        if (a > b){
            return a;           /*如果a > b那么条件表达式if return a*/
        }else{                  /*但是不写else，b > a时不返回任何值 所以return b*/
            return b;           /*一个方法里虽然有两个return，但是不会同时进行，所以可以写多个return语句(对应8)*/
        }
    }

}
