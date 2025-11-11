package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class set {
    public static void main(String[] args) {
        /*
        Set系列集合
        无序：存取顺序不一致
        不重复：可以去重
        无索引：没有带索引的方法，所以不能使用普通for循环遍历，也不能通过索引来获取元素

        Set集合的实现类
        HashSet：无序、不重复、无索引
        LinkedHashSet:有序、不重复、无索引
        TreeSet:可排序、不重复、无索引

        Set接口中的方法基本上与Collection的API一致
        Collection是单列集合的祖宗接口，他的功能是全部单列集合都可以继承使用的
        public boolean add(E e)                 把指定的对象添加到当前集合中
        public void clear()                     清空集合中所有的元素
        public boolean remove(E e)              把给定的对象在当前集合中删除
        public boolean contains(Object obj)     判断当前集合中是否包含给定对象
        public boolean isEmpty()                判断当前集合是否为空
        public int size()                       返回集合中元素的个数/集合的长度
         */

        //1.创建一个Set集合的对象
        Set<String> s = new HashSet<>();

        //2.添加元素
        //如果当前元素是第一次添加，那么可以添加成功，返回true
        //如果当前元素是第二次添加，那么添加失败，返回false
        //所以我们可以利用set集合对数据进行去重
        s.add("张三");
        s.add("张三");
        s.add("李四");
        s.add("王五");

        //3.打印集合
        //无序
        System.out.println(s);

        /*
        利用三种方式对集合遍历
        迭代器
        增强for
        lambda
         */
        //迭代器遍历
        Iterator<String> it = s.iterator();
        while(it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }

        //增强for
        for(String str : s){
            System.out.println(str);
        }

        //匿名内部类
        s.forEach(new Consumer<String>() {
            @Override
            public void accept(String str) {
                System.out.println(str);
            }
        });

        //利用lambda简化
        s.forEach(str-> System.out.println(str));
    }
}
