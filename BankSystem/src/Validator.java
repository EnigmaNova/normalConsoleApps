public class Validator {

    public static boolean validateAccountNumber(int accountNumber) {
        if (accountNumber <= 0) {
            System.out.println("Invalid account number: " + accountNumber);
            return false;
        }
        return true;
    }

    public static boolean validateAmount(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount: " + amount);
            return false;
        }
        return true;
    }
    
}
