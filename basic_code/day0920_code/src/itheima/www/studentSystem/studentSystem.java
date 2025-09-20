package itheima.www.studentSystem;

import java.util.ArrayList;
import java.util.Scanner;


public class studentSystem {
    public static void main(String[] args) {
        ArrayList<Student> list =new ArrayList<>();

        loop: while (true) {
            System.out.println("-------------------欢迎来到Ayeez学生管理系统-------------------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出学生系统");
            System.out.println("请输入你的选择");
            Scanner sc = new Scanner(System.in );
            String choose = sc.next();
            switch(choose){
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> updateStudent(list);
                case "4" -> queryStudent(list);
                case "5" -> {
                    System.out.println("退出学生系统");
                    break loop;
                }
                default -> System.out.println("没有这个选项");


            }
        }

    }

    //添加学生
    public static void addStudent(ArrayList<Student> list){
        System.out.println("添加学生");

        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        System.out.println("请输入学生信息");
        String sid;
        while(true){
            System.out.println("学生的id");
            sid = sc.next();
            //System.out.println(sid);
            if(contains(list,sid)){
                break;
            }
            System.out.println("id重复");

        }
        s.setId(sid);

        System.out.println("学生的姓名");
        s.setName(sc.next());
        System.out.println("学生的年龄");
        s.setAge(sc.nextInt());
        System.out.println("学生的住址");
        s.setAddress(sc.next());
        list.add(s);
    }

    //删除学生
    public static void deleteStudent(ArrayList<Student> list){
        System.out.println("删除学生");
        System.out.println("请输入想删除的学生的id");
        Scanner sc = new Scanner(System.in);
        String sid = sc.next();
        if(idIndex(list,sid)>=0){
            list.remove(idIndex(list,sid));
            System.out.println("删除成功");
        }else{
            System.out.println("该学生id不存在");
        }

    }

    //修改学生
    public static void updateStudent(ArrayList<Student> list){
        System.out.println("修改学生");
        System.out.println("请输入要修改的学生的id");
        Scanner sc = new Scanner(System.in);
        String sid = sc.next();
        int index = idIndex(list,sid);
    }

    //查询学生
    public static void queryStudent(ArrayList<Student> list){
        System.out.println("查询学生");

        if(list.size()==0){
            System.out.println("没有学生信息");
        }
        else{
            System.out.println("id\tname\tage\taddress");
            for(int i=0;i<list.size();i++){
                System.out.println(list.get(i).getId()+"\t"+list.get(i).getName()+"\t"+list.get(i).getAge()+"\t"+list.get(i).getAddress());
            }
        }
    }

    //判断id是否已经存在
    public static boolean contains(ArrayList<Student> list ,String id){
        for(int i =0;i<list.size();i++){

            if(list.get(i).getId().equals(id)){
                return false;
            }
        }
        return true;
    }

    //判断id是否存在并返回索引
    public static int idIndex(ArrayList<Student> list,String id ){
        for (int i = 0; i < list.size(); i++) {
                     if(list.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;

    }

}
