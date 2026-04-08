abstract class Smartdevices {
    String name;

    Smartdevices(String name) {
        this.name = name;
    }

    abstract void turnOFF();
    abstract void turnON();
}

// ---------------- LIGHT ----------------
class Light extends Smartdevices {

    Light(String name) {
        super(name);
    }

    void turnON() {
        System.out.println(name + " Light ON");
    }

    void turnOFF() {
        System.out.println(name + " Light OFF");
    }
}

// ---------------- AC ----------------
class AC extends Smartdevices {

    AC(String name) {
        super(name);
    }

    void turnON() {
        System.out.println(name + " AC ON");
    }

    void turnOFF() {
        System.out.println(name + " AC OFF");
    }
}

// ---------------- TRIGGERS ----------------
interface Trigger {
    boolean isTrigger();
}

class MotionTrigger implements Trigger {
    public boolean isTrigger() {
        System.out.println("Motion Triggered");
        return true;
    }
}

class TempTrigger implements Trigger {
    int temp;

    TempTrigger(int temp) {
        this.temp = temp;
    }

    public boolean isTrigger() {
        System.out.println("Temperature: " + temp);
        return temp > 25;
    }
}

class TimeTrigger implements Trigger {
    int time;

    TimeTrigger(int time) {
        this.time = time;
    }

    public boolean isTrigger() {
        System.out.println("Time: " + time);
        return time >= 18;
    }
}

// ---------------- ACTIONS ----------------
interface Action {
    void execute();
}

class TurnONAction implements Action {
    Smartdevices device;

    TurnONAction(Smartdevices device) {
        this.device = device;
    }

    public void execute() {
        device.turnON();
    }
}

class TurnOFFAction implements Action {
    Smartdevices device;

    TurnOFFAction(Smartdevices device) {
        this.device = device;
    }

    public void execute() {
        device.turnOFF();
    }
}

// ---------------- RULE ----------------
class Rule {
    Trigger trigger;
    Action action;

    Rule(Trigger trigger, Action action) {
        this.trigger = trigger;
        this.action = action;
    }

    void result() {
        if (trigger.isTrigger()) {
            action.execute();
        } else {
            System.out.println("Condition not satisfied");
        }
    }
}

// ---------------- MAIN CLASS ----------------
public class SmartAutomationSystem {
    public static void main(String[] args) {

        // Devices
        Smartdevices d1 = new Light("Hall");
        Smartdevices d2 = new AC("Bedroom");

        // Triggers
        Trigger t1 = new MotionTrigger();
        Trigger t2 = new TempTrigger(30);
        Trigger t3 = new TimeTrigger(20);

        // Actions
        Action a1 = new TurnONAction(d1);
        Action a2 = new TurnOFFAction(d2);

        // Rules
        Rule r1 = new Rule(t1, a1);
        Rule r2 = new Rule(t2, a2);
        Rule r3 = new Rule(t3, new TurnONAction(d2));

        // Execute Rules
        r1.result();
        r2.result();
        r3.result();
    }
}