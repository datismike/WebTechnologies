package dao;

import bean.IBaseObject;
import dao.exception.DAOException;

public interface BaseObjectDAO {
    void addBaseObject(IBaseObject baseObject) throws DAOException;
    void removeBaseObject(int id) throws DAOException;
}