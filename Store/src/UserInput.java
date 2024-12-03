import java.util.Scanner;

public class UserInput {
    private static Scanner scan = new Scanner(System.in);

    public static int getInt(String message) {
        System.out.print(message);
        while (!scan.hasNextInt()) {
            System.out.print("Invalid input. " + message);
            scan.next();
        }
        return scan.nextInt();
    }

    public static double getDouble(String message) {
        System.out.print(message);
        while (!scan.hasNextDouble()) {
            System.out.print("Invalid input. " + message);
            scan.next();
        }
        return scan.nextDouble();
    }

    public static String getString(String message) {
        System.out.print(message);
        return scan.next();
    }
}
