package Practice_.Day04_220927;

import java.util.Scanner;

public class Q09_StringManipulation {
    public static void main(String[] args) {


    /*
      Kullanicidan bir kelime girmesini isteyin.
      * Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
      * kelimenin ortasindaki karakteri yazdirin.
      */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime tanimlayiniz");
        String a = scan.nextLine();
        if (a.length() % 2 != 0 && a.length() >= 3) {
            System.out.println("Girilen ifadenin ortasindaki harf: " + a.substring(a.length() / 2, (a.length()) / 2 + 1));
        } else
            System.out.println("Bu ifade, belirlenen kurallara uymadigindan ekrana ortadaki karakter yazdirilamamaktadir.");
    }
}
