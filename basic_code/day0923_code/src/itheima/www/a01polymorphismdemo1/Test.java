package itheima.www.a01polymorphismdemo1;

public class Test {
    public static void main(String[] args) {

        Student s = new Student();
        s.setName("张三");
        s.setAge(10);

        Teacher t = new Teacher();
        t.setName("王建国");
        t.setAge(30);

        Administrator admin = new Administrator();
        admin.setName("管理员");
        admin.setAge(35);

        register(s);
        register(t);
        register(admin);
    }

    //
    public static void register(Person p){
        p.show();
    }
}

/*
对象的多种形态
前提：有继承或实现关系
有父类引用指向子类对象
有方法的重写
使用父类作为参数，可以接收所有子类对象，体现多态的扩展性与便利
 */
