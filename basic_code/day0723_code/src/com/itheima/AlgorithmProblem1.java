package com.itheima;
import java.util.Scanner;
public class AlgorithmProblem1 {
    /*
    需求：给你一个整数x。
         如果x是一个回文整数，打印true，否则返回false
     */
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int x = Sc.nextInt();
        int num = x;
        int j = 1;
        String number = "";
        String OriginNumber = x +"0";
        while (num != 0) {
            num = num - (num % j);
            j *= 10;
            number = number + ((num % j) * 10 / j);
//            System.out.println(num);
//            System.out.println((num % j) * 10 / j);
        }

        //无论怎么输出都是false，看看怎么回事
        System.out.println(number);
        System.out.println(OriginNumber);
        //结果是一样的啊，数据类型也是一样的，为什么不行
        if (number.equals(OriginNumber)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        //原来字符串的比较要用equals()而不是==，==好像比的是内存地址是否完全相等




    }
}
