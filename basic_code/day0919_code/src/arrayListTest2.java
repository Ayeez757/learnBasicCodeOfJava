import java.util.ArrayList;

public class arrayListTest2 {
    public static void main(String[] args){
        ArrayList<String> list =  new ArrayList<>();
        list.add("1111");
        list.add("222");
        list.add("333");
        list.add("4444");

        //遍历
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i==list.size()-1){
                System.out.print(list.get(i));

            }else{
                System.out.print(list.get(i)+",");
            }
        }
        System.out.println("]");
        System.out.println(list);
    }
}
