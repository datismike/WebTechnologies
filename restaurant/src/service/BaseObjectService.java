package restaurant.service;

import restaurant.bean.IBaseObject;

public interface BaseObjectService {
    void addBaseObject(IBaseObject baseObject) throws ServiceException;
    void removeBaseObject(int id) throws ServiceException;
}