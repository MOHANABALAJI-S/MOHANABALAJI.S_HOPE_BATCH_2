class Product{
    int id;
    String name;
    double price;
    int quantity;
    Product(int id,String name,double price,int quantity){
        this.id=id;
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
    double getTotalPrice(){
        return price * quantity;
    }
    void display(){
        System.out.println("ID= "+id+" "+"Name = " +name+" "+"Price = " +price+" "+"Quantity = " +quantity);
    }
}
public class ShoppingCart{
public static void main(String[] args){
    Product[] p1 = new Product[3];
    p1[0]=new Product(101,"Laptop",100000.0,2);
    p1[1]=new Product(102,"Phone",20000.0,4);
    p1[2]=new Product(103,"Ipad",500000.0,5);
    double grandTotal=0;
    for(int i=0;i<p1.length;i++){
       p1[i].display();
       grandTotal+=p1[i].getTotalPrice(); 
    }
    System.out.println("Grand Total = "+grandTotal);
}

}
