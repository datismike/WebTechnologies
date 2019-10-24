package restaurant.bean;

public class Waiter implements IBaseObject {
    private int ID;
    public int getID() { return this.ID; }
    public void setID(int id) { this.ID = id; }

    private String name;
    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }

    private int salary;
    public int getSalary() { return this.salary; }
    public void setSalary(int salary) { this.salary = salary; }
}