package itheima.www.Integer1;
import java.util.Scanner;

public class IntergerDemo2 {
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String line =sc.nextLine();
        System.out.println(line);
        int i = Integer.parseInt(line);
        System.out.println(i);
        double d = Double.parseDouble(line);
        System.out.println(d);
    }
}
