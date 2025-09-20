package itheima.www;

import java.util.ArrayList;

public class arrayListTest7 {
    public static void main(String[] args) {
        ArrayList<user> list = new ArrayList<>();
        user u1 = new user("张三",01,"114514");
        user u2 = new user("李四",122363146,"123456");
        user u3 = new user("王五",03,"12345678");

        //把用户对象加入到集合
        list.add(u1);
        list.add(u2);
        list.add(u3);

        //boolean b = contains(list,03);
        System.out.println(getIndex(list,02));
        //System.out.println(b);
    }

    //根据id查找用户
//    public static boolean contains(ArrayList<user> list,int id){
//        for(int i =0;i<list.size();i++){
//            if(list.get(i).getId()==id){
//                return true;
//            }
//        }
//        return false;
//    }
//}

//现在更改需求，改成如果有就返回索引，没有就返回-1
public static int getIndex(ArrayList<user> list,int id){
    for(int i =0;i<list.size();i++){
        if(list.get(i).getId()==id){
            return i;
        }
    }
    return -1;


    }
}
