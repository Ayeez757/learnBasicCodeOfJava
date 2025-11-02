package genericity;

import java.util.ArrayList;
import java.util.Iterator;

public class genericity {
    public static void main(String[] args) {
        /*
        泛型可以统一数据类型<数据类型>
        没有泛型的时候，集合如何储存数据？
        如果我们没有给集合指定类型，默认认为所有的数据类型都是Object类型
        此时可以往集合添加任意的数据类型
        带来一个坏处，和多态的弊端一样，我们在获取数据的时候，无法使用他（子类）的特有行为

         */

        //1.创建集合对象
        ArrayList list = new ArrayList();

        //2.添加数据
        list.add(123);
        list.add("aaa");
        list.add(new Student("zhangsan",123));

        //3.遍历集合获取里面的每一个元素
        Iterator it = list.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            //多态的弊端是不能访问子类特有的功能
            //obj.length();
            //强转也会报错
            String str = (String) obj;
            str.length();
            System.out.println(str);
        }

    }
}


class Student{
    private String name;
    private int age;

    public Student(){

    }
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
}

/**
 * 泛型的好处：
 * 统一数据类型
 * 把运行时期的问题提前到编译期间，避免了强制类型转换可能出现的异常，因为在编译阶段类型就能确定下来
 */


