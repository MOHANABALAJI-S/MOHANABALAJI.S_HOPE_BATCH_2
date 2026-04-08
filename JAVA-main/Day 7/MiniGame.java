class Character{
    String name;
    Character(String name){
        this.name=name;
    }
    void attack(){
        System.out.println(name + "is attacking");
    }
}
class Warrior extends Character{
    Warrior(String name){
        super(name);
    }
    void attack(){
        System.out.println(name + "with sword");
    }
}
class Archer extends Character{
    Archer(String name){
        super(name);
    }
    void attack(){
        System.out.println(name + "with arrow");
    }

}
class Mage extends Character{
    Mage(String name){
        super(name);
    }
    void attack(){
        System.out.println(name + "with magic");
    }

}
public class MiniGame {
    public static void main(String[] args){
    Character c1= new Warrior("Ragnar");
    Character c2= new Archer("Legos");
    Character c3= new Mage("Merlin");
    c1.attack();
    c2.attack();
    c3.attack();
}
}
