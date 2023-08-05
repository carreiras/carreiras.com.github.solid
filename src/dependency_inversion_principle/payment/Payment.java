package dependency_inversion_principle.payment;

import dependency_inversion_principle.model.MySQLProduct;

public class Payment {

    public void pay(String productId) {
        MySQLProduct dbProduct = new MySQLProduct();
        String product = dbProduct.getProductById(productId);
        System.out.println(product);
    }
}
