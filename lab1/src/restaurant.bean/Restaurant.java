package restaurant.bean;

import java.util.ArrayList;

public class Restaurant implements IBaseObject {
    private int ID;
    public int getID() { return this.ID; }
    public void setID(int id) { this.ID = id; }

    private String name;
    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }

    private Menu menu;
    public Menu getMenu() { return this.menu; }
    public void setMenu(Menu menu) { this.menu = menu; }

    private ArrayList<Visitor> visitors;
    public ArrayList<Visitor> getVisitors() { return this.visitors; }
    public void setVisitors(ArrayList<Visitor> visitors) { this.visitors = visitors; }

    private ArrayList<Waiter> waiters;
    public ArrayList<Waiter> getWaiters() { return this.waiters; }
    public void setWaiters(ArrayList<Waiter> waiters) { this.waiters = waiters; }
}