package cursoJavaNelioAlves.exercicioMatriz.exercicioEncontrarPosicaoMatriz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de linhas: ");
        int m = scanner.nextInt();
        System.out.print("Informe a quantidade de colunas: ");
        int n = scanner.nextInt();

        int[][] matriz = new int[m][n];

        System.out.println("Informe os valores das posições de cada valor da matriz: ");
        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz[i].length; j++){
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Informe o número que quer encontrar: ");
        int numEncontrar = scanner.nextInt();

        for(int i = 0; i< matriz.length; i++){
            for(int j = 0; j<matriz[i].length; j++){
                if(numEncontrar == matriz[i][j]){
                    System.out.printf("Posição: [%d, %d]\n", i,j);

                    if(j - 1 >= 0) {
                        System.out.println("Esquerda: " + matriz[i][j - 1]);
                    }
                    if(j + 1 < n){
                        System.out.println("Direita: " + matriz[i][j + 1]);
                    }
                    if(i - 1 >= 0){
                        System.out.println("Cima: " + matriz[i - 1][j]);
                    }
                    if(i + 1 < m){
                        System.out.println("Baixo: " + matriz[i + 1][j]);
                    }
                }
            }
        }
    }
}