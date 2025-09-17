public class ArrayDemo2 {
    public static void main(String[] args) {
        //利用索引对数组中的元素进行访问
        //获取数组里面的元素
        //格式： 数组名[索引]

        int [] arr1 ={246,346,75,3423,6};
        int number = arr1[0];
        System.out.println(number);
        System.out.println(arr1[4]);

        //把数据存储到数组当中
        //格式：数组名[索引] = 具体数据/变量；
        //会将原来数据覆盖

        int [] arr2 = {1,2,3,4,5};
        for (int i = 0; i <= 4; i++) {
            System.out.println(arr2[i]);

        }

        //在java中，关于数组的一个长度属性，length
        //调用方式：数组名.length
        int [] arr = {1,3,6,5,7,8,7,34,7,53,45,5,7,5,545,74562,57,4,5,2,57,4,57,};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
