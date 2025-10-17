package cursoJavaNelioAlves.matriz.exemplo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho da matriz que quer formar: ");
        int n = scanner.nextInt();
        int[][] matriz = new int[n][n];

        System.out.println("Informe os valores da matriz: ");
        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j< matriz[i].length; j++){
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Matriz completa: ");
        for(int i = 0; i<matriz.length; i++){
            System.out.println();
            for(int j = 0; j<matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
        }

        System.out.println("\nOs valores da diagonal da matriz: ");
        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz[i].length; j++){
                if(i == j){
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }

        System.out.println("\n" +
                "Números negativos: ");
        for(int i = 0; i< matriz.length; i++){
            for(int j = 0; j<matriz[i].length; j++){
                if(matriz[i][j] < 0){
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }

        scanner.close();
    }
}
