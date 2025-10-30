package itheima.www.Integer1;

public class IntegerDemo1 {
    public static void main(String[] args) {
        /*
        public static String toBinaryString(int i)  得到二进制
        public static String toOctalString(int i)   得到八进制
        public static String toHexString(itn i)     得到十六进制
        public static int parseInt(String s)        将字符串类型的整数转成int类型的整数

         */

        //1-3.把整数转换成二进制，八进制，十六进制
        String str1 = Integer.toBinaryString(100);
        System.out.println(str1);

        String str2 = Integer.toOctalString(100);
        System.out.println(str2);

        String str3 = Integer.toHexString(100);
        System.out.println(str3);

        //4.将字符串类型的整数转成int类型的整数
        //强类型语言：每种数据在java中都有各自的数据类型
        //在计算的时候，如果不是同一种数据类型，是无法直接进行计算的

        int i = Integer.parseInt("123");
        System.out.println(i);
        System.out.println(i+1);

        //细节1：
        //在类型转换的时候，括号中的参数只能是数字不能是其他的，否则代码会报错
        //细节2：
        //8种包装类，出了Character都有对应的parseXxx的方法，进行类型转换
        String str = "true";
        boolean b = Boolean.parseBoolean(str);
        System.out.println(b);


    }
}
