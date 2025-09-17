package com.itheima;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        //需求：判断一个数是否为质数
        Scanner Sc = new Scanner(System.in);
        System.out.println("请输入一个数");
        int num = Sc.nextInt();
        //定义一个临时变量来判断是否存在因数
        int temp = 0;
        for (int i = 2; i <= num; i++) {
            for (int i1 = 2; i1 <= num; i1++) {
                if(i*i1==num){
                    temp++;
                    break;
                }
            }
            if(temp!=0){
                break;
            }
        }
        if(temp==0){
            System.out.println("该数为质数");
        }else {
            System.out.println("该数不是质数");
        }
    }
}
