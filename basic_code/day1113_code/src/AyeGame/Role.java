package AyeGame;

import java.util.Random;

public class Role {
    /*
    概述：
    大一开学三四天的一个想法，自学已经很久了，想自己长远地制作一款小游戏，记录自己各个阶段的进步，
    可以发到GitHub上面(我还没在GitHub上面发过东西，可能还不太会用)，保留我各个阶段的改动。向大家取得好的建议。
    我并不打算一直连续不断地更新，我会每学习一个阶段更新一次，将我所学习到的内容加入进来，使得游戏更加的完善，多元化，增加可玩性。
    (比如日后学习了图形化界面，或许就会发布2.0版本变成2d格斗游戏，或许当我学习了数据库，我会加入用户系统，保留每位玩家信息)
   格斗游戏(1.0版本为文字格斗游戏)，初步想法是可以选择人物(和数值绑定，可以选择天赋(各种概念级天赋，比如说百分之一必杀，或者锁血，不屈，名刀，复活)，
   可以有初始金币买装备或者技能进行搭配，在回合中可以主动触发主动节能。把这个打造成有意思的回合制即时战略游戏。
   版本信息：
   从现在9.11号开始制作这一款小游戏作为1.0版本，后面的改动作为1.1，1.2，1.3以此类推，直到后面加入了图形化界面作为2.0版本
   当前1.0版本目标，先将大致的框架写出，明确基本玩法，使得文字格斗游戏有不错的可玩性，让其真的成为一款战略游戏。
     */
    /*
    基本信息：
        名字
    基本数值：
        血量
        攻击力
        防御力
        暴击率
        暴击伤害

     */
    private String name;                //名字
    private double blood;                  //血量
    private double baseDamage;             //攻击力
    private double defensePower;           //防御力
    private double criticalChance;         //暴击率
    private double criticalHitDamage;      //暴击伤害
    private double alreadyInjured;         //已受伤害

    //两个构造方法
    public Role(String name, int blood, int baseDamage,double defensePower,double criticalChance,double criticalHitDamage,double alreadyInjured) {
        this.name = name;
        this.blood = blood;
        this.baseDamage = baseDamage;
        this.defensePower = defensePower;
        this.criticalChance = criticalChance;
        this.criticalHitDamage = criticalHitDamage;
    }

    public Role() {
    }

    public double getAlreadyInjured() {
        return alreadyInjured;
    }

    public void setAlreadyInjured(double alreadyInjured) {
        this.alreadyInjured = alreadyInjured;
    }

    //get和set方法
    public String getName() {
        return name;
    }

    public double getBlood() {
        return blood;
    }

    public double getDefensePower() {
        return defensePower;
    }

    public double getCriticalChance() {
        return criticalChance;
    }

    public void setDefensePower(double defensePower) {
        this.defensePower = defensePower;
    }

    public void setCriticalChance(double criticalChance) {
        this.criticalChance = criticalChance;
    }

    public void setCriticalHitDamage(double criticalHitDamage) {
        this.criticalHitDamage = criticalHitDamage;
    }

    public double getCriticalHitDamage() {
        return criticalHitDamage;
    }

    public double getBaseDamage() {
        return baseDamage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBlood(double blood) {
        this.blood = blood;
    }

    public void setBaseDamage(double baseDamage) {
        this.baseDamage = baseDamage;
    }


    //定义一个方法用于攻击别人
    //思考：谁攻击谁
    //Role r1 = new Role
    //Role r2 = new Role
    //如果r1攻击r2，拿r1调用一个攻击的方法，r1.xxx(r2);
    //攻击者调用方法，攻击参数
    public void attack(Role role) {
        //this攻击参数
        //计算伤害
        //role.setBlood(role.getBlood()-this.getBaseDamage());
//        //随机1~20伤害
//        Random r = new Random();
//        setBlood(getBlood() - r.nextInt(20) + 1);


        //计算伤害重写(加上防御，爆率，爆伤)
        //角色单次伤害=角色基础伤害*技能伤害倍率(普通攻击默认为1)*爆伤区(暴击伤害*增伤buff)*减伤区(1-伤害减免)
        //爆伤区
        double singleCriticalHitDamage;
        Random r = new Random();
        if(r.nextInt(100)<=this.getCriticalChance()*100){
            //暴击
            singleCriticalHitDamage =this.getCriticalHitDamage();
        }else{
            //没有暴击
            singleCriticalHitDamage = 1;
        }

        //减伤区
        double singleDefensePower = 1-role.getDefensePower();
        //单次伤害结算
        double singleAttackDamage = this.getBaseDamage()*singleCriticalHitDamage*singleDefensePower;
        //计算剩余血量
        role.setBlood(role.getBlood()-singleAttackDamage);
        role.setAlreadyInjured(getAlreadyInjured()+singleAttackDamage);

        //输出结果剩余血量小数点后面太长太丑，不知道为啥我直接在打印语句中强转输出结果会报错，说是要声明变量，那这里临时搞一个吧
        //int BloodTemp = int(role.getBlood());//报错
        //int BloodTemp = (int)role.getBlood();//脑子抽了，原来是这样，看来之前学的不够扎实，用的太少了，以后要多像这样自己写项目，先注释掉
        System.out.println(this.getName() + "打了" + role.getName() + "一下" + ","+"造成了"+singleAttackDamage+"点伤害" +
                "" + role.getName() + "还剩" + (int)role.getBlood() + "血");
    }

    public void roleInfomation(){
        System.out.println(this.getName()+"的基本信息:");
        System.out.println("血量:"+ this.getBlood());
        System.out.println("攻击力:"+this.getBaseDamage());
        System.out.println("防御力:" +this.getDefensePower());
        System.out.println("暴击率:"+this.getCriticalChance());
        System.out.println("暴击伤害:"+this.getCriticalHitDamage());
        System.out.println();
    }

}

/*
临时待办：（想法）
改进计算伤害方法，加上暴击率，暴击伤害，防御力计算。(已完成，未完善)
在三四个关键血量节点加入循环停顿，后续加入玩家操作，可以在这些节点根据血量加入不同的受伤描述
加入一些攻击描述。
加上一个阅览人物信息的阅览方法(方法写完了，但是调用过于潦草，之后可能会加选角色的环节)
加上选人物环节
 */


