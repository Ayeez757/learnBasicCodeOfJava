package itheima.www;

public class constructorStudentTest {
    private String name;
    private int age;

    //空参构造
    public constructorStudentTest(){
        System.out.println("空参构造被调用");
    }
    //带参构造
    public constructorStudentTest(String name,int age){
        System.out.println("有参构造被调用");
        this.name = name;
        this.age = age;
    }

    /*
    构造方法执行时机：
    1.创建对象的时候由虚拟机调用，不能手动调用构造方法
    2.每创建一次对象，就会调用一次构造方法
     */

    public static void main(String[] args) {
        //空参构造
        constructorStudentTest c = new constructorStudentTest();
        //如果我们在括号里啥都没写，那就调用空参构造
        //如果我们压根没写空参构造，那么虚拟机会自动给出一个默认的一个空参构造
        //但是如果我们写了构造方法，那么系统就不会给出

        //有参构造
        constructorStudentTest c2 = new constructorStudentTest("Aye",18);


        System.out.println("c2有参构造的属性："+c2.getName()+c2.getAge());

        //如果我们没有在构造的时候赋值，属性修饰还是private，那就只能用set和get来赋值了
        c.setName("Alice");
        c.setAge(18);
        System.out.println("c1空参构造的属性:"+c.getName()+c.getAge());


    }

    public void setName (String name){
        this.name = name;
    }

    public String getName (){
        return name;
    }

    public void setAge (int age ){
        this.age = age;
    }

    public int getAge (){
        return age;
    }
}
