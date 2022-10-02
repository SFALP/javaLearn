package j11_Method_Creation;

import java.util.Scanner;

public class C04_Method_Creation {
    public static void main(String[] args) {

        // TASK: Girilen ad-soyadin ilk harfleri buyuk, digerlerini kucuk yapan method create ediniz.
        // (VOID Method ile çözüm)

        Scanner scan = new Scanner(System.in);
        System.out.print("Adinizi giriniz: ");
        String ad = scan.next();
        System.out.print("Soyadinizi giriniz: ");
        String soyad = scan.next();
        isimKontrol(ad, soyad);
    }

    public static void isimKontrol(String ad, String soyad) {
        ad = ad.substring(0, 1).toUpperCase() + ad.substring(1).toLowerCase();
        soyad = soyad.substring(0, 1).toUpperCase() + soyad.substring(1).toLowerCase();
        System.out.println("Ad-Soyad: " + ad + " " + soyad);
    }
}
