package com.itheima;

import java.util.Scanner;

public class Method2 {
    public static void main(String[] args) {
        Scanner Sc =new  Scanner(System.in);
        int num1 = Sc.nextInt();
        int num2 = Sc.nextInt();
        sum(num1,num2);
    }
    public static void sum(int num1,int num2){
        int result = num1 + num2;
        System.out.println(result);
    }
}
