package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class test1 {
    public static void main(String[] args) {
        /*
        随机点名
         */

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张三", "李四", "王五", "赵六", "老七", "老八");
        Random r = new Random();
        int index = r.nextInt(list.size());
        String name =list.get(index);
        System.out.println(name);

        Collections.shuffle(list);
        System.out.println(list.get(0));

    }
}
