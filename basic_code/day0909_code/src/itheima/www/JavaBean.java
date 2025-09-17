package itheima.www;

public class JavaBean {
    /*
    标准JavaBean类
    1.类名需要见名知意
    2.成员变量使用private修饰
    3.提供至少两个构造方法
        .无参构造方法
        .带全部参数的构造方法
    4.成员方法
        .提供每一个成员变量对应的setXXX()/getXXX()
        .如果还有其他行为，也要写上
     */


    private String username;

}
/*
创建对象的过程
1.加载class文件
2.申明局部变量
3.在堆内存中开辟一个空间
4.默认初始化
5.显示初始化
6.构造方法初始化
7.将堆内的地址值赋值给局部变量
 */