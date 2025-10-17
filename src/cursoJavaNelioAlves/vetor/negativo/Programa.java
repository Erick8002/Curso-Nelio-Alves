package cursoJavaNelioAlves.vetor.negativo;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar: ");
        int n = scanner.nextInt();

        int[] vectNum = new int[n];
        int numNeg = 0;

        for(int i = 0; i<vectNum.length; i++){
            System.out.println("Digite um número: ");
            vectNum[i] = scanner.nextInt();
            if(vectNum[i]<0){
                numNeg++;
            }
        }

        int[] vectNumNeg = new int[numNeg];
        int j = 0;
        for(int i = 0; i<vectNum.length; i++){
            if(vectNum[i]<0){
                vectNumNeg[j] = vectNum[i];
                j++;
            }
        }

        System.out.println("Números negativos: ");
        for(int i = 0; i<vectNumNeg.length; i++){
            System.out.println(vectNumNeg[i]);
        }
    }
}
