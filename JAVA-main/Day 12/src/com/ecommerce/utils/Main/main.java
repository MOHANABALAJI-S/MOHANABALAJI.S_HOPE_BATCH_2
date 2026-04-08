package src.com.ecommerce.utils.Main;

import src.com.ecommerce.utils.Service.OrderService;
import src.com.ecommerce.utils.model.Order;
import src.com.ecommerce.utils.model.Product;
import src.com.ecommerce.utils.model.User;

public class main {
    public static void main(String[] args) {
        Product p = new Product("mouse",200.0);
        User u = new User("test1", "abc, Chennai");
        Order o = new Order(user, product, 3);
        OrderService s = new OrderService();
    }
}
