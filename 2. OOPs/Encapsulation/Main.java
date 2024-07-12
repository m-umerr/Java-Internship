package Encapsulation;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountNumber(421321);
        account.deposit(100);
        account.withdraw(10);
        System.out.println("Remaining Balancce: "+account.getBalance());
    }
}
