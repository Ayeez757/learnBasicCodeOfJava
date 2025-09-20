package itheima.www;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayListTest6 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<student> list = new ArrayList<>();

        //键盘录入
        Scanner sc = new Scanner(System.in);
        //循环录入
        for(int i = 0;i<3;i++){
            System.out.println("请输入学生的姓名:");
            String name = sc.next();
            System.out.println("请输入学生的年龄:");
            int age = sc.nextInt();

            //添加进对象
            student st = new student(name,age);
            //添加进数组
            list.add(st);
        }

        for(int i=0;i<list.size();i++){
            System.out.println("学生的姓名"+list.get(i).getName()+"学生的年龄"+list.get(i).getAge());
        }

    }
}
