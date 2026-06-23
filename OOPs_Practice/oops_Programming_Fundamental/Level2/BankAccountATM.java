package Level2;

public class BankAccountATM {
    static class BankAccount {
        private String accountHolder;
        private String accountNumber;
        private double balance;

        public BankAccount(String accountHolder, String accountNumber, double balance) {
            this.accountHolder = accountHolder;
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public void deposit(double amount) {
            if (amount <= 0) {
                System.out.println("[ERROR] Invalid deposit amount: " + amount);
                return;
            }
            balance += amount;
            System.out.println("Deposited Rs." + String.format("%.2f", amount) + ", New balance: Rs." + String.format("%.2f", balance));
        }

        public boolean withdraw(double amount) {
            if (amount <= 0) {
                System.out.println("[ERROR] Invalid withdrawal amount: " + amount);
                return false;
            }
            if (amount > balance) {
                System.out.println("[ERROR] Insufficient balance. Available: Rs." + String.format("%.2f", balance));
                return false;
            }
            balance -= amount;
            System.out.println("Withdrew Rs." + String.format("%.2f", amount) + ", Remaining balance: Rs." + String.format("%.2f", balance));
            return true;
        }

        public void displayBalance() {
            System.out.println("Account: " + accountNumber + " | Holder: " + accountHolder + " | Balance: Rs." + String.format("%.2f", balance));
        }
    }

    public static void main(String[] args) {
        BankAccount acct = new BankAccount("Rohit", "ACC1001", 5000.00);
        acct.displayBalance();
        acct.deposit(1500);
        acct.withdraw(700);
        acct.withdraw(7000); // should fail
        acct.displayBalance();
    }
}
