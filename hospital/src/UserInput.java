import java.util.Scanner;

public class UserInput {
    private Scanner scan;

    public UserInput(){
        this.scan = new Scanner(System.in);
    }

    public int getInt(){
        while(!scan.hasNextLine()){
            System.out.println("Invalid input ");
            scan.next();
        }
        return scan.nextInt();
    }

    public String getString(){
        System.out.println("Enter the string");
        return scan.nextLine();
    }

    public double getDouble(){
        while(!scan.hasNextLine()){
            System.out.println("Invalid input.");
            scan.next();
        }
        return scan.nextDouble();
    }
}
