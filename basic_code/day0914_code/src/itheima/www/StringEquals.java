package itheima.www;

public class StringEquals {
    //==在基本数据类型比的是具体的值是否相等，引用数据类型比的是地址值
    //如果是有new出来的字符串，或者一个new一个直接在常量池里面，那么地址肯定是不一样的 ，==输出的就是false

    //字符串比较
    //equals(要比较的字符串)               完全一样才是true，否则为false
    //equalsIgnoreCase(要比较的字符串)     忽略大小写比较
    public static void main(String[] args) {
        //创建俩字符串对象
        String s1 = new String("abc");
        String s2 ="abc";
        String s3 ="Abc";
        System.out.println("=="+s1==s2);
        System.out.println("equals"+s1.equals(s2));
        System.out.println("equals"+s1.equals(s3));
        System.out.println("equalsIgnoreCase"+s1.equalsIgnoreCase(s3));

        //如果在键盘录入一个abc
        //代码中再定义一个字符串abc
        //用==比较，两者不一样
        //在源码里面找半天，可以发现Scanner里面录入的字符串对象是new出来的
        //因此之后要比较都用eqals

    }
}
