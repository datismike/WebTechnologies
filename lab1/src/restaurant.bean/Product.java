package restaurant.bean;

public class Product implements IBaseObject {
    private int ID;
    public int getID() { return this.ID; }
    public void setID(int id) { this.ID = id; }

    private String name;
    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }

    private int calorie;
    public int getCalorie() { return this.calorie; }
    public void setCalorie(int calorie) { this.calorie = calorie; }
}