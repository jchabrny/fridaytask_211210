import javax.management.openmbean.InvalidKeyException;
import java.util.Arrays;
import java.util.Map;

public class ShopService {

    public static void main(String[] args) {

        // Create ProductRepo
        ProductRepo products = new ProductRepo(
                Map.of(
                        1, new Product(1, "Apfel"),
                        2, new Product(2, "Kellogs"),
                        3, new Product(3,"Nutella"),
                        4, new Product(4, "Vollmilch"),
                        5, new Product(5,"Hafermilch"),
                        6, new Product(6,"Kondome"),
                        7, new Product(7,"Pistole"),
                        8, new Product(8,"Kugelschreiber"),
                        9, new Product(9, "Sixpack Sterni"),
                        10, new Product(10, "Kippen")
                )
        );

        products.listAllProducts();

//        try {
//            System.out.println(products.getProduct(12));
//        }
//        catch (InvalidKeyException e) {
//            System.out.println(new Product(0, "INVALID PRODUCT"));
//        }
//
//        System.out.println("\n\n");
//
//        // List all products
//        for (Product product : products.getProducts()) {
//            System.out.println(product);
//        }

//        void createOrder(){}
//        void getOrder(){}
//        void listOrders(){}

        // Create OrderRepo

        // Add products to ProductRepo

        // Create order 1
        // Create order 2
        // Create order 3

        // Add orders to OrderRepo

        // List order 2 by ID

        // List all orders


        Product apple = new Product(1, "Apfel");
        Product kellogs = new Product(2, "Kellogs");
        Product nutella = new Product(3,"Nutella");

        Order order1 = new Order(1);
        order1.add(
                apple, apple, kellogs, nutella
        );

        Order order2 = new Order(2);
        order2.add(
                apple, kellogs, nutella
        );


        OrderRepo orderRepo = new OrderRepo();

        orderRepo.addOrder(order1);
        orderRepo.addOrder(order2);
        orderRepo.listAllOrders();


    }
}
