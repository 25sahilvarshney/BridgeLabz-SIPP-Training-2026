import java.util.*;
import java.lang.*;
import java.io.*;

class BankAc {
    private static int totalAccounts     = 0;
    private static int nextAccountNumber = 1001;
    private int      accountNumber;
    private String   holder;
    private double   balance;
    private String[] transactionLog;
    private int      logCount;

    BankAc(String holder, double initialDeposit) {
        this.accountNumber  = nextAccountNumber++;  
        this.holder         = holder;
        this.balance        = initialDeposit;
        this.transactionLog = new String[20];
        this.logCount       = 0;
        totalAccounts++;
        System.out.println("Account opened for " + holder + " with Rs." + initialDeposit);
    }

    
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public String getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("  [ERROR] Invalid deposit amount: " + amount);
            return;
        }
        balance += amount;
        System.out.println("Deposited    Rs." + String.format("%.2f", amount) + "  | Balance: Rs." + String.format("%.2f", balance));
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("  [ERROR] Invalid withdrawal amount: " + amount);
            return;
        }
        if (amount > balance) {
            System.out.println("  [BLOCKED] Overdraft attempt of Rs." + amount + " | Available: Rs." + String.format("%.2f", balance));
            return;
        }
        balance -= amount;
        System.out.println("Withdrawn    Rs." + String.format("%.2f", amount) + "  | Balance: Rs." + String.format("%.2f", balance));
    }
}

class TransactionLogger {
    public static void printHeader() {
        System.out.println("============================================");
        System.out.println("         BRIDGEBANK — TRANSACTION LOG       ");
        System.out.println("============================================");
    }

    public static void printSectionTitle(String title) {
        System.out.println("\n-- " + title + " --");
        System.out.println("--------------------------------------------");
    }

    public static void printAccountSummary(BankAccount account) {
        System.out.printf("  %-10s | Final Balance: Rs. %10.2f%n",
        account.getHolder(), account.getBalance());
    }

    public static void printFooter(int totalAccounts) {
        System.out.println("\n============================================");
        System.out.println("  Total Accounts Opened : " + totalAccounts);
        System.out.println("  Simulation Complete.");
        System.out.println("============================================");
    }
}


public class BankAccount { 
    public static void main(String[] args) {
        TransactionLogger.printHeader();
        
        BankAccount acc1 = new BankAccount("Ravi",  10000.00);
        BankAccount acc2 = new BankAccount("Priya", 25000.00);
        BankAccount acc3 = new BankAccount("Ankit",  5000.00);
        
        System.out.println("\n  Total Accounts Opened So Far: " + BankAccount.getTotalAccounts());
        
        TransactionLogger.printSectionTitle("Ravi's Transactions");
        acc1.deposit(5000);       
        acc1.withdraw(3000);      
        acc1.deposit(2000);       
        acc1.withdraw(20000);     
        acc1.withdraw(1000);      
        
        TransactionLogger.printSectionTitle("Priya's Transactions");
        acc2.deposit(10000);      
        acc2.withdraw(8000);      
        acc2.deposit(3000);       
        acc2.withdraw(15000);     
        acc2.deposit(500);        
        
        TransactionLogger.printSectionTitle("Ankit's Transactions");
        acc3.deposit(1000);       
        acc3.withdraw(4000);      
        acc3.deposit(2000);       
        acc3.withdraw(500);       
        acc3.withdraw(3000);   

        
        TransactionLogger.printSectionTitle("Final Accounts Summary");
        TransactionLogger.printAccountSummary(acc1);
        TransactionLogger.printAccountSummary(acc2);
        TransactionLogger.printAccountSummary(acc3);
        
        TransactionLogger.printFooter(BankAccount.getTotalAccounts());
    }
}