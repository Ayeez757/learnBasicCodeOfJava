import java.util.Random;

public class ArrayExercise2 {
    public static void main(String[] args) {
        /*需求：生成10个1~100之间的随机数存入数组
        1）求出所有数据的和
        2）求所有数据的平均数
        3）统计有多少个数据比品均值小
         */

        //定义数组
        int [] arr = new int [10];
        //存数据入数组
        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            //每一次循环都会生成一个随机数
            int number = r.nextInt(100)+1;
            //把生成的数加入数组中
            arr[i]=number;
        }
        //定义求和变量
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum+arr[i];
        }
        System.out.println("数组中所有元素的和为"+sum);
        //平均值
        System.out.println("数组的平均值为"+sum/10);
        //比品均值少的数
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<sum/10){
                count++;
            }
        }
        System.out.println("比平均数少的有"+count+"个");
        //遍历数组，验证答案
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
