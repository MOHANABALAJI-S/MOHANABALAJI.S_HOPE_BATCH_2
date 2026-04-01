class locker{
    private long  id;
    private boolean islocked;
    private String pin;
    private String storeditem;
    locker(long id,String pin){
        this.id = id;
        this.pin = pin;
        this.islocked  = true;
    }
    public void storeitem (String item,String p){
        if(pin.equals(p)){
            this.islocked = false;
            this.storeditem = item;

        }
        else{
            System.out.print("Pin is invalid");
        
        }
        this.islocked = true;
        
    }
    public void retrieveitem (String p){
               if(this.pin.equals(p)){
                   
               
               if(!islocked && storeditem != null){
                      System.out.println(storeditem);
                      storeditem = null;
               }
               else if(storeditem == null){
                  System.out.println("Locker is empty");
               }
               else{
                System.out.println("LOcker is Locked");
               }
            }
               else{
               System.out.print("Pin is invalid");
               }
    } 
    public void lock(){
        islocked = true;
        System.out.println("locked");
    }
    public void unlock(String p){
        if(pin.equals(p)){
                   islocked = false;
                   System.out.println("unlocked");
               }
        else{
        System.out.print("Pin is invalid");}
    }
}


public class encap2 {
    public static void main(String[] args) {
        locker loc = new locker(10254,"784568");
        loc.unlock("784568");
        loc.storeitem("gold","784568");
        
       
        loc.retrieveitem("784568");
        loc.lock();
        

        
        }



    }