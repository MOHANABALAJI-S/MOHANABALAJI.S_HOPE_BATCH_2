import java.util.*;

public class NonRep {
    static char Fir(String s){
        // int n=s.length();
        // boolean f=true;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         if(j!=i){
        //             if(s.charAt(i)==s.charAt(j)) f=false;
        //         }
        //     }
        // if(f) return s.charAt(i);
        // f=true;
        // }
        // return ' ';
        int n=s.length();
        int[] arr=new int[26];
        for(char i:s.toCharArray()){
            arr[i-'a']++;
        }
        for(int i=0;i<n;i++){
            if(arr[s.charAt(i)-'a']==1) return s.charAt(i);
        }
        return ' ';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        System.out.println(Fir(s));
    }
}
