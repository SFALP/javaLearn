package Practice_Day01_220919;

import java.util.Scanner;

public class Q08_Scanner {
    public static void main(String[] args) {
        // kullanicidan 2 tam sayi alin
// bu tam sayilari toplayin ve sonucu yazdirin
        Scanner Scan = new Scanner(System.in);
        System.out.print("1. Sayıyı tanımlayınız: ");
        double x = Scan.nextDouble();
        System.out.print("2. Sayıyı tanımlayınız: ");
        double y = Scan.nextDouble();
        double z = x + y;
        System.out.print("Girilen 2 sayının toplamı: " + z);

    }
}
