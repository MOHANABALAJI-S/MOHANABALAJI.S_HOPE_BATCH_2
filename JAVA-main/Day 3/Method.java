import java.util.*;
public class Method{
    static int mul(int a, int b){
        return a*b;
    }
    static int square(int n){
        return mul(n,n);
        System.out.println(n);
        System.out.println(square(n));
    }
    public static void main(StringTest[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);
    }
}