package itheima.www;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        //已知正确的用户名和密码，请用程序实现模拟用户登录，总共给三次机会，登录之后，给出相应的提示
        //1.定义两个变量记录正确的用户名字和密码
        String rightUserName ="Ayeez";
        String rightPassword = "123456";



        //循环
        for (int i = 0; i < 3; i++) {

            //2.键盘录入用户名和密码
            Scanner sc= new Scanner(System.in);
            System.out.println("请输入用户名");
            String username = sc.next();
            System.out.println("请输入密码");
            String password = sc.next();

            //3.比较
            if(username.equals(rightUserName)&&password.equals(rightPassword)){
                System.out.println("用户登录成功");
                break;
            }else{
                if(i==2){
                    System.out.println("你的账号已被锁定");
                }else{
                    System.out.println("用户登录失败,你还剩下"+(2-i)+"次机会");
                }

            }
        }
    }
}
