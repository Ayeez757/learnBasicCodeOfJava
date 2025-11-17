package StreamDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class streamDemo1 {
    /*
    单列集合    default Stream<E> stream()      Collection中的默认方法
    双列集合    无                               无法直接使用stream流
    数组       public static <T> Stream<T> stream(T[] array)  Arrays工具类中的静态方法
    一堆零散数据  public static<T> Stream<T> of(T...values)   Stream接口中的静态方法
     */
    public static void main(String[] args) {

        //1.单列集合获取Stream流
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"a","b","c","d","e","f","d","e");
        //获取一个Stream流，把数据放到Stream流上
        Stream<String> stream1 = list.stream();
        //使用终结方法打印一下所有数据
        stream1.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                //s表示stream流里每一个数据
            }
        });
        //用lambda表达式简化
        list.stream().forEach(s-> System.out.println(s));

    }

}
