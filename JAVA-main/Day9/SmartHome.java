abstract class SmartDevices{
    abstract void turnOn();
    abstract void turnOff();
}

class Light{
    void turnOn(){
        System.out.println("Lights on");
    }
    void turnOff(){
        System.err.println("Lights off");
    }
}
class AC{
    void turnOn(){
        System.out.println("Ac on");
    }
    void turnOff(){
        System.err.println("Ac off");
    }
}
interface trigger{
    boolean isTriggered();
}
class MotionTri implements trigger{
    MotionTri(){
        MotionTri mt=new MotionTri();
    }
    @Override
    public boolean isTriggered(){
        return true;
    }
}
class Time implements trigger{
    double time;
    Time(double time){
        this.time=time;
    }
    @Override
    public boolean isTriggered(){
        if(time >= 7.00){
            return true;
        }
        return false;
    }
}
class Temp implements trigger{
    double tem;
    Temp(double tem){
        this.tem=tem;
    }
    @Override
    public boolean isTriggered(){
        if(tem >=30.00){
            return true;
        }
        return false;
    }
}

interface Action{
    void execute();
}
class TurnOnAction implements Action{
    SmartDevices dev;
    TurnOnAction(SmartDevices dev){
        this.dev=dev;
    }
    public void execute(){
        dev.turnOn();
    }
}
class Rule{
    trigger t;
    Action a;

    public Rule(trigger t,Action a) {
               
    }
    
}
public class SmartHome {
    public static void main(String[] args) {
        
    }
}
