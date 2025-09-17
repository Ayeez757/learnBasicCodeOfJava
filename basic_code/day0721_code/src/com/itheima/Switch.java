package com.itheima;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        String wantToEat="重庆小面";
        switch(wantToEat){
            case "兰州拉面":
                System.out.println("吃兰州拉面");
                break;
            case "重庆小面":
                System.out.println("吃重庆小面");
                break;
            case "炸酱面":
                System.out.println("吃炸酱面");
                break;
            case "热干面":
                System.out.println("吃热干面");
                break;

            default:
                System.out.println("吃泡面");
        }


        //default的省略，啥都匹配不上，没有就直接过了
        //break不能省略，会导致case穿透，执行下一个case直到碰到break或者大括号

        //对于范围判断用if舒服一点，有限东西一一列举的话用case方便点
        System.out.println("请输入一个星期日子");

        Scanner  Sc = new Scanner(System.in);
        int week = Sc.nextInt();
        switch(week){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("今天是工作日");
                break;
            case 6:
            case 7:
                System.out.println("今天是休息日");
                break;
            default:
                System.out.println("不存在该日子");

        }


    }
}
