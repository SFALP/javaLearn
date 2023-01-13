package j35Collection.C02_Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class C03_Task02 {
    public static void main(String[] args) {

// interview question: girilen String datanin karakterlerini alfabetik print ediniz.--> TreeSet'e atanir.
//TASK--> HashSet ve TreeSet tanimlayip run surelerini tanimlayiniz.
// TRICK--> Run suresi icin System.currentTimeMillis() method call ediniz.

        long tsBasla = System.currentTimeMillis();//TS baslangic suresi alindi
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Salim");
        ts.add("Selim");
        ts.add("Serhat");
        ts.add("Haluk");
        ts.add("Hayri");
        ts.add("Harun");
        ts.add("Huseyin");


        long tsBitir = System.currentTimeMillis();//TS bitis suresi alindi
        System.out.println("Ts run suresi: " + (tsBitir - tsBasla));//Ts run suresi: 1

        long hsBasla = System.currentTimeMillis();//HS baslangic suresi alindi

        HashSet<String> hs = new HashSet<>();
        hs.add("ebik");
        hs.add("gabik");
        hs.add("lolo");
        hs.add("falan");
        hs.add("filan");
        hs.add("fesmekan");
        hs.add("agam");
        hs.add("bobrek yatagi");
        hs.add("poc guvec");
        hs.add("kusleme");

        long hsBitis = System.currentTimeMillis();//HS bitis suresi alindi

        System.out.println("HS performans suresi: " + (hsBitis - hsBasla));//HS performans suresi: 0
//Bu hiz verileri; internet hizi, ram kapasitesine, vs gore degiskenlik gosterir.
        // iyi bir javaCAN icin gelisMAC lazim :)
    }
}