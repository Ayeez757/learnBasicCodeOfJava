//测试类

public class PhoneTest {
    public static void main(String[] args){
        //创建手机的对象
        phone p = new phone();
        //给手机赋值
        p.brand = "小米";
        p.price = 1999.8;
        //获取手机对象中的值
        System.out.println(p.brand);
        System.out.println(p.price);
        //调用手机的方法
        p.call();
        p.playGame();

        //再创建一部
        phone p2 = new phone();



    }
}
