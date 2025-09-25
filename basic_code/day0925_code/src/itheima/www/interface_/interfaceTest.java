package itheima.www.interface_;

public class interfaceTest {

    /*
    JDK7以前接口只能定义抽象方法
    JDK8新特性，接口中可以定义有方法体的方法
    JDK9的新特性，接口中可以定义私有方法

    JDK8以后接口中新增的方法
    允许在接口中定义默认方法，需要使用关键字default修饰
    作用：解决接口升级问题
    接口中默认方法的定义格式 ：
    格式：public default 返回值类型 方法名（参数列表）{}
    范例：public default void show(){}

    接口中默认方法的注意事项：
    默认方法不是抽象方法，所以不强制被重写。但如果被重写，重写的时候去掉default关键字
    public可以省略，default不能省略
    如果实现了多个接口，多个接口中存在相同名名字的默认方法，子类就必须对该方法进行重写
    实现类对象可以直接调用接口的default方法，如果不重重写，两个接口会分不清你调用的是哪个


     */
    public static void main(String[] args) {
        InterImpl i = new InterImpl();
        i.show();
    }
}
