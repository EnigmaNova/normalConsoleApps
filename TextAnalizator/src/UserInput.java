import java.util.Scanner;

public class UserInput {
    private Scanner scan;

    public UserInput(){
        this.scan = new Scanner(System.in);
    }

    public String getString(String message){
        System.out.println(message);
        return scan.nextLine();
    }
}
