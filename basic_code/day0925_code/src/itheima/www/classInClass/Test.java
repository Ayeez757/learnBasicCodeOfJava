package itheima.www.classInClass;

public class Test {
    public static void main(String[] args) {
        Outer.Inner1 oi1 = new Outer().new Inner1();

        Outer o = new Outer();
        Object oi2 = o.getInstance();

        System.out.println("oi1"+oi1);
        System.out.println("oi2"+oi2);
    }
}
