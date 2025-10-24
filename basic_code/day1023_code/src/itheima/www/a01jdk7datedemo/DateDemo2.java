package itheima.www.a01jdk7datedemo;

import java.util.Date;
import java.util.Random;

public class DateDemo2 {
    public static void main(String[] args) {
        Random r = new Random();
        Date d1 = new Date(Math.abs(r.nextInt()));
        Date d2 = new Date(Math.abs(r.nextInt()));
        long time1 = d1.getTime();
        long time2 = d2.getTime();
        if(time1 > time2){
            System.out.println("第一个时间在后面，第二个时间在前面");
        }else if(time1< time2){
            System.out.println("第一个时间在后面，第二个时间在前面");
        }else{
            System.out.println("表示两个时间一样");
        }
    }
}
