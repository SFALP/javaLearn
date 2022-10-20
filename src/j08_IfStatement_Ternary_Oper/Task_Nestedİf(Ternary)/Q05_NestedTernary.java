import java.util.Scanner;

public class Q05_NestedTernary {

    public static void main(String[] args) {
		/*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Willkommen beim Programm zur Information über der Blutspendestatus!");
        System.out.print("Bitte beschreiben Sie Ihr Alter: ");
        int a = scan.nextInt();
        System.out.print("Bitte beschreiben Sie Ihr Gewicht: ");
        double k = scan.nextDouble();
        System.out.println(a >= 18 ? (k >= 50) ? ("Sie können Blut spenden") : ("Aus gesundheitlichen Gründen können wir keine Blutspenden annehmen. Denn Ihr Körpergewicht beträgt nicht mehr als 50 kg.") : ("Sie sollen über 18 Jahre alt."));
    }
}
