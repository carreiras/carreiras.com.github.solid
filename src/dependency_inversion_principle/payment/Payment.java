package dependency_inversion_principle.payment;

import dependency_inversion_principle.factory.DbProductFactory;
import dependency_inversion_principle.model.DbProduct;
import dependency_inversion_principle.model.MySQLProduct;

public class Payment {

    public void pay(String productId) {
//        MySQLProduct dbProduct = new MySQLProduct();
        DbProduct dbProduct = DbProductFactory.create();
        String product = dbProduct.getProductById(productId);
        System.out.println(product);
    }
}
