package itheima.www;

public class stringDemo {
    public static void main(String[] args) {

        //调用方法
        int [] arr = {1,5,4,7,4,8,45,789,4,6,357,45,436};
        String str1 =arrToString(arr);
        System.out.println(str1);
    }

    public static String arrToString(int[] arr){
        //安全校验
        if(arr==null || arr.length ==0){
            return "";
        }

        String str ="[";
        for (int i = 0; i < arr.length; i++) {

            if(i == arr.length-1){
                str =str +arr[i]+"]";
            }else{
                str = str +arr[i]+", ";
            }

        }
        return str;
    }
}
