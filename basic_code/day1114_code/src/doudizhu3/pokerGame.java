package doudizhu3;

import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
import java.util.*;

public class pokerGame {



    static ArrayList<String> list = new ArrayList<>();
    static HashMap<String,Integer> hm = new HashMap<>();

    static {
        String[] color = {"♦", "♥", "♣", "♠"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        for (String c : color) {
            for (String n : number) {
                list.add(c+n);
            }
        }
        list.add(" 大王");
        list.add(" 小王");

        hm.put("J",11);
        hm.put("Q",12);
        hm.put("K",13);
        hm.put("A",14);
        hm.put("2",15);
        hm.put("小王",50);
        hm.put("大王",100);
    }


    public pokerGame() {
        Collections.shuffle(list);

        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (i <= 2) {
                lord.add(list.get(i));
                continue;
            }
            if (i % 3 == 0) {
                player1.add(list.get(i));
            } else if (i % 3 == 1) {
                player2.add(list.get(i));
            } else {
                player3.add(list.get(i));
            }
        }


        order(lord);
        order(player1);
        order(player2);
        order(player3);



        lookPoker("底牌", lord);
        lookPoker("张三", player1);
        lookPoker("李四", player2);
        lookPoker("王五", player3);


    }
    public void order(ArrayList<String> list){
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String color1 = o1.substring(0,1);
                int value1 = getValue(o1);

                String color2 = o2.substring(0,1);
                int value2 = getValue(o2);

                int i = value1-value2;

                return i ==0?color1.compareTo(color2):i;
            }
        });

    }

    public int getValue(String poker){
       String number = poker.substring(1);

       if (hm.containsKey(number)){
           return hm.get(number);
       }else{
            return Integer.parseInt(number);
       }
    }


    public void lookPoker(String name, ArrayList<String> list) {
        System.out.print(name + ": ");
        for (Object o : list) {
            System.out.print(o + " ");
        }
        System.out.println();
    }
}
