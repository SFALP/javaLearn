package j15_Arrays.Odev_20221013;

import java.util.Arrays;

public class _04_Create_Array_String {

    public static void main(String[] args) {

        /*
        elemanları: "new jersey" , "new york", "boston","California" olan  String array  oluşturun ve
        Array'daki eleman sayısını yazdırınız.
        Cevap 4 olmalı.
         */

String bundesLand[]={"Bayern","Rheinland-Pfalz","Nordrhein-Westphalen","Hessen","Baden-Wurttermberg"};

        System.out.println("Array'de yazilan eyaletler: "+ Arrays.toString(bundesLand));
        System.out.println("Array'in eleman sayisi: "+bundesLand.length);
    }
}