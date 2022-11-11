package Proje_.GirisProjesi_221026;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Kayit {

    ArrayList<Kullanici> kullaniciKisiler = new ArrayList<>();//kullanici classta olusturulacak objeler alinacak

// 2.STEP(SORUDA)
    public ArrayList<Kullanici> kayitAl() { //kullanici class'tan obje uretmek icin Constructor'a gereken name ve
        // kayit zamani bilgilerini olusturup, olusan objeyi list'e ekler.'

        Scanner sc = new Scanner(System.in);
        System.out.print("Lutfen kullanici ismini tanimlayiniz: ");
        String ad = sc.nextLine();//Kullanici objesi icin name alindi.
        Kullanici k1 = new Kullanici(ad, LocalDateTime.now());//k1 objesi, name'i kullanicidan, kayit zamanini da sistemden parametre olarak alir.
        kullaniciKisiler.add(k1);// olusturulan k1 objesi list'e eklendi.

        return kullaniciKisiler;
    }

//3.STEP (SORUDA)
    public void sansliKullanici(ArrayList<Kullanici> k1Obje) {//Kullanici list'indeki objelerin kayit zamaninin
        //10 saniyeden az olup olmamasina göre sansli kullanici return edilecek.

        for (Kullanici k : k1Obje) {//Kullanici Class'tan kayitAl method ile uretilip kullaniciKisi list'ine eklenen objeler donguye alindi
            if (k.kayitZamani.getSecond() <= 10) {// donguye giren her bir kullanici ojesinin kayit zamani datasindaki saniye verisi
                //10'dan kucuk olmasi kontrol edildi.
                System.out.println(k.name + " Agam sansli kisisin, 5 kg antepfistigi KAZANDINIZ :=), Sisteme giris zamanin: " + k.kayitZamani);

            } else
                System.out.println(k.name + " Agam sansli kisi degilsin :=(, Sisteme giris zamanin: " + k.kayitZamani);
        }
    }
    public void listele(ArrayList<Kullanici> k1Obje){
        System.out.println("k1Obje = " + k1Obje);//Kullanici Class'ta toString print eder.
    }
}