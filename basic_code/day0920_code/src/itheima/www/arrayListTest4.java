package itheima.www;

import java.util.ArrayList;

public class arrayListTest4 {
    //集合添加基本数据类型要包装类
        /*
        byte    >   Byte
        short   >   Short
        char    >   Character
        int     >   Integer
        long    >   Long
        float   >   Float
        double  >   FLoat
        boolean >   Boolean
         */
    public static void main(String[] args) {
        //创建集合
        ArrayList<Integer> list = new ArrayList<>();
        //添加
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);
        
    }
}
