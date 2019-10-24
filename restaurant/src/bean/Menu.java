package bean;

import java.util.ArrayList;

public class Menu implements IBaseObject {
    private int ID;
    public int getID() { return this.ID; }
    public void setID(int id) { this.ID = id; }

    private Season season;
    public Season getSeason() { return this.season; }
    public void setSeason(Season season) { this.season = season; }

    private ArrayList<Dish> dishes;
    public ArrayList<Dish> getDishes() { return this.dishes; }
    public void setDishes(ArrayList<Dish> dishes) { this.dishes = dishes; }
}

enum Season {
    SUMMER,
    AUTUMN,
    WINTER,
    SPRING
}