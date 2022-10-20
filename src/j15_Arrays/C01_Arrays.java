package j15_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

// Array, dizi anlamina gelir.
/*
Array (Dizi): Java'da birden fazla variable store etmek icin kullanilan objelerden biridir
Array olusturulurken 2 seyi declare etmeliyiz:
1- data type (Bir array'in icerisinde sadece ayni data tipinden elemanlar omalıdır.)
2- uzunluk (uzunluk array'in icerisne konul max eleman sayisini belirtir ve bundan fazlasini koymak istersek RTE verir)
array= tepsiye benzer..
Array'de primitive datalar veya non-primitive datalarin referanslari store edilebilir
 isimler array'inin icinde isim degerleri degil, isimlerin referanslari saklanır
 */
public class C01_Arrays {
    public static void main(String[] args) {

// Array tanimlama
        int a;// declare edilen ancak atanmayan primitive datadir.
        int Arr[];//declare edilen ancak atanmauan intiger type Array
// tanimlanan array tanimlama yapilmadan kullanilamaz...

        String isimArr[] = {"muharrem", "enise", "cebrail", "nazim", "ozge"};// hem tanmlama hem atama yapilan String array
// 2.Tanimlama Yolu:  String [] isimArr={"muharrem", "enise", "nazim", "ozge"};// hem tanmlama hem atama yapilan String array

        int sayiArr[] = new int[5];// Java heap memory'de 5 default -> 0 olan int array creat edildi.
        // [0,0,0,0,0]

        // Array'e eleman ekleme...
        sayiArr[2] = 34;
        sayiArr[0] = 35;
        sayiArr[1] = 24;
        sayiArr[3] = 61;
        sayiArr[0] = 34;//0 index array elemani 34 degeriyle update edildi.
// array elemanları uniq olmak zorunda degildir, tekrarli array elemani olabilir.

// Array eleman sayisi boyut degeri:...:
        System.out.println("sayiArr.length = " + sayiArr.length);//5
//Array son elemani:
        System.out.println("Array son eleman = " + isimArr[isimArr.length - 1]);//ozge

        isimArr[isimArr.length - 1] = "QA ozge hanim ";//array son eleman update edildi.

// Array'da olmayan eleman

// Okkali bi TRICK:  sayiArr[11] = 23;// CTE vermez ama olmayan eleman RTE hatasi verir--> array Run Time 'da olusur.
        // Java'da Array yazarken degil, RUN yapildiktan sonra olusturulur.

// Array elemanlarini print eden code

        for (int i = 0; i < isimArr.length; i++) {
            System.out.print(isimArr[i] + " ");
        }
        System.out.println("isimArr = " + isimArr);//isimArr = [Ljava.lang.String;@614c5515 --> Bu isim referans degeridir.
        System.out.println(Arrays.toString(isimArr));//isim Array stringe cevirildi. Sonuc: [muharrem, enise, nazim, QA ozge hanim ]

// TASK1-> sayiArr elemanlarindan degeri tek olanlari print eden code create ediniz.
        for (int i = 0; i < isimArr.length; i++) {
            if (sayiArr[i] % 2 == 1) {
                System.out.println(sayiArr[i] + " ");//61
            }
        }
// TASK 2: sayiArr cift index elemanlari print eden code create ediniz. Yani 0-2. indexleri yazdirilacak.

        for (int i = 0; i < sayiArr.length; i += 2) {
            System.out.print(sayiArr[i] + " ");// 34 34
        }
// TASK3--> isimArray 5 harfli elemanlarinda olusan arrayin elemanlarini print eden code create ediniz.
        String yeniArr[] = new String[isimArr.length];// isimArr elemani kadar bos yeni Array urettik.
        for (int i = 0; i < isimArr.length; i++) {
            if (isimArr[i].length() == 5) {
                yeniArr[i] = isimArr[i];
            }
        }
        System.out.println(Arrays.toString(yeniArr));//[null, enise, nazim, null]

 // Array elemanlarini naturel (k->b) ascending, b->k descending sıralama

        System.out.println(Arrays.toString(isimArr));// siralama öncesi yazdirma: [muharrem, enise, cebrail, nazim, QA ozge hanim ]
        Arrays.sort(isimArr);// isim Array'i naturel siralanir.
        System.out.println(Arrays.toString(isimArr));//once buyuk harf siralandı= [QA ozge hanim , cebrail, enise, muharrem, nazim]

        System.out.println(Arrays.toString(sayiArr));// sıralama oncesi sayi arrayinin durumu:[34, 24, 34, 61, 0]
        Arrays.sort(sayiArr);//Sayilarin oldugu array kucukten buyuge siralanmis oldu.
        System.out.println(Arrays.toString(sayiArr));//siralama sonrasi sayi arrayinin durumu: [0, 24, 34, 34, 61]


    }
}