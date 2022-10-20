package Practice_.Day02_220920;

import java.util.Scanner;

public class Q02_Modulus {
    public static void main(String[] args) {
        /*
         *  Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
         *
         *   Ex :
         *   input  : 12345
         *   output : 12
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Girilen sayıların ilk 2 ve son iki basamağındaki rakamların toplamını hesaplama programına Hoşgeldiniz!");
        System.out.println("Lütfen 5 basamaklı bir tamsayı tanımlayınız: ");
        int a = scan.nextInt();
        int x = a / 10000 % 10;
        int y = a / 1000 % 10;
        int z = a / 10 % 10;
        int t = a % 10;

        System.out.println("Girilen sayının (" + a + ") ilk ve son iki basamağındaki sayıların toplamı: " + (x + y + z + t));

// 2. ÇÖZÜM YOLU:
        /*
   Scanner scan = new Scanner(System.in);
        System.out.println("5 basamakli bir sayi giriniz : ");
        int sayi = scan.nextInt();
        int ilkIki =sayi/1000; //12
        int sonIki = sayi%100; //45
        int ilkIkiTop = (ilkIki/10) + (ilkIki%10); //1+2
        System.out.println("ilkIkiTop = " + ilkIkiTop);
        int sonIkiTop = (sonIki/10) + ( sonIki%10); //4+5
        System.out.println("sonIkiTop = " + sonIkiTop);
        System.out.println("esas toplam = " + (ilkIkiTop + sonIkiTop));


         */

    }
}
