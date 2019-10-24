package bean;

/**
 * Класс, описывающий сущность "Официант"
 */
public class Waiter implements IBaseObject {

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
     * Поле имя
     */
    private String name;

    /**
     * Функция получения имени
     * @return имя
     */
    public String getName() { return this.name; }

    /**
     * Функция установки имени официанта
     * @param name - имя официанта
     */
    public void setName(String name) { this.name = name; }

    /**
     * Поле зарплата
     */
    private int salary;

    /**
     * Функция получения зарплаты
     * @return зарплата
     */
    public int getSalary() { return this.salary; }

    /**
     * Функция установки зарплаты
     * @param salary - зарплата
     */
    public void setSalary(int salary) { this.salary = salary; }
}