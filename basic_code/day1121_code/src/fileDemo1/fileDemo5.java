package fileDemo1;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;

public class fileDemo5 {
    public static void main(String[] args) {
        /*
        public static File[] listRoots()            列出可用的文件系统根
        public String[] list()                      获取当前该路径下的所有内容
        public String[] list(FilenameFilter filter) 利用文件名过滤器获取当前该路径下所有内容
        public File[] listFiles()                    获取当前路径下所有内容
        public File[] listFiles(FileFilter filter)  利用文件名过滤器获取当前该路径下所有内容
        public File[] listFiles(FilenameFilter filter)利用文件名过滤器获取当前该路径下所有内容
         */


        //1.listRoots   获取系统中所有的盘符
        File[] arr = File.listRoots();
        System.out.println(Arrays.toString(arr));

        //2.list()      获取当前该路径下所有内容（仅仅能获取名字）
        File f1 = new File("D:\\aaa");
        String[] arr2 = f1.list();
        for (String string : arr2) {
            System.out.println(string);
        }

        //3.list(FilenameFilter filter)     利用文件名过滤器获取当前该路径下所有内容
        //需求：我现在要获取D：//aaa文件夹里面所有的txt文件
        File f2 = new File("D:\\aaa");
        /*
        accept方法的形参，依次表示aaa文件夹里面每一个文件或者文件夹路径
        参数一：父级路径
        参数二：子级路径
        返回值：如果返回值为true，就表示当前路径保留
                如果返回值为false，就表示当前路径舍弃不要
         */
        String[] arr3 = f2.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File src = new File(dir,name);
                return src.isFile()&&name.endsWith(".txt");
            }
        });

        //用listFile实现同样的功能
        //1.创建File对象
        File f = new File("D:\\aaa");
        //2.需求：打印里面所有的txt文件
        File[] arr4 = f.listFiles();
        for (File file : arr4) {
            //file依次表示aaa文件夹里面每一个文件或者文件夹的路径
            if(file.isFile() && file.getName().endsWith(".txt")){
                System.out.println(file);
            }
        }

        //创建File对象
        File f3 = new File("D:\\aaa");
        //调用listFiles(FileFilter filter)
        File[] arr1 = f.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile() && pathname.getName().endsWith(".txt");
            }
        });

        //调用listFiles(FilenameFilter filter)
        File[] arr5 = f.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File src = new File(dir,name);
                return src.isFile() && name.endsWith(".txt");
            }
        });
        System.out.println(Arrays.toString(arr5));

    }
}
