import java.util.Scanner;

public class Q08_NestedIf {
    /*
     * TASK :

     * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
     * musteri karti olup olmadigini sorun
     * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
     * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
     * alirsa %10 indirim yapan code create ediniz.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Willkommen bei dem unserem Markt angewendten Rabatt-Algorithmus !");
        System.out.print("Wie viel Produkt haben Sie gekauft? ");
        double x = scan.nextInt();
        System.out.println("Bitte beschreiben Sie insgesammt kosten: ");
        double k = scan.nextDouble();
        System.out.println("Haben Sie die Abo-Karte? Wenn Sie haben, tippen Sie bitte Taste J (JA). Wenn Sie nicht haben, tippen Sie bitte Taste N (NEIN): ");
        char c = scan.next().charAt(0);

        if (c == 'J' || c == 'j') {
            if (x > 10) {
                System.out.println("Herzlichen Glückwunsch! Sie haben die %20 Rabattquote gewonnen. Weil Sie mehr als 10 Produkten gekauft hatten. Sie müssen nur: " + (k * 0.8) + "€ bezahlen. Vielen Dank!");
            } else
                System.out.println("Herzlichen Glückwunsch! Sie haben die %15 Rabattquote gewonnen. Weil Sie nicht mehr als 10 Produkten gekauft hatten.\n Sie müssen nur: " + (k * 0.85) + "€ bezahlen. Vielen Dank!");
        } else if (c == 'N' || c == 'n') {
            if (x > 10) {
                System.out.println("Herzlichen Glückwunsch! Sie haben die %15 Rabattquote gewonnen. Weil Sie mehr als 10 Produkten gekauft hatten. Sie müssen nur: " + (k * 0.85) + "€ bezahlen. Vielen Dank!");
            } else
                System.out.println("Herzlichen Glückwunsch! Sie haben die %10 Rabattquote gewonnen. Weil Sie nicht mehr als 10 Produkten gekauft hatten.\n Sie müssen nur: " + (k * 0.9) + "€ bezahlen. Vielen Dank!");
        } else
            System.out.println("Tut mir leid. Wir haben kein Rabatt-Angebot für Sie. Sie müssen " + k + "€ bezahlen. Vielien Dank!");

    }
}
