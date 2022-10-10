package j12_Loops.L01_ForLoop.HW_20221006;

import java.util.Scanner;

public class Odev03_AsalSayi {

    /* Kullanıcıdan aldığımız sayının, asal olup olmadığını return eden
     * bir method create ediniz.
     *
     *  getAsalMi(int sayi)
     *  	return true/false

     * */
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