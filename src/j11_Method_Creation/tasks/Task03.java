package j11_Method_Creation.tasks;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {
        // Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        // ceviren bir method yaziniz.
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen saati tanimlayiniz: ");
        int a = scan.nextInt();
        System.out.print("Lutfen mil degerini tanimlayiniz: ");
        double b = scan.nextDouble();
        System.out.print("Lutfen kilogram degerini tanimlayiniz: ");
        double c = scan.nextDouble();

        System.out.println("\nTanimlanan saat degerinin saniye karsiligi: " + saniye(a) + "saniye");
        System.out.println("Tanimlanan mil degerinin kilometre karsiligi: " + km(b) + "km");
        System.out.println("Tanimlanan kilogram degerinin gram karsiligi: " + kg(c) + "gram");
        System.out.println("Tesekkurler, yine bekleriz :=)");
    }
    public static int saniye(int a) {
        int saniye = a * 60 * 60;
        return saniye;
    }
    public static double km(double b) {
        double mil = b * 1.6;
        return mil;
    }
    public static double kg(double c) {
        double g = c * 1000;
        return g;
    }
}