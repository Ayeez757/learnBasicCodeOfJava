package com.itheima;

public class ForText1 {
    public static void main(String[] args) {


        /*

        需求：求1-100之间偶数的和

         */

       int sum = 0;
       System.out.println(sum);
       for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0) {
                sum = sum + i;
            }

        }

       System.out.println(sum);





    }
}
