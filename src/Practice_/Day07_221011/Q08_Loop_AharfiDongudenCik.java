package Practice_.Day07_221011;
/*
   Program, bir loop içerisinde continue komutu ile karşılaşılırsa, ondan sonraki komutları
   atlar ve loop’un bir sonraki değerinden devam eder.
    */
// Girilen bir stringin harflerini teker teker ekrana alt alta olacak
// sekilde yazdiriniz, bosluk veya a harfi geldiginde bunlari yazmasin

import java.util.Scanner;

public class Q08_Loop_AharfiDongudenCik {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Asal sayi kontrolu programina Hosgeldiniz!");
        System.out.print("Bu kontrol icin 1'den buyuk bir tamsayi tanimlanmasi gerekmektedir: ");
        int a = sc.nextInt();
        if (a >= 1) {
            getAsalmi(a);
        } else {
            System.out.println("Kuralin disinda bir veri tanimladiginiz icin islemlerime devam edemiyorum. Lutfen tekrar deneyiniz");
        }
    }//main disi
    public static void getAsalmi(int a) {
        int b = 0;//a sayisinin i sayisina bolunup-bolunmadigini sayan degiskendir.
        // Ör: 17 sayisi 4'e 5'e ..... bolunsaydi b degerine 1 eklenecekti.
        for (int i = 2; i <= a; i++) {
            if (a % i == 0) {
                b++;
            }
        }
        if (b == 1) {
            System.out.println("Girilen (" + a + ") sayisi asal sayidir");
        } else {
            System.out.println("Girilen (" + a + ") sayisi asal sayi degildir.");
        }
    }
}