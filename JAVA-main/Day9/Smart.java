abstract class SmartDevice{
    abstract void turnOn();
    abstract void turnOff();
    void deviceInfo(){
        System.out.println("It is a device");
    }
    abstract void SetLevel(String level);
}
class Light extends SmartDevice{
    @Override
    void turnOn(){
        System.out.println("Linght On");
    }
    @Override
    public void turnOff(){
        System.out.println("Light Off");
    }
    void SetLevel(String level){
        System.out.println("hello "+level);
    }
}
class Ac extends SmartDevice{
    @Override
    void SetLevel(String level){
        System.out.println(level);
    }
    @Override
    void turnOff(){
        System.out.println("Switch off");
    }
    void turnOn(){
        System.out.println("Linght On");
    }
}
class Fan extends SmartDevice{
    @Override
    void SetLevel(String level){
        System.out.println("hello "+level);
    }
    @Override
    void turnOff(){
        System.out.println("Fan off");
    }
    void turnOn(){
        System.out.println("Linght On");
    }
}

interface Remote{
    void Change();
}
interface wifiControl{
    void connect();
}
class TV implements Remote,wifiControl{
    public void Change(){
        System.out.println("change channel");
    }
    public void connect(){
        System.out.println("Wifi Connected");
    }
}
public class Smart {
    public static void main(String[] args) {
      SmartDevice device=new Light();
        SmartDevice d2=new Ac();
        SmartDevice d3=new Fan();
        device.turnOn();
        device.turnOff();
        device.deviceInfo();
        d2.SetLevel("Hi");
        d3.SetLevel("bala");
        Remote r = new TV();
        r.Change();
        wifiControl w = new TV();
        w.connect();
    }
}
