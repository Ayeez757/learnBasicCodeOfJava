package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class test3 {
    public static void main(String[] args) {
        /**
         * 点名，要求点过的学生本轮不再点名 ，全部学生被点完后开启新的一轮
         */
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            Collections.addAll(list, "张三", "李四", "王五", "赵六", "马嘉祺", "老八", "牢九");
            Random r = new Random();
            while (!list.isEmpty()) {
                System.out.println((list.remove(r.nextInt(list.size()))));
            }
            System.out.println("================");
        }
    }
}
