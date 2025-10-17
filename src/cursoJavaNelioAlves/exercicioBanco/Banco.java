//package aula.exercicioBanco;
//
//public class Banco {
//    private int number;
//    private String name;
//    private double balance;
//    private double deposit;
//    private double withdraw;
//
//    public Banco(){ }
//
//    public Banco(int number, String name, double balance, double deposit, double withdraw){
//        this.number = number;
//        this.name = name;
//        this.balance = balance;
//        this.deposit = deposit;
//        this.withdraw = withdraw;
//    }
//
//    public int getNumber(){
//        return number;
//    }
//    public void setNumber(int number){
//        this.number = number;
//    }
//
//    public String getName(){
//        return name;
//    }
//    public void setName(String name){
//        this.name = name;
//    }
//
//    public double getBalance(){
//        return balance;
//    }
//    public void setBalance(double balance){
//        this.balance = balance;
//    }
//
//    public double getDeposit(){
//        return deposit;
//    }
//    public void setDeposit(double deposit){
//        this.deposit = deposit;
//    }
//
//    public double getWithdraw(){
//        return withdraw;
//    }
//    public void setWithdraw(double withdraw){
//        this.withdraw = withdraw;
//    }
//
//    public double deposit(double deposit){
//        return balance += deposit;
//    }
//
//    public double withdraw(double withdraw){
//        return balance -= withdraw + 5;
//    }
//
//    public String toString(){
//        return String.format(
//                "Account: %d, Holder: %s, Balance: %.2f",
//                getNumber(), getName(), getBalance()
//        );
//    }
//}
