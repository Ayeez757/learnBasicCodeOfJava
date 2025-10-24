package itheima.www.a01jdk7datedemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo3 {
    public static void main(String[] args) {
        /*
        public SimpleDateFormat()       默认格式
        public SimpleDateFormat(String pattern) 指定格式

        public final String format(Date date)   格式化(日期对象->字符串)
        public Date parse(String source)解析(字符串->日期对象)
         */

        //1.利用空参构造创建SimpleDateFormat对象，默认格式
        SimpleDateFormat stdf = new SimpleDateFormat();
        Date d1 = new Date(0L);
        String str = stdf.format(d1);
        System.out.println(str);//1970/1/1 08:00

        //2.利用带参构造创建SimpleDateFormat对象，指定格式
        SimpleDateFormat stdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String str2 = stdf2.format(d1);
        System.out.println(str2);
    }

}
