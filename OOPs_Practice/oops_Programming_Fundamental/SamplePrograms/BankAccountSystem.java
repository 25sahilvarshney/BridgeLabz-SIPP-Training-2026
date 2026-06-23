package SamplePrograms;

public class BankAccountSystem {
    static class BankAccount {
        private static String bankName = "Bridge Bank";
        private static int totalAccounts = 0;
        private final String accountNumber;
        private String accountHolderName;
        private double balance;

        public BankAccount(String accountHolderName, String accountNumber, double balance) {
            this.accountHolderName = accountHolderName;
            this.accountNumber = accountNumber;
            this.balance = balance;
            totalAccounts++;
        }

        public static void getTotalAccounts() {
            System.out.println("Total accounts: " + totalAccounts);
        }

        public static String getBankName() {
            return bankName;
        }

        public void displayDetails() {
            if (!(this instanceof BankAccount)) {
                System.out.println("Object is not a BankAccount");
                return;
            }
            System.out.println("Bank: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: Rs." + String.format("%.2f", balance));
            System.out.println();
        }
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Aman", "BA1001", 15000.00);
        BankAccount acc2 = new BankAccount("Neha", "BA1002", 22000.00);
        acc1.displayDetails();
        acc2.displayDetails();
        BankAccount.getTotalAccounts();
    }
}
