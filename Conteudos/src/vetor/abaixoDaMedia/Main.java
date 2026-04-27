package vetor.abaixoDaMedia;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos elementos vai ter o vetor: ");
        int qtd = scanner.nextInt();

        double[] vectNum = new double[qtd];
        for(int i = 0; i<vectNum.length; i++){
            System.out.println("Digite um número: ");
            vectNum[i] = scanner.nextDouble();
        }

        double soma = 0;
        for(int i = 0; i< vectNum.length; i++){
            soma += vectNum[i];
        }

        double media = soma/qtd;
        System.out.println("Media do vetor: " + media);

        for(int i = 0; i< vectNum.length; i++){
            if(vectNum[i]<media){
                System.out.println(vectNum[i]);
            }
        }

    }
}
