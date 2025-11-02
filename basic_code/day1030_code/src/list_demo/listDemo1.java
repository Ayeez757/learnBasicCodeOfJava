package list_demo;

import java.util.ArrayList;
import java.util.List;

public class listDemo1 {
    public static void main(String[] args) {
        /*
        List系列集合独有的方法：
            void add(int index,E element)       在此集合中的指定位置插入指定元素
            E remove(int index)                 删除指定索引处的元素，返回被删除的元素
            E set(int index,E element)          修改指定索引处的元素，返回被修改的元素
            E get(int index)                    返回指定索引处的元素
         */

        //1.创建一个集合
        List<String> list = new ArrayList<>();

        //2.添加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //3.打印集合
        System.out.println(list);

        //void add(int index,E element)       在此集合中的指定位置插入指定元素
        list.add(1,"qqq");
        System.out.println(list);

        //E remove(int index)                删除指定索引处的元素，返回被删除的元素
        String remove = list.remove(0);
        System.out.println(remove);

        /*
        list系列集合中的两个删除的方法
        1.直接删除元素
        2.通过索引进行删除
        如果我我们在一个含有数字的集合里面对数字进行删除操作，他会优先认为是对索引进行操作，
        因为在方法的重载中，java会默认让形参的数据类型匹配，
        如果我们想删除的是1这个元素（而不是索引），我们可以手动装箱，让int变成Integer再进行删除.
         */
        Integer i = Integer.valueOf(1);
        list.remove(i);

        //E set(int index,E element)          修改指定索引处的元素，返回被修改的元素
        String result = list.set(0,"qqq");
        System.out.println(result);

        //E get(int index)                    返回指定索引处的元素
        String s = list.get(0);
        System.out.println(s);

        //打印集合
        System.out.println(list);
    }
}
