package itheima.www.a05polymorphismdemo5;

public class Cat extends Animal{
    private String color="灰色";
    public void catchMouse(){
        System.out.println("狗在抓老鼠");
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
