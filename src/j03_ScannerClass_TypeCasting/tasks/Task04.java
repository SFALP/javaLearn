package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /* TASK ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
         */
Scanner scan= new Scanner(System.in);
        System.out.println("Clarus spor salonuna Hoşgeldiniz! ");
        System.out.println("İsminiz nedir? ");
        String a=scan.nextLine();
        System.out.println("Soyadınızı öğrenebilir miyiz?");
        String s =scan.nextLine();
        System.out.println("Kaç yaşındasınız? ");
        int y= scan.nextInt();
        System.out.println("Kilonuz nedir?");
        int k=scan.nextInt();
        System.out.println("Spor salonuna kaç ay gelmeyi planlıyorsunuz?");
        int z=scan.nextInt();

        System.out.println("İsminiz: "+a);
        System.out.println("Soyadınız: "+s);
        System.out.println("Yaşınız: "+y);
        System.out.println("Ağırlığınız: "+k);
        System.out.println("Kursa devam edilecek süre: "+z);
        System.out.println("Ödenmesi gereken ücret:$"+z*20);


    }
}
