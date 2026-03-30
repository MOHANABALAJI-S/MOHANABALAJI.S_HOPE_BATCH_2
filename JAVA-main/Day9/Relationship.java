class Battery{
    void powerSupply(){
        System.out.println("Still hava 60% power");
    }
}
class Remote{
    Battery miniBat;
    Remote(){
    miniBat=new Battery();    
    }
    public void changeChannel(){
        miniBat.powerSupply();
        System.out.println("Channel Changed");
    }
    
}
public class Relationship {
    public static void main(String[] args){
        Remote tvRemote=new Remote();
        tvRemote.changeChannel();
    }
}
