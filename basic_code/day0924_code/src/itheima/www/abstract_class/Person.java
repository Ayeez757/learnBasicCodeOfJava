package itheima.www.abstract_class;

public abstract class Person {

    public abstract void work();
    //抽象类不能实例化
    //抽象类中不一定有抽象方法，有抽象方法的类一定是抽象类
    //可以有构造方法
    //作用是在子类创建对象时，给属性进行赋值的
    //抽象类的子类，要么重写抽象类中的所有抽象方法，要么是抽象类
    //抽象类和抽象方法的意义就是规范，强制你按这种格式重写，保证你子类的方法统一

}
