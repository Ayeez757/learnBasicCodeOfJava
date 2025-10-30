package itheima.www.quicksort;

public class quickSort {
    public static void main(String[] args) {
        /**
         * 快速排序
         *     第一轮：以0为基准数，确定基准数在数组中应存放的位置
         *     比基准数小的全都在基准数左边，比基准数大的全都在基准数右边
         *     后面以此类推
         */

        int arr[]={3,1,4,1,5,9,2,6,5,3,5};
        quickSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    /**
     * 参数一：我们要排序的数组
     * 参数二：要排序数组的起始索引
     * 参数三：要排序数组的结束索引
     */
    public static void quickSort(int[] arr,int i,int j){
        //定义两个变量记录要查找的范围
        int start = i;
        int end = j;

        //递归出口
        if(start>end){
            return;
        }

        //记录基准数
        int baseNumber = arr[i];

        //利用循环找到要交换的数字
        while(start != end){
            //利用end，从后往前开始找，找比基准数小的数字
            while(true){
                if(end<=start ||arr[end]<baseNumber){
                    break;
                }
                end--;
            }
            //利用start,从前往后开始找，找比基准数大的数字
            while(true){
                if(start>=end||arr[start]>baseNumber){
                    break;
                }
                start++;
            }
            //把end和start指向的元素进行交换
            int temp=arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        /**
         * 当start和end指向了同一个元素的时候，那么上面的循环就会结束
         * 表示已经找到了基准数在数组中应存入的位置
         * 基准数归位
         * 就是拿着这个范围中的第一个数字，跟start指向的元素进行交换
         */
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;

        //递归调用自己，分别处理左右两边
        quickSort(arr,i,start-1);
        quickSort(arr,start+1,j);


    }
}
