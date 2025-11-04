package exercicioProduto;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Produto p = new Produto();

        System.out.println("Entrada de produto: ");
        System.out.print("Nome: ");
        p.setNome(scanner.nextLine());
        System.out.print("Preço: ");
        p.setPreco(scanner.nextDouble());
        System.out.print("Quantidade no estoque: ");

        System.out.println();
        System.out.println(p);
        System.out.println();

        System.out.println("Quantos produtos quer adicionar: ");
        int addQuantidade = scanner.nextInt();

        p.adicionarProduto(addQuantidade);

        System.out.println(p);
        System.out.println();

        System.out.println("Quantos produtos quer remover: ");
        int removerQuantidade = scanner.nextInt();

        p.removerProduto(removerQuantidade);

        System.out.println(p);

        scanner.close();
    }
}
