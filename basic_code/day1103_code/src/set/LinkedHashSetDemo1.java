package set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 {
    public static void main(String[] args) {
        /*
        LinkedHashSet继承了HashSet
        LinkedHashSet底层原理
        1.有序、不重复、无索引
        2.这里的有序值得是保证存储和取出的元素顺序一致
        3.原理：底层数据结构依然是哈希表，只是每个元素又额外多了一个双链表的机制记录存储的顺序

         */

        //1.创建学生对象
        Student s1 = new Student("zhangsan",18);
        Student s2 = new Student("lisi",18);
        Student s3 = new Student("wangwu",18);
        Student s4 = new Student("zhangsan",18);

        //2.创建LinkedHashSet对象
        LinkedHashSet<Student> lhs1 = new LinkedHashSet<>();

        //3.添加元素
        System.out.println(lhs1.add(s1));
        System.out.println(lhs1.add(s2));
        System.out.println(lhs1.add(s3));
        System.out.println(lhs1.add(s4));

        //4.打印集合
        System.out.println(lhs1);
    }
}
