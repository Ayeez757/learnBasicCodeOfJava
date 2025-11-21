package fileDemo1;

import java.io.File;

public class fileDemo3 {
    public static void main(String[] args) {
        /*
        public boolean delete()                 删除文件、空文件夹
        细节：
            如果删除的是文件，则直接删除，不走回收站
            如果山粗的是空文件夹，则直接删除，不走回收站
            如果删除的是有内容的文件夹，则删除失败
         */

        //1.创建File对象
        File f1 = new File("D:\\Develop\\Java\\Code\\Learn\\basic_code\\day1121_code\\src\\filedemo1\\test.txt");
        //2.删除
        boolean b = f1.delete();
        System.out.println(b);
    }
}
