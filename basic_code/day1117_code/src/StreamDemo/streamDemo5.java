package StreamDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class streamDemo5 {
    public static void main(String[] args) {
        /*
          Stream<T> filter(Predicate<? super T>predicate)       过滤
          Stream<T> limit(long maxSize)                         获取前几个元素
          Stream<T> skip(long n)                                跳过前几个元素
          Stream<T> distinct()                                  元素去重，依赖(hashCode和equals方法)
          static<T> Stream<T> concat(Stream a,Stream b)         合并a和b两个流为一个流
          Stream<R> map(Function<T,R> mapper)                   转换流中的数据类型\
          注意1：中间方法，返回新的Stream流，原来的Stream流只能使用一次，建议使用链式编程
          注意2：修改Stream流中的数据，不会影响原来集合或者数组中的数据
         */
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"123","123","246","1263","572");
        //Stream<T> filter(Predicate<? super T>predicate)       过滤
        list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                //如果返回值为true,表示当前数据留下
                //如果返回值为false,表示当前数据舍弃不要
                return s.startsWith("1");
            }
        }).forEach(s-> System.out.println(s));

        //lambda简化
        list.stream().filter(s -> s.startsWith("1")).forEach(s -> System.out.println(s));

        System.out.println("====================");

        list.stream().limit(2).forEach(s-> System.out.println(s));
        list.stream().skip(2).forEach(s-> System.out.println(s));

        System.out.println("===================");

        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"1","1","2","2","2","3","4");
        list1.stream().distinct().forEach(s-> System.out.println(s));

        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"a","b");
        Stream.concat(list1.stream(),list2.stream()).forEach(s-> System.out.println(s));

        System.out.println("=============================================");



    }
}
