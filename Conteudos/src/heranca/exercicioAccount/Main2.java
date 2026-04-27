package heranca.exercicioAccount;

public class Main2 {
    static void main() {
        Account acc1 = new Account(1001, "Alex", 1000.0);
        acc1.withdraw(200.0);
        System.out.println("Account: ");
        System.out.println("Balance: " + acc1.getBalance());

        Account acc2 = new SavingsAccount(1002, "Erick", 1000.0, 0.01);
        acc2.withdraw(200.0);
        System.out.println("\nSaving Account: ");
        System.out.println("Balance: " + acc2.getBalance());

        Account acc3 = new BusinessAccount(1003, "Yasmin", 1000.0, 500.0);
        acc3.withdraw(200.0);
        System.out.println("\nBusiness Account: ");
        System.out.println("Balance: " + acc3.getBalance());
    }
}
