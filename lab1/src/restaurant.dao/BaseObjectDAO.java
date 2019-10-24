package restaurant.dao;

import restaurant.bean.IBaseObject;

public interface BaseObjectDAO {
    void addBaseObject(IBaseObject baseObject);
    void removeBaseObject(int id);
}