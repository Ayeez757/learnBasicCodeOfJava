package genericity;

public class testDemo {
    public static void main(String[] args) {
        myArrayList<String> list1 = new myArrayList<String>();

        list1.add("aaa");
        list1.add("bbb");
        list1.add("ccc");
        list1.add("ddd");

        System.out.println(list1);

        myArrayList<Integer> list2 = new myArrayList<Integer>();
        list2.add(123);
        list2.add(456);
        list2.add(789);

        int i = list2.get(0);
        System.out.println(i);

        System.out.println(list2);
    }
}
