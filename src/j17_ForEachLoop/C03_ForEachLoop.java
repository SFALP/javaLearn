package j17_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C03_ForEachLoop {
    public static void main(String[] args) {
// TASK01: Iki String array'in  elemalarinin ortak olmasini kontrol eden code create ediniz. (With for each)
// Ortak elemanlari yazdirin. Yoksa da yok yazdirilmalidir.

        String arr1[] = {"Nazim", "Gulsum", "Dilek", "Erol", "Cuneyt", "Cigdem"};
        String arr2[] = {"Musty", "Gulsum", "Ayse", "Enise", "Cuneyt", "Cigdem"};

        List<String> ortakIsim = new ArrayList<>();//Ortak isimlerin atanacagi bos list

        for (String str1 : arr1) {
            for (String str2 : arr2) {
                if (str1.equalsIgnoreCase(str2)) {//her bir cekirdek esitligi kontrol edildi
                    ortakIsim.add(str2);
                }
            }

        }
        if (ortakIsim.isEmpty()) {//ortakIsim list'in bos olup olmadigi kontrol edildi.
            System.out.println("Array listenizde ortak isim yok: " + ortakIsim);

        } else System.out.println("Ortak olan isimler: " + ortakIsim);


    }
}
