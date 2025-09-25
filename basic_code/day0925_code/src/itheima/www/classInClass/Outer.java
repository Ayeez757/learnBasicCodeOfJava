package itheima.www.classInClass;

public class Outer {

    class Inner1{

        /**
         * 我要创建谁的对象
         * 内部类的对象
         * Outer.Inner oi = new Outer().new Inner();
         *
         *
         */
        static int a=10;
    }

    private class Inner2{

    }
    //方法一：可以在外部类编写方法，对外提供内部类对象
    public Inner2 getInstance(){
        return new Inner2();
    }

}
