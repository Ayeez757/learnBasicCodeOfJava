package itheima.www;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        //键盘录入一个字符串，统计该字符穿中大写字母字符，小写字母字符，数字字符出现的次数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        int bigCount = 0;
        int smallCount = 0;
        int numCount = 0;
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            //判断
            //判断依据！！char在进行计算的时候，会自动提升为int类型，依据ASCLL码表
            if (c >= 'a' && c <= 'z') {
                smallCount++;
            } else if (c >= 'A' && c <= 'Z') {
                bigCount++;
            } else if (c >= '0' && c <= '9') {
                numCount++;
            }
        }
        System.out.println("有"+bigCount+"个大写字母");
        System.out.println("有"+smallCount+"个小写字母");
        System.out.println("有"+numCount+"个数字");

    }
}
