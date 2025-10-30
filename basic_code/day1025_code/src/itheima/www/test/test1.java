package itheima.www.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class test1 {
    public static void main(String[] args) {
        //请使用代码实现计算你活了多少天

        //JDK7
        //规则：只要对时间进行计算或者判断，都需要先获取当前时间的毫秒值
        //1.计算出生年月日的毫秒值
        String birthday = "2006年11月21日";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        //Date date = sdf.parse(birthday);
        //long birthdayTime = date.getTime();
        //2。获取当前时间的毫秒值
        long todayTime = System.currentTimeMillis();
        //3.计算间隔了多少天
        //long time = todayTime - birthdayTime;
        //System.out.println(time/1000/60/60/24);

    }
}
