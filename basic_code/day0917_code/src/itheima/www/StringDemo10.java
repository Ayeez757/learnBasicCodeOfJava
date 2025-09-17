package itheima.www;

import java.sql.SQLOutput;

public class StringDemo10 {
    public static void main(String[] args) {
        //1.获取一个手机号码
        String phoneNumber = "11451411451";

        //2.截取手机号码的前三位
        String result = phoneNumber.substring(0,3);

        //加截取后四位
        result = result +"****"+phoneNumber.substring(7);
        System.out.println(result);

        //字符怎么变成数字？
        //ASCLL
        System.out.println('0'+0);//天才!
        System.out.println('a'+0);//天才!

        String talk ="你玩的真好，下次别玩了tmd";
        String result2 = talk.replace("tmd","***");
        System.out.println(result2);

    }

}
