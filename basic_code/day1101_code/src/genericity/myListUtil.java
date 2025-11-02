package genericity;

import java.util.ArrayList;

public class myListUtil {
    /**
     方法的数据类型不确定时可以使用泛型
     可以在类名后面加泛型，这样类里面所有方法都是泛型
     也可以单独在方法的修饰符后面加泛型，这样这个就是泛型方法
     */
    //这里写一个简易的增加多个元素的方法作为演示
    public static<E> void addAll(ArrayList<E> list, E...e){
        for (E e1 : e) {
            list.add(e1);
        }
    }
}
