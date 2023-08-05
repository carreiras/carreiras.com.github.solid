package dependency_inversion_principle.factory;

import dependency_inversion_principle.model.DbProduct;
import dependency_inversion_principle.model.MySQLProduct;

public class DbProductFactory {

    public static DbProduct create() {
        return new MySQLProduct();
    }
}
