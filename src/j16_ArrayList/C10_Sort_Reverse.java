package j16_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C10_Sort_Reverse {
    public static void main(String[] args) {
// Collections.sort(list); --> Verilen list'i naturel (Ascending) siralama yapar.
//Collections.reverse(list); --> Verilen list'i ters siralamasini return eder.

    ArrayList<String> listSehir = new ArrayList<>(List.of("Munih", "LosAngeles", "Londra", "Stockholm", "Istanbul", "Berlin"));

    //Siralamasiz ArrayList yazdirilirsa;
        System.out.println("listSehir = " + listSehir);//listSehir = [Munih, LosAngeles, Londra, Stockholm, Istanbul, Berlin]

        Collections.sort(listSehir);//Ascending(k->b) siralar.
        System.out.println("listSehir = " + listSehir);//listSehir = [Berlin, Istanbul, Londra, LosAngeles, Munih, Stockholm]

        Collections.reverse(listSehir);//Descending (b-->k) siralar.
        System.out.println("listSehir = " + listSehir);//listSehir = [Stockholm, Munih, LosAngeles, Londra, Istanbul, Berlin]

// Sort metoduyla SOUT calismaz. Bu nedenle once Collections.sort(list) ile siralanir, sonra sout ile ArrayList yazdirilir.
// Siralamalarda ASCII degerinde once buyuk harfler geldigi icin OR. haluk ile Haluk arasindaki siralama farkli olur. Haluk once gelir
//ORNEK:
 ArrayList<String> listSehir2 = new ArrayList<>(List.of("munih", "losAngeles", "Londra", "stockholm", "Istanbul", "berlin"));
 Collections.sort(listSehir2);//ascending siralandi
 System.out.println("listSehir2 = " + listSehir2);//listSehir2 = [Istanbul, Londra, berlin, losAngeles, munih, stockholm]

// Ters siralamada.
        Collections.reverse(listSehir2);// Tersten siralandi.
        System.out.println("listSehir2 = " + listSehir2);//listSehir2 = [stockholm, munih, losAngeles, berlin, Londra, Istanbul]
    }
}