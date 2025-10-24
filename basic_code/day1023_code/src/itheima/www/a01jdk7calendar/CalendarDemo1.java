package itheima.www.a01jdk7calendar;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo1 {
    public static void main(String[] args) {
        /*
            public static Calendar getInstance() 获取当前日历的对象

            public final Date get Time()    获取日期对象
            public final setTime(Date date) 给日历设置日期对象

            public long getTimeInMillis()   拿到时间毫秒值
            public void setTimeMillis(long millis) 给日历设置时间毫秒值

            public int get(int field)       取日期中的某个字段信息
            public void set(int field,int value) 修改日历的某个字段信息
            public void add(int field,int amount) 为某个字段增加/减少指定的值
         */

        //1.获取日历对象
        //细节：Calendar是一个抽象类，不能直接new，而是通过一个静态方法获取到子类对象
        //底层原理：
        //会根据系统不同时区来获取不同的日历对象，默认表示当前时间
        //会把时间中的纪元，年，月，日，时，分，秒，星期，等等的都放到一个数组当中
        //细节2：
        //月份：范围0~11 如果获取出来的是0，那么实际上是1月
        //星期：在老外的眼里，星期日是一周的第一天


        Calendar c = Calendar.getInstance();
        System.out.println(c);

        //2.修改一下日历代表的时间
        Date d = new Date(0L);
        c.setTime(d);
        System.out.println(c);

        //3.修改日历上某个字段的信息
        c.set(Calendar.YEAR,2025);
        c.set(Calendar.MONTH,9);
        c.set(Calendar.DAY_OF_MONTH,23);

        c.add(Calendar.DAY_OF_MONTH,1);
        //获取calendar里面的数据
        /*
        0:纪元
        1：年
        2：月
        3：一年中的第几周
        4： 一个月中的第几周
        5：一个月中的第几天（日期）
        java 在Calendar类中，把索引都定义成了常量
         */
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        int day = c.get(Calendar.DAY_OF_MONTH);
        int week = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(year + "年" + month+"月"+day+"日"+" "+ getWeek(week));


    }

    //查表法：让索引和容器一一对应
    public static String getWeek(int week){
        String []arr = {"","星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
        return arr[week];
    }
}
