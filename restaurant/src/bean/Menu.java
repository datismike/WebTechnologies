package bean;

import java.util.ArrayList;

/**
 * Класс, описывающий сущность "Меню"
 */
public class Menu implements IBaseObject {

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
     * Поле тип меню
     */
    private Season season;

    /**
     * Функция получения типа меню
     * @return тип меню
     */
    public Season getSeason() { return this.season; }

    /**
     * Функция установки типа меню
     * @param season - тип меню
     */
    public void setSeason(Season season) { this.season = season; }

    /**
     * Поле список позиций меню
     */
    private ArrayList<Dish> dishes;

    /**
     * Функция получения списка позиций меню
     * @return список позиций меню
     */
    public ArrayList<Dish> getDishes() { return this.dishes; }

    /**
     * Функция установки списка позиций меню
     * @param dishes - список позиций меню
     */
    public void setDishes(ArrayList<Dish> dishes) { this.dishes = dishes; }
}

/**
 * Перечислимый тип, описывающий тип меню
 */
enum Season {
    SUMMER,
    AUTUMN,
    WINTER,
    SPRING
}