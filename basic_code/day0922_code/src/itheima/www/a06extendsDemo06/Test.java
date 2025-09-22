package itheima.www.a06extendsDemo06;

public class Test {
    public static void main(String[] args) {

        //利用空参构造创建子类对象
        Zi z1 = new Zi();
        //利用带参构造创建子类对象会报错
        //子类无法继承父类的构造方法
        //不管是否私有，子类都可以继承父类的成员变量，只是私有的不能直接用

        /*虚方发表
        * 非private
        * 非static
        * 非final
        *
        * */




    }
}


class Fu{
    String name;
    int age;

    public Fu(){}
    public Fu(String name,int age){
        this.name = name;
        this.age = age;
    }
}

class Zi extends Fu{



}