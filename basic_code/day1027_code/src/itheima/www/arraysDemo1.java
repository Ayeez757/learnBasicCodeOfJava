package itheima.www;

import java.util.Arrays;

public class arraysDemo1 {
    public static void main(String[] args) {
        /**
         * public static String toString(数组)                             把数组拼接成一个字符串
         * public static int binarySearch(数组，查找的元素)                  二分查找法查找元素
         * public static int[] copyOf(原数组，新数组长度)                     拷贝数组
         * public static int[] copyOfRanger(原数组，起始数组，结束索引)        拷贝数组（指定范围）
         * public static void fill(数组，元素)                               填充数组
         * public static void sort(数组)                                    按照默认指定方式对数组进行排序
         * public static void sort(数组，排序规则)                            按照指定的规则排序
         */

        //toString：将数组变成字符串
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(arr));//[1,2,3,4,5,6,7,8,9,10]

        //binarySearch:二分查找法查找元素
        //细节1：二分查找的前提：数组中的元素必须是有序的，数组中的元素必须是升序的
        //细节2：如果要查找的元素是存在的，那么返回的是真实的索引
        //但是：如果要查找的元素是不存在的，返回的是 -插入值 - 1
        //解释：为了避免查找0时发生的错误
        System.out.println(Arrays.binarySearch(arr,10));//9
        System.out.println(Arrays.binarySearch(arr,2));//1
        System.out.println(Arrays.binarySearch(arr,20));//-11

        //copyOf:拷贝数组
        //参数一：老数组
        //参数二：新数组的长度
        //方法的底层会根据第二个参数来创建新的数组
        //如果新数组的长度是小于老数组的长度，会部分拷贝
        //如果新数组的长度是等于老数组的长度，会完全拷贝
        //如果新数组的长度是大于老数组的长度，会补上默认初始化
        int newArr1[] = Arrays.copyOf(arr,2);//[1, 2]
        int newArr2[] = Arrays.copyOf(arr,10);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        int newArr3[] = Arrays.copyOf(arr,20);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        System.out.println(Arrays.toString(newArr1));
        System.out.println(Arrays.toString(newArr2));
        System.out.println(Arrays.toString(newArr3));

        //copyOfRange:拷贝数组（指定范围）
        //细节：包头不包尾，包左不包右
        int newArr4[] = Arrays.copyOfRange(arr,0,9);//[1, 2, 3, 4, 5, 6, 7, 8, 9]
        System.out.println(Arrays.toString(newArr4));

        //fill:填充数组
        int arr6[]= Arrays.copyOf(arr,arr.length);
        Arrays.fill(arr6,100);
        System.out.println(Arrays.toString(arr6));//[100, 100, 100, 100, 100, 100, 100, 100, 100, 100]

        //sort：排序。默认情况下，给基本数据类型进行升序排序，底层使用的是快速排序
        int arr7[] ={10,2,3,5,6,1,7,8,3,9,3};
        Arrays.sort(arr7);//[1, 2, 3, 3, 3, 5, 6, 7, 8, 9, 10]
        System.out.println(Arrays.toString(arr7));
    }
}
