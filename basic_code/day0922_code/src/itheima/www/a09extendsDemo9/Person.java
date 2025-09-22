package itheima.www.a09extendsDemo9;

public class Person {
    String name;
    int age;

    public Person(){
        System.out.println("父类的无参构造");


    }

    public Person(String name,int age){

        this.name = name;
        this.age = age;
        System.out.println("父类的有参构造"+this.name+","+this.age);

    }

}
