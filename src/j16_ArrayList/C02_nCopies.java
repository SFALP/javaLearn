package j16_ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C02_nCopies {
    public static void main(String[] args) {

        ArrayList<String> listUlke = new ArrayList<>(List.of("Almanya", "Amerika", "Japonya", "Turkiye", "Kanada", "Ingiltere"));
        ArrayList<String> listSehir = new ArrayList<>(List.of("Munih", "LosAngeles", "londra", "Stockholm", "Istanbul", "Berlin"));

//nCopies(int, Obj);---> Int elemanli bir objeden olusan list atamasi yapilir.
        ArrayList<String> yeniList = new ArrayList<>(Collections.nCopies(5, "ALEX"));//yeniList = [ALEX, ALEX, ALEX, ALEX, ALEX]
        System.out.println("yeniList = " + yeniList);


//addAll(); -->> bir list'e diger list'e oldugu gibi ekler.

        listUlke.addAll(listSehir);//listUlke sonuna listSehir tamamen eklenmis olur.
        System.out.println("listUlke = " + listUlke);
        //listUlke = [Almanya, Amerika, Japonya, Turkiye, Kanada, Ingiltere, Munih, LosAngeles, londra, Stockholm, Istanbul, Berlin]

        listSehir.addAll(3, listUlke);//3.indexten olarak listUlke, listSehir'e eklenmis oldu. 4.indexte listSehir kaldigi yerden devam eder.
        System.out.println("listSehir = " + listSehir);
//listSehir = [Munih, LosAngeles, londra, Almanya, Amerika, Japonya, Turkiye, Kanada, Ingiltere, Munih, LosAngeles, londra, Stockholm, Istanbul, Berlin, Stockholm, Istanbul, Berlin]

// TASK: 1'den 10'a kadar sayilari bir list'e atayip print eden cod create ediniz.

        ArrayList<Integer> listSayi=new ArrayList<>();//bos integer list olusturuldu

        for (int i = 1; i <= 10; i++) {
            listSayi.add(i);
        }
        System.out.println("listSayi = " + listSayi);//listSayi = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    }
}