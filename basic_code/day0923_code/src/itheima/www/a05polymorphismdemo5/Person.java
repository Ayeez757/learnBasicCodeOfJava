package itheima.www.a05polymorphismdemo5;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }



    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void keepPet(Animal a, String something){
        System.out.print("年龄为"+this.getAge()+"的"+getName()+"养了一只"+a.getColor()+"的宠物，"+a.getAge());
        if(a instanceof Dog){
            System.out.println("岁的狗两只腿死死地抱住"+something+"猛吃");
        }else if(a instanceof Cat){
            System.out.println("岁的猫眯着眼睛侧着头吃"+something);
        }
    }
}
