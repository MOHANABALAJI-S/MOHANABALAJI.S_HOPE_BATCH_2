import java.util.*;
class Product{
    int price;
    String name;
    double rating;
    Product(int price,String name,int rating){
        this.price=price;
        this.name=name;
        this.rating=rating;
    }
    @Override
    public String toString(){
        return price+"-"+name+"-"+rating;
    }
}
public class ProductTask{
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(6,"ABC",70));
        products.add(new Product(10,"DEF",80));
        products.add(new Product(15,"XYZ",34));
        products.add(new Product(12,"PQR",56));
        products.add(new Product(2,"EFG",98));
        Comparator<Product> byName = new Comparator<Product>(){
            public int compare(Product a,Product b){
                return a.name.compareTo(b.name);
            }
        };
        Collections.sort(products,byName);
        System.out.println(products);
    }
}