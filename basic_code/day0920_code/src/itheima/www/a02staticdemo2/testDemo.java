package itheima.www.a02staticdemo2;

public class testDemo {

    public static void main(String[] args) {
        //测试工具类中的两个方法是否正确
        int[] arr1 = {1, 2, 3, 4, 5};
        String st = ArrayUtil.printArr(arr1);
        System.out.println(st);

        double[] arr2={1.4,25.3,6.3,7.5,36.9};
        double avgr=ArrayUtil.getAverage(arr2);
        System.out.println(avgr);
    }
}
