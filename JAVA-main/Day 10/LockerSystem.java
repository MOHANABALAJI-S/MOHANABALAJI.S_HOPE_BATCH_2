class Locker {
    private int lockerId;
    private boolean isLocked;
    private int pinCode;
    private String storedItem;
    Locker(int lockerId,int pinCode){
        this.lockerId=lockerId;
        this.pinCode=pinCode;
        this.isLocked=true;
        this.storedItem=null;
    }
    public void storedItem(String item,int pin){
        if(pin==pinCode){
            if(!isLocked){
                storedItem=item;
                System.out.println("Item stored successfully");
            }
            else{
                System.out.println("Locker is locked");
            }
        }
        else{
            System.out.println("Entered pin is wrong");
        }
    }
    public void retriveItem(int pin){
        if(pin==pinCode){
            if(!isLocked && storedItem!=null){
                System.out.println("Retrived Item: "+storedItem);
                storedItem=null;
            }
            else if(storedItem==null){
                System.out.print("Locker is empty");
            }
            else{
                System.out.println("Locker is locked");
            }

        }
        else{
            System.out.println("Incorrect pin");
        }

    }
    public void unlock(int pin){
        if(pin==pinCode){
            isLocked=false;
            System.out.println("Locker Unlocked");
        }
        else{
            System.out.println("Invalid Pin");
        }

    }
    public void lock(){
        isLocked=true;
        System.out.println("Locker locked");

    }
}
public class LockerSystem{
    public static void main(String[] args) {
        Locker locker = new Locker(101,2006);
        locker.unlock(111);
        locker.unlock(2006);
        locker.storedItem("Laptop",2006);
        locker.lock();
        locker.retriveItem(2006);
        locker.unlock(2006);
        locker.retriveItem(2006);
    }
}
