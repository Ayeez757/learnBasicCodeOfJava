package com.heima;
import java.util.Scanner;

public class LogicOperatorPractice {
    public static void main(String[] args) {
        Scanner  Sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int number1 = Sc.nextInt();
        System.out.println("请再输入一个整数");
        int number2 = Sc.nextInt();
        boolean result = number1 == 6 || number2 == 6 || (number2 + number1)%6==0;
        System.out.println(result);





    }
}
