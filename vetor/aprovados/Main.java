package vetor.aprovados;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados: ");
        int qtd = scanner.nextInt();

        Aluno[] vectAluno = new Aluno[qtd];
        for(int i = 0; i< vectAluno.length; i++){
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno: \n", (i+1));
            scanner.nextLine();
            String name = scanner.nextLine();
            double nota1 = scanner.nextDouble();
            double nota2 = scanner.nextDouble();

            vectAluno[i] = new Aluno(name, nota1, nota2);
        }

        double media;
        System.out.println("Alunos aprovados: ");
        for(int i = 0; i< vectAluno.length; i++){
            media = (vectAluno[i].getNota1() + vectAluno[i].getNota2())/2;
            if(media>=6.0){
                System.out.println(vectAluno[i].getName());
            }
        }

    }
}
