package restaurant.service;

import restaurant.bean.IBaseObject;

public interface BaseObjectService {
    void addBaseObject(IBaseObject baseObject);
    void removeBaseObject(int id);
}