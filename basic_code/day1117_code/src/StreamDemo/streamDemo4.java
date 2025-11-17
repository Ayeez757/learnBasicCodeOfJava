package StreamDemo;

import java.util.stream.Stream;

public class streamDemo4 {
    //一堆零散数据  public static<T> Stream<T> of(T...values>   Stream接口中的静态方法
    public static void main(String[] args) {

        Stream.of(1,2,3,4,5,6).forEach(s-> System.out.println(s));
        Stream.of("a","b","c").forEach(s-> System.out.println(s));


        //注意：
        //Stream接口中静态方法of的细节
        //方法的形参是一个可变参数，可以传递一堆零散的数据，也可以传递参数
        //但是数组必须是引用数据类型的，如果传递基本数据类型，是会把整个数组当作一个元素，放到Stream当中。
        int[] arr = {1,2,3,4};
        Stream.of(arr).forEach(s-> System.out.println(s));
    }
}
