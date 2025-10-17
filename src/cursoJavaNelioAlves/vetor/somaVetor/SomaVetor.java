package cursoJavaNelioAlves.vetor.somaVetor;

import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar: ");
        int qtd = scanner.nextInt();

        double[] vectNum = new double[qtd];
        for(int i = 0; i< vectNum.length; i++){
            System.out.println("Digite um número: ");
            vectNum[i] = scanner.nextInt();
        }

        double sum = 0;
        System.out.print("Valores: ");
        for(int i = 0; i< vectNum.length; i++){
            System.out.println(vectNum[i] + " ");
            sum += vectNum[i];
        }
        double media = sum/qtd;

        System.out.println("Soma: " + sum);
        System.out.println("Media: " + media);
    }
}
