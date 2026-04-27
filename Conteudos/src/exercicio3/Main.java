package exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Estudante e = new Estudante();

        System.out.println("Enter your name: ");
        e.name = scanner.nextLine();
        System.out.println("Enter your three grades: ");
        e.grade1 = scanner.nextDouble();
        e.grade2 = scanner.nextDouble();
        e.grade3 = scanner.nextDouble();

        System.out.println(e);

        scanner.close();
    }
}
