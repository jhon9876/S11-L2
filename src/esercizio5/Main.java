/*SCRIVERE UN PROGRAMMA CHE VERIFICHI SE DUE STRINGE INSERITE DALL'UTENTE SONO ANAGRAMMI*/

package esercizio5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        anagrammi();
    }

    public static void anagrammi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la prima stringa");
        String text1 = scanner.nextLine();
        System.out.println("Inserisci la seconda stringa");
        String text2 = scanner.nextLine();

        String[] arrText1 = text1.split("");
        String[] arrText2 = text2.split("");
        Arrays.sort(arrText1);
        Arrays.sort(arrText2);
        System.out.println(Arrays.toString(arrText1));
        System.out.println(Arrays.toString(arrText2));

        if (arrText1.length != arrText2.length) {
            System.out.println("Le due stringe hanno diversa lunghezza. Non sono anagrammi");
        } else {
            int counter = 0;
            for (int i = 0; i < arrText1.length; i++) {
                if (arrText1[i].equals(arrText2[i])) {
                    counter++;

                }
            }
            if (counter == arrText1.length) {
                System.out.println("Anagrammi");
            } else System.out.println("Non sono anagrammi");
        }

    }
}
