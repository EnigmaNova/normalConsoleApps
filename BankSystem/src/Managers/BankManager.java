package Managers;

import java.util.ArrayList;
import java.util.List;

import Models.Account;

public class BankManager {
    private List<Account> accounts; // Список всех счетов

    public BankManager() {
        accounts = new ArrayList<>();
    }

    public Account createAccount(String ownerName, double amount) {
        int accountNumber = accounts.size() + 1; // Генерация уникального номера счета
        Account account = new Account(String.valueOf(accountNumber), amount, ownerName);
        accounts.add(account);
        System.out.println("Account created: " + account);
        return account;
    }

    /**
     * Удаляет счет по номеру.
     * @param accountNumber номер счета.
     * @return true, если счет удален успешно, false, если счет не найден.
     */
    public boolean deleteAccount(int accountNumber) {
        Account account = getAccount(accountNumber);
        if (account != null) {
            accounts.remove(account);
            System.out.println("Account deleted: " + accountNumber);
            return true;
        } else {
            System.out.println("Account not found: " + accountNumber);
            return false;
        }
    }

    public Account getAccount(int accountNumber) {
        for (Account account : accounts) {
            if (Integer.parseInt(account.getAccountNumber()) == accountNumber) {
                return account;
            }
        }
        return null;
    }

    public void listAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts found.");
        } else {
            accounts.forEach(System.out::println);
        }
    }
}
