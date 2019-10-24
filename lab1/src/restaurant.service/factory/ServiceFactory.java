package restaurant.service.factory;

import restaurant.service.BaseObjectService;
import restaurant.service.impl.BaseObjectServiceImpl;

public final class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();
    private final BaseObjectService baseObjectService = new BaseObjectServiceImpl();

    private ServiceFactory() {}

    public static ServiceFactory getInstance() { return instance; }

    public BaseObjectService getBaseObjectService() { return baseObjectService; }
}