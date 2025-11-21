package fileDemo1;

import java.io.File;

public class fileDemo9 {
    public static void main(String[] args) {
        /**
         * 需求：查找电脑所有以avi后缀结尾的文件
         */
        findAvi();

    }

    public static void findAvi(){
         File[] file= File.listRoots();
        for (File file1 : file) {
            findAvi(file1);
        }
    }

    public static void findAvi(File file) {
        File[] list = file.listFiles();
        if (list != null) {//非空判断，不然空指针异常
            for (File file1 : list) {
                if (file1.isFile()) {
                    if (file1.getName().endsWith(".avi")) {
                        System.out.println(file1);
                    }
                } else {
                    findAvi(file1);
                }
            }
        }
    }
}
