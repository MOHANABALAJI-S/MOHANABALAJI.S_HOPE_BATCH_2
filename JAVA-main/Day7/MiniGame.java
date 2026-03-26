class Game{
    String Name;
    Game(String Name){
        this.Name=Name;
    }
    void Attack(){
        System.out.println("Attack...");
    }
}
class Warrior extends Game{
    Warrior(String Name){
        super(Name);
    }
    void Attack(){
        System.out.println(Name+" Attack with Sword");
    }
}
class Archer extends Game{
    Archer(String Name){
        super(Name);
    }
    void Attack(){
        System.out.println(Name+" Attack with arrow");
    }
}
class Mage extends Game{
    Mage(String Name){
        super(Name);
    }
    void Attack(){
        System.out.println(Name+" Attack with Magic");
    }
}

public class MiniGame {
    public static void main(String[] args){
        Game g;
        g=new Game("King");
        g.Attack();
        g=new Warrior("king");
        g.Attack();
        g=new Archer("king");
        g.Attack();
        g=new Mage("king");
        g.Attack();
    }
}
