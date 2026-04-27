package exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Funcionario f = new Funcionario();

        System.out.print("Nome: ");
        f.nome = scanner.nextLine();
        System.out.print("Salário Bruto: ");
        f.salarioBruto = scanner.nextDouble();
        System.out.print("Taxa: ");
        f.taxa = scanner.nextDouble();

        System.out.println();
        System.out.println(f);
        System.out.println();

        System.out.println("Qual o percentual do aumento: ");
        double taxaAumento = scanner.nextDouble();

        f.aumentarSalario(taxaAumento);
        System.out.println(f);

        scanner.close();
    }
}
