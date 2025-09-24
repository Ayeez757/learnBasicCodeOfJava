package itheima.www.final_;

public class final_ {
    /*
    final最终的
    修饰的方法表示该方法是最终方法，不能被重写
    如果这是一个规则类的方法，不想别人修改规则，就可以用final修饰

    修饰的类是最终类，不能被继承
    如果一个类里面所有的方法都不想让你重写，就会用final修饰
    一般来说，我们自己写代码，很少用final修饰类和方法，一般出现在源码

    修饰的变量是常量，只能被赋值一次
    实际开发中，常量一般作为系统的配置信息，方便维护，提高可读性
    常量的命名规范：
    单个单词：全部大写
    多个单次：全部大写，单词之间用下划线隔开
    细节：
    final修饰的变量是基本变量，那么变量储存的数据值不能发生改变
    final修饰的变量是引用类型，那么变量储存的地址值不能发生改变，对象内部的可以改变

     */
    public static void main(String[] args) {

        final int a;
        a = 10;
        final double PI = 3.141592653589793238462643383279502884;
    }
}

class Fu{
    public final void show(){
        System.out.println("fu类的show方法");
    }
}

class Zi extends Fu{
//    @Override
//    public void show(){
//        System.out.println("zi类的show方法");
//    }
}

