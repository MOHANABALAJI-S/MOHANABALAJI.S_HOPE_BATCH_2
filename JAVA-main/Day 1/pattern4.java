import java.util.*;
public class pattern4 {
    public static void main(StringTest[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int k=(2*i-1);k>0;k--){
            System.out.print("*");
        }
    
        System.out.println();
    }

    }
    
}
