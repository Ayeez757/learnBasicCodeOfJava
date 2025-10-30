package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class lambdaDemo1 {
    public static void main(String[] args) {
        /*
        lambda表达式的遍历：
                default void forEach(Consumer<? super T> action):
         */

        //1.创建集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("zhangsan");
        coll.add("lisi");
        coll.add("wangwu");
        //2.利用匿名内部类进行遍历
        coll.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        //利用lambda表达式进行简化
        coll.forEach(( String s)->{
            System.out.println(s);
        });

        //再简化
        coll.forEach(s-> System.out.println(s));


    }
}
