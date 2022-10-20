package j10_String_Manipulations.tasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Identifizieren Sie bitte ein Wort mit 3 Buchstaben");
        String a = scan.nextLine().toLowerCase();
        String b = a.substring(0, 3);//Bu satırda kullanıcını girdiği kelimeden sadece ilk 3 harf alınmıştır. Ve tüm kurgu bunun üzerine inşa edildi.
// substring ifadesini kullanmasaydık IF yapısı içinde 3 hafli olması/olmamasına dair kontrol mekanizması kymamız gerekirdi.
        // Bu kontrol if parantezinde şöyle yazılır: if (a.length() == 3) {bla bla bla }else bla bla

        char x = b.charAt(0);
        char y = b.charAt(1);
        char z = b.charAt(2);

        System.out.println((x == y || x == z || y == z) ? ("Einige Buchstaben sind gleich") : ("Es gibt keine Buchstaben, die gleich sind."));
        System.out.println("Vielen Dank, Tschüss");
    }
}