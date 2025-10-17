package cursoJavaNelioAlves.vetor.maisVelho;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar: ");
        int qtd = scanner.nextInt();

        Pessoa[] vectPessoa = new Pessoa[qtd];
        for(int i = 0; i< vectPessoa.length; i++){
            System.out.printf("Dados da %da pessoa: \n", (i+1));
            System.out.print("Nome: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Idade: ");
            int age = scanner.nextInt();

            vectPessoa[i] = new Pessoa(name, age);
        }

        String maisVelho = "";
        int idadeMaisVelho = 0;

        for(int i = 0; i< vectPessoa.length; i++){
            if(vectPessoa[i].getAge()>idadeMaisVelho){
                maisVelho = vectPessoa[i].getName();
                idadeMaisVelho = vectPessoa[i].getAge();
            }
        }

        System.out.println("Pessoa mais velha: " + maisVelho);
    }
}
