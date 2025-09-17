package itheima.www;

public class Method6 {
    public static void main(String[] args) {

        //定义数组
        int[] arr= {11,222,33,44,55};
        //调用方法
        printArr(arr);
        rankArr(arr);
        printArr(arr);
    }

    public static void printArr(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");

        }
        System.out.println();
    }

    public static void rankArr(int [] arr){
        //遍历数组
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i]<arr[i+1]){
                    int temp =arr[i];
                    arr[i] = arr[i +1];
                    arr[i+1] = temp;
                }
        }

        }
    }

}
