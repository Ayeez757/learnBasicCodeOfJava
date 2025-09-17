package itheima.www;

public class PackagingTestPrivate {
    //标准的写法是属性前面加上private不让别的类直接访问
    private int age;//拿年龄举例
    //但是写一个set和get方法来进行赋值和获取
    //set(赋值)
    public int  setAge(int a){
        if(a >=18 && a <30){
            age = a;
        }else{
            System.out.println("非法输入");
        }
        return age;
    }


    public void printAge(){
        System.out.println(age);
    }

    public int  getAge(){
        return age;
    }



}
