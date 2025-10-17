package cursoJavaNelioAlves.exercicioVetor.mediaPares;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor: ");
        int qtd = scanner.nextInt();

        int soma = 0;
        int qtdNumPar = 0;
        boolean possuiNumPar = false;
        int[] vectNum = new int[qtd];
        for(int i = 0; i< vectNum.length; i++){
            System.out.print("Digite um número: ");
            vectNum[i] = scanner.nextInt();
            if(vectNum[i]%2==0){
                soma += vectNum[i];
                qtdNumPar++;
                possuiNumPar = true;
            }
        }

        if(possuiNumPar){
            double media = soma/qtdNumPar;
            System.out.println("Media dos pares: " + media);
        } else System.out.println("Nenhum número par");


    }
}
