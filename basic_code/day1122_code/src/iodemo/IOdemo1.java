package iodemo;

import java.io.FileOutputStream;
import java.io.IOException;

public class IOdemo1 {
    public static void main(String[] args) throws IOException {
        /*
        细节：
            创建字节输出流对象：
                细节1：参数是字符串表示的路径或者File对象都是可以的
                细节2：如果文件不存在会创建一个新的文件，但是要保证父级路径是存在的。
                细节3：如果文件已经存在，则会清空文件

            写数据：
                细节：write方法的参数是整数，但是实际上写道本地文件中的是整数在ASCLL上对应的字符

            释放资源：
                细节：每次使用完流之后都要释放资源
         */
        //创建对象
        FileOutputStream fos = new FileOutputStream("day1122_code\\a.txt");
        //写入数据
        fos.write(97);
        //释放资源
        fos.close();
    }
}
