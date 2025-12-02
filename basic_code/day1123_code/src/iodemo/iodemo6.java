package iodemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class iodemo6 {
    public static void main(String[] args) throws IOException {
        /*
        拷贝文件
         */
        FileInputStream fis = new FileInputStream("day1123_code\\a.txt");
        FileOutputStream fos = new FileOutputStream("day1123_code\\b.txt");
        int b;
        while((b= fis.read())!=-1){
          fos.write((char)b);
        }
        fos.close();
        fis.close();
    }
}
