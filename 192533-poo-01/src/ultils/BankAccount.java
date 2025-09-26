package ultils;

public class BankAccount{

private String accountNumber;
private double balance;

public BankAccount() {
    this.accountNumber = "";
    this.balance = 0.0;
}

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            this.balance -= amount;
        } else {
            System.out.println("Saldo insuficiente para relizar este retiro.");
        }
    }

    public void showBalance() {
        System.out.println("El saldo de la cuenta es: " + this.balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    
}

