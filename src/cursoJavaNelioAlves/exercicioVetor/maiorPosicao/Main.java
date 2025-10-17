package cursoJavaNelioAlves.exercicioVetor.maiorPosicao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar: ");
        int qtd = scanner.nextInt();

        int[] vectNum = new int[qtd];
        for(int i = 0; i< vectNum.length; i++){
            System.out.print("Digite umn número: ");
            vectNum[i] = scanner.nextInt();
        }

        int numMaior = 0;
        int maiorPosicao = 0;

        for(int i = 0; i<vectNum.length; i++){
            if(vectNum[i]>numMaior){
                numMaior = vectNum[i];
                maiorPosicao = i;
            }
        }

        System.out.println("Maior número: " + numMaior);
        System.out.println("Posição do maior valor: " + maiorPosicao);
    }
}
