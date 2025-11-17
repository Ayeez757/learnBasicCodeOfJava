package StreamDemo;

import java.util.HashMap;

public class streamDemo2 {
        /*
    双列集合    无                               无法直接使用stream流
     */

    public static void main(String[] args) {
        //双列集合
        //1.创建双列集合
        HashMap<String,Integer> hm = new HashMap<>();
        //2.添加数据
        hm.put("aaa",111);
        hm.put("bbb",222);
        hm.put("ccc",333);
        hm.put("ddd",444);
        hm.put("eee",555);
        //3.第一种获取Stream流
        hm.keySet().stream().forEach(s-> System.out.println(s));
        //4.第二种获取Stream流
        hm.entrySet().stream().forEach(s-> System.out.println(s));
    }

}
