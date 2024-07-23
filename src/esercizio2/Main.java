package esercizio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        stampaInLettere();
    }

    public static void stampaInLettere() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero da 1 a 3");
        byte num = Byte.parseByte(scanner.nextLine());

        /*switch (num) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("due");
                break;
            case 3:
                System.out.println("tre");
                break;
            default:
                System.out.println("Inserisci un valore compreso tra 0 e 3");
        }*/
        /*VERSIONE 2*/
        switch (num) {
            case 0 -> System.out.println("zero");
            case 1 -> System.out.println("uno");
            case 2 -> System.out.println("due");
            case 3 -> System.out.println("tre");
            default -> System.out.println("Inserisci un numero compreso tra zero e tre");
        }
    }
}
