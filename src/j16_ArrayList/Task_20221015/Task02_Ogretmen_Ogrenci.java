package j16_ArrayList.Task_20221015;

import java.util.ArrayList;
import java.util.Scanner;

public class Task02_Ogretmen_Ogrenci {
    public static void main(String[] args) {
          /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.

         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Lutfen not tanimlamak istediginiz ogrenci sayisini giriniz: ");
        int ogrSayisi = sc.nextInt();
        ArrayList<Integer> ogrNot = new ArrayList<>();

        for (int i = 0; i < ogrSayisi; i++) {
            System.out.print("Lutfen (" + (i + 1) + "). ogrencinin notunu tanimlayiniz: ");
            ogrNot.add(sc.nextInt());
        }
        System.out.println("Ogrencilerin notlari: " + ogrNot);

        int toplam = 0;
        double ort = 0;
        for (int i = 0; i < ogrNot.size(); i++) {
            toplam += ogrNot.get(i);
            ort = toplam / ogrNot.size();
        }
        System.out.println("Tum ogrencilerin puan ortalamasi: " + ort);

        int ortUstuSay = 0;
        for (int i = 0; i < ogrNot.size(); i++) {
            if (ogrNot.get(i) > ort) {
                ortUstuSay++;
            }
        }
        System.out.println("Ortalamanin uzerindeki ogrenci sayisi: " + ortUstuSay);
        System.out.println("Tesekkurler :=)");

    }
}