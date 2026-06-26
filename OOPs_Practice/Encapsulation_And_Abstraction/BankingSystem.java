
abstract class BankAccount {

    
    private String accountNumber;
    private String holderName;
    private double balance;


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder Name    : " + holderName);
        System.out.println("Balance        : ₹" + balance);
    }


    public abstract double calculateInterest();
}


class SavingsAccount extends BankAccount {

    private double interestRate;

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }
}
class CurrentAccount extends BankAccount {

    private double monthlyBonusRate;

    public double getMonthlyBonusRate() {
        return monthlyBonusRate;
    }

    public void setMonthlyBonusRate(double monthlyBonusRate) {
        this.monthlyBonusRate = monthlyBonusRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * monthlyBonusRate / 100;
    }
}

public class BankingSystem {

    public static void main(String[] args) {

        
        SavingsAccount sa = new SavingsAccount();
        sa.setAccountNumber("SA101");
        sa.setHolderName("Rahul Sharma");
        sa.setBalance(50000);
        sa.setInterestRate(5);

        sa.deposit(10000);
        sa.withdraw(5000);

        System.out.println("\n===== Savings Account =====");
        sa.displayAccountDetails();
        System.out.println("Interest : ₹" + sa.calculateInterest());

    
        CurrentAccount ca = new CurrentAccount();
        ca.setAccountNumber("CA201");
        ca.setHolderName("Priya Verma");
        ca.setBalance(80000);
        ca.setMonthlyBonusRate(2);

        ca.deposit(15000);
        ca.withdraw(10000);

        System.out.println("\n===== Current Account =====");
        ca.displayAccountDetails();
        System.out.println("Interest : ₹" + ca.calculateInterest());
    }
}