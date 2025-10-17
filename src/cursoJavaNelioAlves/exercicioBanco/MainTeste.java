package cursoJavaNelioAlves.exercicioBanco;

import java.util.Locale;
import java.util.Scanner;

public class MainTeste {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        BancoTeste bancoTeste;

        System.out.print("Enter account number: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter account holder: ");
        String name = scanner.nextLine();
        System.out.print("Is there an initial deposit(y/n)?");
        char op = scanner.next().charAt(0);
        if(op == 'y'){
            System.out.print("Enter initial deposit: ");
            double amount = scanner.nextDouble();
            bancoTeste = new BancoTeste(number, name, amount);
        }
        else bancoTeste = new BancoTeste(number, name);

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(bancoTeste);
        System.out.println();

        System.out.print("Enter a deposit value: ");
        double deposit = scanner.nextDouble();
        bancoTeste.deposit(deposit);
        System.out.println("Updated account data: ");
        System.out.println(bancoTeste);
        System.out.println();

        System.out.print("Enter a withdraw value: ");
        double withdraw = scanner.nextDouble();
        bancoTeste.withdraw(withdraw);
        System.out.println("Updated account data: ");
        System.out.println(bancoTeste);

        scanner.close();
    }
}
