import java.sql.Array;
import java.util.ArrayList;

public class arrayListTest {
    public static void main(String [] args){
        ArrayList<String> list = new ArrayList<>();
        //增删改查功能
        System.out.println(list);//这个类底层改动过，直接输出的不是地址值，而是直接输出内容
        list.add("123");
        //集合里面可以存放引用类型，但不能直接存放基本类型的变量
        System.out.println(list);
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        System.out.println(list);
        //删可以按照内容删，也可以按照索引删，返回一个布尔值，表示是否删除成功
        list.remove("aaa");
        list.remove(3);
        System.out.println(list);
        //改
        list.set(0,"321");
        System.out.println(list);
        //查
        String result=list.get(0);
        System.out.println(list);
        System.out.println(result);
    }
}
