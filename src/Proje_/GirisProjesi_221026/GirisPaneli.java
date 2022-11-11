package Proje_.GirisProjesi_221026;

import java.util.ArrayList;
import java.util.Scanner;

public class GirisPaneli {


    //public static void giris(){// bu tanimlama ile method static oldugu icin className ile call edilir.
    public void giris() {
        Scanner sc = new Scanner(System.in);
        Kayit yeniKayit = new Kayit();// Kayit Class'a erisim icin parametresin Constructor ile yeniKayit objesi uretildi
        //Kayit Class'tan method obje olmadan method create etmek icin
        ArrayList<Kullanici> kisi = new ArrayList<>();//Kullanici Class'dan uretilen obj tutulacagi bos list

        boolean cikilsinMi = true;// while dongu izin sart tanimlandi
        while (cikilsinMi) {
            System.out.print("Agam ne istersin? \n(1)-> Kayit Al \n(2)->Sansli Kisi Bul \n(3)-> Listele \n(4)->Cikis \nsecer misin: ");
            int tercih = sc.nextInt();
            switch (tercih) {
                case 1:
                    kisi = yeniKayit.kayitAl();//Kayit Class'tan yeniKayit obje ile kayitAl() method call edildi.

                    break;
                case 2:
                    yeniKayit.sansliKullanici(kisi);
                    break;
                case 3:
                    yeniKayit.listele(kisi);
                    break;
                case 4:
                    cikilsinMi = false;
                    break;
                default:
                    System.out.println("Hatali bir deger girdiniz. Lutfen tekrar deneyiniz");
                    break;
            }
        }
    }
}