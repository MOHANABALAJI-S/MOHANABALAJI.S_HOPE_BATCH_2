public class Method1 {
    static void change(int x){
        x=20;
        System.out.println("Inside:",x);
    }
    public static void main(StringTest[] args){
        int a = 50;
        change(a);
        System.out.println("outside",a);
    }
}
