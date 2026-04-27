package vetor.numerosPares;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar: ");
        int qtd = scanner.nextInt();
        int[] vectNum = new int[qtd];

        int qtdPar = 0;
        for(int i = 0; i< vectNum.length; i++){
            System.out.print("Digite um número: ");
            vectNum[i] = scanner.nextInt();

            if(vectNum[i]%2 == 0){
                qtdPar++;
            }
        }

        int[] vectNumPar = new int[qtdPar];
        int j = 0;
        for(int i = 0; i<vectNum.length; i++){
            if(vectNum[i]%2 == 0){
                vectNumPar[j] = vectNum[i];
                j++;
            }
        }

        System.out.println("Números pares: "    );
        for(int i = 0; i< vectNumPar.length; i++){
            System.out.print(vectNumPar[i] + " ");
        }
        System.out.println("\nQuantidade de números pares: " + qtdPar);
    }
}
