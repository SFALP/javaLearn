package j16_ArrayList.Tasks_20221018;

import java.util.ArrayList;
import java.util.Scanner;

public class _11_prime_numbers {

    /*
    negatif olmayan bir n sayısı girin ve bu sayıya kadar olan kaç asal sayı var ise yazdırın.

        Örnek 1:
        n = 20

        cevap: 8      ==   (2,3,5,7,11,13,17,19)  20 ye kadar 8 adet asal sayı vardır.
        Örnek2:
        Input(Girdi): 10
        Output(Çıktı): 4
        Explanation(Açıklama): 10'dan küçük 4 adet asal sayı vardır. (2,3,5,7)
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pozitif, bir den büyük bir sayı giriniz : ");
        int sayi = sc.nextInt();
        int asalSayilar = 0;
        for (int i = 2; i <= sayi; i++) {
            int flag = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    flag++;
                }
            }
            asalSayilar += (flag == 2 ? 1 : 0);
        }
        System.out.println("asal Sayilar = " + asalSayilar);
    }
}