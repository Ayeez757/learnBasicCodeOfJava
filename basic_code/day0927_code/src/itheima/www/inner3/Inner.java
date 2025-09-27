package itheima.www.inner3;

public class Inner {
    /**
     * 匿名内部类
     * 匿名内部类本质上就是隐藏了名字的内部类
     * 格式：
     * new 类名或者接口名（）{
     * 重写方法；
     * }；
     */

    public static void main(String[] args) {


        //编写匿名内部类代码
        new Swim() {

            @Override
            public void swim() {
                System.out.println("重写了游泳的方法");
            }
        };//分号不能少
        //new的不是swim这个接口名，而是后面的类，类是没有名字的
        //这个整体其实是new了一个对象 ，匿名内部类的对象
        //还包含了对接口的实现关系，方法的重写


        //创建对象
        new Animal() {//继承关系


            //方法的重写
            @Override
            public void eat() {
                System.out.println("吃");
            }
        };

        //在测试类中调用下面的method方法
        method(

                new Animal() {
                    @Override
                    public void eat() {
                        System.out.println("吃");
                    }
                }
        );

    }

    //应用场景
    public static void method(Animal a) {
        a.eat();
    }

}
