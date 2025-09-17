package com.itheima;

public class Continue {
    public static void main(String[] args) {
        //跳过一次循环
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {

                continue;
            }
            System.out.println("小老虎吃第" + i + "个包子");
        }
    }
}
