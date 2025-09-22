package itheima.www.a07extendsDemo7;

public class extendsDemo7 {
    //成员变量访问特点
    //就近原则：谁离我近，我就用谁

    //成员方法的访问特点
    //就近原则：谁离我近，我就用谁


}

class Fu{
    String name ="Fu";
}

class Zi extends Fu{

    String name = "Zi";
    public void ziShow(){
        String name = "ziShow";
        System.out.println(name);
        System.out.println(this.name);//this会找本类成员变量
        System.out.println(super.name);//super会找父类变量
        //父类的父类不能用多层super，没这种写法
        //就近原则，没有就往上找
    }
}