package itheima.www;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        //键盘录入
        //第一套体系
        //nextInt();接收整数
        //nextDouble();接收小数
        //next();接收字符串
        //遇到空格，制表符，回车就停止接受，这些符号后面的数据就不会接受了。

        //第二套体系
        //nextLine();接收字符串

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int num1 = sc.nextInt();
        System.out.println(num1);
        System.out.println("请键盘录入第二个整数");
        int num2 = sc.nextInt();
        System.out.println(num2);

        //sc.next();
        /*
        如果我们第一次录入123 123 ，则num1=123 num2 =123,中间有空格，第一次就不会往后接收了，内存里后面的数据就会被第二次接收。(开头的空格被忽略)
         */

        Scanner sc2 = new Scanner(System.in );
        System.out.println("请输入第一个字符串");
        String s1 = sc2.nextLine();
        System.out.println(s1);
        System.out.println("请输入第二个字符串");
        String s2 = sc2.nextLine();

        System.out.println(s2);
    }
}
