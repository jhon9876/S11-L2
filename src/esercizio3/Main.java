package esercizio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        splitString();
    }

    public static void splitString() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Inserisci una stringa di testo.");
            System.out.println("Inserisci :q per terminare");
            String text = scanner.nextLine();
            if (text.equals(":q")) {
                break;
            }

            String textStringWithoutSpaces = text.replace(" ", "");
            String[] splitText = textStringWithoutSpaces.split("");
            //System.out.println(Arrays.toString(splitText));
            String newText = "";
            for (int i = 0; i < splitText.length; i++) {
                newText += splitText[i] + ",";
            }

            System.out.println("La nuova stringa ottenuta è: " + newText);
        }
    }
}
