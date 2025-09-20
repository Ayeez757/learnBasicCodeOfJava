package itheima.www.a01staticdemo1;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(23);
        s1.setGender("男生");
        //s1.teacherName = "阿伟老师";
        //用静态修饰后，还可以用类名来调用
        Student.teacherName="阿伟老师";
        /*
        静态变量
        被该类所有对象共享
        可以用类名调用，也可以用对象调用
         */

        s1.study();
        s1.show();

        Student s2 = new Student();
        s2.setName("李四");
        s2.setAge(24);
        s2.setGender("女生");

        s2.study();
        s2.show();
    }
}
