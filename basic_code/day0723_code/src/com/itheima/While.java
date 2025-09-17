package com.itheima;

public class While {
    public static void main(String[] args) {
        /*
        初始化语句;
        while(条件){
           执行;
        }
         */
        int i = 1;
        while(i<=100){
            System.out.println(i);
            i++;

        }

        //for和while在语法上没什么区别，但是实际开发有习惯上的区别
        int height = 1;
        int j = 0;
        while(height <= 88444300){
            j++;
            height = height *=2;
        }
        System.out.println(j);

    }
}
