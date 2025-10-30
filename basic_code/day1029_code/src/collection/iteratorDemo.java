package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class iteratorDemo {
    public static void main(String[] args) {
        /*
        Collection遍历方式
        迭代器遍历
        增强for循环
        Lambda表达式遍历
         */

         /*
        迭代器遍历
        迭代器在java中的类是Iterator，迭代器是集合专用的遍历方式

        迭代器遍历相关的三个方法:
        Iterator<E> iterator()              返回迭代器对象，默认指向当前集合的0索引
        boolean hasNext()                   判断当前位置是否有元素，有元素返回true，没有元素返回false
        E next()                            获取当前位置的元素，并将迭代器对象移向下一个元素
         */

        //1.创建集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        //2.获取迭代器对象
        //迭代器就像指针，默认指向集合的0索引处
        Iterator<String> it = coll.iterator();
        //3.利用循环不断地去获取集合中的每一个元素
        while(it.hasNext()){
            //4.next方法地两个事情，获取元素并移动指针
            String str = it.next();
            System.out.println(str);
        }

        /*
        细节：
        1.如果指针指到最后没有元素的位置还用next，那么会报错：NoSuchElementException
        2.迭代器遍历完毕，指针不会复位,如果想要再次遍历，那么要重新获取一个新的迭代器对象
        3.循环中只能用一次next方法
        4.迭代器遍历时，不能用集合的方法进行增加或者删除
         */





    }
}
