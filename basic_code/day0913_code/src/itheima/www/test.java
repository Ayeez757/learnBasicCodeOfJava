package itheima.www;

public class test {
    public static void main(String[] args) {
        Student [] arr = new  Student[3];
        Student stu = new Student("Aye",1,2);
        arr[1] = stu;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
