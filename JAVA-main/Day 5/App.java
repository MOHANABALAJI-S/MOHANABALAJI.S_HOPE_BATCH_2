class User{
    String name;
    String phone;
    String address;
    String role = "User";
    User(){
        System.out.println("By using Super");
    }
    User(String name){
        this.name = name;
        System.out.println("User Created");
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Role: "+role);

    }
}
class Driver extends User{
    String role = "Driver";
    String vehicle;

    Driver(String name,String vehicle){
        super(name);
        this.vehicle=vehicle;
    }

    void displaydriver(){
        super.display();
        System.out.println("Vehicle: "+vehicle);
        System.out.println("Driver class Role: "+role);
        System.out.println("User class Role: "+super.role);
    }

}
public class App {
    public static void main(String[] args) {
        Driver d = new Driver("ABC","Bike");
        d.displaydriver();
    }
    
}
