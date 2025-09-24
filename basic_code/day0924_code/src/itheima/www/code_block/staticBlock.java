package itheima.www.code_block;

public class staticBlock {
    //static{}
    //需要通过static关键字修饰，随着类的加载而加载，并且自动触发，只执行一次
    //就是说，创建多个对象也只有第一次的时候类会被加载
    //使用场景：在类加载的时候，做一些数据初始化的时候使用
    //相比于以前数据初始化写在方法里面，可以防止方法被反复调用，数据初始化被反复执行，这样子可以节省时间

    static{
        System.out.println("static代码块");
    }
}
