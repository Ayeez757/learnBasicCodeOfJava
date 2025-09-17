package com.itheima;

public class pass7 {

    //逢7过小游戏，到7的倍数喊过
    public static void main(String[] args) {

        int num = 0;
        for(;num<=100;){

            num++;

            if (num%7==0){
                System.out.println("过");
                continue;
            }
            System.out.println(num);

        }
    }
}
