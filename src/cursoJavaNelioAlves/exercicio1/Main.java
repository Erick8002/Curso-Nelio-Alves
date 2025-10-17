package cursoJavaNelioAlves.exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Retangulo r = new Retangulo();

        System.out.println("Informe a largura e a altura do retangulo: ");
        r.largura = scanner.nextDouble();
        r.altura = scanner.nextDouble();

        System.out.println(r);

        scanner.close();
    }
}
