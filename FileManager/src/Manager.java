import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Manager {

    public void createFile(String path){
        File file = new File(path + ".txt");
        try{
            if(file.createNewFile()){
                System.out.println("we create a new file.");
                System.out.println("you can edit it in our program.");
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }

    public void writeFile(String path, String text){
        try(FileWriter writer = new FileWriter(path + ".txt", true)){
            writer.write(text + System.lineSeparator());
            System.out.println("we sucsessfully safe info in the file");
        } catch(IOException e){
            e.printStackTrace();
        }
    }

    public void readFile(String path){
        try(BufferedReader br = new BufferedReader(new FileReader(path + ".txt"))){
            System.out.println("text from file");
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }

    public void deleteFile(String path){
        File file = new File(path + ".txt");
        if(file.exists()){
            if(file.delete()){
                System.out.println("we sucsussfully delete this file");
            } else{
                System.out.println("we cannot delete this file");
            }
        } else{
            System.out.println("we cannot find this file.");
        }
    }
}
