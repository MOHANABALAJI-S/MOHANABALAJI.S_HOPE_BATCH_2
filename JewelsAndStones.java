import java.io.*;
public class Fileread{
    public static void main(String[] args){
        try{
            BufferedReader fr = new BufferedReader(new FileReader("test1.txt"));
            String line;
            while((line=fr.readLine())!=null){
                System.out.print(line);
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}