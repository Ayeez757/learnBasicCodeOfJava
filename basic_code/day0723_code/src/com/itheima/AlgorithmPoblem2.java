package com.itheima;

import java.util.Scanner;

public class AlgorithmPoblem2 {

    public static void main(String[] args) {
         /*
   需求：给定两个整数，被除数和除数(都是正数，且不超过int范围)
   将两数相除，要求不适用除法，乘法，和%运算符
   要求得到商和余数
     */

        //录入数据
        Scanner Sc = new Scanner(System.in);
        System.out.println("请输入一个整数作为被除数：");
        int dividend = Sc.nextInt();
        System.out.println("请输入一个整数作为除数");
        int divisor = Sc.nextInt();

        //定义一个量来记录商
        int i = 0;

        //用减法，让被除数一直减去除数，直到减到被除数小于除数
        while (dividend >= divisor) {
            dividend -= divisor;
            i++;
        }
        System.out.println("商为：" + i);
        System.out.println("余数为:" + dividend);
    }

}
