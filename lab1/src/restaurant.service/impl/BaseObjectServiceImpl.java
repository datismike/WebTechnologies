package restaurant.service.impl;

import restaurant.bean.IBaseObject;
import restaurant.dao.BaseObjectDAO;
import restaurant.dao.factory.DAOFactory;
import restaurant.service.BaseObjectService;

public class BaseObjectServiceImpl implements BaseObjectService {
    @Override
    public void addBaseObject(IBaseObject baseObject) {
        // ...
        DAOFactory daoObjectFactory = DAOFactory.getInstance();
        BaseObjectDAO baseObjectDAO = daoObjectFactory.getBaseObjectDAO();
        baseObjectDAO.addBaseObject(baseObject);
        // ...
    }

    @Override
    public void removeBaseObject(int id) {
        // ...
        DAOFactory daoObjectFactory = DAOFactory.getInstance();
        BaseObjectDAO baseObjectDAO = daoObjectFactory.getBaseObjectDAO();
        baseObjectDAO.removeBaseObject(id);
        // ...
    }
}