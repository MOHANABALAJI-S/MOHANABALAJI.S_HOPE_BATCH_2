public class Evenlength {
    public static void main(String[] args){
        String str = "Print the words with even length only";
        String words = " ";
        int len = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch!=' '){
                words+=ch;
                len++;
            }
            else{
                if(len%2==0)
                    System.out.print(words+" ");
            }
            words=" ";
            len=0;
        }
        if(len%2==0)
            System.out.print(words);
    }    
}
