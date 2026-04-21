import java.io.File;
import java.io.IOException;
public class FileExample {
    public static void main(String[] args) {
        try{
        File newFile = new File("test1.txt");
        if(newFile.createNewFile()){
            System.out.println("File created "+newFile.getName());
        }
        else{
            System.out.println("Not able to create file");
        }
    }
    catch(IOException e){
        System.out.println(e.getMessage());
    }
    }
}
