package iodemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Text2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day1201_code\\src\\iodemo\\a.txt"));

//        System.out.println(ois.readObject());

        ArrayList<Student> list = (ArrayList<Student>) ois.readObject();

        for (Student student : list) {
            System.out.println(student);
        }






    }
}
