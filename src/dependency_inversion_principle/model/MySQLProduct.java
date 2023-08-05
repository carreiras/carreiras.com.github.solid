package dependency_inversion_principle.model;

public class MySQLProduct {

    public String getProductById(String productId) {
        return "MySQL: Exibindo dados do produto: " + productId;
    }
}
