package polimorfismo.exemplo1;

public class Main {
    static void main() {
        Account x = new Account(101, "Erick", 1000.00);
        Account y = new SavingsAccount(102, "Yasmin", 1000.00, 0.01);

        x.withdraw(50.00);
        y.withdraw(50.00);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());
    }
}
