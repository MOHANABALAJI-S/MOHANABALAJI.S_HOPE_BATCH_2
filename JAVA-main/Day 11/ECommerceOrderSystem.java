import java.lang.Math;

class ProductOutOfStockException extends Exception {
    public ProductOutOfStockException(String msg) {
        super(msg);
    }
}

class PaymentFailedException extends Exception {
    public PaymentFailedException(String msg) {
        super(msg);
    }
}

class OrderProcessingFailedException extends Exception {
    public OrderProcessingFailedException(String msg) {
        super(msg);
    }
}

class Product {
    String name;
    int stock;
    double price;

    Product(String name, int stock, double price) {
        this.name = name;
        this.stock = stock;
        this.price = price;
    }
}

class user {
    String name;
    String address;

    user(String name, String address) {
        this.name = name;
        this.address = address;
    }
}

class order {
    Product product;
    user user;
    int quantity;

    order(Product product, user user, int quantity) {
        this.product = product;
        this.user = user;
        this.quantity = quantity;
    }
}

class OrderService {
    void placeOrder(order order)
            throws ProductOutOfStockException, PaymentFailedException, OrderProcessingFailedException {

        if (order.product.stock <= 0) {
            throw new ProductOutOfStockException("Product out of stock");
        }

        if (Math.random() < 0.4) {
            throw new PaymentFailedException("Payment Failed");
        }

        if (Math.random() < 0.2) {
            throw new OrderProcessingFailedException("Order Processing Failed");
        }

        order.product.stock -= order.quantity;
        System.out.println("Order placed Successfully");
    }
}

public class ECommerceOrderSystem {
    public static void main(String[] args) {

        Product p = new Product("mouse", 5, 200.0);
        user u = new user("test1", "abc, Chennai");
        order o = new order(p, u, 3);
        OrderService s = new OrderService();

        try {
            s.placeOrder(o);
        } catch (ProductOutOfStockException e) {
            System.out.println(e.getMessage());
        } catch (PaymentFailedException e) {
            System.out.println(e.getMessage());
        } catch (OrderProcessingFailedException e) {
            System.out.println(e.getMessage());
        }
    }
}