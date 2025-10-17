package cursoJavaNelioAlves.exercicioVetor.dadosPessoais;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas: ");
        int qtd = scanner.nextInt();

        Pessoa[] vectPessoa = new Pessoa[qtd];
        double menorAltura = 100000;
        double maiorAltura = 0;
        double somaAlturaMulher = 0;
        int qtdHomem = 0;
        for(int i = 0; i<vectPessoa.length; i++){
            System.out.printf("Altura da %da pessoa: \n", (i+1));
            double height = scanner.nextDouble();
            System.out.printf("Gênero da %da pessoa(M, F): \n", (i+1));
            String gender = scanner.next();

            vectPessoa[i] = new Pessoa(height, gender);

            if(gender.equalsIgnoreCase("m")){
                qtdHomem++;
            } else if(gender.equalsIgnoreCase("f")) {
                somaAlturaMulher += vectPessoa[i].getHeight();
            }

            if(vectPessoa[i].getHeight()>maiorAltura){
                maiorAltura = vectPessoa[i].getHeight();
            } else if(vectPessoa[i].getHeight()<menorAltura){
                menorAltura = vectPessoa[i].getHeight();
            }
        }

        double mediaAlturaMulher = somaAlturaMulher/(qtd-qtdHomem);

        System.out.println("Menor altura: " + menorAltura);
        System.out.println("Maior altura: " + maiorAltura);
        System.out.printf("Media das alturas das mulheres: %.2f%n", mediaAlturaMulher);
        System.out.println("Número de homens: " + qtdHomem);

    }
}
