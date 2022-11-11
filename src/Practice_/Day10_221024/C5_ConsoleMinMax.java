package Practice_.Day10_221024;

import java.util.Scanner;

public class C5_ConsoleMinMax {
    public static void main(String[] args) {

        // Console uzerinden(Scanner) maximum ve minimum degeri saglayiniz
        // ve buradan gelen rakamlari Math.random() da olmasini istediginiz araliga getiriniz.
//Soru,  Bu iki sayi arasinda random bir deger olusturulmasini saglayiniz anlamina gelir.

        Scanner sc = new Scanner(System.in);
        System.out.print("Sayi 1 tanimlayiniz: ");
        int sayi1 = sc.nextInt();
        System.out.print("Sayi 2 tanimlayiniz: ");
        int sayi2 = sc.nextInt();

        System.out.println("Math.max(sayi1, sayi2) = " + Math.max(sayi1, sayi2));

        if (sayi1 > sayi2) {
            int random = (int) (Math.random() * sayi1);
            System.out.println("random = " + random);
        } else {
            int random = (int) (Math.random() * sayi2);
            System.out.println("random = " + random);
        }
    }
}