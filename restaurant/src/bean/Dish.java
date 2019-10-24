package bean;

import java.util.ArrayList;

/**
 * Класс, описывающий сущность "Блюдо"
 */
public class Dish implements IBaseObject {

    /**
     * Поле уникальный идентификатор объекта
     */
    private int ID;

    /**
     * Функция получения уникального идентификатора объекта
     * @return уникальный идентификатор объекта
     */
    public int getID() { return this.ID; }

    /**
     * Функция установки уникального идентификатора объекта
     * @param id - уникальный идентификатор объекта
     */
    public void setID(int id) { this.ID = id; }

    /**
     * Поле название блюда
     */
    private String name;

    /**
     * Функция получения названия блюда
     * @return название блюда
     */
    public String getName() { return this.name; }

    /**
     * Функция установки названия блюда
     * @param name - название блюда
     */
    public void setName(String name) { this.name = name; }

    /**
     * Поле цена блюда
     */
    private int price;

    /**
     * Функция получения цены блюда
     * @return цена блюда
     */
    public int getPrice() { return this.price; }

    /**
     * Функция установки цены блюда
     * @param price - цена блюда
     */
    public void setPrice(int price) { this.price = price; }

    /**
     * Поле список ингридиентов блюда
     */
    private ArrayList<Product> products;

    /**
     * Функция получения списка ингридиентов блюда
     * @return список ингридиентов блюда
     */
    public ArrayList<Product> getProducts() { return this.products; }

    /**
     * Функция установки списка ингридиентов блюда
     * @param products - список ингридиентов блюда
     */
    public void setProducts(ArrayList<Product> products) { this.products = products; }
}