import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Order {
    private final int id;
    private final List<Product> orderContent = new ArrayList<>();

    public Order(int id) {
        this.id = id;
    }

    public void add(Product... products){
        orderContent.addAll(Arrays.asList(products));
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Order " + id + " " + orderContent.toString();
    }
}
