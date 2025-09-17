package com.heima;

import java.util.Scanner;

public class FlowOfControlStatement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入酒量");
        int wine = sc.nextInt();

        if (wine > 2) {
            System.out.println("诶哟，小伙子不错");

        }
        boolean flag = false;
        if (flag) {
            System.out.println("flag的值是true");

        }
        if(flag){

        }else{

        }
        System.out.println("请输入一个整数表示支付的钱");

        int money = sc.nextInt();
        if(money >= 600){
            System.out.println("支付成功");
            money = money-600;
            System.out.println("您剩余："+money);

        }else{
            System.out.println("支付失败，您的余额不足，您的余额为："+money);
        }

        //default不一定写在最下面




    }
}