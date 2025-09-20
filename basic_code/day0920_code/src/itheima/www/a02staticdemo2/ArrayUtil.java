package itheima.www.a02staticdemo2;

public class ArrayUtil {
    //私有化构造方法
    //为了不让外界创造他的对象
    private ArrayUtil(){

    }

    public static String printArr(int []arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i =0;i< arr.length;i++){
            //i索引 arr[i] 元素
            if(i==arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]+",");
            }
        }
        String str = sb.toString();
        return str;

    }

    public static double getAverage(double[] arr){
        double sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
        }
        return sum/arr.length;
    }
}
