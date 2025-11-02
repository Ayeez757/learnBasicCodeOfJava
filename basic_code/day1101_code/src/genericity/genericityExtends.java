package genericity;

import java.util.ArrayList;

public class genericityExtends {
    public static void main(String[] args) {
        /// 泛型不具备继承性，但是数据具备继承性
        //创建集合的对象
        ArrayList<ye> list1 = new ArrayList<>();
        ArrayList<fu> list2 = new ArrayList<>();
        ArrayList<zi> list3 = new ArrayList<>();

        //调用method发现数据为子类的对象无法传参，会报错
        method(list1);
        method(list2);
        method(list3);

        //但是数据具备继承性
        list1.add(new ye());
        list1.add(new fu());
        list1.add(new zi());


    }
    //写一个method
    public static void method(ArrayList<ye> list ){}
}
class ye{}
class fu extends ye{}
class zi extends fu{}

