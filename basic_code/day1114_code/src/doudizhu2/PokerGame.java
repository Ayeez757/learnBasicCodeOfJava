package doudizhu2;

import com.sun.source.tree.Tree;

import java.util.*;

public class PokerGame {


    static HashMap<Integer, String> poker = new HashMap();
    static ArrayList<Integer> list = new ArrayList<>();

    static {
        String[] color = {"♦", "♥", "♣", "♠"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        int index = 1;

        for (String n : number) {
            for (String c : color) {
                list.add(index);
                poker.put(index, c + n);
                index++;
            }
        }
        poker.put(index++, "小王");
        list.add(index);
        poker.put(index, "大王");
        list.add(index);
    }


    PokerGame() {
        Collections.shuffle(list);

        TreeSet<Integer> lord = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();

        for (int i = 0; i < list.size(); i++) {
            if (i <= 3) {
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

        lookPoker("底牌", lord);
        lookPoker("张三", player1);
        lookPoker("李四", player2);
        lookPoker("王五", player3);


    }

    public void lookPoker(String name, TreeSet set) {
        System.out.print(name + ": ");
        for (Object o : set) {
            System.out.print(poker.get(o) + " ");
        }
        System.out.println();
    }
}
