package iodemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Text {
    public static void main(String[] args) throws IOException {

        // 创建对象
        Student s1 = new Student("张三", 23, "北京");
        Student s2 = new Student("李四", 18, "上海");
        Student s3 = new Student("王五", 19, "北京");

        ArrayList<Student> list = new ArrayList<Student>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day1201_code\\src\\iodemo\\a.txt"));

        oos.writeObject(list);
        oos.close();

    }
}
