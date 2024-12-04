import java.util.Scanner;

public class UserInput {
    private Scanner scan = new Scanner(System.in);

    public int getInt(String message) {
        System.out.print(message);
        while (!scan.hasNextInt()) {
            System.out.print("Invalid input. " + message);
            scan.next();
        }
        return scan.nextInt();
    }

    public double getDouble(String message) {
        System.out.print(message);
        while (!scan.hasNextDouble()) {
            System.out.print("Invalid input. " + message);
            scan.next();
        }
        return scan.nextDouble();
    }

    public String getString(String message) {
        System.out.print(message);
        return scan.next();
    }
}
