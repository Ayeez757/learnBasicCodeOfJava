public class Array {


    /*

    数组的定义
    数据类型 [] 数组名
    数据类型 数组名[]
     */

    public static void main(String[] args) {
        //数组的初始化

        int [] array = new int[]{11,22,33};
        double [] array2 = {14,35,352,33,5.3,253};//简化格式

        //需求1：定义数组储存5个学生的年龄
        int [] age = {11,12,13,14,15};
        //需求2，定义三个学生姓名
        String [] name = {"张三","李四","王五"};
        //定义数组存储四个学生的身高
        double[] arr = {161,157.4,2365.346,34.6};

        System.out.println(age);//[I@b4c966a
        //[I@b4c966a
        /*
        地址值：[代表数组，I代表int
         */



    }



}
