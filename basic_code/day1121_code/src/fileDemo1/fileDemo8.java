package fileDemo1;

import java.io.File;

public class fileDemo8 {
    public static void main(String[] args) {
        /*
        删除一个多级文件夹
        如果我们要删除一个有内容的文件夹
        1.先删除文件夹里面所有的内容
        2.再删除自己
         */

        File file = new File("D:\\aaa\\aaa\\aaa\\aaa");
        //调用方法：怕删错东西，这里不写了
    }


    /*
    作用：删除src文件夹
    参数：要删除的文件夹
     */
    public static void delete(File src){
        //1.先删除文件夹里面所有的内容
        //进入src
        File[] files = src.listFiles();
        //遍历
        for (File file : files) {
            //先判断，如果是文件，删除
            if(file.isFile()){
                file.delete();
            }else{
                //判断，如果是文件夹，就递归
                delete(file);
            }
        }
    }
}
