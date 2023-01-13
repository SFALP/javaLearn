package InterviewQuestions.Day02_221114;

import java.util.ArrayList;
import java.util.Scanner;

/* Perfect Number (Mukemmel sayi)
  Kullanici tarafindan bir sayiya kadar olan sayilarin,
  mukemmel olup olmadigini bulan method yaziniz.
  Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
  kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))
  ORNEK: (6, 28, 496, 8128)
  INPUT      : 6
  OUTPUT     :  1,2,3
*/
public class Q04_PerfectNumber {
    public static void main(String[] args) {

        System.out.println("Mukemmel sayi kontrol programina Hosgeldiniz!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Lutfen bir sayi tanimlayiniz: ");
        int sayi = sc.nextInt();

        perfectNummer(sayi);
        girilenSayiyaKadarPerfect(sayi);
    }

    public static void girilenSayiyaKadarPerfect(int sayi) {
        int toplam = 0;
        for (int i = 1; i < sayi; i++) {//Bu kod girilen sayiya bakar.
            for (int j = 1; j < i; j++) {//bolenler kontrol edilmektedir.
                if (i % j == 0) {//sayinin herhangi bir boleni varsa
                    toplam += j;

                }
            }
            if (toplam == i) {
                System.out.println(i + " mukemmel sayidir");
            }
            toplam = 0;
        }
    }

    public static void perfectNummer(int sayi) {
        int sayiToplam = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < sayi; i++) {//1'den baslayarak bolenler kontrol ediliyor, sayi bu duruma dahil olmamalidir.
            if (sayi % i == 0) {//sayinin herhangi bir boleni(i) varsa
                sayiToplam += i;//toplam degiskenine ekle
                list.add(i);//bolen sayilar list ismindeki arrayList'e eklendi.
            }

        }
        System.out.println(sayi+"sayisina kadar olan mukemmel sayilarin listesi: "+list);
        System.out.println();
        if (sayiToplam == sayi) {//bolenlerin toplami sayiya esitse
            System.out.println(sayi + " sayisi mukemmel sayidir");
        } else System.out.println(+sayi + " sayisi mukemmel sayi degildir");
    }
}