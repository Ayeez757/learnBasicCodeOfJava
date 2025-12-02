package iodemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class iodemo5 {
    public static void main(String[] args) throws IOException {
        /*
        循环读取
         */

        FileInputStream fis = new FileInputStream("day1123_code\\a.txt");
        int b;
        while((b = fis.read())!=-1){
            System.out.print((char)b);
        }
        fis.close();


    }
}
