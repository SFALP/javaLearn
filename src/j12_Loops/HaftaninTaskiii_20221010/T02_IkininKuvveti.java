package j12_Loops.HaftaninTaskiii_20221010;

import java.util.Scanner;

public class T02_IkininKuvveti {
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen datayi methodda parametre olarak alan
         * ve datanın 2'nin kuvveti olup olmadığını kontrol eden PowersofTwo(num) methodu create ediniz.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Girilen sayinin 2'nin kuvvet kontrolunun yapildigi programa Hosgeldiniz! ");
        System.out.println("Lutfen bir tamsayi tanimlayiniz: ");
        int sayi = sc.nextInt();

        System.out.println(PowersofTwo(sayi));
        System.out.println("TRUE cevabı, girdiginiz sayinin (" + sayi + ") 2'nin kati oldugunu anlatmaktadir.\n Cevap FALSE ise girdiginiz sayi(" + sayi + ") 2'nin kati olmadigini belirtir. \nTesekkur ederiz :=)");
    }

    public static boolean PowersofTwo(int sayi) {
        boolean us = false;
        while (sayi > 2) {
            sayi /= 2;
        }
        if (sayi % 2 == 0) us = true;
        return us;
    }
}

