package list_demo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class listDemo2 {
    public static void main(String[] args) {
        /*
        List系列集合的五种遍历方式：
            1.迭代器
            2.列表迭代器
            3.增强for
            4.Lambda表达式
            5.普通for循环
         */

        //创建集合并添加元素
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        //1.迭代器
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

        //2.增强for
        for(String s : list){
            System.out.println(s);
        }

        //3.Lambda表达式
        list.forEach(s-> System.out.println(s));

        //4.普通for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //5.列表迭代器
        //获取一个列表迭代器的对象，里面的指针默认也是指向0索引的
        //额外添加了一个方法：在遍历的过程中，可以添加元素
        ListIterator<String> it2 = list.listIterator();
        while(it2.hasNext()){
            String str = it2.next();
            if("bbb".equals(str)){
                it2.add("qqq");
            }
        }
        System.out.println(list);


    }
    /*
    迭代器遍历   在遍历的过程中需要删除元素，请使用迭代器
    列表迭代器   在遍历的过程中需要添加元素，请使用列表迭代器
    增强for遍历
    Lambda表达式   仅仅想遍历，那么使用增强for或者Lambda表达式
    普通for       如果遍历的时候想操作索引，可以用普通for
     */
}
