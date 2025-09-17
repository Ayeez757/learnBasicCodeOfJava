import java.util.Random;

public class ArrayExercise {
    //需求：定义一个数组，存入1~5.要求打乱数组中所有的数据
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int temp;
        int rad;
        Random r =new Random();
        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            rad=r.nextInt(5);
            arr[i] = arr[rad];
            arr[rad] =temp;


        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
