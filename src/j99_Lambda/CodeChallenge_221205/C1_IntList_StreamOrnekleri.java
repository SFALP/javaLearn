package j99_Lambda.CodeChallenge_221205;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


// S12 : listeden 5 den buyuk  sayi var mi?(anyMatch ile cozulebilir)

// S13 : listenin tum elemanlari sifirdan kucuk mu?(allMatch ile cozulebilir)

// S14: listenin 100 e esit elemani yok mu ?(nonMatch ile cozulebilir)

// S15: listenin sifira esit elemani yok mu?(nonMatch ile cozulebilir)

// S16:  listenin ilk 5 elemanini topla?(limit(5) ile cozulebilir)

//S17: listenin son bes elemaninin  listele(skip ile cozulebilir-skip, long deger alir)


public class C1_IntList_StreamOrnekleri {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 6, 9, 15, 8));

        System.out.println("\n  *****  ");
        yazdir(list);//-5 -8 -2 -12 0 1 12 5 6 9 15 8
        System.out.println("\n  *****  ");
        System.out.println("negYazdir(list) = " + negYazdir(list));//negYazdir(list) = [-5, -8, -2, -12]
        System.out.println("\n  *****  ");
        pozYazdir(list);//[1, 12, 5, 6, 9, 15, 8]
        System.out.println("\n  *****  ");
        System.out.println("kareList(list) = " + kareList(list));//kareList(list) = [25, 64, 4, 144, 0, 1, 144, 25, 36, 81, 225, 64]
        System.out.println("\n  *****  ");
        System.out.println("kareTekrarsiz(list) = " + kareTekrarsiz(list));//kareTekrarsiz(list) = [25, 64, 4, 144, 0, 1, 36, 81, 225]
        System.out.println("\n  *****  ");
        ascList(list);//-12 -8 -5 -2 0 1 5 6 8 9 12 15
        System.out.println("\n  *****  ");
        descList(list);//15 12 9 8 6 5 1 0 -2 -5 -8 -12
        System.out.println("\n  *****  ");
        System.out.println("birler5List(list) = " + birler5List(list));//birler5List(list) = [125, 3375]
        System.out.println("\n  *****  ");
        System.out.println("birler5OlmayanList(list) = " + birler5OlmayanList(list));//birler5OlmayanList(list) = [1, 144, 36, 81, 64]
        System.out.println("\n  *****  ");
        System.out.println("toplamList(list) = " + toplamList(list));//toplamList(list) = 29
        System.out.println("\n  *****  ");
        System.out.println("negatifKareList(list) = " + negatifKareList(list));
        /*
Negatifler: -5
 Kareler: 25
Negatifler: -8
 Kareler: 64
Negatifler: -2
 Kareler: 4
Negatifler: -12
 Kareler: 144negatifKareList(list) = [25, 64, 4, 144]
         */
        System.out.println("\n  *****  ");

        System.out.println("\n  *****  ");
    }
    // S11 : peek ornegi cozelim - negatiflerin karelerinden list olusturalim

    public static List<Integer> negatifKareList(List<Integer> list) {
return list.stream().filter(t->t<0).peek(t-> System.out.println("\nNegatifler: "+t)).
        map(t->t*t).peek(t-> System.out.print(" Kareler: "+t)).collect(Collectors.toList());
    /*
 peek () 'in Javadoc sayfası şöyle diyor: " Bu yöntem, temelde, öğeleri bir
ardışık düzen içinde belirli bir noktadan geçerken görmek istediğiniz
yerde hata ayıklamayı desteklemek için vardır . Ara islemdir.. yapilam islemi gormek icin kullanilir

 */
    }

    // S10 :list elemanlarini toplamini bulalim
    public static int toplamList(List<Integer> list) {
        return list.stream().reduce(0, (x, y) -> x + y);
    }

    //S9: list pozitif elemanlari icn karelerini bulup birler basamagi 5 olmayanlardan yeni bir list olusturalim
    public static List<Integer> birler5OlmayanList(List<Integer> list) {
        return list.stream().filter(t -> t > 0).map(t -> t * t).filter(t -> t % 10 != 5).collect(Collectors.toList());
    }

    // S8: list pozitif elemanlari icn kuplerini bulup birler basamagi 5 olanlardan yeni bir list olusturalim
    public static List<Integer> birler5List(List<Integer> list) {
        return list.stream().filter(t -> t > 0).map(t -> t * t * t).filter(t -> t % 10 == 5).collect(Collectors.toList());
    }


    //S7: listin elemanlarini buyukten kucuge siralayalim
    public static void descList(List<Integer> list) {
        list.stream().sorted(Comparator.reverseOrder()).forEach(t -> System.out.print(t + " "));
    }

    //S6: listin elemanlarini kucukten buyuge siralayalim
    public static void ascList(List<Integer> list) {
        list.stream().sorted().forEach(t -> System.out.print(t + " "));
    }

    //S5 : list in elemanlarin karelerinden tekrarsiz yeni bir list olusturalim
    public static List<Integer> kareTekrarsiz(List<Integer> list) {
        return list.stream().map(t -> t * t).distinct().collect(Collectors.toList());
    }


    // S4: list in elemanlarin karelerinden yeni bir list olusturalim
    public static List<Integer> kareList(List<Integer> list) {
        return list.stream().map(t -> t * t).collect(Collectors.toList());
    }


    //S3: pozitif olanlardan yeni bir liste olustur
    public static void pozYazdir(List<Integer> list) {
        System.out.println(list.stream().filter(t -> t > 0).collect(Collectors.toList()));
    }

    //S2: sadece negatif olanlari yazdir
    public static List<Integer> negYazdir(List<Integer> list) {
        return list.stream().filter(t -> t < 0).collect(Collectors.toList());
    }

    // S1:listi aralarinda bosluk birakarak yazdiriniz //
    public static void yazdir(List<Integer> list) {
        list.stream().forEach(t -> System.out.print(t + " "));
    }


}