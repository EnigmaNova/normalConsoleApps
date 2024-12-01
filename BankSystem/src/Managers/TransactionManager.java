package Managers;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import Models.Account;
import Models.Transaction;

public class TransactionManager {
    private List<Transaction> transactions; // Список всех транзакций
    private int transactionCounter = 1; // Уникальный идентификатор транзакций

    public TransactionManager() {
        transactions = new ArrayList<>();
    }

    /**
     * Перевод средств между счетами.
     * @param fromAccount номер счета отправителя.
     * @param toAccount номер счета получателя.
     * @param amount сумма перевода.
     * @param bankManager объект BankManager для доступа к счетам.
     * @return true, если перевод выполнен успешно, false, если возникли ошибки.
     */
    public boolean transfer(int fromAccount, int toAccount, double amount, BankManager bankManager) {
        Account sender = bankManager.getAccount(fromAccount);
        Account receiver = bankManager.getAccount(toAccount);

        if (sender == null || receiver == null) {
            System.out.println("Invalid account numbers.");
            return false;
        }

        if (sender.withDraw(amount)) {
            receiver.deposit(amount);
            Transaction transaction = new Transaction(String.valueOf(getTransactionId()), amount, "Transfer", LocalDateTime.now());
            recordTransaction(transaction);
            System.out.println("Transfer successful: " + amount + " from " + fromAccount + " to " + toAccount);
            return true;
        } else {
            System.out.println("Transfer failed: Insufficient funds.");
            return false;
        }
    }

    /**
     * Записывает транзакцию в список.
     * @param transaction объект транзакции.
     */
    public void recordTransaction(Transaction transaction) {
        transactions.add(transaction);
        System.out.println("Transaction recorded: " + transaction);
    }

    /**
     * Возвращает историю операций по счету.
     * @param accountNumber номер счета.
     */
    public void getTransactionHistory(int accountNumber) {
        if (transactions.isEmpty()) {
            System.out.println("No transactions found.");
        } else {
            transactions.forEach(System.out::println);
        }
    }

    private int getTransactionId() {
        return transactionCounter++;
    }
}
