package enumeracoes.exercicio1Trabalhador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main() throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Informe o nome do departamento: ");
        String nomeDepartamento = scanner.nextLine();
        System.out.println("Informe os dados do trabalhador: ");
        System.out.print("Digite o nome do trabalhador: ");
        String nome = scanner.nextLine();
        System.out.print("Level: ");
        String levelTrabalhador = scanner.nextLine();
        System.out.print("Salário Base: ");
        double salárioBase = scanner.nextDouble();
        scanner.nextLine();

        Trabalhador trabalhador = new Trabalhador(nome, LevelTrabalhador.valueOf(levelTrabalhador), salárioBase, new Departamento(nomeDepartamento));

        System.out.println("Quantos contratos esse trabalhador vai ter? ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for(int i = 1; i<=n; i++){
            System.out.printf("Informe as informações do contrato #%d: \n", i);
            System.out.print("Data(DD/MM/YYYY): ");
            Date dataContrato = sdf.parse(scanner.next());
            System.out.print("Valor por Hora: ");
            double valorPorHora = scanner.nextDouble();
            System.out.print("Duração(Hora): ");
            int hora = scanner.nextInt();

            ContratoHora contrato = new ContratoHora(dataContrato, valorPorHora, hora);
            trabalhador.addContratos(contrato);
        }

            System.out.println();
            System.out.print("Entre com o mês e ano para calcular o salário (MM/YYYY): ");
            String mesEAno = scanner.next();
            int mes = Integer.parseInt(mesEAno.substring(0, 2));
            int ano = Integer.parseInt(mesEAno.substring(3));

            System.out.println("Nome: " + trabalhador.getNome());
            System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
            System.out.println("Salário com os ganhos de " + mesEAno + ": " + String.format("%.2f", trabalhador.income(mes, ano)));

        scanner.close();
    }
}
