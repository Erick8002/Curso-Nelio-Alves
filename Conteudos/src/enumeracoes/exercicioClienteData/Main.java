package enumeracoes.exercicioClienteData;

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

        System.out.println("Enter Client data: ");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Birth date(DD/MM/YYYY):");
        String birthDate = scanner.nextLine();

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        String statusStr = scanner.nextLine();
        OrderStatus status = OrderStatus.valueOf(statusStr.toUpperCase());

        Order order = new Order(new Date(), status, client);

        System.out.print("How many items to this order?");
        int qtt = scanner.nextInt();
        scanner.nextLine();

        for(int i = 1; i<=qtt; i++){
            System.out.println("Enter " + i + "# item data:");
            System.out.print("Product name: ");
            String productName = scanner.nextLine();
            System.out.print("Product price: ");
            double productPrice = scanner.nextDouble();
            scanner.nextLine();

            Product product = new Product(productName, productPrice);

            System.out.print("Quantity: ");
            int productQuantity = scanner.nextInt();
            scanner.nextLine();

            OrderItem orderItem = new OrderItem(productQuantity, productPrice, product);
            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println("Order Summary");
        System.out.println(order);
    }
}
