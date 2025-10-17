//package aula.exercicioBanco;
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Banco b = new Banco();
//
//        System.out.print("Enter account number: ");
//        b.setNumber(scanner.nextInt());
//        scanner.nextLine();
//        System.out.print("Enter account holder: ");
//        b.setName(scanner.nextLine());
//        System.out.print("Is there an initial deposit (y/n)? ");
//        char op = scanner.next().charAt(0);
//        if(op == 'y') {
//            System.out.print("Enter initial deposit: ");
//            b.setDeposit(scanner.nextDouble());
//            b.deposit(b.getDeposit());
//        }else  b.setDeposit(0);
//
//        System.out.println("Account data: ");
//        System.out.println(b);
//        System.out.println();
//
//        System.out.print("Enter a deposit value: ");
//        b.setDeposit(scanner.nextDouble());
//        b.deposit(b.getDeposit());
//        System.out.println(b);
//        System.out.println();
//
//        System.out.print("Enter a withdraw value: ");
//        b.setWithdraw(scanner.nextDouble());
//        b.withdraw(b.getWithdraw());
//        System.out.println(b);
//
//        scanner.close();
//    }
//}
