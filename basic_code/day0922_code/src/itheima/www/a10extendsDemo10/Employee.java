package itheima.www.a10extendsDemo10;

public class Employee {
    private String name;
    private double salary;
    private String id;

    public Employee(String name, double salary, String id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void work(){
        System.out.println("员工在工作");
    }
    public void eat(){
        System.out.println("员工在吃米饭");
    }
}
