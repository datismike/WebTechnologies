package restaurant.bean;

import java.util.ArrayList;

public class Dish implements IBaseObject {
    private int ID;
    public int getID() { return this.ID; }
    public void setID(int id) { this.ID = id; }

    private String name;
    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }

    private int price;
    public int getPrice() { return this.price; }
    public void setPrice(int price) { this.price = price; }

    private ArrayList<Product> products;
    public ArrayList<Product> getProducts() { return this.products; }
    public void setProducts(ArrayList<Product> products) { this.products = products; }
}