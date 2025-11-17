package AyeGame;

import java.util.Scanner;

public class GameTest {
    public static void main(String[] args) {

        //创建角色
        Role r1 = new Role("Aye",100,3,0.3,0.4,1.8,0);//名，命，攻，防，爆率，爆伤
        Role r2 = new Role("Ailes",100,5,0.1,0.2,1.2,0);

        //调用角色信息方法
        r1.roleInfomation();
        r2.roleInfomation();

        //利用Scanner暂停游戏
        Scanner sc = new Scanner(System.in);
        System.out.println("按下回车继续游戏");
        sc.nextLine();

        //循环攻击
        while(true){
            //互相攻击一回合
            //先r1攻击r2
            r1.attack(r2);
            if (r2.getBlood()<=0){
                System.out.println(r2.getName()+"被"+r1.getName()+"达斯了");
                break;
            }

            //再r2攻击r1
            r2.attack(r1);
            if (r1.getBlood()<=0){
                System.out.println(r1.getName()+"被"+r2.getName()+" 达斯了");
                break;
            }

            //加入一个游戏中断
            int temp = 0;//记录中断次数
            if(r1.getAlreadyInjured()>30 && temp ==0){//我真是个天才
                System.out.println(r1.getName()+"只剩"+(int)r1.getBlood()+"滴血，是否要使用技能？");
                String skillOrNot = sc.next();
                //判断是否要使用技能
                if(skillOrNot.equals("是")) {
                    System.out.println("你使用了技能(待补充)");
                    System.out.println("按下回车继续");
                    sc.nextLine();
                }else{
                    System.out.println("你未使用技能");
                }
                temp++;

            }
        }
    }
}
