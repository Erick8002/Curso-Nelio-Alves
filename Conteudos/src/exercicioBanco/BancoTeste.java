package exercicioBanco;

public class BancoTeste {
    private int number;
    private String name;
    private double balance;

    public BancoTeste(int number, String name){
        this.number = number;
        this.name = name;
    }

    public BancoTeste(int number, String name, double amount){
        this.number = number;
        this.name = name;
        deposit(amount);
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double deposit(double amount){
        return balance += amount;
    }

    public double withdraw(double amount){
        return balance -= amount + 5;
    }

    public String toString(){
        return String.format(
                "Account: %d, Holder: %s, Balance: %.2f",
                getNumber(), getName(), getBalance()
        );
    }
}
