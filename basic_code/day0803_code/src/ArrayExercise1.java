public class ArrayExercise1 {
    public static void main(String[] args) {
        //长度为5的数组求最大值并打印
        int [] arr = {33,5,22,55,44};
        int max = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            max = arr[i] > arr[i+1]? arr[i] :arr[i+1];
        }
        System.out.println(max);
    }
}
