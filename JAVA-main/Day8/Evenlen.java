import java.util.*;

public class Evenlen {
    static String Eve(String s){
        int n=s.length();
        StringBuilder ans=new StringBuilder();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<=n;i++){
            if(i==n || s.charAt(i)==' '){
                if(sb.length()%2==0){
                    ans.append(sb+" ");
                }
                    sb.setLength(0);
            }
            else{
                    sb.append(s.charAt(i));
            }
        }
        return new String(ans);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(Eve(s));
}
}