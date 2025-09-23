package itheima.www.a01polymorphismdemo1;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show(){
        System.out.println(name +"，"+ age);
    }
}
/*
多态，新建对象时可以把子类赋值给父类
比如说Studenet s = new Student();
还可以Person p = new Student();
多态是同种类型的对象，表现出不同的形态
前提：有继承/实现关系
有父类引用指向子类对象
Fu f = new Zi();
 */