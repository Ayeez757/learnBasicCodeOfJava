package collection;

import java.util.ArrayList;
import java.util.Collection;

public class collectionDemo1 {
    public static void main(String[] args) {
        /*
    List系列集合：添加的元素是有序、可重复、有索引的
    set系列集合：添加的元素是无需。不重复。无索引的
    Collection是单列集合的祖宗接口，它的功能是全部单列集合都可以继承使用的
     */

    /*
    collection常用方法
    public boolean add(E e)              把给定的对象添加到当前集合中
    public void clear()                  清空集合中的所有元素
    public boolean remove(E e)           把给定的对象在当前集合中删除
    public boolean contains(Object obj)  判断当前集合中是否包含给定的对象
    public boolean isEmpty()             判断当前集合是否为空
    public int size()                    判断集合中元素的个数/集合的长度
     */
    /*
        Collecion是一个接口,我们不能直接创建他的对象
        所以，现在我们学习他的方法时，只能创建他的实现类对象
        实现类:ArrayList

        //目的：为了学习Collection接口里面的方法
        //所以利用多态的方式来创建对象
     */
        Collection<String> coll = new ArrayList<>();

        //1.添加元素
        //细节：如果我们是给list系列集合添加数据，那么返回的boolean永远是true，
        // 如果我们是给set系列集合添加数据，那么如果集合里面原本没有这个元素，返回true，表示添加成功，
        // 如果集合里面原本有这个元素，返回false,表示添加失败，因为set集合的元素不允许重复
        coll.add("aaa");
        System.out.println(coll);

        //2.清空集合中的所有元素
        coll.clear();

        //3.删除给定的对象
        //因为collection定义的是共性的东西，所以不能通过索引进行删除，只能通过对象进行删除
        //如果删除成功，返回true，如果删除失败，返回false
        coll.remove("aaa");
        System.out.println(coll);

        //4.判断元素是否存在
        //细节:contains方法底层用的是equals方法来判断的，所以如果我们要判断的是自定义对象，那再javabean类中一定要重写equals方法



        boolean result1 = coll.contains("aaa");
        System.out.println(result1);


        //5.判断集合是否为空
        boolean result2 = coll.isEmpty();
        System.out.println(result2);

        //6.获取集合的长度
        int size = coll.size();
        System.out.println(size);
    }

}
