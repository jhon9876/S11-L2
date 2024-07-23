package esercizio1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Il numero di caratteri della stringa è pari? : " + stringaPariDispari("Aldo"));
        System.out.println("L'anno inserito è bisestile? : " + annoBisestile(2003));
    }

    public static boolean stringaPariDispari(String text) {

        return text.length() % 2 == 0 ? true : false;
    }

    public static boolean annoBisestile(int anno) {
        if (anno % 4 == 0) {
            return true;
        } else if (anno % 100 == 0 && anno % 400 == 0) {
            return false;
        } else return false;
    }
}