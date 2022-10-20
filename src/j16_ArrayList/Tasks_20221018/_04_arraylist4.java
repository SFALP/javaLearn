package j16_ArrayList.Tasks_20221018;

import java.util.ArrayList;
import java.util.List;

public class _04_arraylist4 {

    /*
        İsmi changeInArraylist() olan bir method oluşturun.
        Parametre olarak String ArrayList, String s1, String s2
           Arraylist'te s1'i s2 olarak değiştirin

        Return String arrayList

        Örneğin;
        Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
        s1 = blue
        s2 = yellow
        Tüm blue 'ları yellow'a dönüştürün.
        cevap: "yellow" , "red" , "yellow" , "red" , "yellow"
     */

    public static void main(String[] args) {
        ArrayList<String> farbe = new ArrayList<>(List.of("yellow", "red", "blue", "red", "blue"));
        String s1 = "blue";
        String s2 = "yellow";

        System.out.println("Array'in donusturulmus hali: " + changeInArraylist(farbe, s1, s2));
        System.out.println("\nHoca, task geregi yellow-red yazdirsa da sarinin yanina sadece LACIVERT yakisir :)");
        System.out.println("\t2022 - 2023 SEZONUNDA SAMPIYON FENERBAHCE!");
    }

    public static ArrayList<String> changeInArraylist(ArrayList<String> farbe, String s1, String s2) {
        ArrayList<String> yeniFarbe = new ArrayList<>();
        for (String a : farbe) {
            yeniFarbe.add(a == s1 ? s2 : a);
        }
        return yeniFarbe;
    }
}