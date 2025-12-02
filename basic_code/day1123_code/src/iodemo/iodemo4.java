package iodemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class iodemo4 {
    public static void main(String[] args) throws IOException {
        /*
        演示：字节输入流FileInputStream
        实现需求：读取文件中的数据，（暂时不写中文）

        实现步骤：
            创建对象
            读取数据
            释放资源
         */

        /*
        创建字节输入流对象
            细节：如果文件不存在，就直接报错
        读取数据
            细节1：一次读一个字节，读出来的是数据在ASCII上对应的数字
            细节2：读到文件末尾了，read方法返回-1
        释放资源
            细节：每次使用完流必须要释放资源

         */


        FileInputStream fis = new FileInputStream("day1123_code\\a.txt");
        int b1 = fis.read();
        System.out.print((char) b1);
        int b2 = fis.read();
        System.out.print((char) b2);
        int b3 = fis.read();
        System.out.print((char) b3);
        int b4 = fis.read();
        System.out.print((char) b4);
        int b5 = fis.read();
        System.out.print((char) b5);
        int b6 = fis.read();
        System.out.print((char) b6);
        int b7 = fis.read();
        System.out.print((char) b7);
        int b8 = fis.read();
        System.out.print((char) b8);
        int b9 = fis.read();
        System.out.print((char) b9);
        int b10 = fis.read();
        System.out.print((char) b10);
        int b11 = fis.read();
        System.out.print((char) b11);
        int b12 = fis.read();
        System.out.print((char) b12);
        int b13 = fis.read();
        System.out.print((char) b13);
        int b14 = fis.read();
        System.out.print((char) b14);
        int b15 = fis.read();
        System.out.print((char) b15);
        int b16 = fis.read();
        System.out.print((char) b16);
        fis.close();

    }
}
