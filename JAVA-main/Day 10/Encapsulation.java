class BankAccount{
    private double balance;
    public void setBalance(double balance){//setters
        if(balance>0){
        this.balance=balance;
        }
        else{
            System.out.println("Input Invalid");
        }
    }
    public void withdraw(int amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Amount Debited: "+balance);
        }
        else{
            System.out.println("Invalid Amount");
        }
    }    
    public void deposit(int amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Amount Credited: "+balance);

        }
        else{
            System.out.println("Invalid Amount");
        }

    }
    public double getBalance(){//getters
        return balance;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.setBalance(1000);
        System.out.println(b.getBalance());
        b.withdraw(500);
        System.out.println(b.getBalance());
        b.deposit(9000);
        System.out.println(b.getBalance());
    }   
}
