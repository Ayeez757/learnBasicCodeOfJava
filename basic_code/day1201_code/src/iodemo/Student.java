package iodemo;

import java.io.Serial;
import java.io.Serializable;

public class Student implements Serializable {
    @Serial
    private static final long serialVersionUID = 95052830119575483L;
    private String name;
    private int age;
    private transient String address;

    public Student() {


    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student(String name, int age, String address) {

        this.name = name;
        this.age = age;
        this.address = address;
    }


    public String getName() {

        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public String getAddress() {
        return address;
    }
}
