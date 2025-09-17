public class ArrayExercise4 {
    public static void main(String[] args) {

        //要求遍历数组，如果是奇数，则当前数字扩大两倍
        //如果是偶数，则当前数字变为二分之一

        //定义数组
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        //遍历数组
        for (int i = 0; i < arr.length; i++) {

            //判断奇偶
            if (arr[i]%2 ==0){
                arr[i] = arr[i]/2;

            }else{
                arr[i] = arr[i]*2;
            }
        }

        //输出数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}
