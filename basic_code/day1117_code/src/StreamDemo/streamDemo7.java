package StreamDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public class streamDemo7 {
    public static void main(String[] args) {
        /*
        void forEach(Consumer action)                   遍历
        long count()                                    统计
        toArray()                                       收集流中的数据，放到数组中
         */

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张三", "李四", "王五", "赵六", "老七", "老八", "牢九");

        /*
        Consumer的泛型：表示流中的数据类型
        accept方法的形参s:依次表示流里面的每一个元素
        方法体：对每一个数据的处理操作（打印）
         */
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        list.stream().forEach(s -> System.out.println(s));

        System.out.println("=========================");

        long count = list.stream().count();
        System.out.println(count);

        System.out.println("=========================");

        Object[] array = list.stream().toArray();
        System.out.println(Arrays.toString(array));

        /*
        IntFunction的泛型：具体类型的数组
        apply的形参：流中数据的个数，要跟数组的长度保持一致
        apply的返回值：具体类型的数组
        方法体：就是创建数组
         */

        /*
        toArray方法的参数的作用：负责创建一个指定类型的数组
        toArray方法的底层，会依次得到流里面的每一个数据，并把数据放到数组当中
        toArray方法的返回值：是一个装着流里面所有数据的数组
         */
        String[] arr = list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        System.out.println(Arrays.toString(arr));

        String[] arr2 = list.stream().toArray(value -> new String[value]);

        System.out.println(Arrays.toString(arr2));
    }
}
