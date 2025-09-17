package com.itheima.demo2;
import java.util.Scanner;

public class shift {
    public static void main(String[] args){

        int a = 1;
        double b = 1.1;
        System.out.println(a+b);

        /*
        隐式转换规则小结：
          取值范围：byte < short < int < long < float < double
          什么时候转换？数据类型不一样，不能进行计算，需要转成一样的才可以进行计算
          转换规则1：取值范围小的和取值范围大的进行运算，小的会提升称为大的，在进行运算
          转换规则2：byte short char 三种类型的数据在运算的时候，都会先提升成int在进行运算
         */

        /*
        强制转换，
        目标数据类型 变量名 = （目标数据类型） 被强转的数据
         */

        double w = 12.3;
        int e = (byte)w;

        //把取值范围大的数值赋值给取值范围小的数据类型就要强制转化，要手动写代码
        //但是如果本身数据大过强制转换的类型，是不行的,数据会发生错误

        byte c1 = 10;
        byte c2 = 20;
        byte result = (byte)(c1 + c2);
        System.out.println(result);

        //连续相加是从左到右的，比如
        System.out.println(1 + 99 + "年黑马");//输出结果是字符串100年黑马

        Scanner Sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int input = Sc.nextInt();
        int baiwei = input/100;
        int shiwei = input%100/10;
        int gewei = input%10;
        System.out.println("百位是：" + baiwei);
        System.out.println("十位是：" + shiwei);
        System.out.println("个位是：" + gewei);

        //字符运算会用ASCII转换成数字来运算


        short s = 1;
        s += 1;
        //+= -= * /= %=都隐藏了一个强制类型转换
    }
}
