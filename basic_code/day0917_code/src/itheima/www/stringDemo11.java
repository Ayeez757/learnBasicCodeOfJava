package itheima.www;

import java.util.Scanner;

public class stringDemo11 {
    //1.对称
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串数字");
        String str = sc.next();
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
//        System.out.println(sb);

        String strResult = sb.toString();
        if(str.equals(strResult)){
            System.out.println("是对称字符串");
        }
        else{
            System.out.println("不是对称字符串");
        }
    }

    //使用StringBuilder的场景
    //1.字符串拼接
    //2.字符串反转


}
