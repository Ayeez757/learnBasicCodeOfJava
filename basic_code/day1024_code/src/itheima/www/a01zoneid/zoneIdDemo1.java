package itheima.www.a01zoneid;

import java.time.ZoneId;
import java.util.Set;

public class zoneIdDemo1 {
    public static void main(String[] args) {
        /*
        static Set<String> getAvailableZoneIds()    获取Java中支持的所有时区
        static ZoneId systemDefault()               获取系统默认时区
        static ZoneId of(String zoneId)             获取一个指定时区
         */

        //1获取所有时区名称
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds);

        //2.获取系统当前默认时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        //3.获取指定时区
        ZoneId zoneId1 = ZoneId.of("Asia/Pontianak");
        System.out.println(zoneId1);
    }
}
