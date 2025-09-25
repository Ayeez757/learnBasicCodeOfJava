package itheima.www.interface_static;

public class test {
    /*
    JDK8以后，接口中新增的方法
    允许在接口中定义静态方法，需要用static修饰
    接口中静态方法的定义格式：
    格式 public static 返回值类型 方法名(参数列表){}
    范例 public static void show(){}
    接口中静态方法的注意事项：
    静态方法只能通过接口名调用，不能通过实现类名或者对象名调用
    public 可以省略，static蹦年省略
     */
    public static void main(String[] args) {
        Inter.show();
    }
}
