package fileDemo1;

import java.io.File;

public class fileDemo10 {
    public static void main(String[] args) {
        File file = new File("D:\\Develop\\Java\\Code\\Learn\\basic_code");
        System.out.println(getLen(file));
    }

    /*
    作用：
        统计一个文件夹的总大小
    参数：
        表示要统计的那个文件夹
    返回值：
        统计之后的结果

     */
   public static long getLen(File src){
       //1.定义变量进行累加
       long len = 0;
       //2.进入src文件夹
       File[] files = src.listFiles();
       //排除空指针异常
       if(files!=null){
           //3.遍历数组
           for (File file : files) {
               //4.判断
               if(file.isFile()){
                   //我们就把当前文件的大小累加到len当中
                   len = len + file.length();
               }else{
                   //判断，如果是文件夹就递归
                   len = len + getLen(file);
               }
           }
       }

       return len;
   }
}
