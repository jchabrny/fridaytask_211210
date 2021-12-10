import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Map;

public class OrderRepo {

    private final Map<Integer, Order> orderMap = new HashMap<>();

    public void addOrder(Order order) {
        orderMap.put(order.getId(), order);
    }

    public Order getOrder(int ID) throws InvalidKeyException{
        if (orderMap.containsKey(ID))
            return orderMap.get(ID);
        else
            throw new InvalidKeyException();
    }

    public void listAllOrders() {
        for (Order order : orderMap.values()){
            System.out.println(order.toString());
        }
    }
}
