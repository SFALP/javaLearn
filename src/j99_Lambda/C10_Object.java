package j99_Lambda;

import java.util.*;
import java.util.stream.Collectors;

/*
TASK :
fields --> Universite (String)
           bolum (String)
           ogrcSayisi (int)
           notOrt (int)
           olan POJO clas craete edip main method içinde 5 farklı obj'den List create ediniz.
 */
public class C10_Object {
    public static void main(String[] args) {

        C10_Universite_Pojo u01 = new C10_Universite_Pojo("Bogazici", "Matematik", 571, 73);
        C10_Universite_Pojo u02 = new C10_Universite_Pojo("Istanbul", "Matematik", 622, 77);
        C10_Universite_Pojo u03 = new C10_Universite_Pojo("Marmara", "Hukuk", 1453, 52);
        C10_Universite_Pojo u04 = new C10_Universite_Pojo("ITU", "Ucak Muhendisligi", 333, 63);
        C10_Universite_Pojo u05 = new C10_Universite_Pojo("Yildiz Teknik", "Gemi", 216, 55);

        List<C10_Universite_Pojo> univ = new ArrayList<>(Arrays.asList(u01, u02, u03, u04, u05));

        System.out.println("Task01: " + notOrt74Buyuk(univ));//Task01: false. Cunku ortalamalarin tamami 74'ten buyuk degil.
        System.out.println("\n   ***   ");
        System.out.println("Task02: " + ogrSayisi110AzMi(univ));//Task02: true
        System.out.println("\n   ***   ");
        System.out.println("Task03: " + enAzBirMatVarMi(univ));//Task03: true
        System.out.println("\n   ***   ");
        System.out.println("Task04: " + ogrSayiDescSira(univ));//
//Task04: [universite='Marmara', bolum='Hukuk', ogrcSayisi=1453, notOrt=52,
// universite='Istanbul', bolum='Matematik', ogrcSayisi=622, notOrt=77,
// universite='Bogazici', bolum='Matematik', ogrcSayisi=571, notOrt=73,
// universite='ITU', bolum='Ucak Muhendisligi', ogrcSayisi=333, notOrt=63,
// universite='Yildiz Teknik', bolum='Gemi', ogrcSayisi=216, notOrt=55]

        System.out.println("\n   ***   ");
        System.out.println("Task05: " + notOrtDescIlk3(univ));
//Task05: [universite='Istanbul', bolum='Matematik', ogrcSayisi=622, notOrt=77,
// universite='Bogazici', bolum='Matematik', ogrcSayisi=571, notOrt=73,
// universite='ITU', bolum='Ucak Muhendisligi', ogrcSayisi=333, notOrt=63]

        System.out.println("\n   ***   ");
        System.out.println("Task06: " + ogrSayiGoreSira2(univ));//Task06: [universite='ITU', bolum='Ucak Muhendisligi', ogrcSayisi=333, notOrt=63]

        System.out.println("\n   ***   ");
        System.out.println("Task07: " + notOrt63BuyukOgrSayisiToplami(univ));//Task07: 1193 (571+622)

        System.out.println("\n   ***   ");
        System.out.println("Task08: " + ogrSayisi333BykNotOrtOrt(univ));//Task08: OptionalDouble[67.33333333333333]

        System.out.println("\n   ***   ");
        System.out.println("Task09: " + matBolumSayisi(univ));//Task09: 2

        System.out.println("\n   ***   ");
        System.out.println("Task10: " + ogrSay571FazlaMaxNotOrt(univ));//Task10: 77
        System.out.println("\n   ***   ");
        System.out.println("Task11: "+ogrSay1071AzMinNotOrt(univ));//Task11: 55
        System.out.println("\n   ***   ");


    }//main sonu

//TASK01--> Not ortalamalarinin 74'ten buyuk olmasi durumunu kontrol ediniz.
    public static boolean notOrt74Buyuk(List<C10_Universite_Pojo> univ) {
        return univ.
                stream().
                allMatch(t -> t.getNotOrt() > 74);
    }

//TASK02--> Ogr sayilarinin 110'dan az olmadigini kontrol eden pr create ediniz.
    public static boolean ogrSayisi110AzMi(List<C10_Universite_Pojo> univ) {
        return univ.stream().allMatch(t -> t.getOgrcSayisi() >= 110);
    }

//TASK03: Universitelerin herhangi birinde Matematik olup olmadigini kontrol ediniz.
    public static boolean enAzBirMatVarMi(List<C10_Universite_Pojo> univ) {
        return univ.
                stream().
                anyMatch(t -> t.getBolum().toLowerCase().contains("mat"));
    }

//TASK04: Universiteleri ogr sayilarina gore Buyukten kucuge(Desc) siralayiniz
    public static List<C10_Universite_Pojo> ogrSayiDescSira(List<C10_Universite_Pojo> univ) {
        return univ.
                stream().
                sorted(Comparator.comparing(C10_Universite_Pojo::getOgrcSayisi).reversed()).//akisa giren elemanlar ogrenci sayisina gore tersten siralanir.
                        collect(Collectors.toList());//akistaki elemanlar liste atandi

        //collect(Collectors.call)-> Collector class'dan call edilen coll. methodile akis elemanlari atanir.
    }

//TASK05: Universiteleri not ortalamasina gore Buyukten kucuge(Desc) siralayip ilk 3'u yazdiriniz.
    public static List<C10_Universite_Pojo> notOrtDescIlk3(List<C10_Universite_Pojo> univ) {
        return univ.stream().sorted(Comparator.comparing(C10_Universite_Pojo::getNotOrt).reversed()).
                limit(3).
                collect(Collectors.toList());
    }

//TASK06: Ogrenci sayisina gore en az 2.universiteyi yazdiriniz.
    public static List<C10_Universite_Pojo> ogrSayiGoreSira2(List<C10_Universite_Pojo> univ) {
        return univ.
                stream().
                sorted(Comparator.comparing(C10_Universite_Pojo::getOgrcSayisi)).limit(2).skip(1).
                //Ogr. sayisina gore Asc siralandi, sonra ilk 2 sira alindi ve 1.siradaki atildi, yani elimizde 2.siradaki kaldi.
                        collect(Collectors.toList());// elimizde kalan da list'e atildi.

    }

//TASK07: notOrtalama 63'den buyuk olan universitelerin ogrenci sayilari toplamini print ediniz
    public static int notOrt63BuyukOgrSayisiToplami(List<C10_Universite_Pojo> univ) {

        return univ.
                stream().
                filter(t -> t.getNotOrt() > 63).//akistaki elemanlardan 63'ten buyuk olanlar alindi.
                        mapToInt(t -> t.getOgrcSayisi()).//akistaki elemanlarin data type'ini parametredeki degere gore update eder, yani bu satirda integer'a cevirmis olur
                        sum();//intiger degerler toplanmis olur
    }

//TASK08: Ogrenci sayisi 333'den buyuk olan universitelerin not Ortalamalarinin da ortalamasini print eden kodu yaziniz.
    public static OptionalDouble ogrSayisi333BykNotOrtOrt(List<C10_Universite_Pojo> univ) {

        return univ.
                stream().
                filter(t -> t.getOgrcSayisi() > 333).//akistaki elemanlardan ogr sayisi 333'ten buyuk olanlar alindi.
                        mapToDouble(t -> t.getNotOrt()).//akistaki elemanlarin data type'ini parametredeki degere gore update eder, yani bu satirda double'a cevirmis olur
                        average();//double'a cevirilen degerlerin ortalamasi alinir.
    }

//TASK 09-->"matematik" bolumlerinin sayisini  print ediniz.
    public static int matBolumSayisi(List<C10_Universite_Pojo> menu) {
        return (int) menu.stream().filter(t -> t.getBolum().equalsIgnoreCase("matematik")).count();
    }


//TASK 10-->Ogrenci sayilari 571'dan fazla olan universite'lerin en buyuk notOrt'unu bulunuz.
    public static int ogrSay571FazlaMaxNotOrt(List<C10_Universite_Pojo> menu) {
        return menu.
                stream().
                filter(t -> t.getOgrcSayisi() > 571).
                sorted(Comparator.comparing(C10_Universite_Pojo::getNotOrt).reversed()).//akisa giren elemanlar, not ortalamasina gore Desc siralandi.
                limit(1).//ilk siradaki alindi
                mapToInt(t -> t.getNotOrt()).//akistaki elemanlarin data type'ini parametredeki degere gore update eder, yani bu satirda integer'a cevirmis olur
                sum();
    }

//TASK 11-->Ogrenci sayilari 1071'dan az olan universite'lerin en kucuk notOrt'unu bulunuz.
    public static int ogrSay1071AzMinNotOrt(List<C10_Universite_Pojo> univ) {
        return univ.
                stream().
                filter(t -> t.getOgrcSayisi() < 1071).
                sorted(Comparator.comparing(C10_Universite_Pojo::getNotOrt)).//akisa giren elemanlar nor ortalamasina gore Asc siralandi
                limit(1).//ilk siradaki alindi
                mapToInt(t -> t.getNotOrt()).//akistaki elemanlarin data type'ini parametredeki degere gore update eder, yani bu satirda int'a cevirmis olur
                sum();
    }

}