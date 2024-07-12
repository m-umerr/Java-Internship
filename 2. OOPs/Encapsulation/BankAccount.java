package Encapsulation;

public class BankAccount {
    private double accountNumber;
    private double balance;

    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposited: "+amount);
        }
        else{
            System.out.println("Invalid Deposit amount");
        }
    }
    public void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println("Withdrew: "+amount);
        }else{
            System.out.println("Invalid amount or insufficient balance");
        }
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(double accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
