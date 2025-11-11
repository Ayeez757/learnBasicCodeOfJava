package map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class mapDemo4 {
    public static void main(String[] args) {
        //Map集合的第一种遍历方式

        //1.创建Map集合的对象
        Map<String, String> map = new HashMap<>();

        //2.添加元素
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");
        map.put("D", "d");
        map.put("E", "e");

        //3.利用lambda表达式进行遍历
        //底层：
        //forEach其实就是利用第二种方式进行遍历，依次得到每一个键和值
        //再调用accept方法
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {
                System.out.println(s + "=" + s2);
            }
        });

        //利用lambda表达式简化
        map.forEach((key,value)-> System.out.println(key+"="+value));
    }
}
