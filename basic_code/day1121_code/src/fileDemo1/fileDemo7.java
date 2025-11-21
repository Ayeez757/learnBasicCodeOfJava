package fileDemo1;

import java.io.File;

public class fileDemo7 {
    public static void main(String[] args) {
        /*
        需求：
            定义一个方法找某一个文件夹，是否有过avi结尾的电影
         */

        File file = new File("D:\\aaa\\bbb");
        boolean b = haveAvi(file);
        System.out.println(b);

    }


    public static boolean haveAvi(File file){
        File[] list = file.listFiles();
        for (File f : list) {
            if(f.isFile()&&f.getName().endsWith(".avi")){
                return true;
            }
        }
        return false;
    }
}
