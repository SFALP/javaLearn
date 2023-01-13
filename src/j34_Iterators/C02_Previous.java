package j34_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C02_Previous {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(24, 38, 65, 9, 11, 07, 27, 23));
        //l1 elemanlarini tersten print ediniz.
        System.out.println("l1 list ilk hali: " + l1);//l1 list ilk hali: [24, 38, 65, 9, 11, 7, 27, 23]
// ters yazdirmak icin pointer sonda olmalidir. Yani hasNext()'in tersidir.

/*
tekrarda son elemandan baslayan islemler icin pointer en sona goturulmelidir.
Bunun icin; pointer'i sona goturen hasNext() method calismalidir.
 */

        ListIterator<Integer> it1 = l1.listIterator();

        while (it1.hasNext()) {//bastan sona dogru pointer surekli sona dogru ilerler.
            it1.next();
        }
//previous() komutunu calistirabilememiz icin oncelikle pointer'i bastan sona goturmemiz sarttir,
// bu nedenle once hasNext() yapisi kullanilir. Sonrasinda asagida oldugu gibi sondan basa doru gidilir.

        while (it1.hasPrevious()) {// sondan basa dogru pointer ilerler
            System.out.println(it1.previous() + " ");
        }

/* Yukaridaki ornegin diger adi: cift yonlu tekrardir.
        Iterator--> her zaman while ile kullanilir. hasNext(), hasprevious() ile kullanilir.

*/


//        System.out.println("l1'in tersten print hali" + l1);

        List<String> l2 = new ArrayList<>(Arrays.asList("Cagla", "ugur", "Muharrem", "Cebrail"));
        System.out.println("List iterator oncesi l2: " + l2);//[Cagla, ugur, Muharrem, Cebrail]

// l2 elemanlarinin sonuncusuna :-) ekleyip print ediniz.
        System.out.println();
        ListIterator<String> it2 = l2.listIterator();//l2 elemanlarini tekrarlayan listiterator tanimlandi.
        while (it2.hasNext()) {

            String s = it2.next();
            if (it2.hasNext() == false) {//son eleman anlamina gelir, cunku sonda eleman var mi sorusunun cevabi =
                // sona gelince otomatik olarak false olur.
                it2.set(s + " :-) ");
            }
        }
        System.out.println(l2);//[Cagla, ugur, Muharrem, Cebrail :-) ]
    /*
cooggg onemli-->  hasPrevious() method icin MUTLAKA-KESINLIKLE hasNext() ve next() methodlari calistirilarak,
cursor(pointer) en sona getirilmelidir.

ITERATOR ve LISTITERATOR farklari:
1- ITERATOR --> sadece hasNext(), next(), remove() methodlarini calistirir.
    LISTITERATOR -->hasNext(), next(), remove(), hasPrevious(), previous(), add(), set() vs methodlari calistirir.

2- LISTITERATOR --> sadece List yapilarinda kullanilir.
    ITERATOR--> tum collection(list, set, array, map...) icin tanimlanir.

3- ITERATOR --> saece ileri yani bastan sona tekrarlar.
    LIST ITERATOR--> bastan sona veya sondan basa dogru da (cift yonlu) tekrarlar.

4- ITERATOR--> Kapsami genis ancak aksiyonu azdir.
    LISTITERATOR--> Kamosami dar ancak aksiyonu fazladir.
     */

    }
}
