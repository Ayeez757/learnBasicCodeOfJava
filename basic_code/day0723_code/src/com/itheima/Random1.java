package com.itheima;


import java.util.Random;

public class Random1 {
    public static void main(String[] args) {
       Random r = new Random();

       //在小括号中是随机数范围，从零开始到这个数减一结束，左闭右开

//        for (int i = 0; i < 100; i++) {
//            int number = (r.nextInt(100))+1;
//            System.out.println(number);
//        }
//

        //从9-15的随机数

        for (int i = 0; i < 100; i++) {
            int num = r.nextInt(7)+9;
            System.out.println(num);

        }





    }
}
