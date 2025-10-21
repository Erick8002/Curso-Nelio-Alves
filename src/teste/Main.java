package teste;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Informe o seu nome: ");
        String nome = new Scanner(System.in).nextLine();
        System.out.println("Ola " + nome);
    }
}
