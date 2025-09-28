package com.itheima.puzzlegame.ui;

import javax.swing.*;

public class LoginJFrame extends JFrame{

    //构造
    public LoginJFrame(){

        this.setSize(488,430);
        //设置界面的标题
        this.setTitle("拼图单机版 v1.0");
        //设置界面让界面处于置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置界面关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //设置界面是否可见
        this.setVisible(true);
    }



}
