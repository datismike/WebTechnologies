package bean;

import java.util.ArrayList;

/**
 * Класс, описывающий сущность "Ресторан"
 */
public class Restaurant implements IBaseObject {

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
     * Поле название
     */
    private String name;

    /**
     * Поле получения названия
     * @return название
     */
    public String getName() { return this.name; }

    /**
     * Функция установки названия
     * @param name - название
     */
    public void setName(String name) { this.name = name; }

    /**
     * Поле меню
     */
    private Menu menu;

    /**
     * Функция получения меню
     * @return меню
     */
    public Menu getMenu() { return this.menu; }

    /**
     * Функция установки меню
     * @param menu - меню
     */
    public void setMenu(Menu menu) { this.menu = menu; }

    /**
     * Поле список посетителей
     */
    private ArrayList<Visitor> visitors;

    /**
     * Функция получения списка посетителей
     * @return список посетителей
     */
    public ArrayList<Visitor> getVisitors() { return this.visitors; }

    /**
     * Функция установки списка посетителей
     * @param visitors - список посетителей
     */
    public void setVisitors(ArrayList<Visitor> visitors) { this.visitors = visitors; }

    /**
     * Поле список официантов
     */
    private ArrayList<Waiter> waiters;

    /**
     * Функция получения списка официантов
     * @return список официантов
     */
    public ArrayList<Waiter> getWaiters() { return this.waiters; }

    /**
     * Функция установки списка официантов
     * @param waiters - список официантов
     */
    public void setWaiters(ArrayList<Waiter> waiters) { this.waiters = waiters; }
}