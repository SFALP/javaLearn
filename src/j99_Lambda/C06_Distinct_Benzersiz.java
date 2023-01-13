package j99_Lambda;
//distinct() => Bu method tekrarlı elemanları sadece bir kere akısa sokar.
// Bu akışın farklı elemanlarından (Object.equals (Object) 'e göre) oluşan bir akış döndürür.
// Sıralı akışlar için, farklı elemanın seçimi sabittir
// (yinelenen öğeler için, karşılaşma sırasında ilk görünen öğe korunur.)
// Sırasız akışlar için, herhangi bir kararlılık garantisi verilmez. Stream return eder.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C06_Distinct_Benzersiz {
    public static void main(String[] args) {

        List<String> menu = new ArrayList<>(Arrays.asList("Kusleme", "Kusleme", "Kusleme", "Soganli", "Soganli", "Soganli", "Trilece", "Bicibici", "Buryan", "Melemen", "Cacix", "Kokorec", "Yaglama", "Guvec", "Arabasi", "Tantuni"));

        System.out.println("\n   ***    ");
        ascUniqPrint(menu);
//ARABASİ BURYAN BİCİBİCİ CACİX GUVEC KOKOREC KUSLEME MELEMEN SOGANLİ TANTUNİ TRİLECE YAGLAMA

        System.out.println("\n   ***    ");
        karakterSayiDescPrint(menu);//8 7 6 5

        System.out.println("\n   ***    ");
        karakterSayisinaGoreElemanAscPrint(menu);
//Cacix Guvec Buryan Kusleme Kusleme Kusleme Soganli Soganli Soganli Trilece Melemen Kokorec Yaglama Arabasi Tantuni Bicibici

        System.out.println("\n   ***    ");
        sonHarfeGoreDescPrint(menu);
//Cacix Buryan Melemen Soganli Soganli Soganli Bicibici Arabasi Tantuni Kusleme Kusleme Kusleme Trilece Kokorec Guvec Yaglama


    }//main sonu

    //TASK: List elemanlarini alfabetik buyuk harf ve tekrarsiz print ediniz.
    public static void ascUniqPrint(List<String> menu) {
        menu.
                stream().//elemanlari akisa alir
                map(String::toUpperCase).//akisa alinan elemanlari buyuk harfe cevirerek guncelleme yapilir
                sorted().//elemanlari siralar.
                distinct().//ifadeleri benzersiz hale getirir, tekrarli ifadeleri tek olarak gunceller
                forEach(t -> System.out.print(t + " "));// yazdirma islemi yapilir
    }

    //TASK: list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..
    public static void karakterSayiDescPrint(List<String> menu) {
        menu.stream().map(String::length).//akistaki string elemanlar karakter sayisiyle update edildi.
                sorted(Comparator.reverseOrder()).//elemanlar ters siralandi
                distinct().//uniq(tekrarsiz yapildi)
                forEach(t -> System.out.print(t + " "));
    }

    //TASK: List elemanlarini karakter sayisina gore ascending sirali yazdiriniz
    public static void karakterSayisinaGoreElemanAscPrint(List<String> menu) {
        menu.
                stream().
                sorted(Comparator.comparing(String::length)).//akisa giren elemanlar, karakter sayisina gore siralandi
                forEach(t -> System.out.print(t + " "));

    }

    // TASK : list elemanlarinin son harfine gore ters sirali print ediniz.
    public static void sonHarfeGoreDescPrint(List<String> menu) {
        menu.
                stream().//elemanlar akisa alindi
                sorted(Comparator.//karsilastirma Class'i call edildi
                comparing(t -> t.toString().//karsilastirma yapilmasi icin method call edildi. Neye gore karsilastirilacagi belirlendi
                charAt(t.toString().length() - 1)).reversed()).//son karakter olacagi bu kodla tanimlandi
                forEach(t -> System.out.print(t + " "));//yazdirildi.
    }

    // Task : listin elemanlarin karakterlerinin cift sayili  karelerini hesaplayan,ve karelerini tekrarsiz buyukten kucuge sirali  print ediniz...
    public static void charKaresiCiftElSirala(List<String> menu) {
        menu.
                stream().//akısa alndı
                map(t -> t.length() * t.length()).//akısdaki string elemanları boyutlarının karesine update edildi
                filter(C01_LambdaExpression::ciftMi).//cift elelmalar filtrelendi
                distinct().//tekrarsız yapıldı
                sorted(Comparator.reverseOrder()).//ters b->k sıra yapıldı
                forEach(C01_LambdaExpression::yazdir);// print edildi
    }
}
