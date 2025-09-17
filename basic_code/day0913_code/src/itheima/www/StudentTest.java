package itheima.www;

public class StudentTest {
    public static void main(String[] args) {

        //1.创建一个数组用来储存学生对象
        Student[] arr = new Student[3];
        //2.创建学生对象并添加到数组中
        Student stu1 = new Student("张三", 01, 18);
        Student stu2 = new Student("李四", 02, 19);
        Student stu3 = new Student("王五", 03, 17);
        //3.把学生对象添加到数组中
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        //要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断
        Student stu4 = new Student("老六", 04, 21);
        //判断id是否重复
        if (contains(arr, stu4)) {
            //不重复就判断数组满了没
            if (count(arr) == arr.length) {
                Student[] newArr = getNewArr(arr);
                //把数据加到新数组中
                newArr[newArr.length-1]=stu4;
                System.out.println("test");
                printArr(newArr);
                arr=newArr;
            } else {
                arr[count(arr)] = stu4;
                printArr(arr);
            }
        }else{
            printArr(arr);
        }

        //要求3：通过id直接删除学生信息
        //如果id存在，则删除，如果不在，则提示删除失败
//        if(getIndex(02,arr)!=-1){
//            arr[getIndex(02,arr)]=null;
//        }else{
//            System.out.println("删除失败");
//        }
        //这是黑马老师的做法，但是我觉得不能这么写，如果和添加信息那边混用的话，会出问题，我重写一个
        if(getIndex(02,arr)!=-1){
            int tempIndex = getIndex(02,arr);

            for(;tempIndex<arr.length-1;){
                arr[tempIndex]=arr[tempIndex+1];
                tempIndex++;


            }
        }else{
            System.out.println("删除失败");
        }
        arr[arr.length-1]=null;

        //遍历看看
        System.out.println();
        printArr(arr);

        //查询id为3的学生看看在不在
        if(getIndex(03,arr)>=0){
            arr[getIndex(03,arr)].setAge(arr[getIndex(03,arr)].getAge()+1);
        }else{
            System.out.println("当前id不存在，修改失败");
        }

        //遍历看看
        System.out.println();
        printArr(arr);


    }

    //唯一性判断
    public static boolean contains(Student[] arr, Student student) {

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null){//非空判断
                if (student.getId() == arr[i].getId()) {
                    return false;
                }
            }
        }
        return true;

    }

    //判断是否满
    public static int count(Student[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;
    }

    //创建一个数组，然后把老数组拷贝过去
    public static Student[] getNewArr(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    //遍历数组
    public static void printArr(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=null){
                System.out.println(arr[i].getId()+","+arr[i].getName()+","+arr[i].getAge());
            }
        }
    }

    //根据id获取索引
    public static int getIndex(int id,Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            //依次得到每一个学生对象
            if(arr[i].getId()==id){
             return i;
            }
        }
        return -1;
    }
}
