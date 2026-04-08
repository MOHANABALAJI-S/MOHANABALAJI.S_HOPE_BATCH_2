class Battery{
    public void PowerSupply(){
        System.out.println("Battery Percentage : 70%");
    }
}
class Remote{
    Battery mini;
    Remote(){
        mini=new Battery();
    }
    public void changechannel(){
    mini.PowerSupply();
    System.out.println("Channel Changed");
    }
    public void changeVolume(){
    System.out.println("Volume Changed");
    }
}
class TV{
    Remote tvRemote;
    TV(Remote tvRemote){
        this.tvRemote=tvRemote;
    }
    public void increaseVolume(){
        tvRemote.changeVolume();
    }

}
public class Relationship {
    public static void main(String[] args) {
        Remote tvRemote = new Remote();
        tvRemote.changechannel();
        Remote sonyRemote=new Remote();
        TV sony = new TV(sonyRemote);
        sony.increaseVolume();
    }
}

