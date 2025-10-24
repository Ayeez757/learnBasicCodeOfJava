package com.itheima.puzzlegame.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

//游戏界面的对象，继承JFrame，实现KeyListener键盘监听接口
public class GameJFrame extends JFrame implements KeyListener {

    //判断游戏胜利的数组
    int [][] win={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
    };


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

    //记录空白图片的索引坐标用于后续
    int x;//内部数组索引
    int y;//外部数组索引

    //打乱图片的方法
    private void initArr(){

        //创建一维数组
        int [] imgsArray1={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};

        //打乱一维数组
        int count=1;
        Random r = new Random();
        while(count%2!=0){
            count--;
        for (int i = 0; i < imgsArray1.length; i++) {
            int index = r.nextInt(16);
            int temp = imgsArray1[i];
            imgsArray1[i] = imgsArray1[index];
            imgsArray1[index] = temp;

        }
        //判断华容道是否有解?????????????????????????????
        int temp=0;

        while(temp<15){

            while(temp<15){
                if(imgsArray1[temp]==imgsArray1[temp+1]-1){
                    temp++;
                    if(imgsArray1[temp]!=imgsArray1[temp+1]-1){
                        temp++;
                        count++;
                        break;
                    }
                }
                temp++;
        }

        }}


        //塞到二维数组里面去
        for(int i = 0 ; i < 4;i++){
            for (int j = 0; j < 4; j++) {
                imgsArray2[i][j]=imgsArray1[i*4+j];
                if(imgsArray2[i][j]==16){
                    x = j;
                    y = i;
                    //测试用
                    System.out.println(x+""+y);
                }
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
        //删除所有图片
        this.getContentPane().removeAll();

        //判断胜利
        if(victory()){
            System.out.println("胜利！");
        }

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
                ImageIcon icon = new ImageIcon("day0927_puzzleGame\\imgs\\fufu\\_"+num+".jpg");
                //创建一个jlabel对象
                JLabel jLabel = new JLabel(icon);
                //设置图片位于左上角
                jLabel.setBounds(j*105+84,i*105+143,105,105);
                //给图片加个边框
                jLabel.setBorder(new BevelBorder(0));
                //把管理容器添加到界面
                this.add(jLabel);
//                //计数器加一
//                num++;
            }
        }

        //刷新页面
        this.getContentPane().repaint();
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

        //给界面加入键盘监听
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code =e.getKeyCode();
        if(code == 65){
            //把界面中所有的图片全部删除
            this.getContentPane().removeAll();
            //加载第一张完整图片
            JLabel all = new JLabel(new ImageIcon("day0927_puzzleGame\\imgs\\fufu\\fnnAll1.jpg"));
            all.setBounds(83,134,420,420);
            this.getContentPane().add(all);
            //刷新界面
            this.getContentPane().repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

        if(victory()){
            return;
        }

        //这个是松开触发的方法，在这里加入上下左右
        //接收一下键盘的数据
        int code = e.getKeyCode();
        //判断上下左右
        if(code==39){
            if(x==3){
                return;
            }
            System.out.println("右");
            //现在对图片进行移动
            /*
            找到空白图片的索引坐标
            与对应的图片索引坐标交换值
            修改空白图片索引坐标
            解决超出索引问题
             */

            //交换
            int temp = imgsArray2[y][x];
            imgsArray2[y][x]= imgsArray2[y][x+1];
            imgsArray2[y][x+1]=temp;
            x++;
            initImage();

        }
        else if(code == 40){
            if(y==3){
                return;
            }
            System.out.println("下");
            //交换
            int temp =imgsArray2[y][x];
            imgsArray2[y][x] = imgsArray2[y+1][x];
            imgsArray2[y+1][x] = temp;
            y++;
            System.out.println(x+","+y);
            initImage();
        }
        else if(code == 37){
            if(x==0){
                return;
            }
            System.out.println("左");
            //交换
            int temp = imgsArray2[y][x];
            imgsArray2[y][x]=imgsArray2[y][x-1];
            imgsArray2[y][x-1] = temp;
            x--;
            initImage();
        }
        else if(code == 38){
            if(y==0){
                return;
            }
            System.out.println("上");
            //交换
            int temp = imgsArray2[y][x];
            imgsArray2[y][x]=imgsArray2[y-1][x];
            imgsArray2[y-1][x]=temp;
            initImage();
            y--;
        }        //实测如果移动图片会很反人类，移动空白会舒服很多
        else if(code==65){
            initImage();
        }
        else if(code==87){
            imgsArray2 = new int[][]{
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}
            };
            initImage();
        }


    }
    //判断data数组中的数据是否跟win数组中相同
    //如果全都相同，返回true，否则返回false
    public boolean victory(){
        for(int i=0;i<imgsArray2.length;i++){
            for(int j=0;j<imgsArray2[i].length;j++){
                if(imgsArray2[i][j]!=win[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}
