package itheima.www.a03polymorphismdemo3;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        //在多态形式下，右边的对象可以实现解耦合，便于扩展和维护
        //定义方法的时候，使用父类作为参数，可以接收所有子类对象，体现多态的扩展性与便利
        //如果一个方法的形参是类名，就可以传递所有这个类的子类的对象
        StringBuilder sb = new StringBuilder();
        //sb.append();这个方法就是例子，形参是object所以里面就可以写所有子类对象
        ArrayList<String> list = new ArrayList<>();
        ArrayList list1 = new ArrayList();
        //list.add();所有东西都可以赛里面
    }


}
