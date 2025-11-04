package exercicioDolar;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the dolar price?");
        CurrencyConverter.dolarPrice = scanner.nextDouble();
        System.out.print("How many dolar will be bought?");
        CurrencyConverter.qtdReal = scanner.nextDouble();
        System.out.print("Amount to be paid in reais: " + CurrencyConverter.totalValueToPay(CurrencyConverter.dolarPrice, CurrencyConverter.qtdReal, CurrencyConverter.iof));

        scanner.close();
    }
}
