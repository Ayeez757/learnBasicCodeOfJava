public class ArrayExercise3 {
    public static void main(String[] args) {
        /*
        需求：定义一个数组，存入1，2，3，4，5.交换首尾索引的元素
        交换前：1，2，3，4，5
        交换后：5，4，3，2，1
         */
        int [] arr = {1,2,3,4,5};
        int temp;
        for (int i = 0; i < arr.length/2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
