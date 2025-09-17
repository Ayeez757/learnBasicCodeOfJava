package itheima.www;

public class StringTest {
    public static void main(String[] args) {
        String s1 = "Aye";//直接赋值的时候，系统会检查字符串常量池里面有没有该字符串，有就复用，可以节省内存
        System.out.println("s1" + s1);
        //这里我一开始报错了，因为我的类名为String,当时没注意，看了好一会才直到出了啥问题

        String s2 = new String();//没new一次，不管有没有，都会在堆内存里面开辟一个空间，这样子会浪费内存空间
        System.out.println("s2" + s2);

        //有参构造
        //传递一个字符串，根据传递的字符串内容再创建一个新的字符串对象()
        String s3 = new String("abc");
        System.out.println("s3"+s3);

        //传递一个字符数组，根据字符数组的内容再创建一个新的字符串对象
        //需求：我要修改字符串的内容，abc qbc，因为字符串不能发生改变，所以可以利用字符数组来修改
        char[] chs = {'a','b','c','d'};
        String s4 = new String(chs);
        System.out.println("s4"+s4);//abcd

        //传递一个字节数组，根据字节数组的内容再创建一个新的字符串对象
        //他会把数字去ASCLL码表转换完在存进String里
        //应用场景：以后在网络中传输的数据都是字节信息，此时用这个构造进行转换
        //byte
        byte[] bytes = {96,97,98,99};
        String s5 = new String(bytes);
        System.out.println("s5"+s5);

    }

}
