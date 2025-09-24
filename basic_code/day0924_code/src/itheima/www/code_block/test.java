package itheima.www.code_block;

public class test {

    public static void main(String[] args) {
        //局部代码块
        //提前结束变量的生命周期，节约内存，但是其实已经用处不大了，那内存没啥影响了
        int a = 0;
        System.out.println(a);
    }


}

class demo {

    String name;
    int age;

    //构造代码块
    //写在成员的位置，会在创建对象时，调用构造方法前先执行构造代码块的内容

    {
        System.out.println("开始创建对象了");
    }

    //但是也用的少，因为不够灵活，如果又有了新的构造方法，但是不想执行构造代码块里面的方法就很难搞了
    //如果多个构造方法里面有重复的代码，一般这样干：写在一个构造方法里面，然后其他的都用this关键字调用
    public demo(){
        this(null,0);

    }
    public demo(String name,int age){
        System.out.println("有参构造");
    }
    //或者直接在本类抽取出一个方法，然后在构造方法里面调用就好了
}