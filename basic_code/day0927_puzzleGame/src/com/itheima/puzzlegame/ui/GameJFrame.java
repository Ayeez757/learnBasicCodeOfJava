package com.itheima.puzzlegame.ui;

import javax.swing.*;
import java.util.Random;

//游戏界面的对象，继承JFrame，
public class GameJFrame extends JFrame {


    //创建二维数组
    int [][] imgsArray2=new int[4][4];

    //写一下空参构造初始化窗口，在app类直接new
    public GameJFrame(){
        //初始化窗口
        initJFrame();

        //初始化菜单
        initJmenuBar();

        //打乱图片
        initArr();



        //添加图片
        initImage();

        //设置是否可见
        this.setVisible(true);

    }

    //打乱图片的方法
    private void initArr(){

        //创建一维数组
        int [] imgsArray1={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        //打乱一维数组
        Random r = new Random();
        for (int i = 0; i < imgsArray1.length; i++) {
            int index = r.nextInt(16);
            int temp = imgsArray1[i];
            imgsArray1[i] = imgsArray1[index];
            imgsArray1[index] = temp;

        }
        //塞到二维数组里面去
        for(int i = 0 ; i < 4;i++){
            for (int j = 0; j < 4; j++) {
                imgsArray2[i][j]=imgsArray1[i*4+j];
            }
        }
//        //检查是否打乱
//        for (int i = 0; i < imgsArray2.length; i++) {
//            for (int j = 0; j < imgsArray2[i].length; j++) {
//                System.out.print(imgsArray2[i][j]+" ");
//            }
//            System.out.println();
//        }


    }

    private void initImage(){
//        //图片名字的计数器
//        int num = 1;
        //改为根据二维数组创建
        //循环嵌套添加图片
        int num;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                //根据二维数组找图片
                num = imgsArray2[i][j];
                //创建imageIcon对象
                ImageIcon icon = new ImageIcon("D:\\Develop\\Java\\Code\\Learn\\basic_code\\" +
                        "day0927_puzzleGame\\imgs\\fufu\\_"+num+".jpg");
                //创建一个jlabel对象
                JLabel jLabel = new JLabel(icon);
                //设置图片位于左上角
                jLabel.setBounds(j*106,i*106,105,105);
                //把管理容器添加到界面
                this.add(jLabel);
//                //计数器加一
//                num++;
            }
        }
    }



    private void initJmenuBar() {
        /**
         * 游戏：重新开始 图片设置 重新登录
         * 关于：作者 投喂
         */
        //新建菜单栏
        JMenuBar JMB = new JMenuBar();
        //新建Jmenu对象
        JMenu GameJM = new JMenu("游戏设置");
        JMenu AboutJM = new JMenu("关于");
        //新建Jmenuitem对象
        JMenuItem reGameJMI = new JMenuItem("重新开始");
        JMenuItem imgSettingJMI = new JMenuItem("图片设置");
        JMenuItem reLoginJMI = new JMenuItem("重新登录");

        JMenuItem fabricatorJMI = new JMenuItem("作者");
        JMenuItem feedFabricatorJMI = new JMenuItem("投喂我！");

        //把Jmenu加到Jmenubar里面
        JMB.add(GameJM);
        JMB.add(AboutJM);
        //把JmenuItem加到Jmenu
        GameJM.add(reGameJMI);
        GameJM.add(imgSettingJMI);
        GameJM.add(reLoginJMI);

        AboutJM.add(fabricatorJMI);
        AboutJM.add(feedFabricatorJMI);

        //给页面设置菜单
        this.setJMenuBar(JMB);
    }


    private void initJFrame() {
        //设置宽高
        this.setSize(603,680);
        //设置界面的标题
        this.setTitle("拼图单机版 v1.0");
        //设置界面让界面处于置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置界面关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消内容自动居中
        this.setLayout(null);
    }
}
