package DemoExercise03数组基本知识;
/*
直接打印数组名称，得到的是数组对应的：内存地址哈希值

访问数组元素的格式：数组名称[索引值]
索引值：就是一个int数字，代表数组当中元组的编号。
【注意】 索引从0开始，一直到“数组的长度-1”为止
 */
public class Demo04Array数组使用 {
    public static void main(String[] args) {
        //静态初始化的省略格式
        int[] array = {10,20,30};
        System.out.println(array);          //[I@4554617c  [数组 I int 数字 十六进制数

        //直接打印数组当中的元素
        System.out.println(array[0]);       //10
        System.out.println(array[1]);       //20
        System.out.println(array[2]);       //30

        //也可以将数组当中的某一个元素，赋值交给变量
        int num = array[1];                 //把数组的内容通过索引值取出
        System.out.println(num);            //20
    }
}
