package j15_Arrays;

import java.util.Scanner;

public class Task05_SayiTersYaz {


    public static void main(String[] args) {
        // Task-> girilen int değeri tersten print eden code create ediniz.

        Scanner sc = new Scanner(System.in);
        System.out.println("Sayiyi tersten yazdirma programina Hosgeldiniz!");
        System.out.println("Lutfen bir tamsayi tanimlayiniz: ");
        int a = sc.nextInt();

        int rakam = 0;

        while (a != 0) {
            int kalan = a % 10;
            rakam = rakam * 10 + kalan;
            a /= 10;
        }
        System.out.println("Sayinin tersten yazilisi: " + rakam);
    }
}