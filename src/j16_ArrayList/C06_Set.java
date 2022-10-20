package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_Set {
    public static void main(String[] args) {

//set(); duzenlemek, ayarlamak anlamina gelir. Update anlamina da gelir.
// List'in istenen indexe istenen elemani update eder.
        ArrayList<String> listSehir = new ArrayList<>(List.of("Munih", "LosAngeles", "Londra", "Stockholm", "Istanbul", "Berlin"));

        System.out.println(listSehir.set(3, "Ankara"));//Stockholm Bu kod ile set edilen deger(cikan oyuncu) print edilir.
        System.out.println(listSehir);//[Munih, LosAngeles, Londra, Ankara, Istanbul, Berlin] List'in set edilmis hali print edildi

//        listSehir.set(11,"Kambocya");//olmayan index set edilirse RTE hatasi verir.
        System.out.println("listSehir = " + listSehir);//listSehir = [Munih, LosAngeles, Londra, Ankara, Istanbul, Berlin]
//list.Sehir.set(1,"Bursa",2,"Izmir"); --> List'te coklu set methodu calismaz buz gibi InTERVIEW Sorusu... CTE Hatasi verir.
// Set komutu tekli calisir, toplu guncelleme yapilmaz.



    }
}