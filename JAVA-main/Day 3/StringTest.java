public class StringTest {
    public static void main(String[] args){
    int count = 0;
    String s = "learning java programming";
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)==' ')
            count++;
    }
    System.out.println(count+1);
}
}
