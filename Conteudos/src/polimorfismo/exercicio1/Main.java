package polimorfismo.exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the numbers of empployees: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for(int i = 1; i<=n; i++){
            System.out.printf("Employee #%d data: \n", i);
            System.out.print("OutSourced (y/n)? ");
            char ch = scanner.next().charAt(0);
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Hours: ");
            int hours = scanner.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = scanner.nextDouble();

            if(ch == 'y'){
                System.out.print("Additional charge: ");
                double additionalCharge = scanner.nextDouble();

                list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            } else if(ch == 'n'){
                list.add(new Employee(name, hours, valuePerHour));
            }
        }

        System.out.println("");
        System.out.println("Payments:");
        for(Employee e : list){
            System.out.println(e);
        }
    }
}
