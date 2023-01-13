package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_Match {
    public static void main(String[] args) {

//anyMatch() --> enaz bir eleman sarti saglarsa true aksi durumda false return eder
//allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.
//noneMatch()--> hic bir sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.

        List<String> menu = new ArrayList<>(Arrays.asList("Kusleme", "Kusleme", "Kusleme", "Soganli", "Soganli", "Soganli", "Trilece", "Bicibici", "Buryan", "Menemen", "Cacix", "Kokorec", "Yaglama", "Guvec", "Arabasi", "Tantuni"));
        System.out.println("\n   ***    ");
        harfSayisi7DenAzKontrol(menu);//Agam menudekiler 7 karakterden fazladir :(.
        System.out.println("\n   ***    ");
        wIleBaslamaKontrol(menu);
        System.out.println("\n   ***    ");
        xIleBitmeKontrol(menu);
        System.out.println("\n   ***    ");


    }//main sonu

    // TASK : List elemanlarinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol ediniz.
    public static void harfSayisi7DenAzKontrol(List<String> menu) {
        boolean kontrol = menu.stream().allMatch(t -> t.length() <= 7);
//allMatch() komutu, list icinde bir tane bile istenen kriterin disinda bir durum oldugunda false'a doner. Cevap false olur.
//allMatch() hepsi icin eslesmek durumundadir. menu isimli list'te olan "bicibici" 8 karakter oldugundan
// 7 kriterini saglamadigindan sonuc false olur.

        if (kontrol) {
            System.out.println("Agam menudekiler 7 ve daha az karakterden olusmaktadir. :)");
        } else System.out.println("Agam menudekiler 7 karakterden fazladir :(.");

    }

    //TASK: List elemanlarinin W ile baslamasini kontrol ediniz.
    public static void wIleBaslamaKontrol(List<String> menu) {
        boolean wKontrol = menu.stream().noneMatch(t -> t.toUpperCase().startsWith("W"));
        if (wKontrol) {
            System.out.println("W ile baslayan sozcuk bulunmamaktadir :)");
        } else System.out.println("W ile baslayan sozcuk bulunmaktadir :(");
    }

    // TASK: List elemanlarinin "X" ile biten en az 1 elemani kontrol ediniz.
    public static void xIleBitmeKontrol(List<String> menu) {
        boolean wKontrol = menu.
                stream().
                anyMatch(t -> t.toLowerCase().endsWith("X"));
        if (wKontrol) {
            System.out.println("x ile biten sozcuk bulunmamaktadir :)");
        } else System.out.println("x ile biten sozcuk bulunmaktadir :(");
    }
}