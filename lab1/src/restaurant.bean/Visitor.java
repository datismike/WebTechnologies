package restaurant.bean;

public class Visitor implements IBaseObject {
    private int ID;
    public int getID() { return this.ID; }
    public void setID(int id) { this.ID = id; }

    private int tableNumber;
    public int getTableNumber() { return this.tableNumber; }
    public void setTableNumber(int tableNumber) { this.tableNumber = tableNumber; }
}