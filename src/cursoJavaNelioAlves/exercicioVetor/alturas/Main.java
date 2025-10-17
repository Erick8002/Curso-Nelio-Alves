    package cursoJavaNelioAlves.exercicioVetor.alturas;

    import java.util.Locale;
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner scanner = new Scanner(System.in);

            System.out.println("Quantas pessoas serão digitadas: ");
            int qtd = scanner.nextInt();

            Pessoa[] vectPessoa = new Pessoa[qtd];
            double sumHeight = 0;
            int qtdMenorIdade = 0;

            for(int i = 0; i< vectPessoa.length; i++){
                scanner.nextLine();
                System.out.printf("Dados da %da pessoa: \n", (i+1));
                System.out.print("Nome: ");
                String name = scanner.nextLine();
                System.out.print("Idade: ");
                int age = scanner.nextInt();
                System.out.print("Height: ");
                double height = scanner.nextDouble();

                vectPessoa[i] = new Pessoa(name, age, height);
                sumHeight += vectPessoa[i].getHeight();
                if(vectPessoa[i].getAge()<16){
                    qtdMenorIdade++;
                }
            }

            String[] vectPessoaMenor = new String[qtdMenorIdade];
            int j = 0;
            for(int i = 0; i<vectPessoa.length; i++){
                if(vectPessoa[i].getAge()<16){
                    vectPessoaMenor[j] = vectPessoa[i].getName();
                    j++;
                }
            }

            double avgHeight = sumHeight/qtd;
            double percentMinor = ((double)qtdMenorIdade/qtd)*100;
            System.out.printf("Altura média: %.2f\n", avgHeight);
            System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentMinor);
            for(int i = 0; i<vectPessoaMenor.length; i++){
                System.out.println(vectPessoaMenor[i]);
            }
        }
    }
