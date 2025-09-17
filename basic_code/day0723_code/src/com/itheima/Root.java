package com.itheima;

import java.util.Scanner;

public class Root {
    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        System.out.println("请输入要开方的数字：");
        int num = Sc.nextInt();
        int result = 0;
        while(result*result<=num){
            result++;
        }
        int result1 = result-1;
        System.out.println("开方结果为："+result1);
    }
}
