package itheima.www.a03staticDemo3;

public class test {
    /*
    静态方法只能访问静态变量和静态方法
    非静态方法可以访问静态变量或静态方法，也可以访问非静态的成员变量和非静态的成员变量
    静态方法中是没有this关键字的
     */
    public static void main(String[] args) {
        Student.teacherName="阿伟老师";

        Student s1 = new Student();
        System.out.println("s1"+s1);
        s1.name = "张三";
        s1.age = 23;
        s1.show1();

        System.out.println("==========================");
        Student s2 = new Student();
        System.out.println("s2"+s2);
        s2.name = "李四";
        s2.age = 24;
        s2.show1();
    }

    //静态的东西随着类的加载而加载到内存，
    // 而非静态的东西要创建对象才会出现在内存中
}
//单例设计模式
