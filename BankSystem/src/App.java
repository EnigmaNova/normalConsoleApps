import Managers.BankManager;
import Managers.TransactionManager;

public class App {
    private UserInput userInput;
    private static BankManager bankManager = new BankManager();
    private static TransactionManager transactionManager = new TransactionManager();

    public App(){
        this.userInput = new UserInput();
    }

    public void run(){
        boolean running = true;
        while(running){
            printMenu();
            int choice = userInput.getInt();

            switch(choice){
                case 1 -> createAccount();
                case 2 -> deleteAccount();
                case 3  -> listAccounts();
                case 4 -> transferFunds();
                case 5 -> showTransactionHistory();
                case 6 -> running = false;
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void printMenu(){
        System.out.println("\n----- Bank System -----");
        System.out.println("1. Create Account");
        System.out.println("2. Delete Account");
        System.out.println("3. List Accounts");
        System.out.println("4. Transfer Funds");
        System.out.println("5. Show Transaction History");
        System.out.println("6. Exit");
        System.out.print("Choose an option: ");
    }

    private void createAccount(){
        System.out.println("Enter the owner's name: ");
        String ownerName = userInput.getString();
        System.out.println("Enter the amount of money: ");
        double amount = userInput.getDouble();
        bankManager.createAccount(ownerName, amount);
    }

    private void deleteAccount(){
        System.out.println("Enter the account number to delete: ");
        int accountNumber = userInput.getInt();
        if (!bankManager.deleteAccount(accountNumber)) {
            System.out.println("Account not found!");
        }
    }

    private void listAccounts() {
        System.out.println("\n----- Accounts -----");
        bankManager.listAccounts();
    }

    private void transferFunds() {
        System.out.print("Enter the source account number: ");
        int fromAccount = userInput.getInt();
        System.out.print("Enter the destination account number: ");
        int toAccount = userInput.getInt();
        System.out.print("Enter the amount to transfer: ");
        double amount = userInput.getDouble();

        if (!transactionManager.transfer(fromAccount, toAccount, amount, bankManager)) {
            System.out.println("Transaction failed!");
        }
    }

    private void showTransactionHistory() {
        System.out.print("Enter the account number to see the transaction history: ");
        int accountNumber = userInput.getInt();
        transactionManager.getTransactionHistory(accountNumber);
    }

    public static void main(String[] args) throws Exception {
        new App().run();
    }
}
