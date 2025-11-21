package fileDemo1;

import java.io.File;

public class fileDemo1 {
    public static void main(String[] args) {
        /*
        public long length()            返回文件的大小
        public String getAbsolutePath() 返回文件的绝对路径
        public String getPath()         返回定义文件时使用的路径
        public String getName()         返回文件的名称，带后缀
        public long lastModified()      返回文件的最后修改时间（时间毫秒值）



         */
        //1.length 返回文件的大小（字节数量）
        //细节一：这个方法只能获取文件的大小吗，单位是字节
        //如果单位我们要是M,G，可以不断地除以1024
        //细节2：这个方法无法获取文件夹的大小
        //如果我们要获取一个文件夹的大小，需要把这个文件夹里面所有的文件都累加在一起

        File f1= new File("D:\\Develop\\Java\\Code\\Learn\\basic_code\\day1121_code\\src\\filedemo1\\a.txt");
        long len = f1.length();
        System.out.println(len);//15

        File f2 = new File("D:\\Develop\\Java\\Code\\Learn\\basic_code\\day1121_code\\src\\filedemo1");
        long len2 = f2.length();
        System.out.println(len2);//0

        System.out.println("========================");

        //2.getAbsolutePath 返回文件的绝对路径
        File f3 = new File("basic_code\\day1121_code\\filedemo1\\a.txt");
        String path1 = f3.getAbsolutePath();
        System.out.println(path1);

        //3.getPath 返回定义文件时使用的路径
        File f5 = new File("D:\\Develop\\Java\\Code\\Learn\\basic_code\\day1121_code\\src\\filedemo1\\a.txt");
        String path3 = f5.getPath();
        System.out.println(path3);

        File f6 = new File("basic_code\\a.txt");
        String path4 = f6.getPath();
        System.out.println(path4);

        System.out.println("===============");

        //4.getName 获取名字
        //细节，文件获取的是文件名加后缀名 ，文件夹就只有文件夹名
        File f7 = new File("D:\\Develop\\Java\\Code\\Learn\\basic_code\\day1121_code\\src\\filedemo1\\a.txt");
        String name1 = f7.getName();
        System.out.println(name1);
    }
}
