package filedemo;

import java.io.File;

public class fileDemo1 {
    public static void main(String[] args) {
        /*
        构造方法
        public File(String pathname)                    根据文件路径创建文件对象
        public File(String parent,String child)         根据父路径名字符串和子路径名字符串创建文件对象
        public File(File parent,String child)           根据父路径对应文件和子路径名字符串创建文件对象
         */

        //1.根据字符串表示的路径，变成File对象
        String str = "D:\\Develop\\java\\learn\\basic_code\\a.txt";
        File f1 = new File(str);
        System.out.println(f1);

        //2.父级路径：D:\Develop\java\learn\basic_code
        //子级路径：a.txt
        String parent = "D:\\Develop\\java\\learn\\basic_code";
        String child = "a.txt";
        File f2 = new File(parent,child);
        System.out.println(f2);

        //这样也行，但是不推荐，不同操作系统的路径分隔符不一样
        File f3 = new File(parent + "\\" + child);

        //3.把一个File表示的路径和String表示路径进行拼接
        File parent2 = new File("D:\\Develop\\java\\learn\\basic_code");
        String child2 = "a.txt";
        File f4 = new File(parent2,child2);
        System.out.println(f4);

    }
}
