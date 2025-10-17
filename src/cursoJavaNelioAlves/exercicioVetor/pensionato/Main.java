package cursoJavaNelioAlves.exercicioVetor.pensionato;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many rooms will be rentered? ");
        int qtdRoom = scanner.nextInt();

        Room[] vectRoom = new Room[10];

        for(int i = 0; i<qtdRoom; i++){
            System.out.println("Rent #" + (i+1));
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Room number: ");
            int roomNum = scanner.nextInt();

            vectRoom[roomNum] = new Room(name, email, roomNum);
        }

        System.out.println("Busy rooms: ");

        for(int i = 0; i<vectRoom.length; i++){
            if(vectRoom[i] != null){
                System.out.printf("%d: %s, %s\n", (i), vectRoom[i].getName(), vectRoom[i].getEmail());
            }
        }
    }
}
