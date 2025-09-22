package itheima.www.a09extendsDemo9;

public class Student extends Person{
    public Student(){
        //子类构造方法中隐藏的super()去访问父类的无参构造
        System.out.println("子类的无参构造");
    }
    public Student(String name,int age){
        super(name,age);
        System.out.println("子类的有参构造");
    }
}
