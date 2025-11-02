package genericity;

import java.util.ArrayList;

/**
 方法的数据类型不确定时可以使用泛型
 可以在类名后面加泛型，这样类里面所有方法都是泛型
 也可以单独在方法的修饰符后面加泛型，这样这个就是泛型方法
 */
//测试类
public class genericityMethod {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        myListUtil.addAll(list1,"aaa","bbb","bbb","bbb","bbb","bbb","bbb");
        System.out.println(list1);
    }
}

/**
 * 泛型接口，如何使用泛型接口
 * 1.实现类给出具体类型
 * 2.实现类延续泛型，创建对象时再确定
 */