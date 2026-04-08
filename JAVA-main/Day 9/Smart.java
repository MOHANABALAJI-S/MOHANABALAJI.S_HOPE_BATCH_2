abstract class SmartDevice{
    abstract void turnON();
    abstract void turnOFF();
    void DeviceInfo(){
        System.out.println("Device Connected");
    }
    void SetLevel(int level){
        System.out.println("Level: "+level);
    }
}
class Light extends SmartDevice{
    @Override
    void turnON(){
        System.out.println("Lights on");
    }
    @Override
    void turnOFF(){
        System.out.println("Lights off");
    }
}
class Fan extends SmartDevice{
    @Override
    void turnON(){
        System.out.println("Fan on");
    }
    @Override
    void turnOFF(){
        System.out.println("Fan off");
    }
}
class AC extends SmartDevice{
    @Override
    void turnON(){
        System.out.println("AC on");
    }
    @Override
    void turnOFF(){
        System.out.println("AC off");
    }
}
interface remote{
    void change();
}
interface WiFiControl{
    void connect();
}
class TV implements remote,WiFiControl{
    @Override
    public void change(){
        System.out.println("Change Channel");
    }
    @Override
    public void connect(){
        System.out.println("WiFi Connected");
    }

}
public class Smart {
    public static void main(String[] args) {
        remote r = new TV();
        r.change();
       
        //SmartDevice device=new Light();
        //SmartDevice device1=new Fan();
        //SmartDevice device2=new AC();
        //device.turnON();
        //device.DeviceInfo();
        //device.SetLevel(10);
        //device1.turnOFF();
        //device2.turnON();
    }
}
