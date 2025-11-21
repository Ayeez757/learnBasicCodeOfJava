package filedemo;

import java.io.File;

public class fileDemo2 {
    public static void main(String[] args) {
        /*
        public boolean isDirectory()            判断此路径名表示的File是否为文件夹
        public boolean isFile()                 判断此路径名表示的File是否为文件
        public boolean exists()                 判断此路径名表示的File是否存在
         */

        //1.对一个文件的路径进行判断
        File f1 = new File("D:\\Develop\\Java\\Code\\learn\\basic_code\\day1120_code\\src\\filedemo\\fileDemo2.java");
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.exists());

        //2.对一个文件夹的路径进行判断
        File f2 = new File("D:\\Develop\\Java\\Code\\learn\\basic_code");
        System.out.println(f2.isDirectory());
        System.out.println(f2.isFile());
        System.out.println(f2.exists());

    }
}
