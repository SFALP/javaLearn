package j11_Method_Creation.tasks;

import java.util.Scanner;

/* Iki kisinin oynayacagi bir kelime oyunu uretelim
 * Kurallar
 * 1- Baslangicta 1.oyuncudan bir kelime girmesini isteyin ve kelimeyi yazdirin
 *
 * 2- 1.oyuncu kelimeyi girince 2.oyuncuya kelimeyi kabul edip etmedigini sorun.
 *      * Eger kelimeyi kabul ederse onceki oyuncuya kelimedeki harf sayisi kadar puan ekleyin
 *        ve 3.adima gecin
 *      * girilen kelimeyi kabul etmezse "gecersiz kelime" yazdirin ve onceki oyuncunun
 *        kazandigini yazip oyunu bitirin
 *
 * 3- yeni oyuncuya oyuna devam etmek isteyip istemedigini sorun
 *      * devam etmek isterse kelimeye eklemek istedigi string'i ve
 *          basa mi sona mi ekleyecegini sorun
 *          aldiginiz string'i kelimeye ekleyip 2.adima gidin
 *
 *      *   Devam etmek istemezse
 *          "Oyun bitti" yazin
 *          kullanicilarin puanlarini ve kazanan oyuncuyu yazdirin
 */
public class Task16_KelimeOyunu {
    static Scanner sc = new Scanner(System.in);
    static String u1;
    static String u2;
    static String sonSoz = "";
    static int u1Puan = 0;
    static int u2Puan = 0;

    public static void main(String[] args) {

        giris();

    }// main sonu

    public static void giris() {
        System.out.println("Java Game oyununa Hosgeldiniz!");
        System.out.print("Lutfen ilk oyuncunun ismini tanimlayiniz: ");
        u1 = sc.nextLine().toLowerCase().trim();
        System.out.print("Lutfen ikinci oyuncunun ismini tanimlayiniz: ");
        u2 = sc.nextLine().toLowerCase().trim();

        asama1(u1, u2);
        asama2(u1,u2);

        System.out.println("TEBRIKLER :=)");

    }

    public static void asama1(String u1, String u2) {
        System.out.print("Sayin " + u1 + " Lutfen kelimenizi tanimlayiniz: ");
        String s1 = sc.nextLine().toLowerCase().trim();
        System.out.println("Girilen sozcuk: " + s1);
        u1SozKontrol(u1, u2, s1);
    }

    public static void u1SozKontrol(String u1, String u2, String s1) {
        System.out.print("Sayin " + u2 + ", " + u1 + "in girdigi (" + s1 + ") kelimesini kabul ediyorsaniz 1, etmiyorsaniz 0 tuslayiniz: ");
        int x1 = sc.nextInt();
        if (x1 == 1) {
            System.out.println(s1 + " kelimesi kabul edilmistir.");
            u1Puan += s1.length();
            System.out.println(u1 + " isimli oyuncunun puani: " + u1Puan + " puan");
            System.out.print("Kabul edilen (" + s1 + ") kelimesini basa eklemek icin 1, sona eklemek icin 0 tuslayiniz: ");
            int a1 = sc.nextInt();
            if (a1 == 1) {
                sonSoz = s1 + sonSoz;
                System.out.println("Son durum: " + sonSoz);
            } else if (a1 == 0) {
                sonSoz = sonSoz + s1;
                System.out.println("Son durum: " + sonSoz);
                asama2(u1, u2);
            } else {
                System.out.println("Hatali bir veri tanimladiniz.");
                u1SozKontrol(u1, u2, s1);
            }

        } else if (x1 == 0) {
            System.out.println("Gecersiz kelime!\nKAZANAN " + u2);
        } else {
            System.out.println("Hatali bir deger tanimlandi");
            u1SozKontrol(u1, u2, s1);
        }

    }

    public static void asama2(String u1, String u2) {
        System.out.print("Sayin " + u2 + " Lutfen kelimenizi tanimlayiniz: ");
        String s2 = sc.nextLine().toLowerCase().trim();
        System.out.println("Girilen sozcuk: " + s2);
        u2SozKontrol(u1, u2, s2);
    }

    public static void u2SozKontrol(String u1, String u2, String s2) {
        System.out.print("Sayin " + u1 + ", " + u2 + "in girdigi (" + s2 + ") kelimesini kabul ediyorsaniz 1, etmiyorsaniz 0 tuslayiniz: ");
        int x1 = sc.nextInt();
        if (x1 == 1) {
            System.out.println(s2 + " kelimesi kabul edilmistir.");
            u2Puan += s2.length();
            System.out.println(u2 + " isimli oyuncunun puani: " + u2Puan + " puan");
            System.out.print("Kabul edilen (" + s2 + ") kelimesini basa eklemek icin 1, sona eklemek icin 0 tuslayiniz: ");
            int a2 = sc.nextInt();
            if (a2 == 1) {
                sonSoz = s2 + sonSoz;
                System.out.println("Son durum: " + sonSoz);
            } else if (a2 == 0) {
                sonSoz = sonSoz + s2;
                System.out.println("Son durum: " + sonSoz);
asama1(u1,u2);
            } else {
                System.out.println("Hatali bir veri tanimladiniz.");
                u1SozKontrol(u1, u2, s2);
            }


        } else if (x1 == 0) {
            System.out.println("Gecersiz kelime!\nKAZANAN " + u1);
        } else {
            System.out.println("Hatali bir deger tanimlandi");
            u2SozKontrol(u1, u2, s2);
        }

    }

}//class sonu
