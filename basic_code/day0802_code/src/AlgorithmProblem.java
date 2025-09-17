import java.util.Scanner;

public class AlgorithmProblem {
    //题目：录入一串数据到数组中，然后排序进行输出
    public static void main(String[] args) {

        //创建数组
        int[] arr = {};
        //打印提示语句
        System.out.println("请输入一些整数，用回车分隔，全部录入后请输入over来结束");
        //键盘录入
        Scanner Sc = new Scanner(System.in);
        //循环录入
        int count = 0;
        //判断录入或终止
        while (true) {
            arr[count] = Sc.nextInt();
            if (Sc.equals("over")) {
                break;
            }
            //录入
//            arr[count] = Sc.nextInt();
            count++;

        }
        //输出结束语句
        System.out.println("输入完成，接下来为您排序，结果如下：");
        //遍历排序

        //输出
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
