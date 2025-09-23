package itheima.www.a05polymorphismdemo5;

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();
        Animal B = new Cat();
        a.setAge(2);
        B.setAge(3);
        Person wang = new Person();
        Person li = new Person();

        wang.setName("老王");
        wang.setAge(30);

        li.setName("老李");
        li.setAge(25);

        wang.keepPet(a,"骨头");
        li.keepPet(B,"小鱼干");
    }

}
