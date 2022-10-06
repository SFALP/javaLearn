package j11_Method_Creation.tasks;

import java.util.Scanner;

public class Task06_Cozum2 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
		/*
		 Kullanıcıya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini 
		 ve iki sayı seçmesini söyleyin. 
         Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.
		 */

        System.out.println("Geometrik sekillerin alan ve cevresinin bulundugu programa Hosgeldiniz!");
        System.out.println("Kare, Dikdortgen, Ucgen'den birini tanimlayiniz: ");
        String secim = scan.nextLine().toLowerCase();
        System.out.println("1.sayiyi giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.println("2.sayiyi giriniz: ");
        int sayi2 = scan.nextInt();

        secim(secim, sayi1, sayi2);

    }//main disi

    public static void secim(String str, int sayi1, int sayi2) {
        switch (str) {
            case "kare":
                kareAlan(sayi1);
                kareCevre(sayi1);
                break;
            case "dikdortgen":
                dikdortgenAlan(sayi1, sayi2);
                dikdortgenCevre(sayi1, sayi2);
                break;
            case "ucgen":
                sayi2 = sayi1;
                ucgenAlani(sayi1);
                ucgenCevresi(sayi2);
                break;
            default:
                System.out.println("");
        }
    }

    private static void ucgenCevresi(int sayi2) {
        System.out.println("Eskenar oldugu kabul edilen ucgenin cevresi: " + 3 * sayi2);
    }

    private static void ucgenAlani(int sayi1) {
        System.out.print("Ucgenin yuksekligini tanimlayiniz: ");
        int h = scan.nextInt();
        System.out.println("Ucgenin alani: " + (h * sayi1) / 2);
    }

    private static void dikdortgenCevre(int sayi1, int sayi2) {
        System.out.println("Dikdortgenin cevresi: " + (sayi1 + sayi2) * 2);
    }

    private static void dikdortgenAlan(int sayi1, int sayi2) {
        System.out.println("Dikdortgenin alani: " + sayi1 * sayi2);
    }

    public static void kareAlan(int sayi1) {
        System.out.println("Karenin alanı: " + sayi1 * sayi1);
    }

    public static void kareCevre(int sayi1) {
        System.out.println("Karenin cevresi: " + (sayi1 * 4));
    }
}