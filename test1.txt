import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Write {
    public static void main(String[] args) {
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("test1.txt"));
            writer.write("Write using FileWriter1");
            writer.newLine();
            writer.write("Write using FileWriter2");
            writer.newLine();
            writer.write("Write using FileWriter3");
            writer.newLine();
            writer.write("Write using FileWriter4");

            writer.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
