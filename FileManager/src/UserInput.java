import java.util.Scanner;

public class UserInput {
    private Scanner scan;

    public UserInput(){
        this.scan = new Scanner(System.in);
    }

    public String getString(){
        return scan.nextLine();
    }

    public String getInt(){
        return scan.nextLine();
    }

    public void close(){
        if(scan != null){
            scan.close();
        }
    }
}
