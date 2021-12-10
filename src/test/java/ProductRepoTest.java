import org.junit.jupiter.api.Test;

import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.*;

class ProductRepoTest {

    // GIVEN
    final ProductRepo products = new ProductRepo(
            Map.of(
                    1, new Product(1, "Apfel"),
                    2, new Product(2, "Kellogs"),
                    3, new Product(3, "Nutella")
            ));

    @Test
    void testGetProductAvailable() {
        // WHEN
        Product actualProduct = products.getProduct(1);
        Product expectedProduct = new Product(1, "Apfel");

        // THEN
        assertEquals(expectedProduct, actualProduct);
    }

    @Test
    void testGetProductNotAvailable() {

//        try {
//            // WHEN
//            Product product = products.getProduct(0);
//        }
//        catch (InvalidKeyException e)
//        {
//            // THEN
//            assertThrows(new InvalidKeyException());
//        }
    }

    @Test
    void testGetProducts() {
        // WHEN
        Product[] expected = {
            new Product(1, "Apfel"),
            new Product(2, "Kellogs"),
            new Product(3, "Nutella")
        };

        assertThat(products.getProducts(), containsInAnyOrder(expected));
    }
}