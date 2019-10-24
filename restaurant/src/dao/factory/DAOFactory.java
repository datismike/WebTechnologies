package dao.factory;

import dao.BaseObjectDAO;
import dao.impl.JSONBaseObjectDAO;

public final class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();
    private final BaseObjectDAO jsonBaseObjectImpl = new JSONBaseObjectDAO();

    private DAOFactory() {}

    public static DAOFactory getInstance() { return instance; }

    public BaseObjectDAO getBaseObjectDAO() { return this.jsonBaseObjectImpl; }
}