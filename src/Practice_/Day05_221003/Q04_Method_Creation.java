package Practice_.Day05_221003;

import java.util.Scanner;

public class Q04_Method_Creation {
    /*
Kullanicidan bir tam sayi alin.
Bu sayinin negatif veya pozitif oldugunu,
tek mi cift mi oldugunu ve
uc basamakli veya daha buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
100'den kucukse sadece birler basamagini yazdirin.
*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi tanimlayiniz: ");
        int a = scan.nextInt();

        negPos(a);
        System.out.println("Sayı tek ise \"false\", çift ise \"true\" yazilacaktir: " + Q02_Method_Creation.ciftKontrol(a));
        basamak(a);
    }

    public static void negPos(int a) {
        if (a < 0) {
            System.out.println("Girilen sayi negatiftir");
        } else System.out.println("Girilen sayi pozitiftir");
    }

    public static void basamak(int a) {
        if (a > 100 && a < 1000) {
            int x = a / 100;
            int y = (a / 10) % 10;
            int z = a % 10;
            System.out.println("Sayinin basamaklari toplami: " + (x + y + z));
        } else if (a < 100) {
            int t = a % 10;
            System.out.println("Girilen sayinin birler basamagi: " + t);
        } else
            System.out.println("Lutfen yeni bir sayi tanimlayiniz");
    }
}