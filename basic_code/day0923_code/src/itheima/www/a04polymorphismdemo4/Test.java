package itheima.www.a04polymorphismdemo4;

public class Test {
    public static void main(String[] args) {
        //创建对象
        Animal a = new Dog();
        //编译看左边，运行看右边
        a.eat();

        //多态的弊端
        //不能调用子类的特有功能
        //a.lookHome();报错
        //如果这样创建对象，是没有办法调用子类特有的功能的，弊端
        //解决方案：
        //把调用者变回子类就行了
        //细节：强转的时候不能瞎转，会报错，我上面new的时候是啥就转啥
        Dog d = (Dog)a;
        //父类更大，父类转子类要加括号强转

//        if(a instanceof Dog){
//            Dog dog = (Dog) a;
//        }

        //多态的优势，在方法中，使用父类作为参数，可以接收所有
        //弊端，不能使用子类的特有功能
        //引用数据类型的类型转换，有两种方式，自动类型转换就是多态的创建对象方法，强转可以转换成正真的子类类型，从而调用子类独有的功能
        //最好加上instanceof关键字进行判断

    }
}

class Animal{

    public void eat(){
        System.out.println("动物在吃东西");
    }
}

class Dog extends Animal{

    @Override
    public void eat(){
        System.out.println("狗吃骨头");
    }

    public void lookHome(){
        System.out.println("狗看家");
    }
}

class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃小鱼干");
    }
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}