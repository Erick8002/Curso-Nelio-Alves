package cursoJavaNelioAlves.exercicioVetor.parte2;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe quantos produtos quer adicionar: ");
        int n = scanner.nextInt();
        Produto[] vect = new Produto[n];

        for(int i = 0; i< vect.length; i++){
            scanner.nextLine();
            System.out.println("Informe o nome do produto: ");
            String name = scanner.nextLine();
            System.out.println("Informe o preço do produto: ");
            double price = scanner.nextDouble();

            vect[i] = new Produto(name, price);
        }

        double sum = 0.0;
        for(int i = 0; i< vect.length; i++){
            sum += vect[i].getPrice();
        }

        double avg = sum/n;

        System.out.println("Produtos");
        for(int i = 0; i< vect.length; i++){
            System.out.println(vect[i]);
        }
        System.out.printf("Average Price: %.2f", avg);

        scanner.close();
    }
}
