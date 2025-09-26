import ultils.BankAccount;

public class app {
        public static void main(String[] args) {
        BankAccount account1 = new BankAccount("12345678", 500.0);
        BankAccount account2 = new BankAccount("98765432", 1000.0);

        account1.showBalance();
        account1.deposit(200.0);
        account1.showBalance();
        account1.withdraw(100.0);
        account1.showBalance();
        account1.withdraw(700.0);

        account2.showBalance();
        account2.deposit(500.0);
        account2.showBalance();
        account2.withdraw(1500.0);
        account2.showBalance();

    }
}

