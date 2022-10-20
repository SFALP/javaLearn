package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C12_Remove {
    public static void main(String[] args) {

        //remove: silme komutudur. List'ten istenen elemani siler. Index verilirse de indexli siler.
        // Ya index verilir ya da elemanin kendisi belirtilir.
        ArrayList<String> listSehir = new ArrayList<>(List.of("Munih", "LosAngeles", "Londra", "Stockholm", "Istanbul", "Berlin"));

        System.out.println("listSehir.remove(\"Ankara\") = " + listSehir.remove("Ankara"));//listSehir.remove("Ankara") = false
        System.out.println("listSehir.remove(\"Londra\") = " + listSehir.remove("Londra"));//listSehir.remove("Londra") = true
        listSehir.remove(1);//1.indexteki eleman ortadan kaldirildi.
        System.out.println("listSehir = " + listSehir);//listSehir = [Munih, Stockholm, Istanbul, Berlin]
//        System.out.println("listSehir.remove(11) = " + listSehir.remove(11)); Olmayan bi index girilirse RTE hatasi aliriz.
  listSehir.add("Munih");
  listSehir.add("Ankara");
  listSehir.add("Munih");
        System.out.println("listSehir = " + listSehir);//listSehir = [Munih, Stockholm, Istanbul, Berlin, Munih, Ankara, Munih]
//Tekrarli eleman silinirse ne olur? Cevap: Ilk karsilasilan indexteki eleman silinir.

        listSehir.remove("Munih");// OR: cift olan Munih silinirse;
        System.out.println("listSehir = " + listSehir);//listSehir = [Stockholm, Istanbul, Berlin, Munih, Ankara, Munih]

        ArrayList<String> listUlke = new ArrayList<>(List.of("Almanya", "Amerika", "Japonya", "Turkiye", "Kanada", "Ingiltere"));

listSehir.addAll(listUlke);//sehirList'e UlkeList eklendi.
        System.out.println("listSehir = " + listSehir);//ulkelist eklenmis hali. listSehir = [Stockholm, Istanbul, Berlin, Munih, Ankara, Munih, Almanya, Amerika, Japonya, Turkiye, Kanada, Ingiltere]

        listSehir.removeAll(listUlke);//sehirList'ten ulkeList cikarildi.
        System.out.println("listSehir = " + listSehir);//listSehir = [Stockholm, Istanbul, Berlin, Munih, Ankara, Munih]
listUlke.removeAll(listSehir);// ulkeden sehir cikarilmak istendi ancak ulkede sehir olmadigi icin bir islem yapilmamis olur
        System.out.println("listUlke = " + listUlke);//listUlke = [Almanya, Amerika, Japonya, Turkiye, Kanada, Ingiltere]

    }
}