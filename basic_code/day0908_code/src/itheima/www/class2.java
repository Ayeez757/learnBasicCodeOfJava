package itheima.www;

public class class2 {
    /*
    类特性：封装，继承，多态
     */
    public static void main(String[] args) {
        //实际开发中，涉及多个对象，
    }
    class Person{

    }
    class Circle{
        //封装思想，对象代表什么，就得封装对应数据，并提供数据对应的行为。
        double radius;
        public void draw(){
            System.out.println("根据半径"+radius+"画了一个圆");
            //圆如果是自己画的，就封装到圆类里面，而人只是调用了他的方法
            //不是所有人都要调用画圆这个方法，但是圆类是一定要有圆的
            //人关门也是把关门封装到门类里面
            

        }
    }
}
