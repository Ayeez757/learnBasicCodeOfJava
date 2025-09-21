package itheima.www.a03staticDemo3;

public class Student {
    String name;
    int age;
    static String teacherName;


    //非静态方法会有一个隐藏的this，如下，谁调用这个方法，
    // 虚拟机就会把谁放进去
    public void show1(Student this){
        System.out.println("this"+this);
        System.out.println(this.name + ","+this.age+
                ","+this.teacherName);

        //调用其他方法
        show2();
        //他会拿着调用show1的方法继续调用show2
        //等价于
        this.show2();
        //其实隐含了this
        //如果在调用show1的地方强行传入参数，会报错
    }

    public void show2(){
        System.out.println("show2");
    }


    public static void method(){
        //如果在静态方法的小括号里加入this，会报错
        //静态方法没this法
        //System.out.println(this.name);
        //会报错
        System.out.println("静态方法");
    }
    //静态的是共享的，也不能调用非静态的成员方法和静态方
}
