package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mapDemo3 {
    public static void main(String[] args) {
        //Map集合的第二种遍历方式

        //1.创建Map集合的对象
        Map<String, String> map = new HashMap<>();

        //2.添加元素
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");
        map.put("D", "d");
        map.put("E", "e");

        //3.Map集合的第二种遍历方式
        //通过键值对对象进行遍历
        //3.1通过一个方法获取所有的键值对对象，返回一个Set集合
        Set<Map.Entry<String,String>> entries = map.entrySet();
        //3.2遍历entries这个集合，去得到里面的每一个键值对对象
        for(Map.Entry<String,String> entry : entries){
            //3.3利用entry调用get方法获取键和值
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }
}