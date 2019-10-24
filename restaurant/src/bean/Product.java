package bean;

/**
 * Класс, описывающий сущность "Продукт"
 */
public class Product implements IBaseObject {

    /**
     * Поле уникальный идентификатор объекта
     */
    private int ID;

    /**
     * Функция получения уникального идентификатора объекта
     * @return уникальный идентификатор объекта в системе
     */
    public int getID() { return this.ID; }

    /**
     * Функция установки уникального идентификатора объекта
     * @param id - уникальный идентификатор объекта
     */
    public void setID(int id) { this.ID = id; }

    /**
     * Поле название продукта
     */
    private String name;

    /**
     * Функция получения уникального названия продукта
     * @return название продукта
     */
    public String getName() { return this.name; }

    /**
     * Функция установки названия продукта
     * @param name - название продукта
     */
    public void setName(String name) { this.name = name; }

    /**
     * Поле количество калорий в продукте
     */
    private int calorie;

    /**
     * Функция получения количества калорий в продукте
     * @return количество калорий в продукте
     */
    public int getCalorie() { return this.calorie; }

    /**
     * Функция установки количества калорий в продукте
     * @param calorie - количество калорий
     */
    public void setCalorie(int calorie) { this.calorie = calorie; }
}