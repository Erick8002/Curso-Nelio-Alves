package cursoJavaNelioAlves.vetor.somaVetores;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite quantos valores vai ter cada vetor: ");
        int qtdVetor = scanner.nextInt();

        System.out.println("Digite os valores do vetor A: ");
        int[] vectA = new int[qtdVetor];
        for(int i = 0; i< vectA.length; i++){
            vectA[i] = scanner.nextInt();
        }

        System.out.println("Digite os valores do vetor B: ");
        int[] vectB = new int[qtdVetor];
        for(int i = 0; i<vectB.length; i++){
            vectB[i] = scanner.nextInt();
        }

        System.out.println("Vetor Resultante: ");
        for(int i = 0; i< vectA.length; i++){
            System.out.println(vectA[i] + vectB[i]);
        }
    }
}
