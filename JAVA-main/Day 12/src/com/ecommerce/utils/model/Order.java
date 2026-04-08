package src.com.ecommerce.utils.model;

public class Order {
    User user;
    Product product;
    int quantity;
    Order(User user,Product product,int quantity){
        this.user=user;
        this.product=product;
        this.quantity=quantity;
    }
}
