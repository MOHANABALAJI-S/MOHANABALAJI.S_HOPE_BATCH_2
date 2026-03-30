import java.util.*;

public class Wave {
    
    static String Wf(String s){
        int n=s.length();
    if(n<=2) return s;
    char[] ch=s.toCharArray();
    StringBuilder sb=new StringBuilder();
    StringBuilder sb2=new StringBuilder();
    for(int i=0;i<n;i++){
        if(i%2==0) 
            {
                sb.append(ch[i]);
            }
        else{
            sb2.append(ch[i]);
        }
    }
    return new String(sb.append(sb2));
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        System.out.println(Wf(s));
    }
}
