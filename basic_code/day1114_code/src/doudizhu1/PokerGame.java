package doudizhu1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PokerGame {
    static ArrayList<String> list =  new ArrayList<>();

    static{
        String[] color = {"♠","♣","♥","♦"};
        String[] number = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

        for (String c : color) {
            for (String n : number) {
                list.add(c+n);
            }
        }
        list.add("小王");
        list.add("大王");



    }

    PokerGame(){
        Collections.shuffle(list);

        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if(i<=2){
                lord.add(list.get(i));
                continue;
            }
            if(i%3==0){
                player1.add(list.get(i));
            } else if (i%3==1) {
                player2.add(list.get(i));
            }else{
                player3.add(list.get(i));
            }
        }

        lookPoker("张三",player1);
        lookPoker("李四",player2);
        lookPoker("王五",player3);


        System.out.println(list);
    }

    public void lookPoker(String name,ArrayList<String> list){
        System.out.print(name+": ");
        for (String string : list) {
            System.out.print(string+" ");
        }
        System.out.println();
    }
}
