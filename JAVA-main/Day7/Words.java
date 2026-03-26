import java.util.*;
public class Words{
    static int WordCount(String s){
        int n=s.length(),count=0;
        char[] ch=s.toCharArray();
        for(int i=0;i<n-1;i++){
            if(Character.isLetterOrDigit(ch[i]) && ch[i+1]==' '){
                count++;
            }
        }
        if(ch[n-1]==' ') return count;
        return count+1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(WordCount(s));
    }
}