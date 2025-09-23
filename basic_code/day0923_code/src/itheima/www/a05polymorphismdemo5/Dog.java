package itheima.www.a05polymorphismdemo5;

public class Dog extends Animal{

    private String color = "黑色";
    public void lookHome(){
        System.out.println("狗在看家");
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
}
