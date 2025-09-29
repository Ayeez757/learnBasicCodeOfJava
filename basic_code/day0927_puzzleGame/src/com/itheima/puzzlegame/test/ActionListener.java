package com.itheima.puzzlegame.test;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class ActionListener {



    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(500,500);
        //取消居中放置
        jFrame.setLayout(null);




        //添加按钮
        JButton jbt1 = new JButton("点我点我");
        //设置按钮位置和宽高
        jbt1.setBounds(0,0,200,50);
        //加到窗口中
        jFrame.add(jbt1);

        jbt1.addActionListener(new AbstractAction( ){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("我被点了");
            }
        }
        );







        jFrame.setVisible(true);

    }
}
