package itheima.www;

import java.util.Scanner;

public class StringDemo2 {
    /*
    public char charAt(int index)根据索引返回字符
    public int length()返回字符串的长度
    字符串里面的length是方法，数组是属性
     */
    public static void main(String[] args) {
        //录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        //进行遍历
        for (int i = 0; i < str.length(); i++) {
            //i 依次表示字符串的每一个索引
            System.out.println(str.charAt(i));
        }
    }
}