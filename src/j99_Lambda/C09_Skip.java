package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C09_Skip {

    //skip(n) => atlama demek. Akışın ilk n elemanını attıktan sonra bu akışın kalan elemanlarından oluşan bir akış return eder.
    // akis, n'den daha az eleman iceriyorsa(Akista 4 eleman varsa 5 eleman atilmak istenirse);
    // skip(n)' method'dan sonra bos akis return eder. skip(n) ara islemdir.
    public static void main(String[] args) {

        List<String> menu = new ArrayList<>(Arrays.asList("Kusleme", "Soganli", "Trilece", "Bicibici", "Buryan", "Menemen", "Cacix", "Kokorec", "Yaglama", "Guvec", "Arabasi", "Tantuni"));
        System.out.println("\n   ***   ");
        ilk2HaricSonHarfSiraliElemanPrint(menu);


    }//main sonu

    // TASK: list elemanlarini son harfine gore siralayip ilk iki eleman haric kalan elemanlari print ediniz
    public static void ilk2HaricSonHarfSiraliElemanPrint(List<String> menu) {
        System.out.println(
                Arrays.asList(//yapilan islem array icinde yazdirildi
                        menu.
                                stream().
                                sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).//akistaki elemanlar son karaktere gore siralandi
                                skip(2).//akistaki ilk 2 eleman atildi
                                toArray()//akis elemanlari bir array'e atandi
                ));
        System.out.println("ForEach ile yazdirilma da yapilir. Asagidaki gibi; ");
        menu.
                stream().
                sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).//akistaki elemanlar son karaktere gore siralandi
                skip(2).//akistaki ilk 2 eleman atildi
                forEach(t -> System.out.println(t + " "));
    }
}