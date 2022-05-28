package com.oricle认识java以及方法入门;
public class Test06Method {
        public static void main(String[] args) {
            //程序入口,注意调用方法的先后顺序
            farmer();
            //调用农民伯伯的方法
            seller();
            cook();
            me();
        }
        public static  void farmer (){ //农民伯伯
            System.out.println("种菜");
            System.out.println("施肥");
            System.out.println("浇水");
            System.out.println("收获");
            System.out.println("卖出");
        }
        public static  void seller () { //商贩
            System.out.println("买入");
            System.out.println("抬价");
            System.out.println("吆喝");
            System.out.println("卖出");
        }
        public static  void cook(){     //厨子
            System.out.println("买入");
            System.out.println("洗菜");
            System.out.println("烹饪");
            System.out.println("做好");
        }
        public static void me() {       //我
            System.out.println("吃");
        }
}
