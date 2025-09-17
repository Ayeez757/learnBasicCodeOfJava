package itheima.www;

import java.util.Scanner;

public class Method5 {

    public static void main(String[] args){
        short s1 = 4;
        long s2 = 4;
        if ( num(s1) == num(s2)){

            System.out.println("相等");
        }else{
            System.out.println("不等");
        }
        System.out.println(s1==s2);


    }
    public static void fn(int a){

    }
    public static int fn(int a,int b){
        return 1;
    }
    //不在一个类里面的方法不构成重载关系
    public static long num(byte a){
        long result = a;
        return result;
    }
    public static long num(short a){
        long result = a;
        return result;
    }
    public static long num(int a){
        long result = a;
        return  result;
    }
    public static long num(long a){
        long result = a;
        return  result;
    }

}
