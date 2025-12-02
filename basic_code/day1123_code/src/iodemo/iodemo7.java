package iodemo;

import java.io.FileInputStream;
import java.io.IOException;

public class iodemo7 {
    public static void main(String[] args) throws IOException {
        /*
        一次读取多个数据
         */
        FileInputStream fis = new FileInputStream("day1123_code\\a.txt");
        byte[] bytes = new byte[2];
         int len=0;
         while((len = fis.read(bytes))!=-1){
             String str = new String(bytes,0,len);
             System.out.print(str);
         }

//        int len1 = fis.read(bytes);
//        String str1 = new String(bytes, 0, len1);
//        System.out.print(str1);
//        int len2 = fis.read(bytes);
//        String str2 = new String(bytes, 0, len2);
//        System.out.print(str2);
//        int len3 = fis.read(bytes);
//        String str3 = new String(bytes, 0, len3);
//        System.out.print(str3);

        fis.close();

    }
}
