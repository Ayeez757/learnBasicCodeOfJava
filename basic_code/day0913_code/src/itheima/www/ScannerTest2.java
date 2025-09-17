package itheima.www;

import java.util.Scanner;

public class ScannerTest2 {
    public static void main(String[] args) {
        //键盘录入的两套体系是不能混用的
        //混用会导致下面的nextLine接收不到数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int num = sc.nextInt();
        System.out.println(num);
        System.out.println("请输入一个字符串");
       // String str = sc.nextLine();
      //  System.out.println(str);

        //等以后学会了类型转换再用第二套体系

    }
}
