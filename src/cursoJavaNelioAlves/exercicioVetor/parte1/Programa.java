package cursoJavaNelioAlves.exercicioVetor.parte1;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe quantas pessoas quer calcular a altura: ");
        int n = scanner.nextInt();
        double[] vect = new double[n];

        for(int i = 0; i<n; i++){
            vect[i] = scanner.nextDouble();
        }

        double sum = 0.0;

        for(int i = 0; i<n; i++){
            sum += vect[i];
        }

        double media = sum/n;

        System.out.printf("Average height: %.2f", media);

        scanner.close();
    }
}
