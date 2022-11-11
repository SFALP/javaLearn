package Interview.Day01_221107;

import java.util.Scanner;

public class Q03_PrimeNumber {
    /*
    Ask user enter a positive number and check if it is prime or not
    Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Asal sayi kontrol programina Hosgeldiniz!");
        System.out.print("Lutfen 2 veya 2'den buyuk bir tamsayi tanimlayiniz: ");
        int sayi = sc.nextInt();
        boolean flag = true;

        if (sayi >= 2) {
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) System.out.println("Girilen (" + sayi + ") sayisi asaldir");
            else System.out.println("Girilen (" + sayi + ") sayisi asal degildir");

        } else System.out.println("Tanimlanan kriterler disinda sayi tanimladiniz, lutfen tekrar deneyiniz.");
    }
}