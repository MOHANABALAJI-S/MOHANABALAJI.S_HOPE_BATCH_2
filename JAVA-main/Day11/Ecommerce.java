class Product{
    String Productname;
    int stock;
    double price;
}
class User extends Product{
    String address;
    double balance;
    String name;

}
class paymentfailedexception extends Exception{
    public paymentfailedexception(String message){
        super(message);
    }
}
class productoutofstockexception extends Exception{
    public productoutofstockexception(String message){
        super(message);
    }
}
class insufficientfundsexception extends Exception{
    public insufficientfundsexception(String message){
        super(message);
    }
}
class Order extends User{
    
    int quantity;
    
    
    Order(String name,String address,String Productname,int quantity,int stock,double price,double balance){
         this.name=name;
         this.address=address;
         this.Productname=Productname;
         this.quantity=quantity;
         this.stock=stock;
         this.price=price;
         this.balance=balance;
    }
}
class ErrorChecker{
    static void placeOrder(Order order) throws paymentfailedexception,productoutofstockexception,insufficientfundsexception{
        if(order.stock<order.quantity){
            throw new productoutofstockexception("Product is out of stock");
        }
        double totalPrice=order.price*order.quantity;
        if(order.balance<totalPrice){
            throw new insufficientfundsexception("Insufficient funds");
        }
        // Process payment
        boolean paymentSuccess=false;
        if(!paymentSuccess){
            throw new paymentfailedexception("Payment failed");
        }
        // If everything is successful
        System.out.println("Order placed successfully!");  
    }
    
}
public class Ecommerce extends ErrorChecker{
    
    public static void main(String[] args) {
        ErrorChecker ecom=new ErrorChecker();
        Order order=new Order("John","123 Street","Laptop",1,10,100000.0,99999.0);
        try {
            ecom.placeOrder(order);
        } catch (productoutofstockexception e) {
            System.out.println(e.getMessage());
        } catch (insufficientfundsexception e) {
            System.out.println(e.getMessage());
        } catch (paymentfailedexception e) {
            System.out.println(e.getMessage());
        }
    }
}