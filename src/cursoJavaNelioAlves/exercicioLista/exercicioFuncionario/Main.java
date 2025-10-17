package cursoJavaNelioAlves.exercicioLista.exercicioFuncionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int qtdFuncionario = scanner.nextInt();
        List<Funcionario> listFunctionary = new ArrayList<>(qtdFuncionario);

        for(int i = 0; i<qtdFuncionario; i++){
            System.out.printf("Employee #%d: \n", (i+1));
            System.out.print("Id: ");
            int id = scanner.nextInt();
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();

            listFunctionary.add(new Funcionario(name, id, salary));
        }

        System.out.print("Enter the employee id that will have a salary increase: ");
        int id = scanner.nextInt();
        Funcionario idEncontrado = null;
        for (Funcionario f : listFunctionary){
            if(f.getId() == id){
                idEncontrado = f;
            }
        }

        double percentIncrease;
        if(idEncontrado != null){
            System.out.print("Enter the percent: ");
            percentIncrease = scanner.nextDouble();
            idEncontrado.setSalary(idEncontrado.getSalary() * (1 + percentIncrease));
        } else System.out.println("This id does not exist!");

        System.out.println("List of employees: ");
        for(Funcionario funcionario : listFunctionary){
            System.out.println(funcionario);
        }

        scanner.close();
    }
}
