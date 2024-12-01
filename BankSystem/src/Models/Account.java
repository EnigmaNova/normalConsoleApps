package Models;

public class Account {
    private String accountNumber;
    private double balance;
    private String ownerName;

    public Account(String accountNumber, double balance, String ownerName){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;
    }

    public void deposit(double amount){
        if (amount <= 0) {
            System.out.println("Deposit amount must be greater than zero.");
            return;
        }
        balance += amount; // Увеличиваем баланс
        System.out.println("Successfully deposited " + amount + ". New balance: " + balance);
    }

    public boolean withDraw(double amount){
        if(amount <= 0){
            System.out.println("Deposit amount must be greater than zero.");
            return false;
        }

        if(amount > balance){
            System.out.println("Insufficient balance. Current balance: " + balance);
            return false;
        }

        balance -= amount;
        System.out.println("Successfully withdrew " + amount + ". New balance: " + balance);
        return true;
    }

    public String getAccountNumber(){return accountNumber;}
    public double getBalance(){return balance;}
    public String getOwnerName(){return ownerName;}
    
    @Override
    public String toString() {
        return "Account{" +
               "accountNumber='" + accountNumber + '\'' +
               ", balance=" + balance +
               ", ownerName='" + ownerName + '\'' +
               '}';
    }

    
}
