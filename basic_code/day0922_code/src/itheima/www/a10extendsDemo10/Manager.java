package itheima.www.a10extendsDemo10;

public class Manager extends Employee{
    private double bouns;

    public Manager(){}

    public Manager(String name, double salary, String id, double bouns) {
        super(name, salary, id);
        this.bouns = bouns;
    }

//    public Manager(double bouns) {
//        this.bouns = bouns;
//    }
}
