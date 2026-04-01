class BankAccount{
    private double balance;
    public void setBalance(double balance){
        if(balance>0){
        this.balance=balance;
        }
        else{
            System.out.println("Invalid Input");
        }
    }
    public void withdraw(int amount){
        if(amount>0 && balance>=amount) {
            balance-=amount;
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
    public void deposit(int amount){
        if(amount>0){
            balance+=amount;
        }
        else{
            System.out.println("invalid amount");
        }
    }
    public double getBalance(){
        return balance;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        BankAccount b=new BankAccount();
        b.setBalance(1000);
        System.out.println(b.getBalance());
        b.withdraw(200);
        System.out.println(b.getBalance());
        b.deposit(1000);
        System.out.println(b.getBalance());
    }
}
