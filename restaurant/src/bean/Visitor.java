package bean;

/**
 * Класс, описывающий сущность "Посетитель"
 */
public class Visitor implements IBaseObject {

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
     * Поле номер стола
     */
    private int tableNumber;

    /**
     * Функция получения номера стола
     * @return номер стола
     */
    public int getTableNumber() { return this.tableNumber; }

    /**
     * Функция установки номера стола
     * @param tableNumber - номер стола
     */
    public void setTableNumber(int tableNumber) { this.tableNumber = tableNumber; }
}