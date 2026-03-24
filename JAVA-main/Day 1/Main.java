import java.util.*;
public class Main{
    public static void main(StringTest[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b){
            if(a>c)
        System.out.println(a);
            else
                System.out.print(c);
        }
        else if(b>a){
            if(b>c)
                System.out.print(b);
            else
                System.out.print(c);
        }
        else if(c>a){
            if(c>b)
                System.out.print(c);
            else
                System.out.print(b);
        }


    }
}
