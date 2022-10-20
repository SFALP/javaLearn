package Practice_.Day07_221011;

import java.util.Scanner;
// girilen sayinin rakamlari toplamini bulunuz.

public class Q01_Loop_RakamToplami {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Girilen sayini rakamlari toplamini bulma programina Hosgeldiniz!");
        System.out.println("Lutfen bir tamsayi belirleyiniz: ");
        int x = sc.nextInt();

        System.out.println(basamakTopla(x));
    }
    public static int basamakTopla(int x) {
        int toplam = 0;

        while (x != 0) {
            toplam += x % 10;
            x /= 10;
         }
        return toplam;
    }
}