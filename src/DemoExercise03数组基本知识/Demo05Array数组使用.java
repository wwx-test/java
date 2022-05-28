package DemoExercise03数组基本知识;

/*
使用动态初始化数组的时候，其中的元素将会自动拥有一个默认值，规则如下：
如果式整数类型，那么默认为0;
如果是浮点类型，那么默认为0.0;
如果式字符类型，那么默认为'\u0000';
如果是布尔类型，那么默认为false;
如果式引用类型，那么默认为null。

注意事项:
静态初始化其实也有默认值的过程，只不过系统自动马上将默认值替换成为了大括号当中的具体数值。

总结:
动态初始化适用于知道长度但是不知道具体内容的数据类型 需要编写长度
静态初始化适用于知道内容 但是长度也会根据内容扩大
动态初始化和静态初始化两者在运行过程中都无法增加长度
动态初始化能省略格式，静态也可以 但是静态初始化省略之后就不能拆分过程为两步了
数组是可以将其中的数据直接打印出来的 通过索引值 也可以通过索引值将里面存放的数据内容赋值给一个变量 然后输出变量
动态初始化的数组根据数据类型里面存放的数值也不一样，int类型数组默认为0，可以通过数组索引下标进行赋值修改

 */
public class Demo05Array数组使用 {
    public static void main(String[] args) {
        //动态初始化一个数组
        int[] array = new int[3];
        System.out.println(array);      //内存地址值
        System.out.println(array[0]);   //0
        System.out.println(array[1]);   //0
        System.out.println(array[2]);   //0
        System.out.println("===============");

        //将数据123复制交给数组array当中的1号元素
        array[1] = 123;
        System.out.println(array[0]);   //0
        System.out.println(array[1]);   //123
        System.out.println(array[2]);   //0
    }
}
