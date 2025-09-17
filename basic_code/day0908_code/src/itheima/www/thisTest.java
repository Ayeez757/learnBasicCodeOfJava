package itheima.www;

public class thisTest {
    //方法外面的，类里面的是成员变量
    //方法里面的是局部变量
    //就近原则

    private int a = 1;//成员变量
    public void method(){
        int a =10;//局部变量
        System.out.println(a);//打印局部变量
    }

    //测试main方法
    public static void main(String[] args) {
        thisTest t =  new thisTest();
        t.method();
        t.method2();


    }

    //一样的方法再写一遍，加上this
    public void method2(){
        int a =10;//局部变量
        System.out.println(this.a);//打印局部变量
    }

    public void setA(int a){
        this.a = a;

    }

}
