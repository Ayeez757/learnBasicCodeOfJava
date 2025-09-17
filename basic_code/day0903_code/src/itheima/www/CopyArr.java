package itheima.www;

public class CopyArr {
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int[] copyNew = CopyOfRange(arr,3,7);
        for(int i = 0;i<copyNew.length;i++){
            System.out.println(copyNew[i]);
        };
    }

    public static int[] CopyOfRange(int[] arr,int from,int to){
        int [] newArr = new int[to - from];
        int temp = 0;
        for(int i = from;i < to;i++){
            newArr[temp] = arr[i-1];
            temp++;
        }
        return  newArr;
    };
}

