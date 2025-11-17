package test;

import java.lang.reflect.Array;
import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class test2 {
    public static void main(String[] args) {
        /**
         * 点名，男生概率70%，女生30%
         */
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,1,1,1,1,1,1,0,0,0);
        ArrayList<String> boyList = new ArrayList<>();
        ArrayList<String> girlList = new ArrayList<>();
        Collections.addAll(boyList,"张三","李四","王五","赵六","马嘉七","老八","牢九");
        Collections.addAll(girlList,"小美","小花","小天");
        Random r = new Random();
        int number = list.get(r.nextInt(list.size()));
        if(number == 1){
            System.out.println(boyList.get(r.nextInt(boyList.size())));
        }else{
            System.out.println(girlList.get(r.nextInt(girlList.size())));
        }
    }
}
