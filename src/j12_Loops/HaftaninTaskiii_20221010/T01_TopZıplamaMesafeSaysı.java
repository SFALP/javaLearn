package j12_Loops.HaftaninTaskiii_20221010;

import java.util.Scanner;

public class T01_TopZıplamaMesafeSaysı {

   /* HAFTANIN TASK'iiii :-)
    Bir top belirli yükseklikten atılmaktadır.
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.

    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Topun kac metreden firlatilacagini giriniz: ");
        double h = sc.nextInt();//yukseklik verisi
        int ziplamaSayisi = 0;
        double alinanYol = h;

        do {
            alinanYol += ( 2*h * 0.75);
            h *= 0.75;
            ziplamaSayisi++;
        } while (h >= 1);

        System.out.println("Alinan yol(metre): " + alinanYol + " \nZiplama sayisi: " + ziplamaSayisi);
    }
}