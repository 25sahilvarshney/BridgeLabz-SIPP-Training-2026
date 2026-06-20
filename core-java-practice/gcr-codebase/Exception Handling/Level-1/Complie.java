import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Complie{
    public static void main(String[] args){
        try{
            BufferedReader read = new BufferedReader(new FileReader("data.txt"));
            String line;
            while((line = read.readLine())!=null){
                System.out.println(line);
            }
            read.close();
        }
        catch (IOException e){
            System.out.println("An IOException Occured:" + e.getMessage());
        }
    }
}