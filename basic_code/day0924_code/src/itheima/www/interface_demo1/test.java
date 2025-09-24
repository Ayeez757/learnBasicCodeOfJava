package itheima.www.interface_demo1;

public class test {
    //定义接口
    //public interface 接口名{}
    /*
    接口不能实例化
    接口和类之间是实例关系，通过implenments关键字表示
    public class 类名 implements 接口名{}
    接口的子类（实现类）
    要么重写接口中所有的抽象方法
    要么是抽象类
    接口和类的实现关系，可以单实现，也可以多实现
    public class 类名 implements 接口名1，接口名2
    实现类还可以在继承一个类的同时实现多个接口
    public class 类名 extends 父类 implements 接口名1 接口名2



     */

    public static void main(String[] args) {
        Frog f = new Frog("小青",1);
        System.out.println(f.getName()+","+f.getAge());

        f.eat();
        f.swim();

        Rabit r = new Rabit("小白",2);
        System.out.println(r.getName()+","+r.getAge());

        r.eat();




    }

}


