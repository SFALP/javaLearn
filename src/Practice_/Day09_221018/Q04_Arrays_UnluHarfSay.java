package Practice_.Day09_221018;
/*
Verilen Stringi array e cevirerek unlu harflerin sayisini bulan prgram yazin
String s= Apex,nesne yonelimli bir programlama dilidir"       */

import java.util.Arrays;

public class Q04_Arrays_UnluHarfSay {
    public static void main(String[] args) {

        String s = " Apex,nesne yonelimli bir programlama dilidir";
        s.toLowerCase().trim();
        String arr[] = s.split("");
        System.out.println(Arrays.toString(arr));
        int sesli = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("a") || arr[i].contains("e") || arr[i].contains("ı") ||
                    arr[i].contains("i") || arr[i].contains("o") || arr[i].contains("ö") ||
                    arr[i].contains("u") || arr[i].contains("ü")) {
                sesli++;
            }
        }
        System.out.println("sesli = " + sesli);

 //       HOCA COZUMU
        System.out.println(" ********* HOCA COZUMU *************");
        String s1 = " Apex,nesne yonelimli bir programlama dilidir";
        s1 = s1.replace(",", "").replace(" ", "");
        System.out.println("s1 = " + s1);

        String sesliHarf[] = {"a", "e", "i","o","u"};
        System.out.println(Arrays.toString(sesliHarf));

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < sesliHarf.length; j++) {
                if (arr[i].equalsIgnoreCase(sesliHarf[j])) {
                    count++;
                }
            }
        }
        System.out.println("Sesli harf sayisi: "+count);
    }
}