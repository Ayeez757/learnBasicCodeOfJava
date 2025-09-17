package itheima.www;

import java.util.StringJoiner;

public class stringJoinerDemo {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(",","[","]");
        int [] arr = {1,2,3,4,5,6,7,8,9,0,1,24,25,35,356,23,25,235};
        for (int i = 0; i < arr.length; i++) {

             sj.add(""+arr[i]);
        }
        System.out.println(sj);
    }
}
