package itheima.www.a01DateTimeFormatterDemo;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {
    public static void main(String[] args) {
        /*
            static DateTimeFormatter ofPattern(格式)  获取格式
            String format(时间对象)                     按照指定方式格式化
         */

        //获取时间对象
        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));

        //解析/格式化器
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EE a");
        //格式化
        System.out.println(dtf1.format(time));
    }
}
