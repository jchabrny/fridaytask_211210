import javax.management.openmbean.InvalidKeyException;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class ProductRepo {

    private final Map<Integer, Product> productsMap;

    public ProductRepo(Map<Integer, Product> initialProducts) {
        this.productsMap = initialProducts;
    }

    public Product getProduct(int key) throws InvalidKeyException {
        if (productsMap.containsKey(key)) {
            return productsMap.get(key);
        }
        else{
            throw new InvalidKeyException();
        }
    }

    public Collection<Product> getProducts() {
        return productsMap.values();
    }

    public void listAllProducts(){
        for (Product product : productsMap.values()){
            System.out.println(product.toString());
        }
    }
}