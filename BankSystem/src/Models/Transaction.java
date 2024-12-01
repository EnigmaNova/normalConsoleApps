package Models;

import java.time.LocalDateTime;

public class Transaction {
    private String transactionId;
    private double amount;
    private String type;
    private LocalDateTime date;
    
    public Transaction(String id, double amount, String type, LocalDateTime date){
        this.transactionId = id;
        this.amount = amount;
        this.type = type;
        this.date = date;
    }

    public String getTransactionId(){return transactionId;}
    public double getAmount(){return amount;}
    public String getType(){return type;}
    public LocalDateTime getDate(){return date;}
    
    @Override
    public String toString() {
        return "Transaction{" +
               "transactionId='" + transactionId + '\'' +
               ", amount=" + amount +
               ", type='" + type + '\'' +
               '}';
    }
}
