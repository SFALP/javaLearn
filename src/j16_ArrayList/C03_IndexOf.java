package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_IndexOf {
    public static void main(String[] args) {
//indexOf(); --> List icinde ,stenen elemanin index degerini return eder.
        ArrayList<String> listUlke = new ArrayList<>(List.of("Almanya", "Amerika", "Japonya", "Turkiye", "Kanada", "Ingiltere"));
        ArrayList<String> listSehir = new ArrayList<>(List.of("Munih", "LosAngeles", "Londra", "Stockholm", "Istanbul", "Berlin"));

        System.out.println(listSehir.indexOf("Londra"));//2    londra'nin indexini ekrana yazdirir.
        System.out.println(listSehir.indexOf("Ankara"));//-1    olmayan eleman icin -1 yazdirir.
        System.out.println(listSehir.indexOf("Manisa"));//-1    olmayan eleman icin -1 yazdirir.

        listUlke.add("Amerika");
        System.out.println(listUlke.indexOf("Amerika"));// ayni elemandan 2 tane varsa bile ilk karsilasilan index ekranda yazdirilir.

        System.out.println(listUlke.lastIndexOf("Amerika"));//6 aranan elemani sondan baslayarak arar, bulursa da bastan baslayarak index numarasini yazdirir.
    }
}