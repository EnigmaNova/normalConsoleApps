import java.util.Scanner;

public class UserInput {
    private final Scanner scan;

    public UserInput(){
        this.scan = new Scanner(System.in);
    }

    public String getAlgoChoice(){
        System.out.println("Enter sorting algorithm (bubble, selection, quick, insertion, merge, heap, tim, counting, radix):");
        return scan.nextLine().trim().toLowerCase();
    }

    public String getArrayInput(){
        System.out.println("Enter a list of integers separated by spaces:");
        return scan.nextLine().trim();
    }
}
