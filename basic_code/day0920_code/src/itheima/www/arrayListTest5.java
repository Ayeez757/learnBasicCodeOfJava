package itheima.www;

import java.util.ArrayList;

public class arrayListTest5 {
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<student> list = new ArrayList<>();

        //创建学生对象
        student st1 = new student("张三",23);
        student st2 = new student("李四",24);
        student st3 = new student("王五",18);

        list.add(st1);
        list.add(st2);
        list.add(st3);


        //遍历集合
        //System.out.println(list);//[itheima.www.student@2f4d3709, itheima.www.student@4e50df2e, itheima.www.student@1d81eb93]
        //这里不直接打印是因为打印出来是地址值，要遍历
        for(int i = 0;i< list.size();i++){
            //i索引list.get(i) 元素/学生对象
            student stu = list.get(i);
            System.out.println(stu.getName()+","+stu.getAge());
        }
    }

}
