package j15_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

// Array elemaninin varligini kontrol etme

        int arr[]={67,97,20,63,43,34,54,24,16,7,55,17};

        int sayi=33;
        boolean flag=false;//bayrak asagida
        for (int i = 0; i <=arr.length-1 ; i++) {
            if (arr[i]==sayi){
                flag=true;
            break;
            }
            System.out.println();
        }
        if (flag) {
            System.out.println("Aradiginiz sayi Array'da VAR :)");
        }else System.out.println("Aradiginiz sayi Array icinde bulunmamaktadir :(");
// Array icinde aranan degerin olup olmadigini ogrenmenin kolay yolu:

        Arrays.sort(arr);//array elemanlari siralandi.
        Arrays.binarySearch(arr, 34);
        //binarySearch(arr, 34)--> ikiz karsilastirma anlamina gelir. Array icinde 34 var mi yokmu sorusunu arasitma yapar.
        System.out.println("Indexi: "+Arrays.binarySearch(arr, 34));//Indexi: 5 yazilir.
        System.out.println("Indexi: "+Arrays.binarySearch(arr, 16));//Indexi: 1 yazilir.
        // cevap olarak index no verir (eger varsa)
        System.out.println("Indexi: "+Arrays.binarySearch(arr, 21));//Eger array icinde aranan eleman yoksa,
        // cevap olarak; eger bu eleman olsaydi kaçinci sirada olacaksa o deger eksi işaretiyle birlikte yazilirdi.

        // KISACA: Arrayda olan bir eleman için sirasini, olmayan bir eleman için eksi ifadesiyle birlikte muhtemel sirasini yanitlar.

        System.out.println("Indexi: "+Arrays.binarySearch(arr, 99)); //Indexi: -13 yazdirilir. Cunku yok,
        // eger 99 array'e yazilmis olsaydi 13.sirada olacakti.
    }
}