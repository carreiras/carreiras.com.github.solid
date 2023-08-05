package dependency_inversion_principle.factory;

import dependency_inversion_principle.model.Db;
import dependency_inversion_principle.model.DbProduct;
import dependency_inversion_principle.model.MongoDBProduct;
import dependency_inversion_principle.model.MySQLProduct;

public class DbProductFactory {

    public static DbProduct create(Db type) {
        if (type == Db.MYSQL) {
            return new MySQLProduct();
        } else {
            return new MongoDBProduct();
        }
    }

}
