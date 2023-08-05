package dependency_inversion_principle.model;

public class MongoDBProduct implements DbProduct{

    public String getProductById(String productId) {
        return "MongodDB: Exibindo dados do produto: " + productId;
    }
}
